const fs = require("fs");

const input = fs.readFileSync("/dev/stdin").toString().split("\n"); //여러 줄 입력받을 때

const count = parseInt(input[0]);

for (let j = 0; j < count; j++) {
  let star = "";
  for (let i = count - 1; i > j; i--) {
    star += " ";
  }
  for (let k = 0; k < j + 1; k++) {
    star += "*";
  }
  console.log(star);
}