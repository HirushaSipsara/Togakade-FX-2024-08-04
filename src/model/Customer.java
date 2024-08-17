package model;

public class Customer {
    private String id;

    private String Name;

    private String Address;

    private Double Salary;

    public Customer() {
    }

    public Customer(String id, String name, String address, Double salary) {
        this.id = id;
        Name = name;
        Address = address;
        Salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}
