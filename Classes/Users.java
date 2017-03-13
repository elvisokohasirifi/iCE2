/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author razak
 */
public abstract class Users {

    //user information
    protected String name;
    protected String password;
    protected char type;
    protected char gender;
    protected String email;

    //public Users(String name, String password, char type, char gender, String email);

    /**
     * Login in to system
     * @param name username
     * @param password password of user
     * @return True if login is successful
     */
    public abstract boolean login(String name, String password);

}
