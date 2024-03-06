const fs = require("fs");

const input = parseInt(fs.readFileSync("/dev/stdin").toString()); //여러 줄 입력받을 때
let arr = new Array(2 * input - 1);
let repeat = new Array(input - 1);
repeat.fill(" ");
arr[input - 1] = "*";
for (let i = repeat.length; i >= 0; i--) {
  console.log(
    repeat.join("") + arr[input - 1] + repeat.reverse().join("").trimEnd()
  );
  repeat.reverse();
  repeat[i - 1] = "*";
}
for (let i = 0; i < repeat.length; i++) {
  repeat[i] = " ";
  console.log(
    repeat.join("") + arr[input - 1] + repeat.reverse().join("").trimEnd()
  );
  repeat.reverse();
}
