const fs = require("fs");
let input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n"); //여러 줄 입력받을 때

let [a, ...arr] = input.map((e) => {
  return parseInt(e);
});

console.log(arr.sort((a, b) => a - b).join("\n"));
