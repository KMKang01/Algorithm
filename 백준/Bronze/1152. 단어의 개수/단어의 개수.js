const fs = require("fs");

const input = fs.readFileSync("/dev/stdin").toString().trim().split("\n"); //여러 줄 입력받을 때

const count = input[0] !== "" ? input[0].trim().split(" ").length : 0;

console.log(count);
