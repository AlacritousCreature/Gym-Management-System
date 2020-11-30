/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymmanagement;

import static gymmanagement.MainLogin.*;
import java.util.*;

/**
 *
 * @author
 */
public class TrainerDetails {

    public static void deletetrainer(String name) {

        if (TrainerL.containsKey(name)) {
            TrainerDetails obj = TrainerO.get(name);
            TrainerL.remove(name);
            TrainerO.remove(name);
            U1.remove(obj);
            B1.remove(obj);
            G1.remove(obj);
            U2.remove(obj);
            B2.remove(obj);
            G2.remove(obj);

        }
    }

    static ArrayList<TrainerDetails> tr = new ArrayList<TrainerDetails>();
    public HashMap<String,UserDetails> Cust=new HashMap<String,UserDetails>();
    private String name, username, gender, age, contactno, email, password;
    public int u1 = 0, b1 = 0, g1 = 0, u2 = 0, b2 = 0, g2 = 0;

    public TrainerDetails(String name, String username, String gender, String age, String contactno, String email, String password) {
        this.name = name;
        this.username = username;
        this.gender = gender;
        this.age = age;
        this.contactno = contactno;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getContactno() {
        return contactno;
    }

    public void setContactno(String contactno) {
        this.contactno = contactno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
