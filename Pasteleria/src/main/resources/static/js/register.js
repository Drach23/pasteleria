function registerSuccessMessage() {
    // Código anterior para el mensaje de registro exitoso...
  }
  
  function validateForm() {
    const name = document.getElementById("inputName").value.trim();
    const lastName = document.getElementById("inputLastName").value.trim();
    const phone = document.getElementById("inputPhone").value.trim();
    const email = document.getElementById("inputEmail").value.trim();
    const password = document.getElementById("inputPassword").value;
  
    const errorDiv = document.getElementById("errorMessage");
  
    if (name === "" || lastName === "" || phone === "" || email === "" || password === "") {
      // Código anterior para campos vacíos...
    }
  
    if (!validateEmail(email)) {
      errorDiv.innerText = "Por favor, introduzca un correo electrónico válido.";
      errorDiv.classList.add("error-message");
  
      // Eliminar el mensaje de error después de 5 segundos
      setTimeout(function () {
        errorDiv.innerText = "";
        errorDiv.classList.remove("error-message");
      }, 5000);
  
      return false; // Evita el envío del formulario si el correo electrónico no es válido
    }
  
    if (!validatePhoneNumber(phone)) {
      errorDiv.innerText = "Por favor, introduzca un número de teléfono válido (10 dígitos).";
      errorDiv.classList.add("error-message");
  
      // Eliminar el mensaje de error después de 5 segundos
      setTimeout(function () {
        errorDiv.innerText = "";
        errorDiv.classList.remove("error-message");
      }, 5000);
  
      return false; // Evita el envío del formulario si el número de teléfono no es válido
    }
  
    if (!validateName(name) || !validateName(lastName)) {
      errorDiv.innerText = "Nombre y apellido no pueden contener símbolos.";
      errorDiv.classList.add("error-message");
  
      // Eliminar el mensaje de error después de 5 segundos
      setTimeout(function () {
        errorDiv.innerText = "";
        errorDiv.classList.remove("error-message");
      }, 5000);
  
      return false; // Evita el envío del formulario si el nombre o apellido contienen símbolos
    }
  
    if (password.length < 8) {
      errorDiv.innerText = "La contraseña debe tener al menos 8 caracteres.";
      errorDiv.classList.add("error-message");
  
      // Eliminar el mensaje de error después de 5 segundos
      setTimeout(function () {
        errorDiv.innerText = "";
        errorDiv.classList.remove("error-message");
      }, 5000);
  
      return false; // Evita el envío del formulario si la contraseña es demasiado corta
    }
  
    // Si todo está bien, mostrar mensaje de registro exitoso
    registerSuccessMessage();
    return true;
  }
  
  function validateEmail(email) {
    const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    return emailRegex.test(email);
  }
  
  function validatePhoneNumber(phone) {
    const phoneRegex = /^\d{10}$/;
    return phoneRegex.test(phone);
  }
  
  function validateName(name) {
    const symbolsRegex = /[-!$%^&*()_+|~=`{}\[\]:";'<>?,.\/]/;
    return !symbolsRegex.test(name);
  }
  
  function userRegister() {
    // Código anterior para registro de usuario...
  }
  