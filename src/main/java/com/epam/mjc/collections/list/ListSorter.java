package com.epam.mjc.collections.list;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    /**
     * Implement the program which gets the List and sorts it in ascending order of function 5x^2+3, where x is element from List. If the function value is the same for multiple elements, those elements are sorted in ascending order.
     *
     * List consists of int numbers represented as a String. Use a Comparator for sorting.
     * @param sourceList
     */
    public void sort(List<String> sourceList) {
        Collections.sort(sourceList, new ListComparator());
    }
}

class ListComparator implements Comparator<String> {


    @Override
    public int compare(String a, String b) {
        int valueA = 5*Integer.parseInt(a)*Integer.parseInt(a)+3;
        int valueB = 5*Integer.parseInt(b)*Integer.parseInt(b)+3;
        if(valueA==valueB) return a.compareTo(b);
        return valueA - valueB;
    }
}
