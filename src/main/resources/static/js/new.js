const title = document.getElementById('title');
const tag = document.getElementById('tag');
const btn = document.getElementById('submit');

function ableCheck(){
	const titleCheck = title.value;
	const tagCheck = tag.value;

	if(titleCheck.length >=1 && tagCheck.length>=1){
		btn.disabled = false;
		btn.style.opacity = "1";
		btn.style.cursor = 'pointer';
	}else{
		btn.disabled = true;
		btn.style.opacity = "0.3";
		btn.style.cursor = 'defualt';
	}
}

btn.addEventListener('click', () => {
 
})
 
 
title.addEventListener("keyup", ableCheck) 

tag.addEventListener("keyup", ableCheck)