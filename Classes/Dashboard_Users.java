/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author razak
 */
public class Dashboard_Users extends Users {

    /**
     * Login in to system
     * @param name username
     * @param password password of user
     * @return True if login is successful
     */
    @Override
    public boolean login(String name, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Method for viewing reports of emergencies and responses
     * @return String formated report
     */
    public String viewReports() {
        return null;
    }

    /**
     * Adding an emergency number
     * @param number String format of the number to add
     */
    public void addEmergencyNumber(String number) {

    }

    /**
     * Check if a respondent has responded to an emergency
     * @return True if he/she has
     */
    public boolean respond() {
        return false;
    }

    /**
     * Creates a new user 
     * @return True if successful
     */
    public boolean createNewUser() {
        return false;
    }
}
