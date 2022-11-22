
var com = (Math.floor(Math.random() * 3) + 1);
var user = prompt();
var my;
switch (user) {
	case "가위":
		my = 1;
	case "바위":
		my = 2;
	case "보":
		my = 3;
}

switch (my) {
	case 1:
		switch (com) {
			case 1:
				alert("비김");
				break;
			case 2:
				alert("짐");
				break;
			case 3:
				alert("이김");
				break;
		}
	case 2:
		switch (com) {
			case 1:
				alert("이김");
				break;
			case 2:
				alert("비김");
				break;
			case 3:
				alert("짐");
				break;
		}
	case 3:
		switch (com) {
			case 1:
				alert("짐");
				break;
			case 2:
				alert("이김");
				break;
			case 3:
				alert("비김");
				break;
		}
}
