// Load states dynamically
fetch("/api/states")
    .then(res => res.json())
    .then(states => {
        const select = document.getElementById("stateSelect");
        states.forEach(state => {
            const option = document.createElement("option");
            option.value = state;
            option.text = state;
            select.appendChild(option);
        });
    });

function getStateInfo() {
    const state = document.getElementById("stateSelect").value;
    if (!state) return;

    fetch(`/api/states/${state}`)
        .then(res => res.json())
        .then(data => {
            document.getElementById("stateCard").classList.remove("hidden");

            document.getElementById("stateName").innerText = data.stateName;
            document.getElementById("capital").innerText = data.capital;
            document.getElementById("population").innerText = data.population;
            document.getElementById("area").innerText = data.area;
            document.getElementById("literacy").innerText = data.literacyRate;
            document.getElementById("language").innerText = data.language;
        });
}