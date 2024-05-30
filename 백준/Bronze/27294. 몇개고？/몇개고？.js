const fs = require("fs");
let [time, drink] = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split(" "); //여러 줄 입력받을 때
time = parseInt(time);
drink = parseInt(drink);

if (time >= 12 && time <= 16 && drink === 0) {
  console.log("320");
} else {
  console.log("280");
}
