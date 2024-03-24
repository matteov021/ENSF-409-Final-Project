/**
 * @author Matteo Valente
 * @author Marcus Gee
 * @author Findlay Dunn-Wolbaum
 * @author Omar Ahmed
 * @version 1.3.0
 * @since 1.0.0
 */

package Animals;
import Schedule.Item;

public class Animal {
    // should all these be private final or protected final?
    // should we have the following?:
    // Boolean orphaned
    // String AnimalFeedingType
    // FeedWindow
    // FeedTime
    // FeedPrepTime
    // CleanTime
    private final int ID; //Unique ID for each animal
    private String nickName;
    private String animalSpecies;
    private boolean kitStatus = false;

    /**
     * Animal Constructor
     * @param ID            - Animal's ID
     * @param nickName      - Animal's Name
     * @param animalSpecies - Animal's Species
     */

    public Animal(int ID, String nickName, String animalSpecies) throws IllegalArgumentException {
        if (ID < 0)
            throw new IllegalArgumentException();
        else if (nickName == null || nickName.isEmpty())
            throw new IllegalArgumentException();
        else if (animalSpecies == null || animalSpecies.isEmpty())
            throw new IllegalArgumentException();

        this.ID = ID;
        this.nickName = nickName;
        this.animalSpecies = animalSpecies;
    }

    /**
     * ID Getter
     * @return ID
     */

    public int getID() {
        return ID;
    }

    /**
     * nickName Getter
     * @return nickName
     */

     public String getNickName() {
        return nickName;
    }

    /**
     * animalSpecies Getter
     * @return animalSpecies
     */

     public String getAnimalSpecies() {
        return animalSpecies;
    }

    /**
     * kitStatus Getter
     * @return kitStatus
     */

     public boolean getKitStatus() {
        return kitStatus;
    }

    /**
     * kitStatus Setter
     */

     public void setKitStatus() {
        this.kitStatus = true;
    }

    /**
     * Create & Return Item Object With Default Feeding Values 
     * For All Animal Species, Default Has 5 Min Feeding, 3-Hour Window
     * @return Item
     */

    public Item feeding() {
        return new Item(this.ID, 0, 0, 3, 5);
    }
}