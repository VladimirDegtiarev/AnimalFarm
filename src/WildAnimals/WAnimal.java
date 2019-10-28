package WildAnimals;

public class WAnimal {

    protected String name;
    protected int attack;
    protected int speed;
    protected int escaped;

    public WAnimal() {}

    public WAnimal(String name, int attack, int speed, int escaped) {
        this.name = name;
        this.attack = attack;
        this.speed = speed;
        this.escaped = escaped;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setEscaped(int escaped) {
        this.escaped = escaped;
    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    public int getSpeed() {
        return speed;
    }

    public int getEscaped() {
        return escaped;
    }

    @Override
    public String toString() {
        return name +
                ", Сила атаки: " + attack +
                ", Скорость: " + speed;
    }
}
