const fs = require("fs");
const input = parseInt(
  fs
    .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
    .toString()
    .trim()
); //여러 줄 입력받을 때

for (let i = 1; i <= input; i++) {
  if (Math.floor(i / 10) <= 0) {
    // i가 10 미만

    if (2 * i == input) {
      // console.log("1 < i < 10");
      console.log(i);
      break;
    }
  } else if (Math.floor(i / 10) < 10) {
    // i가 100 미만

    let a = (i % 10) + Math.floor(i / 10) + i;
    if (a == input) {
      // console.log("10 < i < 100");
      console.log(i);
      break;
    }
  } else if (Math.floor(i / 10) < 100) {
    // i가 1000 미만

    let a = (i % 10) + (Math.floor(i / 10) % 10) + Math.floor(i / 100) + i;
    if (a == input) {
      // console.log("100 < i < 1000");
      console.log(i);
      break;
    }
  } else if (Math.floor(i / 10) < 1000) {
    // i가 10000 미만

    let a =
      (i % 10) +
      (Math.floor(i / 10) % 10) +
      (Math.floor(i / 100) % 10) +
      Math.floor(i / 1000) +
      i;
    if (a == input) {
      // console.log("1000 < i < 10000");
      console.log(i);
      break;
    }
  } else if (Math.floor(i / 10) < 10000) {
    // i가 100000 미만

    let a =
      (i % 10) +
      (Math.floor(i / 10) % 10) +
      (Math.floor(i / 100) % 10) +
      (Math.floor(i / 1000) % 10) +
      Math.floor(i / 10000) +
      i;
    if (a == input) {
      // console.log("10000 < i < 100000");
      console.log(i);
      break;
    }
  } else if (Math.floor(i / 10) < 100000) {
    let a =
      (i % 10) +
      (Math.floor(i / 10) % 10) +
      (Math.floor(i / 100) % 10) +
      (Math.floor(i / 1000) % 10) +
      (Math.floor(i / 10000) % 10) +
      Math.floor(i / 100000) +
      i;
    if (a == input) {
      // console.log("100000 < i < 1000000");
      console.log(i);
      break;
    }
  }
  if (i == input) {
    console.log("0");
  }
}
