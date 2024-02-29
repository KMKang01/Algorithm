const fs = require("fs");

const input = fs.readFileSync("/dev/stdin").toString().trim().split("\n"); //여러 줄 입력받을 때

for (let i = 0; i < input.length; i++) {
  const tmp = input[i].split(" ");
  const a = parseInt(tmp[0]);
  const b = parseInt(tmp[1]);
  console.log(a + b);
}
