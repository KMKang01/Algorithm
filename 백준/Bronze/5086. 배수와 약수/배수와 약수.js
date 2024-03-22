const fs = require("fs");
let input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n"); //여러 줄 입력받을 때

for (let i = 0; i < input.length; i++) {
  num1 = parseInt(input[i].split(" ")[0]);
  num2 = parseInt(input[i].split(" ")[1]);
  if (num1 == 0 && num2 == 0) break;
  if (num2 % num1 == 0) {
    console.log("factor");
  } else if (num1 % num2 == 0) {
    console.log("multiple");
  } else {
    console.log("neither");
  }
}
