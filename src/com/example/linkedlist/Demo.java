package com.example.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
//// a Linkedlist entry points to another entry - very good for inserts and for search performance
        LinkedList<String> placesToVisit = new LinkedList<>();
        addInOrder(placesToVisit, "Melbourne");
        addInOrder(placesToVisit, "Brisbane");
        addInOrder(placesToVisit, "Perth");
        addInOrder(placesToVisit, "Canberra");
        addInOrder(placesToVisit, "Adelaide");
        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Darwin");
        printList(placesToVisit);

        addInOrder(placesToVisit, "Alice Springs");
        addInOrder(placesToVisit, "Darwin");
        printList(placesToVisit);
        visit(placesToVisit);
    }

    //hasNext() --> is there another entry;
//i.next --> moving to another entry but its actually returning the current value because its moves on
    private static void printList(LinkedList<String> linkedList) {
        //Iterator --> another way of accessing and going through all entries that are in a list
        Iterator<String> i = linkedList.iterator(); //--> equivalent of a for loop in a different way
        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next()); // while an element that is in this linked list pointing to another entry there is one more record to visit. while this tru we re gonna show the current record
        }
        System.out.println("====================================");
    }

    public static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();
// with ListIterator we can go back to a previous record
        while (stringListIterator.hasNext()) {
            // you have to say stringListIterator.next() to point to the first entry. we use it in the begging as e setup
            int comparison = stringListIterator.next().compareTo(newCity); // if the number is 0 this means that the records matched - we dont want to add anything
            // equal, do not add
            if (comparison == 0) {
                System.out.println(newCity + "is already included as a destination");
                return false;
            } else if (comparison > 0) {
                // new City should appear before this one
                // Brisbaine -> Adelaide
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0) {
                //move on next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()) {
            System.out.println("No cities in the itenerary");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Holiday (vacation) over");
                    quit = true;
                    break;

                case 1:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }

                    if (listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;

                case 2:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;

                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress ");
        System.out.println("0 - to quit\n" +
                "1 - go to the next city\n" +
                "2 - go to the previous city\n" +
                "3 - print menu options");
    }
}