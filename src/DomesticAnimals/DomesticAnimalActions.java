package DomesticAnimals;

import Human.Human;
import WildAnimals.WAnimal;

public interface DomesticAnimalActions {

    void giveResources(Human human);
    void getHealth(Human human);

    void runAway(WAnimal animal);

}
