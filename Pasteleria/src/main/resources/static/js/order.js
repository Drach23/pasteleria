const orderUrl = "http://localhost:8080/order";
        fetch(orderUrl)
            .then(response => response.json())
            .then(orders => {
                const orderProductUrl = "http://localhost:8080/orderProduct";
                fetch(orderProductUrl)
                    .then(response => response.json())
                    .then(orderProducts => {
                        const deliveryUrl = "http://localhost:8080/deliverys";
                        fetch(deliveryUrl)
                            .then(response => response.json())
                            .then(deliveries => {
                                let tableBody = document.getElementById("orderTable");

                                orders.forEach(order => {
                                    let row = document.createElement("tr");
                                    let idCell = document.createElement("td");
                                    let userIdCell = document.createElement("td");
                                    let productNameCell = document.createElement("td");
                                    let fechaPedidoCell = document.createElement("td");
                                    let fechaEntregaCell = document.createElement("td");
                                    let estadoEnvioCell = document.createElement("td");

                                    idCell.innerHTML = order.id;
                                    userIdCell.innerHTML = order.usuario.id;

                                    let orderProduct = orderProducts.find(op => op.order.id === order.id);
                                    if (orderProduct) {
                                        productNameCell.innerHTML = orderProduct.product.nombre;
                                    } else {
                                        productNameCell.innerHTML = "Producto no encontrado";
                                    }

                                    fechaPedidoCell.innerHTML = order.fechaPedido;

                                    let delivery = deliveries.find(d => d.order.id === order.id);
                                    if (delivery && delivery.fechaEntrega) {
                                        fechaEntregaCell.innerHTML = delivery.fechaEntrega;
                                    } else {
                                        fechaEntregaCell.innerHTML = "No disponible";
                                    }

                                    estadoEnvioCell.innerHTML = delivery ? delivery.status : "No disponible";

                                    row.appendChild(idCell);
                                    row.appendChild(userIdCell);
                                    row.appendChild(productNameCell);
                                    row.appendChild(fechaPedidoCell);
                                    row.appendChild(fechaEntregaCell);
                                    row.appendChild(estadoEnvioCell);

                                    tableBody.appendChild(row);
                                });

                                console.log(orders);
                                console.log(orderProducts);
                                console.log(deliveries);
                            })
                            .catch(error => {
                                console.error("Error al obtener datos de DeliveryModel: ", error);
                            });
                    })
                    .catch(error => {
                        console.error("Error al obtener datos de OrderProductModel: ", error);
                    });
            })
            .catch(error => {
                console.error("Error al obtener datos de OrderModel: ", error);
            });