

import domain.Participant;
import factory.ParticipantFactory;
import repository.impl.ParticipantRepository;

import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ParticipantRepository repo = new ParticipantRepository();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- Participant Management System ---");
            System.out.println("1. Add Participant");
            System.out.println("2. View Participant");
            System.out.println("3. Update Participant");
            System.out.println("4. Delete Participant");
            System.out.println("5. View All Participants");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();

                    Participant newParticipant = ParticipantFactory.createParticipant(id, name, email);
                    repo.create(newParticipant);
                    System.out.println("Participant added successfully!");
                    break;

                case 2:
                    System.out.print("Enter ID to fetch: ");
                    String searchId = scanner.nextLine();
                    Optional<Participant> participant = repo.read(searchId);
                    System.out.println(participant.orElse(null));
                    break;

                case 3:
                    System.out.print("Enter ID to update: ");
                    String updateId = scanner.nextLine();
                    Optional<Participant> existingParticipant = repo.read(updateId);

                    if (existingParticipant.isPresent()) {
                        System.out.print("Enter new name: ");
                        String newName = scanner.nextLine();
                        System.out.print("Enter new email: ");
                        String newEmail = scanner.nextLine();

                        Participant updatedParticipant = ParticipantFactory.createParticipant(updateId, newName, newEmail);
                        repo.update(updatedParticipant);
                        System.out.println("Participant updated successfully!");
                    } else {
                        System.out.println("Participant not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter ID to delete: ");
                    String deleteId = scanner.nextLine();
                    if (repo.delete(deleteId)) {
                        System.out.println("Participant deleted successfully!");
                    } else {
                        System.out.println("Participant not found.");
                    }
                    break;

                case 5:
                    System.out.println("All Participants:");
                    for (String key : repo.getAll().keySet()) {
                        System.out.println(repo.read(key).orElse(null));
                    }
                    break;

                case 6:
                    exit = true;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
        scanner.close();
    }
}


