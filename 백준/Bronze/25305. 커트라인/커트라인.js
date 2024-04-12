const fs = require("fs");
let input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n"); //여러 줄 입력받을 때

let [N, k] = input.shift().split(" ");
let arr = input[0].split(" ");
arr.sort((a, b) => a - b);

console.log(arr[parseInt(N) - parseInt(k)]);
