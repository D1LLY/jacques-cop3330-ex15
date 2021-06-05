/*
Example Output
What is the password? 12345
I don't know you.
Or

What is the password? abc$123
Welcome!
Constraints
Use an if/else statement for this problem.
Make sure the program is case sensitive.
 */

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Dilly Jacques
 */

package programming1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.print("What is the password? ");
        String pass=in.nextLine();

        if(pass.equals("abc$123")){
            System.out.println("Welcome!");
        }
        else{
            System.out.println("I don't know you.");
        }
    }
}
