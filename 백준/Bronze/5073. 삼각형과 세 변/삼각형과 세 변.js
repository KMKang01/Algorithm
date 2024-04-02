const fs = require("fs");
const input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n"); //여러 줄 입력받을 때

let arr = new Array();
input.forEach((e) => {
  arr.push(e.split(" "));
});
arr = arr.map((e) => {
  return (e = [Number(e[0]), Number(e[1]), Number(e[2])]);
});

function isTriangle(arr) {
  if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0) {
    return 0;
  }
  if (
    arr[0] + arr[1] <= arr[2] ||
    arr[0] + arr[2] <= arr[1] ||
    arr[1] + arr[2] <= arr[0]
  ) {
    console.log("Invalid");
  } else if (arr[0] == arr[1] && arr[1] == arr[2]) {
    console.log("Equilateral");
  } else if (
    (arr[0] == arr[1] && arr[0] != arr[2]) ||
    (arr[1] == arr[2] && arr[0] != arr[2]) ||
    (arr[0] == arr[2] && arr[0] != arr[1])
  ) {
    console.log("Isosceles");
  } else {
    console.log("Scalene");
  }
}
arr.forEach((e) => {
  isTriangle(e);
});
