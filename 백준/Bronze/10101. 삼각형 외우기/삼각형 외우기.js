const fs = require("fs");
const input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n"); //여러 줄 입력받을 때

let angle = new Array();
input.forEach((e) => {
  angle.push(Number(e));
});
if (angle[0] + angle[1] + angle[2] == 180) {
  if (angle[0] == 60 && angle[1] == 60 && angle[2] == 60) {
    console.log("Equilateral");
  } else if (
    angle[0] == angle[1] ||
    angle[1] == angle[2] ||
    angle[0] == angle[2]
  ) {
    console.log("Isosceles");
  } else {
    console.log("Scalene");
  }
} else {
  console.log("Error");
}
