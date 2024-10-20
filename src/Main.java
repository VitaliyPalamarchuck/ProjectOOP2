import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Buyer buyer; // оголошення змінної buyer
        // Введення капіталу покупця
        System.out.println("Введіть ваш капітал:");
        int capital = scanner.nextInt();
        buyer = new Buyer(capital);

        // Виведення меню вибору категорій мотоциклів
        System.out.println("Виберіть категорію мотоциклів(введіть потрібний вам номер):");
        System.out.println("1. Спортивні");
        System.out.println("2. Круїзери");
        System.out.println("3. Туристичні");

        int CategoryChoice = scanner.nextInt();
        //Створюємо список мотоциклів залежно від вибраної категорії
        List<Transport> motos = MotoFactory.createMotos(CategoryChoice);

        // Виведення інформації про мотоцикли
        for (Transport moto : motos) {
            moto.bikeInfo();
            System.out.println(); // для розділення інформації про різні мотоцикли
        }

        System.out.println("Пошук мотоцикла за ціною в межах капіталу...");
        buyer.findMotoByPrice(motos);
    }
}
