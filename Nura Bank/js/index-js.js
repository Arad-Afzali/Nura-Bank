window.onload = function () {
  setTimeout(function () {
    document
      .querySelectorAll("#header, #nura-bank, #producers, #social-media")
      .forEach(function (element) {
        element.classList.add("visible");
      });
  }, 2000);
};
