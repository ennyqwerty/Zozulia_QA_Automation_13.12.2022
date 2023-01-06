package com.hillel.lessons.lesson5;

import java.util.Scanner;

public class HomeWork6CounterStrike {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //ввести ім'я першої команди
        System.out.println("Please enter team1 name");

        String team1Name = scanner.nextLine();

        //ввести кількість фрагів для 5-ти гравців першої команди (тобто має бути 5 змінних)

        System.out.println("Please enter frags player 1  team 1");

        if (!scanner.hasNextInt()) {
            System.out.println("Wrong. Please enter point player1");
            System.exit(0);
        }
        int fragPlayer1Team1 = scanner.nextInt();

        System.out.println("Please enter frags player 2  team 1");
        if (!scanner.hasNextInt()) {
            System.out.println("Wrong. Please enter point player2");
            System.exit(0);
        }
        int fragPlayer2Team1 = scanner.nextInt();

        System.out.println("Please enter frags player 3  team 1");
        if (!scanner.hasNextInt()) {
            System.out.println("Wrong. Please enter point player3");
            System.exit(0);
        }
        int fragPlayer3Team1 = scanner.nextInt();

        System.out.println("Please enter frags player 4  team 1");
        if (!scanner.hasNextInt()) {
            System.out.println("Wrong. Please enter point player4");
            System.exit(0);
        }
        int fragPlayer4Team1 = scanner.nextInt();

        System.out.println("Please enter frags player 5  team 1");
        if (!scanner.hasNextInt()) {
            System.out.println("Wrong. Please enter point player5");
            System.exit(0);
        }
        int fragPlayer5Team1 = scanner.nextInt();
        scanner.nextLine();

        //ввести ім'я другої команди

        System.out.println("Please enter team2 name");
        String team2Name = scanner.nextLine();

        //ввести кількість фрагів для 5-ти гравців другої команди (тобто має бути 5 змінних)

        System.out.println("Please enter frags player 1  team 2");
        if (!scanner.hasNextInt()) {
            System.out.println("Wrong. Please enter point player1");
            System.exit(0);
        }
        int fragPlayer1Team2 = scanner.nextInt();

        System.out.println("Please enter frags player 2  team 2");
        if (!scanner.hasNextInt()) {
            System.out.println("Wrong. Please enter point player2");
            System.exit(0);
        }
        int fragPlayer2Team2 = scanner.nextInt();

        System.out.println("Please enter frags player 3  team 2");
        if (!scanner.hasNextInt()) {
            System.out.println("Wrong. Please enter point player3");
            System.exit(0);
        }
        int fragPlayer3Team2 = scanner.nextInt();

        System.out.println("Please enter frags player 4  team 2");
        if (!scanner.hasNextInt()) {
            System.out.println("Wrong. Please enter point player4");
            System.exit(0);
        }
        int fragPlayer4Team2 = scanner.nextInt();

        System.out.println("Please enter frags player 5  team 2");
        if (!scanner.hasNextInt()) {
            System.out.println("Wrong. Please enter point player5");
            System.exit(0);
        }
        int fragPlayer5Team2 = scanner.nextInt();

        // підрахувати середнє арифметичне балів кожної команди

        double averagePointsTeam1 = (double) (fragPlayer1Team1 + fragPlayer2Team1 + fragPlayer3Team1 + fragPlayer4Team1 + fragPlayer5Team1) / 5;
        double averagePointsTeam2 = (double) (fragPlayer1Team2 + fragPlayer2Team2 + fragPlayer3Team2 + fragPlayer4Team2 + fragPlayer5Team2) / 5;

        System.out.println(team1Name + " averagePoints " + averagePointsTeam1);
        System.out.println(team2Name + " averagePoints " + averagePointsTeam2);

        //порівняти результати команд та визначити переможця
        if (averagePointsTeam1 > averagePointsTeam2) {
                System.out.println("Перемогла команда " + team1Name + " з " + averagePointsTeam1 + " очками");
        } else if (averagePointsTeam1 < averagePointsTeam2) {
                System.out.println("Перемогла команда " + team2Name + " з " + averagePointsTeam2 + " очками");
        } else {
                System.out.println("Нічия");
            }

        }
    }

