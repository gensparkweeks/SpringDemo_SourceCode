package org.example;
import java.util.List;

public class Student{
    private int id;
    private String name;
    private List<Phone> ph;
    private Address add;

    //Constructor
    public Student(int id, String name, List<Phone> ph, Address add) {
        this.id = id;
        this.name = name;
        this.ph = ph;
        this.add = add;
    }

    //Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPh(List<Phone> ph) {
        this.ph = ph;
    }

    public void setAdd(Address add) {
        this.add = add;
    }

    //Getter

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Phone> getPh() {
        return ph;
    }

    public Address getAdd() {
        return add;
    }

    @Override
    public String toString() {
        return "Student{" + "\n" +
                "id=" + id + "\n" +
                ", name='" + name + '\'' + "\n" +
                ", ph=" + ph + "\n" +
                ", add=" + add + "\n" +
                '}';
    }
}
