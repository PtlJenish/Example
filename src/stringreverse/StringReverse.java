/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringreverse;

/**
 *
 * @author Jenish Patel
 */
import java.util.Scanner;
public class StringReverse {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        String name;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        name=input.nextLine();
        char[] revString=new char[name.length()];
        for (int i = 0; i < name.length(); i++) {
            revString[i]=name.charAt(i);
        }
        for (int i = revString.length-1; i >= 0; i--) {
            System.out.println(revString[i]);
        }
    }
    
}
