class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int n = board.length;
        String color = board[h][w];
        // 1. 위
        if(h - 1 >= 0 && board[h - 1][w].equals(color)) answer++;
        // 2. 아래
        if(h < n - 1 && board[h + 1][w].equals(color)) answer++;
        // 3. 왼쪽
        if(w - 1 >= 0 && board[h][w - 1].equals(color)) answer++;
        // 4. 오른쪽
        if(w < n - 1 && board[h][w + 1].equals(color)) answer++;
        
        
        return answer;
    }
}