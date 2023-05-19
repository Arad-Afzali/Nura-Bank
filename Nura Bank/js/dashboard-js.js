let btn = document.querySelector("#btn");
let colleft = document.querySelector(".column-left");
let colmid = document.querySelector(".column-middle");
let colright = document.querySelector(".column-right");

function myFunction () {
  colleft.classList.toggle("active");
  colmid.classList.toggle("active");
  colright.classList.toggle("active");
};



const optionElement = document.querySelector('#copy-card');
optionElement.addEventListener('click', () => {
  const text = document.querySelector('#card-number').textContent;
  navigator.clipboard.writeText(text);

  alert('Copied to clipboard!');
});

const optionElement2 = document.querySelector('#online-pass-button');
optionElement2.addEventListener('click',() => {
  alert('You will receive a text message with your password soon.')
})


function toggledeactive() {
  var button = document.getElementById("active-deactive-button");
  var activespan = document.getElementById("activespan");
  var status = document.getElementById("status");
  if (button.classList.contains("active")) {
    button.classList.remove("active");
    button.style.backgroundColor = "#f45050";
    button.innerHTML = "Deactive";
    activespan.style.color = "green";
    activespan.innerHTML = "Active";
    status.style.border = "3px solid green"
  } else {
    button.classList.add("active");
    button.style.backgroundColor = "green";
    button.innerHTML = "Active";
    activespan.style.color = "#f45050";
    activespan.innerHTML = "Deactive";
    status.style.border = "3px solid red"

  }
}
