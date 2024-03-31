const fs = require("fs");
let input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n"); //여러 줄 입력받을 때

/* 
    1. 가로에서 비교
    2. 세로에서 비교
  */
let arr = new Array();
arr = input.map((e) => {
  return (e = e.split(" "));
});

let count = 0;

/* 
  가로 비교: 각 행 처음 문자를 기준, 가로 줄을 비교
  -> input[0][0], input[1][0], ...
    -> input[i][0] for 0 to input.length
  세로 비교: 각 열 처음 문자를 기준, 세로 줄을 비교
  -> input[0][0], input[0][1], ...
    -> input[i][j] for 0 to input[i].length
*/

for (let i = 0; i < arr.length; i++) {
  let horizCh = arr[i][0]; //가로 검사
  let vertiCh = arr[0][i]; //세로 검사

  for (let j = 0; j < arr[i].length; j++) {
    //가로 줄 비교
    if (arr[i][j] != horizCh) {
      break;
    }
    if (j == arr[i].length - 1 && arr[i][j] == horizCh) {
      count++;
    }
  }
  //세로 줄 비교
  for (let k = 0; k < arr.length; k++) {
    if (arr[k][i] != vertiCh) {
      break;
    }
    if (k == arr.length - 1 && arr[k][i] == vertiCh) {
      count++;
    }
  }
}

count > 0 ? console.log(1) : console.log(0);
