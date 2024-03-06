const fs = require("fs");

const input = fs.readFileSync("/dev/stdin").toString().trim().split(" "); //여러 줄 입력받을 때
for (let i = 0; i < input.length; i++) {
  input[i] = Number(input[i]);
}
let chessArr = [1, 1, 2, 2, 2, 8];

let answer = "";
for (let i = 0; i < chessArr.length; i++) {
  let res = chessArr[i] - input[i];
  answer += `${res} `;
}
console.log(answer);