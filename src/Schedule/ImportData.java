/**
 * @author Matteo Valente
 * @author Marcus Gee
 * @author Findlay Dunn-Wolbaum
 * @author Omar Ahmed
 * @version 2.1.0
 * @since 1.6.0
 */

package Schedule;
import java.sql.*;
import java.util.*;
import Medical.*;
import Animals.*;

public class ImportData { 
    private Connection dbConnection;
    private List<String> validTableNames = Arrays.asList("animals", "tasks", "treatments");

    /**
     * Create A Connection To The Database (EWR)
     * Save To dbConnection
     * @param username
     * @param password
     * @return boolean
    */
    
    public boolean dbConnection(String username, String password) {
        try {
            this.dbConnection = DriverManager.getConnection("jdbc:postgresql://localhost/ewr", username, password);
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
        return true;
    }

    /**
     * Create HashMap From ResultSet
     * Contains AnimalID (key) and AnimalObject (Value)
     * @return animalHashMap
     * @throws SQLException
     */

    public HashMap<Integer, Animal> getAnimalsTable() throws SQLException {
        HashMap<Integer, Animal> animalHashMap = new HashMap<>();
        String tableName = "animals";
        String query = "SELECT * FROM " + tableName;
        
        if (!validTableNames.contains(tableName.toLowerCase())) {
            throw new SQLException("Invalid Table Name.");
        }

        try (Statement statement = dbConnection.createStatement();
            ResultSet table = statement.executeQuery(query)) {
        
            while (table.next()) {
                
                int id = table.getInt("AnimalID");
                String nickName = table.getString("AnimalNickname");
                String animalSpecies = table.getString("AnimalSpecies");
                Animal newAnimal = null;
            
                switch (animalSpecies) {
                    case "beaver":
                        newAnimal = new Beaver(id, nickName, animalSpecies);
                        break;
                    case "coyote":
                        newAnimal = new Coyote(id, nickName, animalSpecies);
                        break;
                    case "fox":
                        newAnimal = new Fox(id, nickName, animalSpecies);
                        break;
                    case "porcupine":
                        newAnimal = new Porcupine(id, nickName, animalSpecies);
                        break;
                    case "raccoon":
                        newAnimal = new Raccoon(id, nickName, animalSpecies);
                        break;
                }
                if (newAnimal != null) {
                    animalHashMap.put(id, newAnimal);
                }
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return animalHashMap;
    }
    
    /**
     * Create HashMap From ResultSet
     * Contains TaskID (key) and TasksObject (Value)
     * @return
     * @throws SQLException
     */
    
    public HashMap<Integer, Tasks> getTasksTable() throws SQLException {
        HashMap<Integer, Tasks> tasksHashMap = new HashMap<>();
        String tableName = "tasks";
        String query = "SELECT * FROM " + tableName;

        if (!validTableNames.contains(tableName.toLowerCase())) {
            throw new SQLException("Invalid Table Name.");
        }

        try (Statement statement = dbConnection.createStatement();
            ResultSet table = statement.executeQuery(query)) {
        
            while (table.next()) {
                
                int taskID = table.getInt("TaskID");
                String description = table.getString("Description");
                int duration = table.getInt("Duration");
                int maxWindow = table.getInt("MaxWindow");
                Tasks newTask = new Tasks(taskID, description, duration, maxWindow);
                tasksHashMap.put(taskID, newTask);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return tasksHashMap;
    }

    /**
     * Create ArrayList From ResultSet
     * Contains Treatments Data
     * @return
     * @throws SQLException
     */

    public ArrayList<Treatments> getTreatmentsTable() throws SQLException {
        ArrayList<Treatments> treatmentsArrayList = new ArrayList<>(); 
        String tableName = "treatments";
        String query = "SELECT * FROM " + tableName;

        if (!validTableNames.contains(tableName.toLowerCase())) {
            throw new SQLException("Invalid Table Name.");
        }
        
        try (Statement statement = dbConnection.createStatement();
            ResultSet table = statement.executeQuery(query)) {
            
                while (table.next()) {
                
                int treatmentID = table.getInt("TreatmentID");
                int animalID = table.getInt("AnimalID");
                int taskID = table.getInt("TaskID");
                int startHour = table.getInt("StartHour");
                Treatments newTreatment = new Treatments(treatmentID, animalID, taskID, startHour);
                treatmentsArrayList.add(newTreatment);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return treatmentsArrayList;   
    }

    /**
     * Set StartHour Of Treatment Based On User Input
     * Allows User To Fix The Schedule
     * Find ID -> Update StartHour -> Return True If Updated
     * @param treatmentID
     * @param newStartHour
     * @return
     */
    
    public boolean updateTreatmentStartHour(int treatmentID, int newStartHour) {
        String query = "UPDATE treatments SET StartHour = ? WHERE TreatmentID = ?";
        try (PreparedStatement preparedStatement = dbConnection.prepareStatement(query)) {
            preparedStatement.setInt(1, newStartHour);
            preparedStatement.setInt(2, treatmentID);
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
