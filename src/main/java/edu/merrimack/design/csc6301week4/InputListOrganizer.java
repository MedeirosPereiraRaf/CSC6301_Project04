/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.merrimack.design.csc6301week4;

import java.util.*;

/**
 * This class takes in a list of integers from the user and sorts it using the Collections Framework.
 * 
 * Note: This is original code produced by the author below.
 * 
 * @author Rafael Pereira
 * @since Week 4 of CSC6301
 * @version 1.0
 */
public class InputListOrganizer {
    static int NUM_INT_IN_LIST = 10;
    
    /**
     * Main method of the class.
     * 
     * @param args - Default parameter. Not used.
     */
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        LinkedList list = new LinkedList();  
        
        // Populate the list from user inputs
        list = fillList(in, list);
        System.out.println(String.format("Linked List BEFORE sorting: %s", list));
        
        // Sort final list and print
        Collections.sort(list);
        System.out.println(String.format("Linked List AFTER sorting: %s", list));
    }
   
    /**
     * This method asks the user for a series of integers and adds them to a Linked List. 
     * 
     * The size of the linked list is dependent on the value of NUM_INT_IN_LIST.
     * 
     * @param in - Scanner object to obtain inputs from the user through the console.
     * @param ll - Linked List object that will be populated with user inputs.
     * @return - Populate Linked List as result of user inputs. 
     */
    public static LinkedList fillList(Scanner in, LinkedList ll){
        int userInt;
        for(int i=0; i < NUM_INT_IN_LIST; i++){
            System.out.println("Type a number: ");
            userInt = in.nextInt();  
            ll.add(userInt);
        }
        return ll;
    }
}
