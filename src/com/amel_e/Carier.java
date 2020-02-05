package com.amel_e;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Carier extends Person {

    private static ArrayList<Carier> carier = new ArrayList<>();
    private static double tips = 0;
    private int salary;

    
    public static void setTips(double tips) {
        BufferedReader reader;
        String line;
        String[] control;
        Carier car;
        try {
            reader = new BufferedReader(new FileReader("/home/nbt/Documents/Amel_e/src/com/amel_e/carier.txt"));
            line = reader.readLine();
            while (line != null) {
                control = line.split(",");
                
                    car = new Carier(control[0], control[1], control[2], control[3], Double.valueOf(control[4]));
                    carier.add(car);
                    
                

                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Carier.tips = Carier.tips + tips / 5.0;
        
        FileOutputStream fos = null;
        String res = "";
        res += carier.get(0).name + "," + carier.get(0).surname + "," + carier.get(0).userName + "," + carier.get(0).password + "," + carier.get(0).tips;
        byte [] b  = res.getBytes();
        try {
            fos = new FileOutputStream("/home/nbt/Documents/Amel_e/src/com/amel_e/carier.txt",false);
            fos.write(b);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Carier.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Carier.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(Carier.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public Carier(String name, String surname, String userName, String password, double tips) {
        super(name, surname, userName, password);
        this.tips = tips;
    }

    public void addtips(double amount) {
        tips += amount / 5;
    }

    public static void withDraw(double amount) {
        tips = amount;
        FileOutputStream fos = null;
        String res = "";
        res += carier.get(0).name + "," + carier.get(0).surname + "," + carier.get(0).userName + "," + carier.get(0).password + "," + carier.get(0).tips;
        byte [] b  = res.getBytes();
        try {
            fos = new FileOutputStream("/home/nbt/Documents/Amel_e/src/com/amel_e/carier.txt",false);
            fos.write(b);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Carier.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Carier.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(Carier.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static double getTips() {
        return tips;
    }

    public Carier() {
    }

    @Override
    public boolean login(String s1, String s2) {
        BufferedReader reader;
        String line;
        String[] control;
        Carier car;
        try {
            reader = new BufferedReader(new FileReader("/home/nbt/Documents/Amel_e/src/com/amel_e/carier.txt"));
            line = reader.readLine();
            while (line != null) {
                control = line.split(",");
                if (control[2].equals(s1) && control[3].equals(s2)) {
                    car = new Carier(control[0], control[1], control[2], control[3], Double.valueOf(control[4]));
                    carier.add(car);
                    return true;
                }

                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static ArrayList<Carier> getCarier() {
        return carier;
    }

}
