public class Login /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.login;

/**
 *
 * @author ATunc
 */
        import java.util.Scanner;
public class Login {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String k_Name,Passwort;
        System.out.print("Geben Sie Benutzername ein: ");
        k_Name = scan.nextLine();
        System.out.print("Geben Sie Passwort ein: ");
        Passwort = scan.nextLine();
        if(k_Name.equals("Java") && Passwort.equals("123")){
            System.out.println("Erfolgreich!");


        }else{
            System.out.println("Benutzername oder Passwort sind falsh");
        }

    }
}
{
}
