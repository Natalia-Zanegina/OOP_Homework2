public class Cat {
    private String name;
    private int appetite;

    private boolean satiety;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean getSatiety() {
        return satiety;
    }

    public void setSatiety(Boolean satiety) {
        this.satiety = satiety;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(int food){
        if (appetite <= food){
            satiety = true;
        }
    }
}
