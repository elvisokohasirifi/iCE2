
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author razak
 */
public class Emergency {

    //Emergency information
    protected char type;
    protected MainUser reporter;
    protected Dashboard_Users respondent;
    protected Date date_time;
    protected String location;
    protected byte[] picture;
    protected byte[] audio;

    //create constructor
    public Emergency() {

    }

    /**
     * View information of the emergency
     * @return String formatted report of the emergency
     */
    public String viewEmergency() {
        return null;
    }

}

/**
 * Emergency types
 * @author razak
 * H for .........
 * A for .........
 * S for .........
 */
enum Emergency_Type {
    H, A, S
}
