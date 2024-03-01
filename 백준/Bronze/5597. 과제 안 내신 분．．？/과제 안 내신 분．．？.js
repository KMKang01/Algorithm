const fs = require("fs");

const input = fs.readFileSync("/dev/stdin").toString().split("\n"); //여러 줄 입력받을 때

for (let i = 0; i < input.length; i++) {
  input[i] = Number(input[i]);
}

for (let i = 1; i <= 30; i++) {
  if (input.indexOf(i) == -1) {
    console.log(i);
  }
}
