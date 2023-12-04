function buscarProducto(productoId) {
    const url = `http://localhost:8080/productos/findById?id=${productoId}`;

    fetch(url, {
        method: 'GET',
        headers: {
            'Content-Type': 'application/json'
        }
    })
        .then(response => response.json())
        .then(data => {
            console.log(data);
            displayProduct(data);
        })
        .catch(error => {
            console.error("Hubo un error: ", error);
            showError("ERROR: No se encontró el producto con el ID especificado");
        });
}

// Obtén el parámetro de la URL que indica el productoId
const urlParams = new URLSearchParams(window.location.search);
const productoId = urlParams.get("productoId");

if (productoId) {
    // Si hay un parámetro de productoId, obtén el producto por ese ID
    getProductById(productoId);
} else {
    // Si no hay un parámetro de productoId, carga todos los productos
    const url = "http://localhost:8080/productos";

    fetch(url, {
        method: 'GET',
        headers: {
            'Content-Type': 'application/json'
        }
    })
        .then(response => response.json())
        .then(data => {
            console.log(data);
            displayProducts(data);
        })
        .catch(error => {
            console.error("Hubo un error: ", error);
            showError("ERROR: No se encontraron productos");
        });
}

function getProductById(productoId) {
    const url = `http://localhost:8080/productos/findById?id=${productoId}`;

    fetch(url, {
        method: 'GET',
        headers: {
            'Content-Type': 'application/json'
        }
    })
        .then(response => response.json())
        .then(data => {
            console.log(data);
            displayProduct(data);
        })
        .catch(error => {
            console.error("Hubo un error: ", error);
            showError("ERROR: No se encontró el producto con el ID especificado");
        });
}

function displayProduct(producto) {
    const productContainer = document.getElementById("detalleProductoContainer");
    const rutaImagen = `../img/products/${producto.id}.jpg`;
    const divProducto = document.createElement("div");
    divProducto.className = "producto";

    divProducto.innerHTML = `
        <img src="${rutaImagen}" alt="${producto.nombre}" class="detalle-producto-imagen">
        <h2>${producto.nombre}</h2>
        <p>Precio: ${producto.precio}</p>
        <p>Descripción: ${producto.descripcion}</p>
    `;

    productContainer.appendChild(divProducto);
}
