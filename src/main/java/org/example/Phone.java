package org.example;

public class Phone {

    private String mob;

    //Constructors
    public Phone() {
        this.mob = "502-101-0001";
    }

    public Phone(String mob) {
        this.mob = mob;
    }

    //Setter
    public void setMob(String mob) {
        this.mob = mob;
    }

    //Getter
    public String getMob() {
        return mob;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "mob='" + mob + '\'' +
                '}';
    }
}
