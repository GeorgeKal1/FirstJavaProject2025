package tourismApp;

import java.util.Scanner;
import java.util.LinkedList;
import tourismApp.classes.*;
import java.io.*;


public class Main {

    static Scanner Scan = new Scanner(System.in);
    static LinkedList<Client> listOfClients = new LinkedList<>();
    static LinkedList<Reservation> listOfReservations = new LinkedList<>();
    static LinkedList<Accommodation> listOfAccomodations = new LinkedList<>();
    static LinkedList<Food> listOfFoods = new LinkedList<>();
    
    static{//list of food to choose
        listOfFoods.add(new Food("Burger", 5));
        listOfFoods.add(new Food("Pasta", 8));
        listOfFoods.add(new Food("Pizza", 10));
        listOfFoods.add(new Food("steak", 15));
        listOfFoods.add(new Food("salmon", 20));
        listOfFoods.add(new Food("soup", 12));

    }
    

    public static void main(String[] args) {
        loadData();
        String choice;
        do {
            choice = menu();
            Action(choice);
        } while (!choice.equals("6"));
    }

   

    public static String menu() {
        String answ;
        String message = "-------------------------------------------------\n"+
                         "Choose what you want to do:\n" +
                         "1. View all: Clients / Accommodations / Reservations / Food\n" +
                         "2. Add new Record: Client / Accommodation / Reservation\n" +
                         "3. Search Client by Name\n" +
                         "4. Delete all Records: Client,Accommodation,Reservation\n" +
                         "5. View ratings\n" +
                         "6. Save and exit\n" +
                         "-------------------------------------------------";
        System.out.println(message);
        answ = Scan.next();
        return answ;
    }




    public static void Action(String answ) {
        String answ2;
    
        switch (answ) {
            case "1":
                System.out.println("What do you want to view? 1. Clients 2. Accommodations 3. Reservations 4. Food (1/2/3/4): ");
                answ2 = Scan.next();
                switch (answ2) {
                    case "1":
                        System.out.println(listOfClients + "\n");
                        break;
                    case "2": 
                        System.out.println(listOfAccomodations + "\n");
                        break;
                    case "3":
                        System.out.println(listOfReservations + "\n");
                        break;
                    case "4":
                        System.out.println(listOfFoods + "\n");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
                break;
            case "2":
                System.out.println("What record do you want to add? 1. Client 2. Accommodation 3. Reservation (1/2/3): ");
                answ2 = Scan.next();
                switch (answ2) {
                    case "1":
                        // Add Client
                        if (listOfAccomodations.isEmpty() || listOfReservations.isEmpty()) {
                            System.out.println("No Accommodations or Reservations Available");
                            return;
                        }
    
                        System.out.println("Give Client's name: ");
                        String name = Scan.next();
                        System.out.println("Give Client's email: ");
                        String email = Scan.next();
    
                        // Display food options
                        displayFoodOptions();
                        String food1 = getValidFoodChoice();    
    
                        // Display and get accommodation
                        displayAccommodationOptions();
                        String accommodationName = getValidAccommodationChoice(); 

                         // Display and get reservation
                        displayReservationOptions();
                        String reservationName = getValidReservationChoice();
    
                        System.out.println("Give Reservation Date (day): ");
                        int day = Scan.nextInt();
                        System.out.println("Give Reservation Date (month): ");
                        int month = Scan.nextInt();
                        System.out.println("Give Reservation Date (year): ");
                        int year = Scan.nextInt();
    
                        // Create new Client with valid accommodation
                        Client newClient = new Client(name, email, food1, accommodationName, reservationName, day, month, year);
                        listOfClients.add(newClient);
                        System.out.println("Client added successfully!");
                        break;
    
                    case "2":
                        // Add Accommodation
                        System.out.println("Give Accommodation's name: ");
                        String accommodationNameForNewAccommodation = Scan.next();  
                        System.out.println("Give Accommodation's cost: ");
                        int cost = Scan.nextInt();
                        System.out.println("Give max number of customers: ");
                        int customers = Scan.nextInt();
    
                        Accommodation newAccommodation = new Accommodation(accommodationNameForNewAccommodation, cost, customers);
                        listOfAccomodations.add(newAccommodation);
                        System.out.println("Accommodation added successfully!");
                        break;
    
                    case "3":
                        // Add Reservation
                        System.out.println("What type of Reservation do you want to add? 1. Route 2. POI 3. Destination (1/2/3): ");
                        String reservationType = Scan.next();
    
                        switch (reservationType) {
                            case "1":
                                // Route Reservation
                                System.out.println("Give Route Title: ");
                                String routeTitle = Scan.next();
                                System.out.println("Give Route Code: ");
                                int routeCode = Scan.nextInt();
                                System.out.println("Give Route Rating(0-5): ");
                                int routeRating = Scan.nextInt();
                                System.out.println("Give Route Cost: ");
                                int routeCost = Scan.nextInt();
                                System.out.println("Give Route Duration: ");
                                float routeDuration = Scan.nextFloat();
    
                                Route newRoute = new Route(routeTitle, routeCode, routeRating, routeCost, routeDuration);
                                listOfReservations.add(newRoute);
                                System.out.println("Route added successfully!");
                                break;
    
                            case "2":
                                // POI Reservation
                                System.out.println("Give POI Title: ");
                                String poiTitle = Scan.next();
                                System.out.println("Give POI Code: ");
                                int poiCode = Scan.nextInt();
                                Scan.nextLine(); 
                                System.out.println("Give POI Rating (0-5): ");
                                int poiRating = Scan.nextInt();
                                Scan.nextLine(); 
                                System.out.println("Give POI Cost: ");
                                int poiCost = Scan.nextInt();
                                Scan.nextLine(); 
                                System.out.println("Give POI Description: ");
                                String poiDescription = Scan.nextLine();
    
                                POI newPOI = new POI(poiTitle, poiCode, poiRating, poiCost, poiDescription);
                                listOfReservations.add(newPOI);
                                System.out.println("POI added successfully!");
                                break;
    
                            case "3":
                                // Destination Reservation
                                System.out.println("Give Destination Title: ");
                                String destinationTitle = Scan.next();
                                System.out.println("Give Destination Code: ");
                                int destinationCode = Scan.nextInt();
                                Scan.nextLine(); 
                                System.out.println("Give Destination Rating(0-5): ");
                                int destinationRating = Scan.nextInt();
                                Scan.nextLine(); 
                                System.out.println("Give Destination Cost: ");
                                int destinationCost = Scan.nextInt();
                                Scan.nextLine(); 
                                System.out.println("Give Destination Location: ");
                                String destinationLocation = Scan.nextLine();
    
                                Destination newDestination = new Destination(destinationTitle, destinationCode, destinationRating, destinationCost, destinationLocation );
                                listOfReservations.add(newDestination);
                                System.out.println("Destination added successfully!");
                                break;
    
                            default:
                                System.out.println("Invalid choice. Please try again.");
                                break;
                        }
                        break;
    
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
                break;
    
            case "3":
                // Code to search for a client by name
                System.out.println("Enter the name of the client to search:");
                String searchName = Scan.next();
                boolean found = false;

                for (Client client : listOfClients) {
                    if (client.getName().equalsIgnoreCase(searchName)) {
                        System.out.println("Client found: " + client);
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("No client found with the name: " + searchName);
                }
                break;
    
            case "4":
                // Code to delete all records (Client, Accommodation, or Reservation)
                listOfClients.clear();
                listOfAccomodations.clear();
                listOfReservations.clear();
                System.out.println("All records have been deleted successfully!");
                break;
    
            case "5":
                // Code to view ratings
                System.out.println("Ratings of Reservations:");
                System.out.println("-------------------------------------------------");
                if (listOfReservations.isEmpty()) {
                    System.out.println("No reservations available to display ratings.");
                } else {
                    for (Reservation reservation : listOfReservations) {
                        System.out.printf("Title: %-20s | Rating: %d/5%n", 
                                          reservation.getTitle(), reservation.getRating());
                    }
                }
                System.out.println("-------------------------------------------------");
                break;
    
            case "6":
                
                System.out.println("Saving and exiting...");
                try {
                    File dataDir = new File("data");
                    if (!dataDir.exists()) {
                        dataDir.mkdirs(); // Create the directory if it doesn't exist
                    }


                    FileOutputStream fileOutClients = new FileOutputStream("data/clients.ser");
                    ObjectOutputStream outClients = new ObjectOutputStream(fileOutClients);
                    outClients.writeObject(listOfClients);
                    outClients.close();
                    fileOutClients.close();

                    FileOutputStream fileOutReservations = new FileOutputStream("data/reservations.ser");
                    ObjectOutputStream outReservations = new ObjectOutputStream(fileOutReservations);
                    outReservations.writeObject(listOfReservations);
                    outReservations.close();
                    fileOutReservations.close();

                    FileOutputStream fileOutAccommodations = new FileOutputStream("data/accommodations.ser");
                    ObjectOutputStream outAccommodations = new ObjectOutputStream(fileOutAccommodations);
                    outAccommodations.writeObject(listOfAccomodations);
                    outAccommodations.close();
                    fileOutAccommodations.close();

                    System.out.println("Data saved successfully!");
                } catch (Exception e) {
                    System.out.println("An error occurred while saving data: " + e.getMessage());
                }
                break;
    
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
    }
    
    








    //these functions are used to ask for a valid food choice of the user
    public static void displayFoodOptions() {
        System.out.println("Available Food Options:");
        int index = 1;
        for (Food food : listOfFoods) {
            System.out.println(index++ + ". " + food.getName() + " - $" + food.getCost1());
        }
    }  
    public static String getValidFoodChoice() {
        do {
            System.out.println("Enter your preferred food from the list:");
            String input = Scan.next(); 
            
            boolean valid = listOfFoods.stream()
                .anyMatch(food -> food.getName().equalsIgnoreCase(input));
            
            if (valid) {
                return input;
            } else {
                System.out.println("Invalid choice. Please select a food from the displayed options.");
            }
        } while (true);
    }
    

    //these functions are to ask for the accomodation of the client
    public static void displayAccommodationOptions() {
        System.out.println("Available Accommodation Options:");
        int index = 1;
        for (Accommodation accommodation : listOfAccomodations) {
            System.out.println(index++ + ". " + accommodation.getName() + " - $" + accommodation.getCost1() + " - Max Customers: " + accommodation.getMaxCustomers());
        }
    }
    public static String getValidAccommodationChoice() {
        do {
            System.out.println("Enter your preferred accommodation from the list:");
            String input = Scan.next();

            boolean valid = listOfAccomodations.stream()
                .anyMatch(accommodation -> accommodation.getName().equalsIgnoreCase(input));

            if (valid) {
                return input;
            } else {
                System.out.println("Invalid choice. Please select an accommodation from the displayed options.");
            }
        } while (true);
    }
    
    // these functions are to ask for the reservation of the client
    public static void displayReservationOptions() {
        System.out.println("Available Reservation Options:");
        int index = 1;
        for (Reservation reservation : listOfReservations) {
            System.out.println(index++ + ". " + reservation.getTitle() + " - $" + reservation.getCost1());
        }
    }

    public static String getValidReservationChoice() {
        do {
            System.out.println("Enter your preferred reservation from the list:");
            String input = Scan.next();

            boolean valid = listOfReservations.stream()
                .anyMatch(reservation -> reservation.getTitle().equalsIgnoreCase(input));

            if (valid) {
                return input;
            } else {
                System.out.println("Invalid choice. Please select a reservation from the displayed options.");
            }
        } while (true);
    }


    public static void loadData() {//function that loads the data when
        try {
            File dataDir = new File("data");
            if (!dataDir.exists()) {
                dataDir.mkdirs(); // Create the directory if it doesn't exist
            }

            // Load Clients
            FileInputStream fileInClients = new FileInputStream("data/clients.ser");
            ObjectInputStream inClients = new ObjectInputStream(fileInClients);
            listOfClients = (LinkedList<Client>) inClients.readObject();
            inClients.close();
            fileInClients.close();

            // Load Reservations
            FileInputStream fileInReservations = new FileInputStream("data/reservations.ser");
            ObjectInputStream inReservations = new ObjectInputStream(fileInReservations);
            listOfReservations = (LinkedList<Reservation>) inReservations.readObject();
            inReservations.close();
            fileInReservations.close();

            // Load Accommodations
            FileInputStream fileInAccommodations = new FileInputStream("data/accommodations.ser");
            ObjectInputStream inAccommodations = new ObjectInputStream(fileInAccommodations);
            listOfAccomodations = (LinkedList<Accommodation>) inAccommodations.readObject();
            inAccommodations.close();
            fileInAccommodations.close();

            System.out.println("Data loaded successfully!");
        } catch (Exception e) {
            System.out.println("An error occurred while loading data: " + e.getMessage());
        }
    }
}