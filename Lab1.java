/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package character_stream_3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Student
 */
public class Lab1 {

    public static void main(String[] args) throws IOException {
        FileWriter output = new FileWriter("LAB1.txt");
        output.write("Hello world");
        output.close();
        FileReader input = new FileReader("LAB1.txt");

        int ch;
        while ((ch = input.read()) != -1) {

            System.out.print((char) ch);

        }

    }
}
