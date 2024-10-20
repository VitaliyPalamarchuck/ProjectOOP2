// Підклас TouristMoto, який наслідує клас Transport
class TouristMoto extends Transport {
    // Конструктор TouristMoto
    public TouristMoto(String name, int horsePower, int height, int tankCapacity, int price) {
        super(name, horsePower, height, tankCapacity, price, "Tourist");
    }

}