package Exercize_N3;

public class Matrix {

    int[][] matrix;
    int col;
    int row;

    public int[][] sumMatrix(int[][] otherMatrix) {
        int[][] result = new int[this.row][this.col];
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                result[i][j] = this.matrix[i][j] + otherMatrix[i][j];
            }

        }
        return result;

    }

    public int[][] numMultMatrix(int num) {
        int[][] result = new int[this.row][this.col];
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                result[i][j] = this.matrix[i][j] * num;
            }
        }
        return result;
    }

    public void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int[][] multMatrix(int[][] otherMatrix) {
        int[][] result = new int[this.matrix.length][otherMatrix[0].length];
        for (int i = 0; i < result[0].length; i++) {
            for (int j = 0; j < result.length; j++) {
                for (int k = 0; k < this.matrix[0].length; k++) {
                    result[i][j] = result[i][j] + this.matrix[i][k] * otherMatrix[k][j];
                }
            }
        }
        return result;
    }
}
