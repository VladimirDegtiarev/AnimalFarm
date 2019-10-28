package DomesticAnimals;

abstract public class DAnimal {

    protected String name;
    protected int health;
    protected int weight;
    protected int resProduction;
    protected int speed;

    public DAnimal () {}

    public DAnimal(String name, int health, int weight, int resProduction, int speed) {
        this.name = name;
        this.health = health;
        this.weight = weight;
        this.resProduction = resProduction;
        this.speed = speed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setResProduction(int resProduction) {
        this.resProduction = resProduction;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getWeight() {
        return weight;
    }

    public int getResProduction() {
        return resProduction;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return name +
                ", Здоровье:" + health +
                ", Вес:" + weight +
                ", Дает ресурсов:" + resProduction + " (в день)" +
                ", Скорость: " + speed;
    }
}
