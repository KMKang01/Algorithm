const fs = require("fs");

const input = fs.readFileSync("/dev/stdin").toString().trim().split("\n"); //여러 줄 입력받을 때

const idx = parseInt(input[1]);
const character = input[0][idx - 1];
console.log(character);
