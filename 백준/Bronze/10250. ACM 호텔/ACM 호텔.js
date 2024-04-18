const fs = require("fs");
const input = fs
  .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
  .toString()
  .trim()
  .split("\n"); //여러 줄 입력받을 때
/*
  [0][0] = 101호, [0][1] = 102호, ...
  [1][0] = 201호, [1][1] = 202호, ...
  [2][0] = 301호, [2][1] = 302호, ...
  ...
  우선순위: 각 열의 첫 번째부터 채워야 함
*/
let tc = parseInt(input[0]);
for (let i = 1; i <= tc; i++) {
  [H, W, N] = input[i].split(" ").map((e) => {
    return (e = parseInt(e));
  });
  // H = 건물 층 수, W = 각 층의 방 수, N = N번째 손님
  let floor = (N % H).toString(); // 층 수 구하기
  if (floor == 0) {
    floor = H.toString();
  } // 꼭대기 층인 경우
  let room = Math.floor(N / H) + 1; //방 번호 구하기
  if (N % H == 0) {
    room -= 1;
  }
  if (N == H * W) {
    floor = H.toString();
    room = W.toString();
  } // 맨 마지막 방인 경우
  if (room < 10) {
    room = "0" + room.toString();
  } // 방 번호가 10이하면 중간에 0 을 붙여줌
  console.log(floor + room);
}
