package com.amel_e;

//Ana classımız
public abstract class Person {

    protected String name;
    protected String surname;
    protected String userName;
    protected String password;

    public Person(String name, String surname, String userName, String password) {
        this.name = name;
        this.surname = surname;
        this.userName = userName;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Person() {
    }

    public abstract boolean login(String s1, String s2);
}
