import java.util.Scanner;

public class PassengerOperations {
    static Scanner scanner = new Scanner(System.in);

    public static void register(){

        Passenger passenger = new Passenger();
        System.out.println("Ad daxil et:");
        String name = scanner.nextLine();
        passenger.setName(name);
        System.out.println("soyad daxil et:");
        String surname = scanner.nextLine();
        passenger.setName(surname);
        boolean check1 = true;
        int a=0;
        while(check1) {
            System.out.println("yas daxil et:");
            String age = scanner.nextLine();

            boolean check = true;

            while (check) {
                try {
                    a = Integer.parseInt(age);
                    if (a < 18) {
                        throw new InvalidAgeException("Yas 18den boyuk olmalidir");
                    }
                    check=false;
                    check1=false;
                } catch (NumberFormatException | InvalidAgeException e) {
                    System.out.println(e.getMessage());
                    check = false;
                }
            }
        }
        passenger.setAge(a);


    }


}
