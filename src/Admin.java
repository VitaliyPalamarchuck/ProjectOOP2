import java.util.Scanner;

public class Admin {
    private String username;
    private String password;

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Метод аутентифікації
    public boolean authenticate(String inputUsername, String inputPassword) {
        return username.equals(inputUsername) && password.equals(inputPassword);
    }

    // Додаємо мотоцикл
    public void addMoto() throws InvalidMotoCategory {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть категорію мотоцикла (Sport/Cruiser/Tourist):");
        String category = scanner.nextLine();
        System.out.println("Введіть назву мотоцикла:");
        String name = scanner.nextLine();
        System.out.println("Введіть потужність (к.с.):");
        int horsePower = scanner.nextInt();
        System.out.println("Введіть висоту (мм):");
        int height = scanner.nextInt();
        System.out.println("Введіть об'єм баку (л):");
        int tankCapacity = scanner.nextInt();
        System.out.println("Введіть ціну (євро):");
        int price = scanner.nextInt();

        Transport newMoto;
        switch (category) {
            case "Sport":
                newMoto = new SportMoto(name, horsePower, height, tankCapacity, price);
                break;
            case "Cruiser":
                newMoto = new CruiserMoto(name, horsePower, height, tankCapacity, price);
                break;
            case "Tourist":
                newMoto = new TouristMoto(name, horsePower, height, tankCapacity, price);
                break;
            default:
                throw new InvalidMotoCategory("Категорія "+category+ " є некоректою");
        }

        MotoFactory.addMoto(newMoto); // Додаємо новий мотоцикл до фабрики
        System.out.println("Мотоцикл додано успішно.");
    }

    // Видаляємо мотоцикл
    public void removeMoto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть назву мотоцикла для видалення:");
        String name = scanner.nextLine();

        for (Transport moto : MotoFactory.getAllMotos()) {
            if (moto.getName().equalsIgnoreCase(name)) {
                MotoFactory.removeMoto(moto); // Видалення мотоцикла
                System.out.println("Мотоцикл видалено успішно.");
                return;
            }
        }
        System.out.println("Мотоцикл з такою назвою не знайдено.");
    }
}
