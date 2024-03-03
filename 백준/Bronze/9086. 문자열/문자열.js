const fs = require("fs");

const input = fs.readFileSync("/dev/stdin").toString().trim().split("\n"); //여러 줄 입력받을 때

const tc = parseInt(input[0]);
for (let i = 1; i <= tc; i++) {
  console.log(input[i][0] + input[i][input[i].length - 1]);
}
