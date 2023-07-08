package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    /**Implement the program which will create LinkedList<Integer> from List<Integer> following the rule:

     If the number from the List<Integer> is odd, then insert this number at the beginning of the LinkedList<Integer>, otherwise, insert the number at the end of the LinkedList<Integer>.
     */
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> result = new LinkedList<>();
        for (int i = 0; i < sourceList.size(); i++) {
            if(sourceList.get(i)%2!=0){
                result.addFirst(sourceList.get(i));
            }else {
                result.addLast(sourceList.get(i));
            }
        }
        return result;
    }
}
