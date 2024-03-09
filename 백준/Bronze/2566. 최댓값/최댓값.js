const fs = require("fs");

let input = fs.readFileSync("/dev/stdin").toString().trim().split("\n"); //여러 줄 입력받을 때
input = input.map((e) => {
  return (e = e.split(" "));
});
let row = 0;
let col = 0;

let max = 0;
for (let i = 0; i < input.length; i++) {
  for (let j = 0; j < input[i].length; j++) {
    if (parseInt(input[i][j]) >= max) {
      max = parseInt(input[i][j]);
      row = i + 1;
      col = j + 1;
    }
  }
}

console.log(max + "\n" + row + " " + col);
