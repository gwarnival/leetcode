class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        
        double[][] table = new double[query_row+2][query_row+2];
        table[0][0] = poured;
        for (int i = 0; i <= query_row; i ++) {
            for(int j = 0; j <= i; j ++) {
                if (table[i][j] > 1) {
                    table[i+1][j] += (table[i][j] - 1) / 2.0;
                    table[i+1][j+1] += (table[i][j] - 1) / 2.0;
                    table[i][j] = 1;    
                }
            }
        }
        
        return table[query_row][query_glass];
    }
}