package com.hillel.lessons.lesson18.comparators;

import com.hillel.lessons.lesson18.Player;

import java.util.Comparator;

public class PlayerComparateByNameComparator implements Comparator<Player> {
    @Override
    public int compare(Player o1, Player o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
