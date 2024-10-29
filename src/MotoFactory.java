import java.util.ArrayList;
import java.util.List;
// Список усіх мотоциклів
public class MotoFactory {
    private static List<Transport> allMotos = new ArrayList<>();
    static {
        // Додаємо мотоцикли
        allMotos.add(new SportMoto("SportBike1", 300, 1150, 20, 25000));
        allMotos.add(new SportMoto("SportBike2", 250, 1050, 17, 24000));
        allMotos.add(new SportMoto("SportBike3", 220, 1000, 14, 19000));

        allMotos.add(new CruiserMoto("CruiserBike1", 150, 1200, 20, 12000));
        allMotos.add(new CruiserMoto("CruiserBike2", 160, 1250, 19, 13000));
        allMotos.add(new CruiserMoto("CruiserBike3", 175, 1450, 21, 14000));

        allMotos.add(new TouristMoto("TouringBike1", 180, 1300, 22, 10000));
        allMotos.add(new TouristMoto("TouringBike2", 170, 1350, 21, 9000));
        allMotos.add(new TouristMoto("TouringBike3", 160, 1250, 20, 8000));
    }

    //метод для створення списку мотоциклів в залежності від вибраної категорії
    public static List<Transport> createMotos(int categoryChoice) {
        List<Transport> filteredMotos = new ArrayList<>();
        for (Transport moto : allMotos) {
            if((categoryChoice == 1 && moto instanceof SportMoto) ||
                    (categoryChoice == 2 && moto instanceof CruiserMoto)||
                    (categoryChoice == 3 && moto instanceof TouristMoto)){
                filteredMotos.add(moto);
            }
        }
        return filteredMotos;
    }

    public static void addMoto(Transport moto) { // Додаємо новий мотоцикл
        allMotos.add(moto);
    }

    public static boolean removeMoto(Transport moto) { // Видаляємо мотоцикл зі списку
        return allMotos.remove(moto);
    }

    public static List<Transport> getAllMotos() { // Отримуємо список усіх мотоциклів
        return allMotos;
    }
}