package org.example;

// 定義一個代表人的類別
public class Person {
    private String name;  // 人的名稱
    private int birthYear;  // 人的出生年份
    private double height = 0;  // 人的身高，預設值為0
    private double weight = 0;  // 人的體重，預設值為0

    // 建構子: 創建一個新的人物物件並初始化名字和出生年份
    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    // 取得人的名稱
    public String getName() {
        return name;
    }

    // 計算並回傳人的年齡
    public int getAge() {
        return 2023 - birthYear;
    }

    // 設置人的身高，如果身高不合法則拋出異常
    public void setHeight(double height) throws PersonException {
        if (height <= 0) {
            throw new PersonException("Invalid height");
        }
        this.height = height;
    }

    // 設置人的體重，如果體重不合法則拋出異常
    public void setWeight(double weight) throws PersonException {
        if (weight <= 0) {
            throw new PersonException("Invalid weight");
        }
        this.weight = weight;
    }

    // 計算並回傳人的BMI值，如果身高還未被設定則拋出異常
    public double getBMI() throws PersonException {
        if (height == 0) {
            throw new PersonException("Height is not set");
        }
        return weight / (height * height);
    }
}
