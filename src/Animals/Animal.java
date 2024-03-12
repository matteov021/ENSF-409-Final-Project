/**
 * 
 * @author Matteo Valente
 * @author 
 * @author 
 * @author 
 * @version 1.0.0
 * @since 1.0.0
 */

package Animals;

public class Animal {
    private final int ID;
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
        else if (nickName == null || nickName == "")
            throw new IllegalArgumentException();
        else if (animalSpecies == null || animalSpecies == "")
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

     public boolean getKitStaus() {
        return kitStatus;
    }

    /**
     * kitStatus Setter
     */

     public void setKitStaus() {
        this.kitStatus = true;
    }

}