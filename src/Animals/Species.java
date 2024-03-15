/**
 * @author Matteo Valente
 * @author Marcus Gee
 * @author Findlay Dunn-Wolbaum
 * @author Omar Ahmed
 * @version 1.2.0
 * @since 1.0.0
 */

package Animals;
import Medical.Tasks;

public enum Species {
    
    /**
     * enum Override
     * Set Animal ID To 1
     * This Forces Feeding To Occur If Neccessary
     */
    
    beaver {
        public Tasks feedingTask() {
            return new Tasks(1, "Feeding", 5, 3);
        }
    },
    coyote {
        public Tasks feedingTask() {
            return new Tasks(1, "Feeding", 5, 3);
        }
    },
    fox {
        public Tasks feedingTask() {
            return new Tasks(1, "Feeding", 5, 3);
        }
    },
    porcupine {
        public Tasks feedingTask() {
            return new Tasks(1, "Feeding", 5, 3);
        }
    },
    racoon {
        public Tasks feedingTask() {
            return new Tasks(1, "Feeding", 5, 3);
        }
    };
    public abstract Tasks feedingTask();
}
