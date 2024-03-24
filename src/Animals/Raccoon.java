/**
 * @author Matteo Valente
 * @author Marcus Gee
 * @author Findlay Dunn-Wolbaum
 * @author Omar Ahmed
 * @version 1.2.0
 * @since 1.0.0
 */

package Animals;

import Schedule.Item;

public class Raccoon extends Animal {
    
    public Raccoon(int ID, String nickName, String animalSpecies) {
        super(ID, nickName, animalSpecies);
    }

    /**
     * Create & Return Item Object With Raccoon Specific Feeding Values
     * Override The Animal Method If Called
     * Nocturnal (12AM startHour)
     * @return Item
     */

    @Override
    public Item feeding() {
        return new Item(getID(), 0, 0, 3, 5);
    }    

}
 