import java.util.Scanner;

public class Dateable {

    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
System.out.println("ENTER your AGE!!");
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
       int age2 = age / 2;
       int agew = age2 + 7;
       System.out.println("Folk Rule says- " + agew);







    }
}

