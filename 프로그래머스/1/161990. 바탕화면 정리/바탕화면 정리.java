class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = {};
        boolean[][] fileMatrix = new boolean[wallpaper.length][];
        for(int i = 0; i < wallpaper.length; i++){
            String [] lineSplit = wallpaper[i].split("");
            // .은 빈 공간, #은 파일
            fileMatrix[i] = new boolean[lineSplit.length];
            for(int j = 0; j < lineSplit.length; j++){
                fileMatrix[i][j] = lineSplit[j].equals(".") ? false : true;
            }
        }
        
        
        int lux = 51, luy = 51, rdx = 0, rdy = 0; // lux는 최소 x, luy는 최소 y, rdx는 최대 x, rdy는 최대 y를 찾아야 함.
        for(int i = 0; i < fileMatrix.length; i++) {
            for(int j = 0; j < fileMatrix[i].length; j++) {
                if(fileMatrix[i][j]) {
                    lux = Math.min(lux, i);
                    luy = Math.min(luy, j);
                    rdx = Math.max(rdx, i + 1);
                    rdy = Math.max(rdy, j + 1);
                }
            }
        }   
        
        return new int[]{lux, luy, rdx, rdy};
    }
}