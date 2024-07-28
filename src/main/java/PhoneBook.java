import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class PhoneBook {

    private Map<String, String> phoneBook;

    public PhoneBook() {
        phoneBook = new TreeMap<>();
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

    public String findByName(String name) {
        return phoneBook.get(name);
    }

    //имена в алфавитном порядке без необходимости проводить сортировку = используем TreeMap вместо HashMap
    public void printAllNames() {
        for (String key : phoneBook.keySet()) {
            System.out.println(key);
        }
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Vladimir Petrov", "9112223344");
        phoneBook.add("Ivan Popov", "9111111111");
        phoneBook.add("Albina Agoshkova", "9128887766");

        phoneBook.printAllNames();
    }
}
