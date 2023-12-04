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

function validateForm(){
    let name = document.getElementById("inputName").value;
    let lastName = document.getElementById("inputLastName").value;
    let phone = document.getElementById("inputPhone").value;
    let email = document.getElementById("inputEmail").value;
    let password = document.getElementById("inputPassword").value;

    if(name === "" || lastName === "" || phone === "" || email === "" || password === ""){
        // Al menos un campo está vacío
        const errorDiv = document.getElementById("errorMessage");
        errorDiv.innerText = "Por favor, complete todos los campos.";
        errorDiv.classList.add("error-message");

        // Eliminar el mensaje de error después de 5 segundos
        setTimeout(function () {
            errorDiv.innerText = "";
            errorDiv.classList.remove("error-message");
        }, 5000);

        return false; // Evita el envío del formulario si hay campos vacíos
    }

    // Todos los campos están llenos, mostrar mensaje de registro exitoso
    registerSuccessMessage();

    return true;
}

function userRegister(){
    let name = document.getElementById("inputName").value;
    let lastName = document.getElementById("inputLastName").value;
    let phone = document.getElementById("inputPhone").value;
    let email = document.getElementById("inputEmail").value;
    let password = document.getElementById("inputPassword").value;

    console.log(name, lastName, phone, email, password);

    const userData = {
        nombre: name,
        apellido: lastName,
        telefono: phone,
        email: email,
        contraseña: password
    }

    const url = "http://localhost:8080/user";

    const requestOptions = {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(userData)
    }

    fetch(url, requestOptions)
        .then((response) => {
            if (response.ok) {
                return response.json();
            } else {
                throw new Error('Error al registrar usuario : ');
            }
        })
        .then((data) => {
            console.log('Usuario registrado con éxito', data);
        })
        .catch((error) => {
            console.log('Error al realizar el registro', error);
        });
}