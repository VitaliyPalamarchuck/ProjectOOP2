// Підклас CruiserMoto, який наслідує клас Transport
class CruiserMoto extends Transport{
    // Конструктор CruiserMoto
    public CruiserMoto(String name, int horsePower, int height, int tankCapacity, int price) {
        super(name, horsePower, height, tankCapacity, price, "Cruiser");
    }

}

