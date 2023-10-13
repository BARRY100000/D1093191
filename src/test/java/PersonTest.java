import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.example.Person;
import org.example.PersonException;

// 定義對Person類的測試
public class PersonTest {

    // 測試名稱功能是否正確
    @Test
    public void testName() {
        Person person = new Person("John", 1990);
        assertEquals("John", person.getName());
    }

    // 測試年齡計算功能是否正確
    @Test
    public void testAge() {
        Person person = new Person("John", 1990);
        assertEquals(33, person.getAge());  // 年齡由今年2023減去出生年
    }

    // 測試BMI計算功能是否正確
    @Test
    public void testBMI() throws PersonException {
        Person person = new Person("John", 1990);
        person.setHeight(1.8);
        person.setWeight(70);
        assertEquals(21.6, person.getBMI(), 0.1);  // 使用 delta 值 0.1 處理浮點數精度差異
    }

}
