package pl.edu.uwm.wmii.zad14;

import java.util.Objects;

class Programmer extends Employee{

    private String programmingLanguage;

    public Programmer(String firstName, String  lastName, double salary,
                      String programmingLanguage){
        super(firstName, lastName, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String toString(){
        return super.toString() +","+programmingLanguage;
    }

    @Override
    public boolean equals(Object obj){
        if (!super.equals(obj)) return false;
        Programmer programmer = (Programmer) obj;
        return Objects.equals(programmer, programmer.programmingLanguage);
    }

    @Override
    public int hashCode(){
        return super.hashCode() * 31 +
                (programmingLanguage == null ? 0 : programmingLanguage.hashCode());
    }
}
