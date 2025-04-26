package tourismApp;

import java.util.Scanner;
import java.util.LinkedList;
import tourismApp.classes.*;

public class Main {

    static Scanner Scan = new Scanner(System.in);
    static LinkedList<Client> listOfClients = new LinkedList<>();
    static LinkedList<Reservation> listOfReservations = new LinkedList<>();
    static LinkedList<Accommodation> listOfAccomodations = new LinkedList<>();

    public static void main(String[] args) {
        int choice;
        do {
            choice = menu();
            Action(choice);
        } while (choice != 6);
    }

    public static void addNewRecord(LinkedList<?> list1) {
        // Add logic to add a new record
    }

    public static int menu() {
        int answ;
        String message = "Choose what you want to do:\n" +
                         "1. View all: Accommodations / Reservations\n" +
                         "2. Add new Record: Client / Accommodation / Reservation\n" +
                         "3. Search Client by Name\n" +
                         "4. Delete all Records: Client,Accommodation,Reservation\n" +
                         "5. View ratings\n" +
                         "6. Save and exit\n" +
                         "-------------------------------------------------";
        System.out.println(message);
        answ = Scan.nextInt();
        return answ;
    }

    public static void Action(int answ) {
        int answ2;

        switch (answ) {
            case 1:
                System.out.println("What do you want to view? 1. Clients 2. Accommodations 3. Reservations (1/2/3): ");
                answ2 = Scan.nextInt();
                switch (answ2) {
                    case 1:
                        System.out.println(listOfClients + "\n");
                        break;
                    case 2:
                        System.out.println(listOfAccomodations + "\n");
                        break;
                    case 3:
                        System.out.println(listOfReservations + "\n");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
                break;

            case 2:
                System.out.println("What record do you want to add? 1. Client 2. Accommodation 3. Reservation (1/2/3): ");
                answ2 = Scan.nextInt();
                switch (answ2) {
                    case 1:

                        System.out.println("Give Client's name: ");
                        String name = Scan.next();
                        System.out.println("Give Client's email: ");
                        String email = Scan.next();
                        System.out.println("Give Client's preferred food: ");
                        String food1 = Scan.next();
                        System.out.println("Give Client's accommodation: ");
                        String accommodation = Scan.next();
                        System.out.println("Give Reservation Name: ");
                        String reservationName = Scan.next();
                        System.out.println("Give Reservation Date (day): ");
                        int day = Scan.nextInt();
                        System.out.println("Give Reservation Date (month): ");
                        int month = Scan.nextInt();
                        System.out.println("Give Reservation Date (year): ");
                        int year = Scan.nextInt();

                        Client newClient = new Client(name, email, food1, accommodation, reservationName, day, month, year);
                        listOfClients.add(newClient);
                        System.out.println("Client added successfully!");
                        break;



                    case 2:
                        System.out.println("Give Accommodation's name: ");
                        String accommodationName = Scan.next();
                        System.out.println("Give Accommodation's cost: ");
                        int cost = Scan.nextInt();
                        System.out.println("Give max number of customers: ");
                        int customers = Scan.nextInt();

                        Accommodation newAccommodation = new Accommodation(accommodationName, cost, customers);
                        listOfAccomodations.add(newAccommodation);
                        System.out.println("Accommodation added successfully!");
                        break;



                    case 3:
                        
                        System.out.println("Adding a new Reservation is not yet implemented.");
                        break;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
                break;

            case 3:
                // Code to search for a client by name
                break;

            case 4:
                // Code to delete a record (Client, Accommodation, or Reservation)
                break;

            case 5:
                // Code to view ratings
                break;

            case 6:
                System.out.println("Saving and exiting...");
                break;

            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
    }
}