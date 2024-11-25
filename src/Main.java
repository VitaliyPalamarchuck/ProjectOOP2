import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запитуємо користувача про тип входу: Покупець чи Адміністратор
        System.out.println("Ви бажаєте ввійти як:\n1. Покупець \n2. Адміністратор");
        int userType = scanner.nextInt();

        if (userType == 1) {
            // Вхід як покупець
            Buyer buyer; // Оголошуємо змінну buyer
            System.out.println("Введіть ваш капітал:"); // Вводимо капітал покупця
            int capital = scanner.nextInt();
            buyer = new Buyer(capital); // Ініціалізуємо об'єкт покупця
            ShowChosenMenu.showMotoMenu(buyer); // Відображаємо меню для покупця
        } else if (userType == 2) {
            // Вхід як адміністратор
            Admin admin = new Admin("admin", "password"); // Логін та пароль адміністратора за замовчуванням
            System.out.println("Введіть логін:");
            String username = scanner.next();
            System.out.println("Введіть пароль:");
            String password = scanner.next();

            if (admin.authenticate(username, password)) {
                // Якщо логін і пароль правильні, показуємо меню адміністратора
                ShowChosenMenu.showAdminMenu(admin);
            } else {
                // Повідомлення про невірний логін або пароль
                System.out.println("Невірний логін або пароль.");
            }
        } else {
            // Невірний вибір для типу входу
            System.out.println("Невірний вибір.");
        }

        scanner.close(); // Закриваємо сканер для звільнення ресурсів
    }
}
