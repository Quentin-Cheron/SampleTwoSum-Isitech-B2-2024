import java.util.Scanner;

public class FirstApp {
    public static void main(String[] args) {
     CheckIfNumberIsPrime();

    // checkTheAverage();

    // CheckTheHighestNumber();

    //DayOfTheWeek();
    }

    static void DayOfTheWeek() {
        Scanner scanner = new Scanner(System.in);
        int number;
        String[] week = {"lundi", "mardi", "mercredi", "jeudi", "vendredi", "samedi", "dimanche"};

        while (true) {
            System.out.println("Quel est votre nombre ?");
            number = Integer.parseInt(scanner.next());
            if (number >= 1 && number <= 7) {
                System.out.println(week[number - 1]);
            } else {
                System.out.println("Nombre invalide. Veuillez entrer un nombre entre 1 et 7.");
            }
        }
    }

    static void CheckTheHighestNumber() {
        Scanner scanner = new Scanner(System.in);
        int number;
        int highestNumber = 0; // Initialize to the smallest possible integer value

        do {
            System.out.println("Quel est votre nombre ?");
            number = Integer.parseInt(scanner.next());
            if (number > highestNumber) {
                highestNumber = number;
            }
        } while (number != 0);

        scanner.close();

        if (highestNumber != 0) {
            System.out.println("Le plus grand nombre rentré est : " + highestNumber);
        } else {
            System.out.println("Aucun nombre n'a été rentré.");
        }
    }

    static void checkTheAverage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est votre nombre ?");
        int number = Integer.parseInt(scanner.next());
        int num = 0;
        for (int i = 0; i <= number; i++) {
            num += i;
        }

        System.out.println(num);
    }

    static void CheckIfNumberIsPrime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est votre nombre ?");
        int number = Integer.parseInt(scanner.next());

        if (number % 2 == 0) {
            System.out.println("Pair");
        } else {
            System.out.println("Impaire");
        }
    }
}