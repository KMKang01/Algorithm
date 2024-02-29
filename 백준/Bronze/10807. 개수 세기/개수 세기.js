const fs = require("fs");

const input = fs.readFileSync("/dev/stdin").toString().split("\n"); //여러 줄 입력받을 때

const countOfNum = parseInt(input[0]);
const arr = input[1].split(" ");
const keyNum = parseInt(input[2]);

const modifedArr = arr.map(Number);

let count = 0;

modifedArr.forEach((element) => {
  element == keyNum ? count++ : " ";
});

console.log(count);
