import java.util.Scanner;

public class Pages {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age again.");
        int age = scanner.nextInt();
        while (age<0 ) {
            try{
                age = Integer.parseInt(scanner.nextLine());
            }
            catch (NumberFormatException e){
                System.out.println("Please enter a valid age man...");
            }
        }
        System.out.println("Age:" + age);
        int age2 = 100 - age;
        System.out.println("Please read " + age2 +" Pages");
    }


}