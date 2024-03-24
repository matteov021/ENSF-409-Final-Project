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

public class Beaver extends Animal {
    
    public Beaver(int ID, String nickName, String animalSpecies) {
        super(ID, nickName, animalSpecies);
    }

    /**
     * Create & Return Item Object With Beaver Specific Feeding Values
     * Override The Animal Method If Called
     * Diurnal (8AM startHour)
     * @return Item
     */

    @Override
    public Item feeding() {
        return new Item(getID(), 0, 8, 3, 5);
    }
}
