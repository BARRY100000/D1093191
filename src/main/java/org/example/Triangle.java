package org.example;

public class Triangle {     //用來代表並檢查三角形類型的類別
    public enum TriangleType {
        EQUILATERAL, ISOSCELES, SCALANE, NOT_A_TRIANGLE     //設計出分類三角形的類型
    }

    public static TriangleType checkTriangle(int a, int b, int c) throws TriangleException {    //判斷三角形是否為三角形
        if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a) {
            throw new TriangleException(a, b, c);   //若不是拋出Exception
        }

        if (a == b && b == c) {
            return TriangleType.EQUILATERAL;    //等邊三角形
        } else if (a == b || a == c || b == c) {
            return TriangleType.ISOSCELES;      //等腰三角形
        } else {
            return TriangleType.SCALANE;        //不規則三角形
        }
    }
}

