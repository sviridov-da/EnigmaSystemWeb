function getUser1(){
    fetch('http://localhost:8080/users/1')
        .then((response) => {
            return response.json();
        })
        .then((data) => {
            showUser(data);
        });
}

function showUser(data){
    document.getElementById("user-info").innerText = "Name: " + data.name + "\nAge: " + data.age;
}

