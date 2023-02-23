package javaCoreHW.hw6;

public class Employee {
    private String surname;
    private String name;
    private String position;
    private double hourlyRate;

    public Employee(String surname, String name,
                    String position, double hourlyRate) {
        this.surname = surname;
        this.name = name;
        this.position = position;
        this.hourlyRate = hourlyRate;
    }

    public Employee(String surname, String name,
                    String position) {
        this.surname = surname;
        this.name = name;
        this.position = position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }
    public static void main(String[] args) {
    }
}


/*
2. Описати клас Employee з полями (методи описуєте самостійно):
 - Прізвище
 - Ім'я
 - Посада
 - Заробітня платня за годину
*/