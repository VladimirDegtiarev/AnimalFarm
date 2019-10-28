package Farm;

import DomesticAnimals.*;
import Human.*;
import WildAnimals.*;

public class Farm {

    private DAnimal [] dAnimals = new DAnimal[10];
    private Human [] humans = new Human[1];
    private WAnimal [] wAnimals = new WAnimal[3];

    int randomDomesticAnimal;

    public void AddDomesticAnimals() {
        for (int i = 0; i < dAnimals.length - 1; i++) {

            randomDomesticAnimal = (int) (Math.random() * ((3 - 1) + 1)) + 1;

            if (randomDomesticAnimal == 1) {dAnimals[i] = new Cow();}
            else if (randomDomesticAnimal == 2) {dAnimals[i] = new Chicken();}
            else {dAnimals[i] = new Rabbit();}
        }

        dAnimals[9] = new Cat();
    }

    public void AddWildAnimals() {
        wAnimals[0] = new Bear();
        wAnimals[1] = new Wolf();
        wAnimals[2] = new Fox();
    }

    public void Humans() {
        humans[0] = new Farmer();
    }

    public void getINFO () {

        System.out.println("Сейчас на ферме живут животные:");
        for (int i = 0; i < dAnimals.length; i++) {
            System.out.println( i + ". " + dAnimals[i].toString());
        }

        System.out.println("\nЛюди на ферме:");
        for (int i = 0; i < humans.length; i++) {
            System.out.println( i + ". " + humans[i].toString());
        }

        System.out.println("\nЕжедневно ферму атакуют:");
        for (int i = 0; i < wAnimals.length; i++) {
            System.out.println( i + ". " + wAnimals[i].toString());
        }

    }

    public void Day () {}

}
