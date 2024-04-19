const fs = require("fs");
const input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n"); //여러 줄 입력받을 때

let answer = "";
for (let i = 0; i < input.length - 1; i++) {
  let sides = input[i].split(" ").map((e) => {
    return (e = parseInt(e));
  });
  let maxSide = sides.sort((a, b) => a - b).pop();

  if (maxSide >= sides[0] + sides[1]) {
    answer += "wrong\n";
    continue;
  }
  if (maxSide ** 2 == sides[0] ** 2 + sides[1] ** 2) {
    answer += "right\n";
  } else {
    answer += "wrong\n";
  }
}
console.log(answer.trim());
