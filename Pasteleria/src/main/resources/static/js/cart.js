document.addEventListener("DOMContentLoaded", () => {
    const dataTable = document.getElementById("cartTable").getElementsByTagName("tbody")[0];
    const apiUrl = 'http://localhost:8080/';

    function updateTotal() {
        const dataTable = document.getElementById("cartTable").getElementsByTagName("tbody")[0];
        const rows = dataTable.getElementsByTagName("tr");
        let total = 0;
    
        // Iterar sobre cada fila de la tabla
        for (let i = 0; i < rows.length; i++) {
            const precioCell = rows[i].getElementsByTagName("td")[3]; // La celda que contiene el precio
    
            // Obtener el precio como un número y sumarlo al total
            total += parseFloat(precioCell.innerHTML.replace("$", ""));
        }
    
        // Actualizar el elemento HTML que muestra el total
        const totalAmountElement = document.getElementById("totalAmount");
        totalAmountElement.innerHTML = "$" + total.toFixed(2); // Mostrar el total con dos decimales
    }
    // Make an HTTP request to get the JSON data
    fetch(apiUrl)
        .then(response => response.json())
        .then(data => {
            // Iterate through the JSON data and populate the table
            data.forEach(item => {
                const row = dataTable.insertRow();
                const idCell = row.insertCell(0)
                const productCell = row.insertCell(1);
                const cantidadCell = row.insertCell(2);
                const precioCell = row.insertCell(3);
                
                idCell.innerHTML = item.id;
                productCell.innerHTML = item.product;
                cantidadCell.innerHTML = item.cantidad;
                precioCell.innerHTML = item.precio;
            });
            // After populating the table, update the total
            updateTotal();
        })
        .catch(error => {
            console.error('Error fetching data:', error);
        });
});