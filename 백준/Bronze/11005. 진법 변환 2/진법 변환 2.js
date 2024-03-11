const fs = require("fs");

const input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split(); //여러 줄 입력받을 때

const num = parseInt(input[0].split(" ")[0]);
const divisor = parseInt(input[0].split(" ")[1]);

let dividend = num;
let remainder = 0;
let answer = [];

while (dividend >= divisor) {
  remainder = dividend % divisor;
  dividend = parseInt(dividend / divisor);

  if (remainder > 9) {
    answer.push(String.fromCharCode(remainder + 55));
  } else {
    answer.push(remainder.toString());
  }
}
if (dividend > 9) {
  answer.push(String.fromCharCode(dividend + 55));
} else {
  answer.push(dividend.toString());
}
console.log(answer.reverse().join(""));
