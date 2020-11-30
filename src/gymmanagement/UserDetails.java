/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymmanagement;
import javax.swing.*;
import java.util.*;
import java.lang.*;
import java.io.*;
/**
 *
 * @author aadityagadhave
 */


public class UserDetails {

    static ArrayList<UserDetails>user=new ArrayList<UserDetails>();
    
    private String name,last,us,gender,memberShip,email,password,address,train,sl,plan="Do Something";
    private int age,weight,height;
    private TrainerDetails assT=null;
    private int ch=1;

    public int getCh() {
        return ch;
    }

    public void setCh(int ch) {
        this.ch = ch;
    }
    public TrainerDetails getAssT() {
        return assT;
    }

    public void setAssT(TrainerDetails assT) {
        this.assT = assT;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public UserDetails(String name, String last, String us, String gender, String memberShip, String email, String password, String train,String sl,int age, int weight, int height,String address) {
        this.name = name;
        this.last = last;
        this.us = us;
        this.gender = gender;
        this.memberShip = memberShip;
        this.email = email;
        this.password = password;
        this.address = address;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.train=train;
        this.sl=sl;
    }

    public String getTrain() {
        return train;
    }

    public void setTrain(String train) {
        this.train = train;
    }

    public String getSl() {
        return sl;
    }

    public void setSl(String sl) {
        this.sl = sl;
    }

    
    public static void setUser(ArrayList<UserDetails> user) {
        UserDetails.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getUs() {
        return us;
    }

    public void setUs(String us) {
        this.us = us;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMemberShip() {
        return memberShip;
    }

    public void setMemberShip(String memberShip) {
        this.memberShip = memberShip;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    
    
    
}
