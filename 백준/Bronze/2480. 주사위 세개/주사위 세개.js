const fs = require("fs");

const input = fs.readFileSync("/dev/stdin").toString().trim().split(" ");

const a = parseInt(input[0]);
const b = parseInt(input[1]);
const c = parseInt(input[2]);
let reward = 0;
let max = Math.max(a, b, c);

if (a == b) {
  if (a == c) {
    reward = 10000 + a * 1000;
  } else if (a != c) {
    reward = 1000 + a * 100;
  }
} else if (a != b) {
  if (a == c) {
    reward = 1000 + a * 100;
  } else if (a != c) {
    if (b == c) {
      reward = 1000 + b * 100;
    } else {
      reward = max * 100;
    }
  }
}

console.log(reward);
