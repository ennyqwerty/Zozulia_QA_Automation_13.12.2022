package com.hillel.lessons.lesson11.homework14;

public class FitnessApp {

    private final String name;
    private final int dayBirthday;
    private final int monthBirthday;
    private final int yearBirthday;
    private final String email;
    private final long phoneNumber;

    private String lastname;
    private double weight;
    private int pressure;
    private int countSteps;
    private int age;
    private  int year = 2023;

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public void setCountSteps(int countSteps) {
        this.countSteps = countSteps;
    }

    public FitnessApp(String name, int dayBirthday, int monthBirthday, int yearBirthday,
                      String email, long phoneNumber, String lastname, double weight,
                      int pressure, int countSteps, int year) {
        this.name = name;
        this.dayBirthday = dayBirthday;
        this.monthBirthday = monthBirthday;
        this.yearBirthday = yearBirthday;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.lastname = lastname;
        this.weight = weight;
        this.pressure = pressure;
        this.countSteps = countSteps;
        this.age = year-yearBirthday;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getDayBirthday() {
        return dayBirthday;
    }

    public int getMonthBirthday() {
        return monthBirthday;
    }

    public int getYearBirthday() {
        return yearBirthday;
    }

    public String getEmail() {
        return email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }


    public void printAccountInfo() {
        System.out.println("Користувач: "+ getName() + " " + lastname + ". День народження " + getDayBirthday() + "." + getMonthBirthday()
                + "." + getYearBirthday() + ", повних років - " + getAge() + ". емейл - " + getEmail() + ". Телефон  "
                + getPhoneNumber() + ". Вага  " + weight + ". Тиск  " + pressure + ". Кроків в день  " + countSteps);
    }

    @Override
    public String toString() {
        return "Юзер " +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", dayBirthday=" + dayBirthday +
                ", monthBirthday=" + monthBirthday +
                ", yearBirthday=" + yearBirthday +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", weight=" + weight +
                ", pressure=" + pressure +
                ", countSteps=" + countSteps;
    }

}
