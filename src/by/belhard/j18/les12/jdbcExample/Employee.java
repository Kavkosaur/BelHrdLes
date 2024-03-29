package by.belhard.j18.les12.jdbcExample;

import java.util.Date;

public class Employee {

    private int id;
    private String name ;
    private Date dateOfEmployment;
    private Specialty specialty;

    public Employee(int id, String name, Date dateOfEmployment, Specialty specialty) {
        this.id = id;
        this.name = name;
        this.dateOfEmployment = dateOfEmployment;
        this.specialty = specialty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void setDateOfEmployment(Date dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfEmployment=" + dateOfEmployment +
                ", specialty=" + specialty +
                '}';
    }
}
