const fs = require("fs");
const [a, b, c] = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n"); //여러 줄 입력받을 때
let result = (parseInt(a) * parseInt(b) * parseInt(c)).toString();
let arr = new Array(10).fill(0);

for (let i = 0; i < result.length; i++) {
  let char = result[i];

  switch (char) {
    case "0":
      arr[0] += 1;
      break;
    case "1":
      arr[1] += 1;
      break;
    case "2":
      arr[2] += 1;
      break;
    case "3":
      arr[3] += 1;
      break;
    case "4":
      arr[4] += 1;
      break;
    case "5":
      arr[5] += 1;
      break;
    case "6":
      arr[6] += 1;
      break;
    case "7":
      arr[7] += 1;
      break;
    case "8":
      arr[8] += 1;
      break;
    case "9":
      arr[9] += 1;
      break;
  }
}
console.log(arr.join("\n").trim());
