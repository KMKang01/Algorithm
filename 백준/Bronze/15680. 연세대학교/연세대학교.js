const fs = require("fs");
const input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim(); //여러 줄 입력받을 때

if (input == "0") {
  console.log("YONSEI");
} else if (input == "1") {
  console.log("Leading the Way to the Future");
}
