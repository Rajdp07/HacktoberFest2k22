let a;
let time;
let date;
let currenthour;
let currentmin;
let currentsec;
let timeofday;
const options = { weekday: 'long', year: 'numeric', month: 'long', day: 'numeric' };

setInterval(() => {
    a = new Date();
    currenthour =  a.getHours();
    currenthour = (currenthour < 10 ? "0" : "")+currenthour;
    currentmin = a.getMinutes();
    currentmin =(currentmin<10 ? "0" :"")+currentmin;
    currentsec = a.getSeconds();
    currentsec =(currentsec<10 ? "0":"")+currentsec;
    timeofday = (currenthour < 12 ? "AM" : "PM");
    time =currenthour + " : "+currentmin +" : "+currentsec +" "+timeofday;
    date = a.toLocaleDateString(undefined,options);
    
    document.getElementById("time").innerHTML = time + " On "+  date;   
}, 1000);