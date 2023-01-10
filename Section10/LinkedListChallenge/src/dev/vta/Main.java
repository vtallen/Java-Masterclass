package dev.vta;

import java.util.LinkedList;
import java.util.Scanner;

record Town(String name, int distance) {
    public Town(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return name + " " + distance;
    }
}

public class Main {

    public static void main(String[] args) {
        LinkedList<Town> placesToVisit = new LinkedList<>();

        Town adelaide = new Town("Adelaide", 1374);
        Town aliceSprings = new Town("Alice Springs", 2771);
        Town brisbane = new Town("Brisbane", 917);
        Town darwin = new Town("Darwin", 3971);
        Town melbourne = new Town("Melbourne", 877);
        Town perth = new Town("Perth", 3923);

        addPlace(placesToVisit, adelaide);
        addPlace(placesToVisit, aliceSprings);
        addPlace(placesToVisit, brisbane);
        addPlace(placesToVisit, darwin);
        addPlace(placesToVisit, melbourne);
        addPlace(placesToVisit, perth);

        System.out.println(placesToVisit);
        String menu = """
                Available actions:
                (F)orward
                (B)ackward
                (L)ist places
                (M)enu
                (Q)uit
                """;

        boolean isRunning = true;
        Scanner s = new Scanner(System.in);
        var iterator = placesToVisit.listIterator();

        System.out.println(menu);
        while (isRunning) {
            if (iterator.hasNext())
            System.out.print(">>");
            String input = s.nextLine().toUpperCase();

            switch (input) {
                case "F" -> {
                    if (iterator.hasNext()) {
                        System.out.println(">> " + iterator.next());
                    } else {
                        System.out.println(">> There is no next item");
                    }
                }
                case "B" -> {
                    if (iterator.hasPrevious()) {
                        System.out.println(">> " + iterator.previous());
                    } else {
                        System.out.println(">> There is no previous item");
                    }
                }
                case "Q" -> {
                    isRunning = false;
                }
                case "M" -> {
                    System.out.println(menu);
                }
                default -> {
                    System.out.println(">> Unknown command");
                }
            }
        }

    }

    public static void addPlace(LinkedList<Town> list, Town town) {
        if (list.contains(town)) {
            System.out.println(">> List already contains " + town.toString());
        } else {
            int index = 0;

            for (Town i : list) {
                int distance = i.distance();
                if (distance > town.distance()) {
                    break;
                }
                index++;
            }

            list.add(index, town);
        }
    }
}

