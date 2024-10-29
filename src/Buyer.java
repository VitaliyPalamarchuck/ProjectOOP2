import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Buyer {
    public int capital; // Змінна для збереження доступного капіталу покупця

    // Конструктор класу Buyer, що ініціалізує капітал
    public Buyer(int capital) {
        this.capital = capital;
    }

    // Метод для пошуку доступних мотоциклів за ціною
    public void findMotoByPrice(List<Transport> motos) {
        // Отримуємо список мотоциклів, які покупець може собі дозволити
        List<Transport> affordableMotos = getAffordableMotos(motos);

        // Якщо список доступних мотоциклів порожній, виводимо повідомлення
        if (affordableMotos.isEmpty()) {
            System.out.println("Мотоцикла з ціною до " + capital + " € не знайдено.");
        } else {
            // Виводимо список мотоциклів, які покупець може придбати
            System.out.println("Мотоцикли, які ви можете придбати:");
            for (int i = 0; i < affordableMotos.size(); i++) {
                System.out.println((i + 1) + ". " + affordableMotos.get(i).getName()+" - "+affordableMotos.get(i).getPrice()+" €");
            }

            // Запитуємо у користувача номер мотоцикла, який він хоче купити
            System.out.println("\nВиберіть номер мотоцикла, який бажаєте придбати:");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            // Перевіряємо, чи вибір користувача в межах доступного списку
            if (choice >= 1 && choice <= affordableMotos.size()) {
                System.out.println("Ви обрали мотоцикл:");
                // Виводимо інформацію про обраний мотоцикл
                affordableMotos.get(choice - 1).bikeInfo();
            } else {
                // Якщо вибір некоректний, виводимо повідомлення
                System.out.println("Неправильний вибір. Спробуйте ще раз.");
            }
        }
    }

    // Метод для фільтрації доступних мотоциклів за ціною
    private List<Transport> getAffordableMotos(List<Transport> motos) {
        // Створюємо новий список для збереження доступних мотоциклів
        List<Transport> affordableMotos = new ArrayList<>();
        for (Transport moto : motos) {
            // Додаємо мотоцикл до списку, якщо його ціна не перевищує капітал покупця
            if (moto.getPrice() <= capital) {
                affordableMotos.add(moto);
            }
        }
        // Повертаємо список доступних мотоциклів
        return affordableMotos;
    }
}