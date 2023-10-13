package org.example;

// 定義一個自訂的Exception，用於處理Person類中的異常情況
public class PersonException extends Exception {

    // 建構子: 創建一個新的Exception並給出一個訊息
    public PersonException(String message) {
        super(message);
    }
}
