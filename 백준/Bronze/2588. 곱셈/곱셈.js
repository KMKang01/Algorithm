const fs = require("fs");

const input = fs.readFileSync("/dev/stdin").toString().trim();
const num1 = parseInt(input[0]+input[1]+input[2]);

const a = parseInt(input[6]) * num1;
const b = parseInt(input[5]) * num1;
const c = parseInt(input[4]) * num1;

console.log(a);
console.log(b);
console.log(c);
console.log(a+b*10+c*100);