class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        floodFillAlgo(image, sr, sc, color, image[sr][sc]);
        return image;
    }
    
    public void floodFillAlgo(int[][] image, int i, int j, int color, int currColor){
        if( i < 0 || j < 0 || i >= image.length || j>= image[0].length) return;
        if(image[i][j] != currColor || image[i][j] == color){
            return;
        }
        currColor = image[i][j];
        image[i][j] = color;
        floodFillAlgo(image, i-1, j, color, currColor);
        floodFillAlgo(image, i+1, j, color, currColor);
        floodFillAlgo(image, i, j-1, color, currColor);
        floodFillAlgo(image, i, j+1, color, currColor);
    }
}