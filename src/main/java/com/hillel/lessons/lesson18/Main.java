package com.hillel.lessons.lesson18;

import com.hillel.lessons.lesson18.comparators.PlayerComparateByAgeComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Player p1 = new Player("zen", 25);
        Player p2 = new Player("Enny", 22);
        Player p3 = new Player("Jenny", 32);

        TreeSet<Player> list = new TreeSet<>();
        list.add(p3);
        list.add(p2);
        list.add(p1);

        for (Player o: list){
            System.out.println(o);
        }
        System.out.println();

        Player p4 = new Player("Pen1", 25);
        Player p5 = new Player("Enny1", 22);
        Player p6 = new Player("Kenny1", 32);

        List<Player> list1 = new ArrayList<>();
        list1.add(p4);
        list1.add(p5);
        list1.add(p6);

        Collections.sort(list1);
        for (Player f: list1){
            System.out.println(f);
        }
        System.out.println();

        Player p10 = new Player("Pen1", 25);
        Player p11 = new Player("Enny1", 22);
        Player p12 = new Player("Enny3", 32);


        List<Player> list4 = new ArrayList<>();
        list4.add(p10);
        list4.add(p11);
        list4.add(p12);


        Collections.sort(list4, new PlayerComparateByAgeComparator());

        for (Player player: list4){
            System.out.println(player);
        }
    }
}
