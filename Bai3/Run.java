package Collection.Bai3;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CityList cityList = new CityList();
        while (true) {
            System.out.println("===== City List =====");
            System.out.println("1. Add a City");
            System.out.println("2. Show all City");
            System.out.println("3. Sort City by ID");
            System.out.println("4. Delete OddNumber");
            System.out.println("5. Exit");
            System.out.println("Your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    int id = 0;
                    String name;
                    System.out.println("Enter City ID: ");
                    id = scanner.nextInt();
                    System.out.println("Enter City name: ");
                    name = scanner.next();
                    City c = new City(id, name);
                    cityList.add(c);
                    break;
                case 2:
                    System.out.println("City");
                    cityList.show();
                    break;
                case 3:
                    cityList.sort();
                    break;
                case 4:
                    cityList.remove();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice !");
                    continue;
            }
        }
    }
}




