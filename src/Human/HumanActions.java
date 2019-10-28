package Human;

import DomesticAnimals.DAnimal;
import WildAnimals.WAnimal;

public interface HumanActions {

    void driveOutWildAnimal (WAnimal animal);

    void consumeResources(DAnimal animal);
    void feedDomesticAnimal(DAnimal animal);
    void killDomesticAnimal(DAnimal animal);

}
