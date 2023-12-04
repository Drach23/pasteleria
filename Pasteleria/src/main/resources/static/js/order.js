document.addEventListener("DOMContentLoaded", () => {
    const dataTable = document.getElementById("orderTable").getElementsByTagName("tbody")[0];
    const apiUrl = 'http://localhost:8080/order';

    // Make an HTTP request to get the JSON data
    fetch(apiUrl)
        .then(response => response.json())
        .then(data => {
            // Iterate through the JSON data and populate the table
            data.forEach(item => {
                const row = dataTable.insertRow();
                const idCell = row.insertCell(0)
                const productCell = row.insertCell(1);
                const adressBranchCell = row.insertCell(2);
                const fechaPedidoCell = row.insertCell(3);
                const estadoCell = row.insertCell(4);
                

                idCell.innerHTML = item.id;
                productCell.innerHTML = item.product;
                adressBranchCell.innerHTML = item.adressBranch;
                fechaPedidoCell.innerHTML = item.fechaPedido;
                estadoCell.innerHTML = item.estado;
            });
        })
        .catch(error => {
            console.error('Error fetching data:', error);
        });
});