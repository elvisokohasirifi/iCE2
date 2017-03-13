/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author razak
 */
public class MainUser extends Users {
    
    //user information
    protected String phone;
    protected String location;
    protected String emergency_name;
    protected String emergency_number;

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
     * This reports an emergency 
     * @return True if successful
     */
    public boolean reportEmergency() {
        return false;
    }

    /**
     * This method is called to modify user information
     */
    public void changeDetails() {

    }

    /**
     * This is use to record and Audio during emergencies
     * @return byte[] audio record
     */
    public byte[] recordAudio() {
        return null;
    }
    
    /**
     * for taking pictures during emergencies
     * @return byte[] pictures
     */
    public byte[] takePictures() {
        return null;
    }
    
}
