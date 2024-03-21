const fs = require("fs");
const { isFloat64Array } = require("util/types");
const input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split(" "); //여러 줄 입력받을 때
const up = parseInt(input.shift());
const down = parseInt(input.shift());
const peek = parseInt(input.shift());
let snail_locale = 0;
let count = 0;

snail_locale = peek - up;
count = Math.ceil(snail_locale / (up - down));

count++;
console.log(count);