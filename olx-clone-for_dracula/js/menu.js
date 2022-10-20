function describe(it) {
    x = document.getElementById("target1");
    a = (it.title);
    x.innerHTML = a;
    y = document.getElementById("target2");
    b = (it.alt);
    y.innerHTML = b;
}



//For ordering information
function billingFunction() {
    if (document.getElementById("same").checked) {
        document.getElementById('billingName').value = document.getElementById('shippingName').value;
        document.getElementById('billingZip').value = document.getElementById('shippingZip').value;
    }

    else{
        document.getElementById('billingName').value = "";
        document.getElementById('billingZip').value = "";
    }
}