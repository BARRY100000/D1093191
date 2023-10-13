package org.example;

public class Main {

    public static void main(String[] args) {
        // 測試 Triangle 類別
        try {
            // 檢查由邊長 3 4 5 形成的三角形類型
            Triangle.TriangleType type = Triangle.checkTriangle(3, 4, 5);
            System.out.println("這個三角形是: " + type);
        } catch (TriangleException e) {
            // 捕獲任何無效的三角形異常並顯示訊息
            System.out.println(e.getMessage());
        }

        // 測試 Person 類別
        // 建立一個新的人
        Person person = new Person("約翰", 1990);
        // 輸出該人在 2023 年的年齡
        System.out.println(person.getName() + " 在 2023 年滿 " + person.getAge() + " 歲。");

        try {
            // 設定該人的身高和體重
            person.setHeight(1.8);
            person.setWeight(70);
            // 輸出 BMI，取到小數點後一位
            System.out.println(person.getName() + " 的 BMI 為: " + ( (float)((int)(person.getBMI()*10) )/ 10 ));
        } catch (PersonException e) {
            // 捕獲與 Person 有關的任何無效操作並顯示訊息
            System.out.println(e.getMessage());
        }
    }
}
