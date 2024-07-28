import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {

    @Test
    public void test_addContact() {
        PhoneBook phoneBook = new PhoneBook();
        int expectedContactAmount = 1;

        int actualContactAmount = phoneBook.add("Ivan Popov", "9056708754");

        Assertions.assertEquals(expectedContactAmount, actualContactAmount);
    }

    @Test()
    public void test_addSameContact() {
        PhoneBook phoneBook = new PhoneBook();
        int expectedContactAmount = 1;
        phoneBook.add("Natalia Ivanova", "9056708754");

        int actualContactAmount = phoneBook.add("Natalia Ivanova", "9056708754");

        Assertions.assertEquals(expectedContactAmount, actualContactAmount);
    }

    @Test
    public void test_positive_findByNumber() {
        PhoneBook phoneBook = new PhoneBook();
        String expectedName = "Elena Petrova";
        phoneBook.add("Elena Petrova", "9112345678");

        String actualName = phoneBook.findByNumber("9112345678");

        Assertions.assertEquals(expectedName, actualName);
    }

    @Test
    public void test_negative_findByNumber() {
        PhoneBook phoneBook = new PhoneBook();

        String actualName = phoneBook.findByNumber("9111111111");

        Assertions.assertNull(actualName);
    }
}
