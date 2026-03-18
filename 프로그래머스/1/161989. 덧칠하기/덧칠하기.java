class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        boolean [] tiles = new boolean [n]; // 칠해야 할 부분을 true, 이미 칠해져있는 부분을 false
        for(int s : section) {
            tiles[s -1] = true;
        }
        
        for(int i = 0 ; i < n; i++){
            if(tiles[i]) {
                answer++;
                for(int j = i; j < i + m; j++) {
                    if(j < n) tiles[j] = false;
                }
            }
        }
        
        return answer;
    }
}