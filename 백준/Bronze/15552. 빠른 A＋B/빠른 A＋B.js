const fs = require("fs");

const input = fs.readFileSync("/dev/stdin").toString().split("\n");

const count = parseInt(input[0]);
let answer = '';

for (let i = 0; i < count; i++) {
  let tmp = input[i + 1].split(" ");
  let result = parseInt(tmp[0]) + parseInt(tmp[1])
  answer = answer + result + '\n';
}
console.log(answer);
