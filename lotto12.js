//내 수
var my_num = [];
for (var i = 0; i < 6; i++) {

    my_num[i] = Number(prompt());
}
//컴퓨터 수
var com_num = [];
// com_num[0] = Math.floor(Math.random() * 45) + 1;
//배열안의 모든 요소가 서로 다른 알고리즘
for (var i = 0; i < 6; i++) {
    com_num[i] = Math.floor(Math.random() * 45) + 1;
    for (var k = 0; k < i; k++) {
        if (com_num[i] != com_num[k]) {
            continue;
        } else {
            com_num[i] = Math.floor(Math.random() * 45) + 1;
        }
    }
}
//보너스 번호
while (true) {
    com_num[6] = Math.floor(Math.random() * 45) + 1;
    for (var i = 0; i < 6; i++) {
        if (com_num[i] == com_num[6]) {
            break;
        }
        else {
            continue;
        }
    }
    break;
}


//내수와 컴퓨터수 비교
var cnt = 0;
var error=0;
for (var i = 0; i < my_num.length; i++) {
    for (var j = 0; j < com_num.length-1; j++) {
        if (my_num[i] == com_num[j]) {
            cnt += 1;
        }
        else continue;
    }
}
dw('맞은 개수 : '+cnt);
br();
if (cnt < 2) {
    dw("꽝입니다");
}
else if (cnt == 3) {
    dw("5등입니다");
}
else if (cnt == 4) {
    dw("4등입니다");
}
else if (cnt == 5) {
    for (var i = 0; i < my_num.length; i++) {
        if(com_num[6] == my_num[i]){
            error++;
        }
    }
    if(error != 0 ){
        dw("2등입니다");
    }
    else {dw("3등입니다");
    }
}
else dw("1등입니다");
br();
dw('나의 번호 : '+my_num);
br();
dw('로또 번호 : '+com_num);