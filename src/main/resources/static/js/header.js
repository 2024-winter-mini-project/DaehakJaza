var dropdown = document.querySelector(".my-info");
var dropdownContent = document.querySelector(".dropdown_content");


dropdown.addEventListener("click", function() {
  if (dropdownContent.style.display === "block") {
      dropdownContent.style.display = "none";
  } else {
      dropdownContent.style.display = "block";
  }
});

document.addEventListener('mouseup', function(e) {
	if (!dropdown.contains(e.target) && dropdownContent.style.display === "block") {
			dropdownContent.style.display = 'none';
	}
});