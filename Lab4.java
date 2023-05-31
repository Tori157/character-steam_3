/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package character_stream_3;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Student
 */
public class Lab4 {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("LAB1.txt");
            Scanner input = new Scanner(file);
            System.out.println(input.nextLine());
           input.nextLine();
           double weight = input.nextDouble();
            System.out.println(weight);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lab4.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("File not found");
        }
        
        
    }
}
