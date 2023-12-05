function buscarProducto(productoId) {
    // Obtén y muestra la información del producto
    getProductById(productoId);
    
    // Obtén y muestra los comentarios del producto
    getReviewsByProductId(productoId);
}

function getProductById(productoId) {
    const url = `http://localhost:8080/productos/findById?id=${productoId}`;

    fetchProducto(url);
}

function getReviewsByProductId(productoId) {
    const reviewsUrl = `http://localhost:8080/reviews/findByProductId?id=${productoId}`;

    fetch(reviewsUrl, {
        method: 'GET',
        headers: {
            'Content-Type': 'application/json'
        }
    })
        .then(response => response.json())
        .then(reviewsData => {
            displayReviews(reviewsData);
        })
        .catch(error => {
            console.error("Hubo un error al obtener los comentarios: ", error);
            showError("ERROR: No se pudieron obtener los comentarios para este producto.");
        });
}

function fetchProducto(url) {
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

function displayReviews(reviews) {
    const reviewsContainer = document.getElementById("reviewsContainer");

    // Limpiar el contenedor de comentarios antes de mostrar nuevos comentarios
    reviewsContainer.innerHTML = "";

    if (reviews.length > 0) {
        reviews.forEach(review => {
            const reviewElement = document.createElement("div");
            reviewElement.className = "review";
            reviewElement.innerHTML = `
                <p>Calificación: ${review.calificacion}</p>
                <p>Comentario: ${review.comentario}</p>
                <p>Usuario: ${review.usuario.nombre}</p>
                <p>Fecha de Creación: ${review.fechaCreacion}</p>
            `;
            reviewsContainer.appendChild(reviewElement);
        });
    } else {
        // Si no hay comentarios, mostrar un mensaje
        const noReviewsMessage = document.createElement("p");
        noReviewsMessage.textContent = "No hay comentarios para este producto.";
        reviewsContainer.appendChild(noReviewsMessage);
    }
}

// Obtén el parámetro de la URL que indica el productoId
const urlParams = new URLSearchParams(window.location.search);
const productoId = urlParams.get("productoId");

if (productoId) {
    // Si hay un parámetro de productoId, busca y muestra el producto y sus comentarios
    buscarProducto(productoId);
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

// function displayProducts(products) {
//     // Implementa la lógica para mostrar la lista de productos
//     // Puedes adaptar esta función según tus necesidades.
// }


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
