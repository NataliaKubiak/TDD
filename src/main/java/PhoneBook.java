import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PhoneBook {

    private Map<String, String> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public int add(String name, String number) {
        phoneBook.put(name, number);
        return phoneBook.size();
    }

    //без полного перебора = возвращаем первое подходящее значение
    public String findByNumber(String number) {
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            if (Objects.equals(number, entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
}
