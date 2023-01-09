package dev.vta;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean run = true;
        ArrayList<String> arrayList = new ArrayList<>();

        System.out.println("""
                Available actions:
                0 - Quit
                1 - Add items to the list
                2 - Remove items from the list 
                3 - Print the current list
                """);


        while (run) {
            System.out.print(">> ");
            String command = s.nextLine();

            switch (command) {
                case "0" -> {
                    run = false;
                }
                case "1" -> {
                    System.out.print("Enter a comma delimited list of items to add >> ");
                    String[] items = s.nextLine().split(",");

                    for (String item : items) {
                        String trimmed = item.trim();
                        if (arrayList.contains(trimmed)) {
                            System.out.println(">> Item: " + trimmed + " : is already in the list");
                        } else {
                            arrayList.add(trimmed);
                        }
                    }

                    arrayList.sort(Comparator.naturalOrder());
                    System.out.println("New list >> " + arrayList);

                }
                case "2" -> {
                    System.out.print("Enter a comma delimited list of items to remove >> ");
                    String userInput = s.next();

                    arrayList.removeAll(List.of(userInput.split(",")));
                    System.out.println("New List >> " + arrayList);
                }
                case "3" -> {
                    System.out.println(">> " + arrayList);
                }
                default -> {
                    System.out.println(">> Command not recognized");
                }
            }
        }

    }

    public static boolean contains(ArrayList<String> arrayList, List<String> items){
        boolean containsItem = false;
        for (String item: arrayList) {
            if (arrayList.contains(item)) {
                containsItem = true;
                break;
            }
        }
        return containsItem;
    }
}
