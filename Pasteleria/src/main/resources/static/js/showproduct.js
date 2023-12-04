function getProductsByCategoria(categoriaId) {
    const url = `http://localhost:8080/productos/findByCategoria?categoriaId=${categoriaId}`;

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
            showError("ERROR: No se encontraron productos para la categoría seleccionada");
        });
}

// Obtén el parámetro de la URL que indica la categoría
const urlParams = new URLSearchParams(window.location.search);
const categoriaId = urlParams.get("categoriaId");

if (categoriaId) {
    // Si hay un parámetro de categoría, obtén productos filtrados por esa categoría
    getProductsByCategoria(categoriaId);
} else {
    // Si no hay un parámetro de categoría, carga todos los productos
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

function displayProducts(products) {
    const productContainer = document.getElementById("productContainer");

    products.forEach(producto => {
        const rutaImagen = `../img/products/${producto.id}.jpg`;
        const divProducto = document.createElement("div");
        divProducto.className = "producto";

        divProducto.innerHTML = `
            <h2>${producto.nombre}</h2>
            <img src="${rutaImagen}" alt="${producto.nombre}" class="producto-imagen">
            <p>Precio: ${producto.precio}</p>
            <p>Descripción: ${producto.descripcion}</p>
        `;

        productContainer.appendChild(divProducto);
    });
}

function showError(message) {
    // Implementa la lógica para mostrar un mensaje de error en la interfaz de usuario
    console.error(message);
}
