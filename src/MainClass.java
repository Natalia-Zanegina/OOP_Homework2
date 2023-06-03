public class MainClass {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Барсик", 100),
                new Cat("Мурзик", 150),
                new Cat("Рыжик", 80)
        };
        Plate plate = new Plate(130);
        plate.info();

        feedCats(cats, plate);
        plate.info();

        plate.add(100);

        feedCats(cats, plate);
        plate.info();

        plate.add(120);

        feedCats(cats, plate);
        plate.info();
    }
    static void feedCats(Cat[] cats, Plate plate){
        for(Cat cat : cats){
            cat.eat(plate.getFood());
            if (cat.getSatiety()) {
                plate.setFood(plate.getFood() - cat.getAppetite());
                cat.setAppetite(0);
                System.out.printf("%s сыт\n", cat.getName());
            }
            else {
                System.out.printf("%s голоден\n", cat.getName());
            }
        }
    }
}

