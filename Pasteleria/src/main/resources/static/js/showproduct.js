const url = "http://localhost:8080/productos";

// Realiza la solicitud de datos al servidor
fetch(url)
    .then(response => response.json())
    .then(data => {
        // Itera sobre los productos y crea un div para cada uno
        data.forEach(producto => {
            crearDivProducto(producto);
        });
    })
    .catch(error => console.error("Error al obtener datos de productos:", error));

function crearDivProducto(producto) {
    const productContainer = document.getElementById("productContainer");

    // Construye la ruta de la imagen basada en el ID del producto
    const rutaImagen = `../img/products/${producto.id}.jpg`; // Utiliza acentos graves (backticks) aquí

    // Crea un nuevo div para el producto
    const divProducto = document.createElement("div");
    divProducto.className = "producto";

    // Agrega la información del producto al div, incluida la imagen
    divProducto.innerHTML = `
        <h2>${producto.nombre}</h2>
        <img src="${rutaImagen}" alt="${producto.nombre}" class="producto-imagen">
        <p>Precio: ${producto.precio}</p>
        <p>Descripción: ${producto.descripcion}</p>
    `;

    // Agrega el div del producto al contenedor
    productContainer.appendChild(divProducto);
}
