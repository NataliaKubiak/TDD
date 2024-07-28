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
}
