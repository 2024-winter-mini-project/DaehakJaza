var imgCheck = 0;

function changeScrapImg(){
	var img = document.getElementById("scrap-img");

	if(imgCheck == 0){
		img.src = "../img/cancelScrap.png";
		imgCheck = 1;
	}else{
		img.src = "../img/doScrap.png";
		imgCheck = 0;
	}

}

function like(){
	var button = document.getElementById("like-button");

	const likeNum = document.getElementById("like-num")

	let num = likeNum.innerText
	num = parseInt(num) + 1;

	likeNum.innerText = num;

	button.disabled = true;
}

