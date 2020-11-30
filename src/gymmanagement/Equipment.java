/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymmanagement;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author
 */
public class Equipment {

    String name;
    int quantity;
    public static ArrayList<Equipment> EList = new ArrayList<Equipment>();

    Equipment(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static void load() {
        File f = new File("src/gymmanagement/equipment.txt");
        try {
            Scanner s = new Scanner(f);
            //JOptionPane.showMessageDialog(null,"hey");

//            if(f==null)
//                System.out.println("heya");
            while (s.hasNext()) {
                String name = s.next();
                int q = s.nextInt();
                Equipment ee = new Equipment(name, q);
                EList.add(ee);

            }
        } catch (Exception e) {
            System.out.println("Heyaaa");
        }

    }

}
