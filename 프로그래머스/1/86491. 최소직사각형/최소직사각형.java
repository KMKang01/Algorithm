class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int width = sizes[0][0];
        int height = sizes[0][1];
        
        for(int i = 1 ; i < sizes.length; i++) {
            // 1. 그대로 넣었을 때 들어가는 경우 -> continue
            // 2. 돌려서 넣었을 때 들어가는 경우 -> continue
            if(width >= sizes[i][0] && height >= sizes[i][1]
               || width >= sizes[i][1] && height >= sizes[i][0]) {
                continue;
            } else {
                // 3. 돌렸는데도 안 들어가는 경우 -> 크기 조정
                // 3-1. width > height 이면 width에 가로 세로 중 큰 값을 넣고 1, 2 조건 수행
                if(width >= height) {
                    width = Math.max( width, Math.max(sizes[i][0], sizes[i][1])) ;
                    if(width >= sizes[i][0] && height >= sizes[i][1]
                       || width >= sizes[i][1] && height >= sizes[i][0]) {
                        continue;
                    } else {
                        height = Math.max( height, Math.min(sizes[i][0], sizes[i][1])) ;        
                    }
                } else {
                // 3-2. height > width 이면 height에 가로 세로 중 큰 값을 넣고 1, 2 조건 수행
                    height = Math.max( height, Math.max(sizes[i][0], sizes[i][1])) ;
                    if(width >= sizes[i][0] && height >= sizes[i][1]
                       || width >= sizes[i][1] && height >= sizes[i][0]) {
                        continue;
                    } else {
                        width = Math.max( width, Math.min(sizes[i][0], sizes[i][1])) ;        
                    }
                }
            }
            
            
            
        }
        answer = width * height;
        
        return answer;
    }
}