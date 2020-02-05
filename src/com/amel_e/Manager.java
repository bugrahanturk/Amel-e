package com.amel_e;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Manager extends Person implements ISystem {

    private static ArrayList<Customer> customer = new ArrayList<>();
    private static int index;

    public static void setIndex(int index) {
        Manager.index = index;
    }

    public static int getIndex() {
        return index;
    }

    public Manager(String name, String surname, String userName, String password) {
        super(name, surname, userName, password);
    }

    public static void empthyList() {
        int size = customer.size();
        for (int i = 0; i < size; i++) {
            customer.remove(0);
        }

    }

    public static void fillList() {
        //Dosyadiki müşteri verilerini customer array listine okuyoruz.
        if (customer.isEmpty()) {
            Customer cus;
            BufferedReader reader;
            String line;
            String[] control;
            try {
                reader = new BufferedReader(new FileReader("/home/nbt/Documents/Amel_e/src/com/amel_e/Customer.txt"));
                line = reader.readLine();
                while (line != null) {
                    control = line.split(",");
                    cus = new Customer(control[0], control[1], control[2], control[3], control[4], control[5]);
                    customer.add(cus);
                    line = reader.readLine();
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void fillFile() {
        //Arraylistteki müşteri bilgilerini dosyaya aktarıyoruz.
        if (!customer.isEmpty()) {
            String line = "";
            FileOutputStream fos = null;
            for (int i = 0; i < customer.size(); i++) {
                line += customer.get(i).name + "," + customer.get(i).surname + "," + customer.get(i).userName + "," + customer.get(i).password + ","
                        + customer.get(i).getAddress() + "," + customer.get(i).getAccount() + "\n";
            }
            byte[] info = line.getBytes();
            info[info.length - 1] = (byte) ',';
            try {
                fos = new FileOutputStream("/home/nbt/Documents/Amel_e/src/com/amel_e/Customer.txt", false);
                fos.write(info);

            } catch (FileNotFoundException ex) {
                Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    fos.close();
                } catch (IOException ex) {
                    Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

    @Override
    public boolean login(String s1, String s2) {
        BufferedReader reader;
        String line;
        String[] control;
        try {
            reader = new BufferedReader(new FileReader("/home/nbt/Documents/Amel_e/src/com/amel_e/admin.txt"));
            line = reader.readLine();
            while (line != null) {
                control = line.split(",");
                if (control[0].equals(s1) && control[1].equals(s2)) {
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

    public static ArrayList<Customer> getCustomer() {
        return customer;
    }

    public Manager() {
    }

    @Override
    public void add(Customer c) {
        for (Customer x : customer) {
            if (x.userName.equals(c.userName)) {
                return;
            }
        }
        customer.add(c);
    }

    @Override
    public void delete(Customer c) {
        customer.remove(c);

    }

    @Override
    public int search(String name, String surname) {
      
        for (Customer x : customer) {
            if (x.name.equalsIgnoreCase(name) && x.surname.equalsIgnoreCase(surname)) {
                return x.getCustomerID();
            }
        }
        return 0;
    }

    

    public String toString(Customer c) {
        return "Name: " + c.name + " Surname: " + c.surname + " Username: " + c.userName + " Adress: " + c.getAddress() + "\n";
    }

}
