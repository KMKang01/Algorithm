const fs = require("fs");

const input = fs.readFileSync("/dev/stdin").toString().trim().split(""); //여러 줄 입력받을 때

let i = 0;
let palindrome = 1;
while (i < parseInt(input.length / 2)) {
  if (input[i] != input[input.length - 1 - i]) {
    palindrome = 0;
    break;
  }
  i++;
}
console.log(palindrome);
