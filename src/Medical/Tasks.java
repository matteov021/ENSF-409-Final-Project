/**
 * @author Matteo Valente
 * @author Marcus Gee
 * @author Findlay Dunn-Wolbaum
 * @author Omar Ahmed
 * @version 1.4.0
 * @since 1.0.0
 */

package Medical;

public class Tasks {
    
    // Tasks class used to create tasks.
    // Used by Animals class and Treatments class.
    // Creates a list of tasks for each animal.

    private final int TASKID;
    private final String DESCRIPTION;
    private final int MAXWINDOW;
    private final int DURATION;

    /**
     * Tasks Constructor
     * @param taskID        - Task ID
     * @param description   - Description Of Task
     * @param maxWindow     - Max Window For Task
     * @param duration      - Duration Of The Task
     */

    public Tasks(int taskID, String description, int duration, int maxWindow) throws IllegalArgumentException {
        if (duration < 0) {
            throw new IllegalArgumentException();
        }
        if (maxWindow < 0 || maxWindow > 24) {
            throw new IllegalArgumentException();
        }

        this.TASKID = taskID;
        this.DESCRIPTION = description;
        this.MAXWINDOW = maxWindow;
        this.DURATION = duration;
    }
    
    /**
     * TASKID Getter
     * @return TASKID
     */
    
     public int getTaskID() {
        return TASKID;
    }

    /**
     * DESCRIPTION Getter
     * @return DESCRIPTION
     */

    public String getDescription() {
        return DESCRIPTION;
    }

    /**
     * MAXWINDOW Getter
     * @return MAXWINDOW
     */
    
     public int getMaxWindow() {
        return MAXWINDOW;
    }

    /**
     * DURATION Getter
     * @return DURATION
     */
    
     public int getDuration() {
        return DURATION;
    }
}
