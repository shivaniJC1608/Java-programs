class Solution {
    public int[][] generateTriangle(int numRows) {
       
        int[][] triangle = new int[numRows][];

        for (int i = 0; i < numRows; i++) {
            triangle[i] = new int[i + 1]; 
            for (int j = 0; j <= i; j++) {
               
                if (j == 0 || j == i) {
                    triangle[i][j] = 1;
                } else {
                  
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }
            }
        }

        return triangle;
    }
}
