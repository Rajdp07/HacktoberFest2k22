
// For Header
let header = document.querySelector("header")

let headerNav = document.querySelector("header nav")
  

window.onscroll = function() {scrollFunction()};

function scrollFunction() {
  if (document.body.scrollTop > 50 || document.documentElement.scrollTop > 50) {
    header.classList.add("small")
  } else {
    header.classList.remove("small")
  }
} 

// For Menu 
let menuBtn = document.querySelector(".menu-btn")
	menuBtn.addEventListener("click", () => {

		menuBtn.classList.toggle("active")
		headerNav.classList.toggle("active")

})
  
// For highlights
let highlights = {
	today: [
		{
		img: "./burger.png",
		name: "Beef Burger",
		sides: "Chips",
		toppings: "Pepper Sauce",
		price: "5000"
	}
	],
	week: [
	{
	img: "./burger.png",
		name: "Beef Burger",
		sides: "Chips",
		toppings: "Pepper Sauce",
		price: "5000"
	}
	],
	month: [
	, 
	{
		img: "./honey.png",
		name: "Plain Pancakes",
		sides: "Chicken",
		toppings: "Honey",
		price: "2300"
	}
	],
}
let test = {
	today: [
		{
		img: "./burger.png",
		name: "Beef Burger",
		sides: "Chips",
		toppings: "Pepper Sauce",
		price: "5000"
	}, 
	{
		img: "./honey.png",
		name: "Plain Pancakes",
		sides: "Chicken",
		toppings: "Honey",
		price: "2300"
	},
	{
		img: "./fruits.png",
		name: "Plain Pancakes",
		sides: "Fruits",
		toppings: "Maple Syrup",
		price: "2300"
	},
	{
		img: "./nuggets.png",
		name: "Plain Pancakes",
		sides: "Fruits",
		toppings: "Maple Syrup",
		price: "2300"
	}
	],
	week: [
	{
		name: "Sapa Pancakes",
		sides: "Chicken Wings",
		toppings: "Pepper Sauce",
		price: "5000"
	}
	],
	month: [
	{
		name: "Zazu Pancakes",
		sides: "Chicken Wings",
		toppings: "Zeh Sauce",
		price: "5000"
	}
	],
}

let createHighlight = (data, target) => {
	let title = document.createElement("h3")
	title.innerText = data.name
		let sides = document.createElement("p")
	sides.innerText = data.sides
	let toppings = document.createElement("p")
	toppings.innerText = data.toppings
	let price = document.createElement("p")
	price.innerText = "N" + data.price
	let order = document.createElement("button")
	order.innerText = "Place Order"
	
	let info = document.createElement("div")
	info.classList.add("order_info")
	info.appendChild(title)
	info.appendChild(sides)
	info.appendChild(toppings)
	info.appendChild(price)
	info.appendChild(order)
	let img = document.createElement("div")
	img.classList.add("order_img")
	img.style.background = "url("+data.img+")";
	img.style.backgroundPosition = "0px";
	img.style.backgroundSize = "120px";
	img.style.backgroundRepeat = "no-repeat";
		let body = document.createElement("div")
	body.classList.add("order")
	body.classList.add("fade-in")
	body.appendChild(img)
	body.appendChild(info)	
	target.appendChild(body)	
}


let highlightsSlides = document.querySelector(".highlights_slides")

// For highlights nav
let highlightNavs = document.querySelectorAll(".highlights_nav .nav_item")

highlightNavs.forEach(item => {
	item.addEventListener("click", () => {
		highlightNavs.forEach(targ => {
			targ.classList.remove("nav_item-active")
		})
		item.classList.add("nav_item-active")


		highlights[item.getAttribute("data-option")].forEach(item => {
			highlightsSlides.innerHTML = ""
	createHighlight(item, highlightsSlides)
	
})
	})
})


		highlights.today.forEach(item => {
			highlightsSlides.innerHTML = ""
	createHighlight(item, highlightsSlides)
	
})