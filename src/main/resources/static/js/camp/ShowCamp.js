function fillCampInfo(campId){
    fetch('http://localhost:8080/api/camps/'+getCurrentCampId())
        .then((response) => {
            if(!response.ok){
                window.location.replace("/notfound")
                return false;
            }
            return response.json();
        })
        .then((data) => {
            if(data != false) {
                showCampInfo(data);
            }
        });

    fetch('http://localhost:8080/api/groups?camp_id='+getCurrentCampId())
        .then((response) => {
            return response.json();
        })
        .then((data) => {
            showGroups(data);
        });
}

function getCurrentCampId(){
    let path = window.location.pathname;
    return path.charAt(path.length-1);
}

function showCampInfo(data){
    let CampTitle = document.getElementById("camp_title");
    CampTitle.innerText = data.title;
}

function showGroups(data){
    let GroupsTable = document.getElementById("CampDataTable");
    data.forEach(element => addGroupToTable(GroupsTable, element));
}

function addGroupToTable(table, group){
    table.innerHTML+=
        "<tr>" +
            "<td>" + group.title + "</td>" +
        "</tr>"
}

fillCampInfo();