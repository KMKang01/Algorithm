const fs = require("fs");
let input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n"); //여러 줄 입력받을 때

let i = 0;
let answer = "";
while (input[i] !== "# 0 0") {
  let [name, age, weight] = input[i].split(" ");
  if (parseInt(age) > 17 || parseInt(weight) >= 80) {
    answer += name + " Senior\n";
  } else {
    answer += name + " Junior\n";
  }
  i++;
}
console.log(answer.trim());
