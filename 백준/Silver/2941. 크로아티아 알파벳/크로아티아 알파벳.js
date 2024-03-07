const fs = require("fs");

const input = fs.readFileSync("/dev/stdin").toString().trim().split(""); //여러 줄 입력받을 때

const croatia = ["c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="];
const arr = new Array();
let count = 0;
for (let i = 0; i < input.length; i++) {
  if (croatia.indexOf(input[i] + input[i + 1]) != -1 && i < input.length) {
    arr.push(input[i] + input[i + 1]);
    i++;
    count++;
  } else if (
    croatia.indexOf(input[i] + input[i + 1] + input[i + 2]) != -1 &&
    i < input.length
  ) {
    arr.push(input[i] + input[i + 1] + input[i + 2]);
    i += 2;
    count++;
  } else {
    arr.push(input[i]);
    count++;
  }
}

console.log(count);
