/**
 * @author Matteo Valente
 * @author Marcus Gee
 * @author Findlay Dunn-Wolbaum
 * @author Omar Ahmed
 * @version 1.4.0
 * @since 1.0.0
 */

package Animals;
import Schedule.Item;

public class Animal {
    // I think all should be private final except for kitStatus
    // private final is used for encapsulation
    // could use protected final to allow subclasses to access directly, but we have getter methods
    private final int ID;  //Unique ID for each animal
    private final String nickName;  //Animal's name
    private final String animalSpecies; //Animal's species
    private boolean kitStatus = false; //Kit Status

    /**
     * Animal Constructor
     * @param ID            - Animal's ID
     * @param nickName      - Animal's Name
     * @param animalSpecies - Animal's Species
     * @throws IllegalArgumentException - if inputs are invalid
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
     * Retrieves the unique ID of the animal.
     * @return the unique identifier for this animal.
     */

    public int getID() {
        return ID;
    }

    /**
     * Retrieves the nickname of the animal.
     * @return the nickname of the animal as a String. Can be empty but never null.
     */

     public String getNickName() {
        return nickName;
    }

    /**
     * Retrieves the species of the animal.
     * @return the species of the animal as a String.
     */

     public String getAnimalSpecies() {
        return animalSpecies;
    }

    /**
     * Checks if the animal is a kit (a young or baby animal).
     * @return true if the animal is a kit, false otherwise.
     */

     public boolean getKitStatus() {
        return kitStatus;
    }

    /**
     * Marks the animal as a kit (a young or baby animal).
     * Note: This method can only set the kit status to true.
     */

     public void setKitStatus() {
        this.kitStatus = true;
    }

    /**
     * Creates and returns an Item object with default feeding values for the animal.
     * The default feeding schedule is a 5-minute feeding within a 3-hour window.
     * This method assumes the use of a 24-hour clock for scheduling.
     * @return an Item object representing the default feeding schedule for this animal.
     */

    public Item feeding() {
        return new Item(this.ID, 0, 0, 3, 5);
    }
}