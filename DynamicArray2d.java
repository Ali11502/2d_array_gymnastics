public class DynamicArray2d {
    private int row;
    private int col;
    private int currRow_ind;
    private int currCol_ind;
    private int[][] c;

    public DynamicArray2d(int row, int col) {
        this.row = row;
        this.col = col;
        int[][] a = new int[row][col];
        for (int rows = 0; rows < row; rows++) {
            for (int cols = 0; cols < col; cols++) {
                a[rows][cols] = (int) (Math.random() * 10);
                currCol_ind = cols;
                currRow_ind = rows;
            }
        }
        this.c = a;

    }

    public void appendRow(int[] rowArray) {
        if (rowArray.length <= currCol_ind + 1) {
            currRow_ind++;
            if (currRow_ind >= row) {
                row = row * 2;
                int[][] temp2d = new int[row][col];
                for (int i = 0; i <= currRow_ind; i++) {
                    for (int j = 0; j <= currCol_ind; j++) {
                        if (i != currRow_ind) {
                            temp2d[i][j] = c[i][j];
                        } else if (i == currRow_ind) {
                            if (j < rowArray.length)
                                temp2d[currRow_ind][j] = rowArray[j];
                            else temp2d[currRow_ind][j] = 0;
                        }
                    }
                }
                c = temp2d;
            } else if (currRow_ind < row) {
                int[][] temp2d = new int[row][col];
                for (int i = 0; i <= currRow_ind; i++) {
                    for (int j = 0; j <= currCol_ind; j++) {
                        if (i != currRow_ind) {
                            temp2d[i][j] = c[i][j];
                        } else if (i == currRow_ind) {
                            if (j < rowArray.length)
                                temp2d[currRow_ind][j] = rowArray[j];
                            else temp2d[currRow_ind][j] = 0;
                        }
                    }
                }
                c = temp2d;
            }
        } else System.out.println("invalid input");
    }

    public void appendCol(int[] colArray) {
        if (colArray.length <= currRow_ind + 1) {
            currCol_ind++;
            if (currCol_ind >= col) {
                col = col * 2;
                int[][] temp2d = new int[row][col];
                for (int i = 0; i <= currRow_ind; i++) {
                    for (int j = 0; j <= currCol_ind; j++) {
                        if (j != currCol_ind) {
                            temp2d[i][j] = c[i][j];
                        } else if (j == currCol_ind) {
                            //temp2d[i][currCol_ind] = colArray[i];
                            if (i < colArray.length)
                                temp2d[i][currCol_ind] = colArray[i];
                            else temp2d[i][currCol_ind] = 0;
                        }
                    }
                }
                c = temp2d;
            } else if (currCol_ind < col) {
                int[][] temp2d = new int[row][col];
                for (int i = 0; i <= currRow_ind; i++) {
                    for (int j = 0; j <= currCol_ind; j++) {
                        if (j != currCol_ind) {
                            temp2d[i][j] = c[i][j];
                        } else if (j == currCol_ind) {
                            if (i < colArray.length)
                                temp2d[i][currCol_ind] = colArray[i];
                            else temp2d[i][currCol_ind] = 0;
                        }
                    }
                }
                c = temp2d;
            }
        } else System.out.println("invalid input");
    }

    public void print2d() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(c[i][j] + ",");
            }
            System.out.println();
        }
    }
}
