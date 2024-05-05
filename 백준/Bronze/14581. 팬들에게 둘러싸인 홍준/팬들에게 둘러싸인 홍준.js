const fs = require("fs");
const input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim(); //여러 줄 입력받을 때

let ls = [
  [":fan:", ":fan:", ":fan:"],
  [":fan:", ":fan:", ":fan:"],
  [":fan:", ":fan:", ":fan:"],
];
ls[1][1] = `:${input}:`;
let answer = `${ls[0].join("")}\n${ls[1].join("")}\n${ls[2].join("")}`;
console.log(answer);
