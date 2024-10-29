import java.util.Scanner;
import  java.util.List;

public class ShowChosenMenu {
    // Вивід меню адміністратора
    public static void showAdminMenu(Admin admin) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Додати мотоцикл");
            System.out.println("2. Видалити мотоцикл");
            System.out.println("3. Вийти");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    admin.addMoto(); // Додаємо мотоцикл
                    break;
                case 2:
                    admin.removeMoto(); // Видаляємо мотоцикл
                    break;
                case 3:
                    return; // Вихід з меню
                default:
                    System.out.println("Невірний вибір.");
            }
        }
    }

    // Метод для відображення меню для покупця
    public static void showMotoMenu(Buyer buyer) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Виберіть категорію мотоциклів(введіть потрібний вам номер):");
        System.out.println("1. Спортивні");
        System.out.println("2. Круїзери");
        System.out.println("3. Туристичні");

        int categoryChoice = scanner.nextInt();
        List<Transport> motos = MotoFactory.createMotos(categoryChoice);

        for (Transport moto : motos) {
            moto.bikeInfo();
            System.out.println();
        }

        System.out.println("Пошук мотоцикла за ціною в межах капіталу...");
        buyer.findMotoByPrice(motos);
    }
}
