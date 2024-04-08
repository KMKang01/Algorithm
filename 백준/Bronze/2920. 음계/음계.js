const fs = require("fs");
const input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim(); //여러 줄 입력받을 때

if (input == "1 2 3 4 5 6 7 8") {
  console.log("ascending");
} else if (input == "8 7 6 5 4 3 2 1") {
  console.log("descending");
} else {
  console.log("mixed");
}
