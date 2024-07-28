import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {

    PhoneBook phoneBook = new PhoneBook();

    @Test
    public void test_addContact() {
        int expectedContactAmount = 1;
        int actualContactAmount = phoneBook.add("Natalia Ivanova", "9056708754");

        Assertions.assertEquals(expectedContactAmount, actualContactAmount);
    }

    @Test()
    public void test_addSameContact() {
        int expectedContactAmount = 1;
        int actualContactAmount = phoneBook.add("Natalia Ivanova", "9056708754");

        Assertions.assertEquals(expectedContactAmount, actualContactAmount);
    }

    @Test
    public void test_positive_findByNumber() {
        String expectedName = "Elena Petrova";
        phoneBook.add("Elena Petrova", "9112345678");
        String actualName = phoneBook.findByNumber("9112345678");

        Assertions.assertEquals(expectedName, actualName);
    }

    @Test
    public void test_negative_findByNumber() {
        String actualName = phoneBook.findByNumber("9111111111");

        Assertions.assertNull(actualName);
    }
}
