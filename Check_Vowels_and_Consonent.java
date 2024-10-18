
// Enter the Character : A
// Given character is Vowel

// Enter the Character : b
// Given character is Consonant

import java.util.Scanner;
public class Check_Vowels_and_Consonent {
      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Character : ");
            char y = sc.next().charAt(0);

            if(y == 'a' || y == 'i' || y == 'o' || y == 'u' || y == 'e' || y == 'A' || y == 'I' || y == 'O' || y == 'U' || y == 'E'){
                 
                  System.out.println("Given character is Vowel");

            }else{
                  System.out.println("Given character is Consonant");
            }
      }
      
}

