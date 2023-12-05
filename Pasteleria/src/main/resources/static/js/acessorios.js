function registerSuccessMessage() {
    const successDiv = document.getElementById("successMessage");
    successDiv.innerText = "Registro exitoso.";
    successDiv.classList.add("success-message");

    // Eliminar el mensaje de éxito después de 5 segundos
    setTimeout(function () {
        successDiv.innerText = "";
        successDiv.classList.remove("success-message");
    }, 5000);
}

function registerAccessory() {
    let nombre = document.getElementById("inputNombre").value;
    let descripcion = document.getElementById("inputDescripcion").value;
    let costoAdicional = document.getElementById("inputCostoAdicional").value;
    let status = document.getElementById("inputStatus").value;

    if (nombre === "" || descripcion === "" || costoAdicional === "" || status === "") {
        // Al menos un campo está vacío
        const errorDiv = document.getElementById("errorMessage");
        errorDiv.innerText = "Por favor, complete todos los campos.";
        errorDiv.classList.add("error-message");

        // Eliminar el mensaje de error después de 5 segundos
        setTimeout(function () {
            errorDiv.innerText = "";
            errorDiv.classList.remove("error-message");
        }, 5000);
        
        return; // Evita el envío del formulario si hay campos vacíos
    }

    // Todos los campos están llenos, realizar registro en el backend
    const accessoryData = {
        nombre: nombre,
        descripcion: descripcion,
        costoAdicional: costoAdicional,
        status: status
    };

    const url = "http://localhost:8080/accesorios";

    const requestOptions = {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(accessoryData)
    };

    fetch(url, requestOptions)
        .then((response) => {
            if (response.ok) {
                return response.json();
            } else {
                throw new Error('Error al registrar accesorio : ');
            }
        })
        .then((data) => {
            console.log('Accesorio registrado con éxito', data);
            // Mostrar mensaje de éxito
            registerSuccessMessage();
        })
        .catch((error) => {
            console.log('Error al realizar el registro del accesorio', error);
            // Mostrar mensaje de error
            const errorDiv = document.getElementById("errorMessage");
            errorDiv.innerText = "Error al registrar accesorio.";
            errorDiv.classList.add("error-message");

            // Eliminar el mensaje de error después de 5 segundos
            setTimeout(function () {
                errorDiv.innerText = "";
                errorDiv.classList.remove("error-message");
            }, 5000);
        });
}
