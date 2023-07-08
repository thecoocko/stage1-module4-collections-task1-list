package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    /**
     * Implement the program which gets List<String> as parameter and creates a new ArrayList<String>.
     * ArrayList<String> should consist of duplicated words whose index in List<String> is divisible by 3 (indexes start from 1).
     *
     * @param sourceList
     * @return
     */
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < sourceList.size(); i++) {
            if((i+1)%3==0){
                result.add(sourceList.get(i));
                result.add(sourceList.get(i));
            }
        }
        return result;
    }
}
