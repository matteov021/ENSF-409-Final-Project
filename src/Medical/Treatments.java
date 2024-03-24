/**
 * @author Matteo Valente
 * @author Marcus Gee
 * @author Findlay Dunn-Wolbaum
 * @author Omar Ahmed
 * @version 1.5.0
 * @since 1.2.0
 */

package Medical;

public class Treatments {
    
    // Treatments class is designed to manage the assignment of treatments to animals.
    // Each treatment is associated with a unique treatment ID, an animal ID, a task ID, and a start hour for the treatment.

    private final int TREATMENTID;
    private final int ANIMALID;
    private final int TASKID;
    private int startHour;

    /**
     * Treatments Constructor
     * @param treatmentID - Treatment ID
     * @param animalID    - Animal ID
     * @param taskID      - Task ID
     * @param startHour   - Start Hour
     */

    public Treatments(int treatmentID, int animalID, int taskID, int startHour) throws IllegalArgumentException {
        if (startHour < 0 || startHour > 23) {
            throw new IllegalArgumentException();
        }
        
        this.TREATMENTID = treatmentID;
        this.ANIMALID = animalID;
        this.TASKID = taskID;
        this.startHour = startHour;
    }

    /**
     * TREATMENTID Getter
     * @return TREATMENTID
     */
    
     public int getTreatmentID() {
        return TREATMENTID;
    }

    /**
     * ANIMALID Getter
     * @return ANIMALID
     */

    public int getAnimalID() {
        return ANIMALID;
    }

    /**
     * TASKID Getter
     * @return TASKID
     */

    public int getTaskID() {
        return TASKID;
    }

    /**
     * startHour Getter
     * @return startHour
     */

    public int getStartHour() {
        return startHour;
    }

    /**
     * startHour Setter
     * @param startHour
     */

    public void setStartHour(int startHour) throws IllegalArgumentException {
        if (startHour < 0 || startHour > 23) {
            throw new IllegalArgumentException();
        }
        this.startHour = startHour;
    }
}
