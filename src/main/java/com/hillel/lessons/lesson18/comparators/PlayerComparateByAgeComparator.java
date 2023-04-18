package com.hillel.lessons.lesson18.comparators;

import com.hillel.lessons.lesson18.Player;

import java.util.Comparator;

public class PlayerComparateByAgeComparator implements Comparator<Player> {
    @Override
    public int compare(Player o1, Player o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
