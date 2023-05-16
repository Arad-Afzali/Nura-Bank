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

