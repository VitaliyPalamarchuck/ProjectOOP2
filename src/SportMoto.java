// Підклас SportMoto, який наслідує клас Transport
class SportMoto extends Transport{
    // Конструктор SportMoto
    public SportMoto(String name, int horsePower, int height, int tankCapacity, int price) {
        super(name, horsePower, height, tankCapacity, price, "Sport");
    }

}