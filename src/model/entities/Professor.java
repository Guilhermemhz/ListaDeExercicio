package model.entities;

public class Professor {

    private String name;
    private Double valuePerHour;
    private int numberOfClasses;

    public Professor(){
    }

    public Professor(String name, Double valuePerHour, int numberOfClasses) {
        this.name = name;
        this.valuePerHour = valuePerHour;
        this.numberOfClasses = numberOfClasses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public int getNumberOfClasses() {
        return numberOfClasses;
    }

    public void setNumberOfClasses(int numberOfClasses) {
        this.numberOfClasses = numberOfClasses;
    }

    public double grossSalary(){
        return valuePerHour * numberOfClasses;
    }

    public double discount(){
        double gross = grossSalary();

        if (gross <= 1621.00) {
            return 0.075;
        } else if (gross <= 2902.84) {
            return 0.09;
        } else if (gross <= 4354.27) {
            return 0.12;
        } else {
            return 0.14;
        }
    }

    public double salary(){
        return grossSalary() - grossSalary() * discount();
    }  
}
