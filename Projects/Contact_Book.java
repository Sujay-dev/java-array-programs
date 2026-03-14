package Projects;

import java.util.Scanner;

public class Contact_Book {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of contacts");
        int size = sc.nextInt();

        String[] names = new String[size];
        String[] phone = new String[size];

        while (true) {

            System.out.println("\n1 Add Contact");
            System.out.println("2 View Contacts");
            System.out.println("3 Search Contact");
            System.out.println("4 Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter name of contact");
                    for (int i = 0; i < size; i++) {
                        names[i] = sc.next();
                    }

                    System.out.println("Enter phone number");
                    for (int i = 0; i < size; i++) {
                        phone[i] = sc.next();
                    }
                    break;

                case 2:
                    if (names[0] == null) {
                        System.out.println("No contacts available. Please add contacts first.");
                    } else {
                        System.out.println("------ Contact List ------");
                        System.out.println("Name\tPhone Number");

                        for (int i = 0; i < size; i++) {
                            System.out.println(names[i] + "\t" + phone[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Enter name to search");
                    String search = sc.next();

                    boolean found = false;

                    for (int i = 0; i < size; i++) {
                        if (names[i] != null && names[i].equals(search)) {
                            found = true;
                            System.out.println("Contact found");
                            System.out.println("Mobile number : " + phone[i]);
                        }
                    }

                    if (!found) {
                        System.out.println("Contact not found");
                    }
                    break;

                case 4:
                    System.out.println("Exited");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option");
            }
        }
    }
}



