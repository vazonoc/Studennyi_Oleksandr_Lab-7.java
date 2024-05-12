import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TelephoneBook {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Сидоренко", "123456789");
        phoneBook.put("Петров", "987654321");
        phoneBook.put("Іванов", "456123789");
        phoneBook.put("Сидоров", "789456123");
        phoneBook.put("Коваленко", "321654987");
        phoneBook.put("Смирнов", "654987321");
        phoneBook.put("Петренко", "147258369");
        phoneBook.put("Ковальов", "369852147");
        phoneBook.put("Михайленко", "258369147");
        phoneBook.put("Григоренко", "852147369");

        System.out.println("Телефонна книга:");
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println("Прізвище: " + entry.getKey() + ", Номер телефону: " + entry.getValue());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть прізвище для видалення:");
        String lastNameToRemove = scanner.nextLine();

        if (phoneBook.containsKey(lastNameToRemove)) {
            phoneBook.remove(lastNameToRemove);
            System.out.println("Запис для абонента " + lastNameToRemove + " видалено");
        } else {
            System.out.println("Не можливо видалити запис - абонент " + lastNameToRemove + " відсутній в книзі");
        }

        System.out.println("Кількість записів у книзі: " + phoneBook.size());

        scanner.close();
    }
}

