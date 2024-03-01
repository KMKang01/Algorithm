const fs = require("fs");

const input = fs.readFileSync("/dev/stdin").toString().split("\n"); //여러 줄 입력받을 때

for (let i = 0; i < input.length; i++) {
  input[i] = input[i].split(" ").map(Number);
}

const bucket = input[0][0];
const trial = input[0][1];
let array = Array(bucket);
for (let i = 0; i < array.length; i++) {
  array[i] = i + 1;
}

for (let i = 0; i < trial; i++) {
  const e1 = input[i + 1][0];
  const e2 = input[i + 1][1];

  let tmp = array[e1 - 1];
  array[e1 - 1] = array[e2 - 1];
  array[e2 - 1] = tmp;
}
console.log(array.join(" "));
