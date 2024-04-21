const fs = require("fs");
const input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n"); //여러 줄 입력받을 때

const r = 31;
const M = 1234567891;

let L = parseInt(input[0]);
let arr = input[1].split("");
let H = 0;

for (let i = 0; i < L; i++) {
    let char = arr[i].charCodeAt() - 96;
    H += char * r ** i;
}


console.log(H % M);
