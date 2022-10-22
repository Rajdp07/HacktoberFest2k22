const date = new Date();
const renderCalender = ()=>{const month = [
    "January",
    "February",
    "March",
    "April",
    "May",
    "June",
    "July",
    "August",
    "September",
    "October",
    "November",
    "December",
];
const monthdays = document.querySelector(".days");
const lastday = new Date(date.getFullYear(),date.getMonth()+1,0).getDate();
date.setDate(1);
const firstDayIndex = date.getDay();
console.log(firstDayIndex);
const prevlastday =new Date(date.getFullYear(),date.getMonth(),0).getDate(); 
console.log(prevlastday);
const lastdayindex =new Date(date.getFullYear(),date.getMonth()+1,0).getDay(); 
const nextdays = 7 - lastdayindex - 1;


document.querySelector(".dates h1").innerHTML = month[date.getMonth()];
document.querySelector(".dates p").innerHTML = new Date().toDateString();

let days = "";
for(let j = firstDayIndex;j>0;j--){
    days+= `<div class="prev-days">${prevlastday - j + 1}</div>`;
    
}
for(let i = 1;i<=lastday;i++){
    if(i=== new Date().getDate() && date.getMonth()===new Date().getMonth()){
        days+=`<div class="today">${i}</div>`;

    }
    else{
        days+=`<div>${i}</div>`;
    }
    
}
    



for(let x = 1; x<=nextdays;x++){
    days +=`<div class="next-days">${x}</div>`;
   
}
monthdays.innerHTML = days;

}
console.log(date);


document.querySelector('.prev').addEventListener('click',()=>{
    date.setMonth(date.getMonth() - 1);
    renderCalender();

})

document.querySelector('.next').addEventListener('click',()=>{
    date.setMonth(date.getMonth() + 1);
    renderCalender();
})

renderCalender();

