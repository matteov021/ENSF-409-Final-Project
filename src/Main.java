import Schedule.*;

public class Main {

    public static void main(String[] args) {
        // Dummy credentials for demonstration. Replace with actual credentials.
        String username = "aboba";
        String password = "ucalgary";

        try {
            // Instantiate the Schedule class, which should automatically create the schedule and write it to a file
            Schedule schedule = new Schedule(username, password);
            
            // At this point, the schedule should be created and written to Schedule.txt
            System.out.println("Schedule creation completed successfully and written to Schedule.txt.");
        } catch (IllegalArgumentException e) {
            System.err.println("There was an error during schedule creation: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

