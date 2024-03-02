const fs = require("fs");

const input = fs.readFileSync("/dev/stdin").toString().trim().split("\n"); //여러 줄 입력받을 때
const inputArray = new Array();

for (let i = 0; i < input.length; i++) {
  const e = input[i].split(" ");
  inputArray.push(Number(e[0]), Number(e[1]));
}

const sortedArray = new Array(inputArray[0]);
for (let i = 0; i < sortedArray.length; i++) {
  sortedArray[i] = i + 1;
}

for (let i = 2; i < inputArray.length; i += 2) {
  let n = inputArray[i];
  let m = inputArray[i + 1];
  let tmp = sortedArray.slice(n - 1, m);
  tmp.reverse();
  for (j = 0; j < tmp.length; j++) {
    sortedArray[j + n - 1] = tmp[j];
  }
}
console.log(sortedArray.join(" "));
