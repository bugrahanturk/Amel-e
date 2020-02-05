package com.amel_e;

public class Customer extends Person {

    private String address;
    private String account = "0";
    private  int customer_id = 1;
    private int customerID;
    private SystemClass s1;

    public Customer(String name, String surname, String userName, String password, String address, String account) {
        super(name, surname, userName, password);
        this.address = address;
        this.account = account;
        this.customerID = customer_id++;
        s1 = new SystemClass();

    }

    public SystemClass getS1() {
        return s1;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAccount() {
        return account;
    }

    public String getAddress() {
        return address;
    }

    public int getCustomerID() {
        return customerID;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public Customer() {
        s1 = new SystemClass();
    }

    @Override
    public boolean login(String s1, String s2) {

        for (int i = 0; i < Manager.getCustomer().size(); i++) {
            if (Manager.getCustomer().get(i).getUserName().equals(s1) && Manager.getCustomer().get(i).getPassword().equals(s2)) {
                Manager.setIndex(i);
                return true;
            }

        }
        return false;
    }

}
