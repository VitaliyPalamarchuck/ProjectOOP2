import java.util.ArrayList;
import java.util.List;

public class MotoFactory {
    //метод для створення списку мотоциклів в залежності від вибраної категорії
    public static List<Transport> createMotos(int categoryChoice) {
        List<Transport> motos = new ArrayList<>(); //список для збереження мотоциклів
        //світч для вибору категорії
        switch (categoryChoice) {
            case 1:
                motos.add(new SportMoto("SportBike1", 300, 1150, 20, 25000));
                motos.add(new SportMoto("SportBike2", 250, 1050, 17, 24000));
                motos.add(new SportMoto("SportBike3", 220, 1000, 14, 19000));
                break;
            case 2:
                motos.add(new CruiserMoto("CruiserBike1", 150, 1200, 20, 12000));
                motos.add(new CruiserMoto("CruiserBike2", 160, 1250, 19, 13000));
                motos.add(new CruiserMoto("CruiserBike3", 175, 1450, 21, 14000));
                break;
            case 3:
                motos.add(new TouristMoto("TouringBike1", 180, 1300, 22, 10000));
                motos.add(new TouristMoto("TouringBike2", 170, 1350, 21, 9000));
                motos.add(new TouristMoto("TouringBike3", 160, 1250, 20, 8000));
                break;
            default:
                System.out.println("Категорії під даним номером не існує!");
                break;
        }
        return motos; // повернення списку мотоциклыв
    }
}
