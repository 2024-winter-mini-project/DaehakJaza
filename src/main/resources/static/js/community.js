var dropdown2 = document.querySelector(".select-standard");
var dropdownContent2 = document.querySelector(".dropdown-standard");

var elements = document.querySelectorAll(".standard-choose");

for(let i=0; i< elements.length; i++){
	elements[i].addEventListener("click", function(){
		var standard = document.querySelector(".ss");
		standard.innerText = elements[i].innerText;
	});

}

dropdown2.addEventListener("click", function(event) {
  if (dropdownContent2.style.display === "block") {
      dropdownContent2.style.display = "none";
  } else{
      dropdownContent2.style.display = "block";
  }
});



