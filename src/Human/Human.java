package Human;

public class Human {

    protected String name;
    protected int numberOfConsumedResources;
    protected int numberOfGottenResources;

    public Human () {}

    public Human(String name, int numberOfConsumedResources, int numberOfGottenResources) {
        this.name = name;
        this.numberOfConsumedResources = numberOfConsumedResources;
        this.numberOfGottenResources = numberOfGottenResources;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfConsumedResources(int numberOfConsumedResources) {
        this.numberOfConsumedResources = numberOfConsumedResources;
    }

    public void setNumberOfGottenResources(int numberOfGottenResources) {
        this.numberOfGottenResources = numberOfGottenResources;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfConsumedResources() {
        return numberOfConsumedResources;
    }

    public int getNumberOfGottenResources() {
        return numberOfGottenResources;
    }

    @Override
    public String toString() {
        return name +
                ", Ежедневно потребляет:" + numberOfConsumedResources;
    }
}
