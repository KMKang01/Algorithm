const fs = require("fs");

const input = fs.readFileSync("/dev/stdin").toString().split(' ');
result = parseInt(input[0]) - 543;
console.log(result);