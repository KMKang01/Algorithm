const fs = require("fs");

const input = fs.readFileSync("/dev/stdin").toString().split("\n"); //여러 줄 입력받을 때

const arr = input[1].split(" ").map(Number);
let min = arr[0];
let max = arr[0];
const output = arr.forEach((element) => {
  element < min ? (min = element) : " ";
  element > max ? (max = element) : " ";
});
console.log(min + " " + max);
