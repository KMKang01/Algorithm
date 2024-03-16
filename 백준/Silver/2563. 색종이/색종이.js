const fs = require("fs");
let input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n"); //여러 줄 입력받을 때

let paper = parseInt(input.shift());
input = input.map((e) => {
  return (e = [Number(e.split(" ")[0]), Number(e.split(" ")[1])]);
});

let canvas = new Array(100).fill(0).map((e) => {
  return (e = new Array(100).fill(0));
});

for (let i = 0; i < paper; i++) {
  let x = input[i][0];
  let y = input[i][1];

  for (let k = x; k < x + 10; k++) {
    for (let j = y; j < y + 10; j++) {
      if (canvas[k][j] == 0) {
        canvas[k][j] = 1;
      }
    }
  }
}

let count = 0;
canvas.forEach((e) => {
  e.forEach((element) => {
    element == 1 ? count++ : "";
  });
});
console.log(count);
