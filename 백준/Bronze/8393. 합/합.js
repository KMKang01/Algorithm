const fs = require("fs");

const input = fs.readFileSync("/dev/stdin").toString().split(" ");

const r = parseInt(input[0]);
let result = 0;

for (let i = 1; i <= r; i++) {
  result += i;
}

console.log(result);
