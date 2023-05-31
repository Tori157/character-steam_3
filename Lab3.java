/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package character_stream_3;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author Student
 */
public class Lab3 {

    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter output = new PrintWriter("LAB1.txt");
        output.println("Welcome to java ");
        output.println("Akkarawit");
       
        output.println(60.5);
        output.println(60);

        output.close();
        
        String s;

    }

}
