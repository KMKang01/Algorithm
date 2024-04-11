const fs = require("fs");
let input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n")
  .map((e) => {
    return parseInt(e);
  }); //여러 줄 입력받을 때

input.sort((a, b) => a - b);
let avg = 0;
input.forEach((e) => {
  avg += e;
});
avg /= input.length;
let midV = input[Math.floor(input.length / 2)];
console.log(`${avg}\n${midV}`);
