import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        doLogic();
    }


    public static void doLogic(){

        System.out.println("THE WORST NUMBER GUESSING GAME EVER!!!!!!!!!\n");
        System.out.println("I\"M THIKING OF A NUMBER BETWEEN 1-10.  TRY 2 GUESS IT!");

        Scanner scan = new Scanner(System.in);

        int userInput = scan.nextInt();
        int secretNumber = 4;

        if(userInput == 4){
            System.out.println("LOL!!! U GOT IT!  I CANT BELEIVE U GESSED IT WAS "+secretNumber+"!");
        }else{
            System.out.println("W00T!  U SUX0R!!!  I PWN J00!!!  IT WAS "+secretNumber+"!\n");
        }
    }

}
