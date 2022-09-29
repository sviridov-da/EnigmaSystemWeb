function fillCampTable(){
    fetch('http://localhost:8080/api/camps/')
        .then((response) => {
            return response.json();
        })
        .then((data) => {
            showCamps(data);
        });
}

function showCamps(data){
    let CampsTable = document.getElementById("all-camps-view");
    data.forEach(element => addCampToTable(CampsTable, element));
}


function addCampToTable(table, camp){
    let date = new Date(camp.startDate);
    table.innerHTML+=
        "  <div class=\"col-sm-4\">" +
        "<div class='card my-2' >" +
        "  <img src='/images/camps/"+camp.image + "'"+
        "class=\"card-img-top\" alt=\"...\">\n" +
        "  <div class=\"card-body\">\n" +
        "    <h5 class=\"card-title\">"+camp.title+"</h5>\n" +
        "    <p class='card-text'><i>Начало: "+date.toLocaleDateString()+"</i></p>" +
        "    <p class=\"card-text\">"+camp.description+"</p>" +
        "    <a href='/camps/"+camp.id+"' class='px-auto'><button class='btn btn-primary px-auto'>Подробнее</button></a>" +
        "  </div>\n" +
        "</div> " +
        " </div>";
}

fillCampTable();