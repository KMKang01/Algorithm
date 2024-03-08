const fs = require("fs");

const input = fs.readFileSync("/dev/stdin").toString().trim().split("\n"); //여러 줄 입력받을 때

const row = parseInt(input[0].split(" ")[0]);
const col = parseInt(input[0].split(" ")[1]);

for (let i = 0; i < input.length; i++) {
  input[i] = input[i].split(" ");
}

const matrix1 = [];
const matrix2 = [];

for (let i = 0; i < row; i++) {
  matrix1.push(input[i + 1]);
}
for (let i = 0; i < row; i++) {
  matrix2.push(input[i + 1 + row]);
}

let matrix3 = new Array(row).fill(0).map(() => new Array(col).fill(0));

for (let i = 0; i < row; i++) {
  for (let j = 0; j < col; j++) {
    matrix3[i][j] = parseInt(matrix1[i][j]) + parseInt(matrix2[i][j]);
  }
  matrix3[i] = matrix3[i].join(" ");
}
console.log(matrix3.join("\n"));
