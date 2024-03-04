const fs = require("fs");

const input = fs.readFileSync("/dev/stdin").toString().split(" "); //여러 줄 입력받을 때

const n1 = parseInt(input[0].split("").reverse().join(""));
const n2 = parseInt(input[1].split("").reverse().join(""));
console.log(n1 > n2 ? n1 : n2);
