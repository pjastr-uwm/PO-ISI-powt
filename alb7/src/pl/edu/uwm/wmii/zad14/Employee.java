package pl.edu.uwm.wmii.zad14;

import java.util.Objects;

class Employee {
    private String firstName;
    private String lastName;

    private double salary;

    public Employee(String firstName, String  lastName, double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String n) {
        this.lastName = n;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return getClass().getSimpleName()+","+firstName+","+ lastName +","+salary;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        if(!Objects.equals(firstName, employee.firstName)) return false;
        if(!Objects.equals(lastName, employee.lastName)) return false;
        return Double.compare(salary, employee.salary) == 0;
    }

    @Override
    public int hashCode(){
        int result = firstName !=null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName !=null ? lastName.hashCode() : 0);
        result = 31 * result + Double.valueOf(salary).hashCode();
        return result;
    }


}
