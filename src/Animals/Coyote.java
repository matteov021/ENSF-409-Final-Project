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

public class Coyote extends Animal{
    
    public Coyote(int ID, String nickName, String animalSpecies){
        super(ID, nickName, animalSpecies);
    }

    /**
     * Create & Return Item Object With Coyote Specific Feeding Values
     * Override The Animal Method If Called
     * Crepusular (7PM startHour)
     * @return Item
     */

    @Override
    public Item feeding() {
        return new Item(getID(), 0, 19, 3, 5);
    }
}
 