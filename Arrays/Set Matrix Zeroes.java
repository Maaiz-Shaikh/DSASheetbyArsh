// Question Link : https://leetcode.com/problems/set-matrix-zeroes/description/

// Approach 1: Copy matrix, use first matrix and do changes in 2nd matrix, then copy 2nd matrix to 1st matrix.
// TC: O(n*m*(m+n)), SC: O(n*m) where n = no. of rows, m = no. of columns
class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int[][] copyMatrix = new int[n][m];

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
               copyMatrix[i][j] = matrix[i][j]; 
            }
        }

       
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
               if(copyMatrix[i][j] == 0) {
                   //row
                    for(int row=0; row<n; row++) {
                        matrix[row][j] = 0;
                    }

                   //column
                    for(int col=0; col<m; col++) {
                        matrix[i][col] = 0;
                    }
               } 
            }
        }

        
    }
}


// Approach 2: Find the indexes of zeroes and stored it in array. Then go to that index and convert the row and column to 0
// TC: O(n*m + n*k + m*k), SC: O(k) where k = no. of zeroes, n = no. of rows, m = no. of columns
class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        List<Integer> rows = new ArrayList<>();
        List<Integer> cols = new ArrayList<>();

        // finding indexes of rows and column where value is 0
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
               if(matrix[i][j] == 0) {
                   rows.add(i);
                   cols.add(j);
                   
               }
            }
        }

        // making column 0
        for(int i=0; i<rows.size(); i++) {
            for(int j=0; j<m; j++) {
                matrix[rows.get(i)][j] = 0;
            }
        }

        // making row 0
        for(int i=0; i<cols.size(); i++) {
            for(int j=0; j<n; j++) {
                matrix[j][cols.get(i)] = 0;
            }
        }
    }
}
