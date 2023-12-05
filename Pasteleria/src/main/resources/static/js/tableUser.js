const url = "http://localhost:8080/user";
        
        fetch(url)
            .then(response => response.json())
            .then(data => {
                let tableBody = document.getElementById("userTableBody");

                data.forEach(function (user) {
                    let row = document.createElement("tr");
                    let idCell = document.createElement("td");
                    let nameCell = document.createElement("td");
                    let lastNameCell = document.createElement("td");
                    let emailCell = document.createElement("td");
                    let phoneCell = document.createElement("td");

                    idCell.innerHTML = user.id;
                    nameCell.innerHTML = user.nombre;
                    lastNameCell.innerHTML = user.apellido;
                    emailCell.innerHTML = user.email;
                    phoneCell.innerHTML = user.telefono;

                    row.appendChild(idCell);
                    row.appendChild(nameCell);
                    row.appendChild(lastNameCell);
                    row.appendChild(emailCell);
                    row.appendChild(phoneCell);

                    tableBody.appendChild(row);
                });
            })
            .catch(error => {
                console.error("Tuvimos este error: ", error);
            });