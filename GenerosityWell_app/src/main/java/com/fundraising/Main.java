package com.fundraising.service;

import com.fundraising.FundraisingEvent;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FundraisingService service = new FundraisingService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Create Event");
            System.out.println("2. View Event");
            System.out.println("3. Update Event");
            System.out.println("4. Delete Event");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter event ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter event name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter event goal: ");
                    double goal = scanner.nextDouble();
                    service.createEvent(id, name, goal);
                    break;
                case 2:
                    System.out.print("Enter event ID: ");
                    id = scanner.nextLine();
                    FundraisingEvent event = service.getEvent(id);
                    if (event != null) {
                        System.out.println(event);
                    } else {
                        System.out.println("Event not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter event ID: ");
                    id = scanner.nextLine();
                    System.out.print("Enter new event name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter new event goal: ");
                    goal = scanner.nextDouble();
                    service.updateEvent(id, name, goal);
                    break;
                case 4:
                    System.out.print("Enter event ID: ");
                    id = scanner.nextLine();
                    service.deleteEvent(id);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}