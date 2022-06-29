package Exercize_N3;

import org.junit.jupiter.api.BeforeAll;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {
    int[][] twoDimArray = {{5,7,3}, {7,0,1}, {8,1,2}};
    int[][] twoDimArray1 = {{18,28,18},{28,45,90},{45,3,14}};
    int num = 2;
    @org.junit.jupiter.api.Test
    void sumMatrix() {

        Matrix matrix = new Matrix(twoDimArray);
        int [][] result = {{23,35,21}, {35, 45, 91}, {53, 4, 16}};
        assertArrayEquals(result, matrix.sumMatrix(twoDimArray1));
    }

    @org.junit.jupiter.api.Test
    void numMultMatrix() {
        Matrix matrix = new Matrix(twoDimArray);
        int [][] result = {{10,14,6}, {14, 0, 2}, {16, 2, 4}};
        assertArrayEquals(result, matrix.numMultMatrix(num));
    }

    @org.junit.jupiter.api.Test
    void multMatrix() {
        Matrix matrix = new Matrix(twoDimArray);
        int [][] result = {{421,464,762}, {171, 199, 140}, {262, 275, 262}};
        assertArrayEquals(result, matrix.multMatrix(twoDimArray1));
    }
}