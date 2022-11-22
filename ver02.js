var user = prompt("가위바위보");
while (true) {
    if (user == "가위" || user == "바위" || user == "보") {
        break;
    }
    alert("다시 입력하세요");
}

var com = (Math.floor(Math.random() * 3) + 1);
if (com == 1) {
    com = "가위";
}
else if (com == 2) {
    com = "바위";
}
else {
    com = "보";
}

switch (user) {
    case "가위":
        switch (com) {
            case "가위":
                alert("비김");
                break;
            case "바위":
                alert("짐");
                break;
            case "보":
                alert("이김");
                break;
        }
        break;
    case "바위":
        switch (com) {
            case "가위":
                alert("이김");
                break;
            case "바위":
                alert("비김");
                break;
            case "보":
                alert("짐");
                break;
        }
        break;
    case "보":
        switch (com) {
            case "가위":
                alert("짐");
                break;
            case "바위":
                alert("이김");
                break;
            case "보":
                alert("비김");
                break;
        }
        break;
}

