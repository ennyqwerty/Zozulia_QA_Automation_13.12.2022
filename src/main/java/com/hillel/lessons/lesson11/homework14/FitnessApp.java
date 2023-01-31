package com.hillel.lessons.lesson11.homework14;

public class FitnessApp {

    private  String name;
    private  int dayBirthday;
    private int monthBirthday;
    private  int yearBirthday;
    private String email;
    private long phoneNumber;

    String lastname;
    double weight;

    int pressure;
    int countSteps;
    private int age;
    private  int year = 2023;

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

    public void setName(String name) {
        this.name = name;
    }

    public void setDayBirthday(int dayBirthday) {
        this.dayBirthday = dayBirthday;
    }

    public void setMonthBirthday(int monthBirthday) {
        this.monthBirthday = monthBirthday;
    }

    public void setYearBirthday(int yearBirthday) {
        this.yearBirthday = yearBirthday;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void printAccountInfo() {
        System.out.println("Користувач: "+ getName() + " " + lastname + ". День народження " + getDayBirthday() + "." + getMonthBirthday()
                + "." + getYearBirthday() + ", повних років - " + getAge() + ". емейл - " + getEmail() + ". Телефон  "
                + getPhoneNumber() + ". Вага  " + weight + ". Тиск  " + pressure + ". Кроків в день  " + countSteps);
    }

    @Override
    public String toString() {
        //Виправлено руками, щоб було зрозуміло в мейн
        return "Юзер " +
                "name='" + name + '\'' +
                ", dayBirthday=" + dayBirthday +
                ", monthBirthday=" + monthBirthday +
                ", yearBirthday=" + yearBirthday +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", lastname='" + lastname + '\'' +
                ", weight=" + weight +
                ", pressure=" + pressure +
                ", countSteps=" + countSteps +
                ", age=" + age +
                ", year=" + year;
    }

}
