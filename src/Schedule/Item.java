/**
 * @author Matteo Valente
 * @author Marcus Gee
 * @author Findlay Dunn-Wolbaum
 * @author Omar Ahmed
 * @version 1.7.0
 * @since 1.5.0
 */

package Schedule;

public class Item {
    private int animalID;
    private int taskID;
    private int startHour;
    private int maxWindow;
    private int duration;
    private int treatmentID;

    /**
     * Item Constructor
     * @param animalID  - Animal ID
     * @param taskID    - Task ID
     * @param startHour - Start Hour 
     * @param maxWindow - Max Window Time
     * @param duration  - Duration
     */

    public Item(int animalID, int taskID, int startHour, int maxWindow, int duration) {
        if (duration < 0) {
            throw new IllegalArgumentException();
        }
        if (maxWindow < 0 || maxWindow > 24) {
            throw new IllegalArgumentException();
        }
        if (startHour < 0 || startHour > 23) {
            throw new IllegalArgumentException();
        }

        this.animalID = animalID;
        this.taskID = taskID;
        this.startHour = startHour;
        this.maxWindow = maxWindow;
        this.duration = duration;
        this.treatmentID = 0;
    }

    // Constructor That Includes Treatment ID

    public Item(int animalID, int taskID, int startHour, int maxWindow, int duration, int treatmentID) {
        if (duration < 0) {
            throw new IllegalArgumentException();
        }
        if (maxWindow < 0 || maxWindow > 24) {
            throw new IllegalArgumentException();
        }
        if (startHour < 0 || startHour > 23) {
            throw new IllegalArgumentException();
        }

        this.animalID = animalID;
        this.taskID = taskID;
        this.startHour = startHour;
        this.maxWindow = maxWindow;
        this.duration = duration;
        this.treatmentID = treatmentID;
    }
    
    /**
     * animalID Getter
     * @return animalID
     */

    public int getAnimalID() {
        return animalID;
    }

    /**
     * taskID Getter
     * @return taskID
     */

    public int getTaskID() {
        return taskID;
    }

    /**
     * startHour Getter
     * @return startHour
     */

    public int getStartHour() {
        return startHour;
    }

    /**
     * maxWindow Getter
     * @return maxWindow
     */

    public int getMaxWindow() {
        return maxWindow;
    }

    /**
     * duration Getter
     * @return duration
     */

    public int getDuration() {
        return duration;
    }

    /**
     * treatmentID Getter
     * @return treatmentID
     */

    public int getTreatmentID() {
        return treatmentID;
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
