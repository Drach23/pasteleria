// cargarCategorias.js

const url_categoria = "http://localhost:8080/categorias";  

// Realiza la solicitud de datos al servidor
fetch(url_categoria)
    .then(response => response.json())
    .then(data => {
        // Itera sobre las categorías y crea un div para cada una
        data.forEach(categoria => {
            crearDivCategoria(categoria);
        });
    })
    .catch(error => console.error("Error al obtener datos de categorías:", error));

function crearDivCategoria(categoria) {
    const categoriasContainer = document.getElementById("categoriasContainer");

    // Crea un nuevo div para la categoría
    const divCategoria = document.createElement("div");
    divCategoria.className = "categoria";

    // Agrega la información de la categoría al div
    divCategoria.innerHTML = `
        <h3>${categoria.categoryName}</h3>
        <a href="producto.html?categoriaId=${encodeURIComponent(categoria.id)}" onclick=filtrarPorCategoria(${categoria.id})>
            Ver productos
        </a>
    `;

    // Agrega el div de la categoría al contenedor
    categoriasContainer.appendChild(divCategoria);
}
