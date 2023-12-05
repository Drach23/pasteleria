// cargarCategorias.js
/**
 * IMPORTANTE
 * Al añadir una categoria, se debe agregar a la imagen a la carpeta en img/categorias
 * y el nombre de la imagen debe ser el id de la categoria y debe ser un archivo .jpg
 * De no ponerse ese nombre a la imagen, va explotar :D
 */


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
    const rutaImagen = `../img/categorias/${categoria.id}.jpg`;
    const divCategoria = document.createElement("div");
    divCategoria.className = "categoria";

    // Agrega la información de la categoría al div
    divCategoria.innerHTML = `
        <a href="producto.html?categoriaId=${encodeURIComponent(categoria.id)}" onclick=filtrarPorCategoria(${categoria.id})>
            <img src="${rutaImagen}" alt="${categoria.categoryName}" class="categoria-imagen">
        </a>
        <h3>${categoria.categoryName}</h3>
    `;

    // Agrega el div de la categoría al contenedor
    categoriasContainer.appendChild(divCategoria);
}
