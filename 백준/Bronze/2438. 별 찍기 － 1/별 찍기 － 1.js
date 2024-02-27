const fs = require("fs");

const input = fs.readFileSync("/dev/stdin").toString().split("\n"); //여러 줄 입력받을 때

const count = parseInt(input[0]);
let star = "";

for (let i = 0; i < count; i++) {
  star += "*";
  console.log(star);
}
