//AES
function encrypt() {
  let encrypted = CryptoJS.AES.encrypt(
    document.getElementById("text").value,
    document.getElementById("password").value
  );
  document.getElementById("encryptedValue").innerHTML = encrypted;
  document.getElementById("decrypted").innerHTML = "";
}

function decrypt() {
  let decrypted = CryptoJS.AES.decrypt(
    document.getElementById("encryptedValue").innerHTML,
    document.getElementById("password").value
  ).toString(CryptoJS.enc.Utf8);

  document.getElementById("decrypted").innerHTML = decrypted;
  document.getElementById("encryptedValue").innerHTML = "";
}
//RSA
//tab switch
function onTabClick(event) {
  let activeTabs = document.querySelectorAll(".active");

  // deactivate existing active tab and panel

  activeTabs.forEach(function (tab) {
    tab.className = tab.className.replace("active", "");
  });

  // activate new tab and panel
  event.target.parentElement.className += " active";
  document.getElementById(event.target.href.split("#")[1]).className +=
    " active";
}

const element = document.getElementById("nav-tab");

element.addEventListener("click", onTabClick, false);
