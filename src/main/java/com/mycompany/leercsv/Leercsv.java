/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.leercsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Leercsv {

    public static void main(String[] args) {
        String csvFile= "C:/Users/DELL/Downloads/aaaaafunciona.txt";
        String line= "";
        String cvsSplitBy = ",";
        
        String [] nombres = new String[7];
        int[] edades = new int[7];
        String[] emails = new String[7];
        
        try (BufferedReader br = new BufferedReader (new FileReader(csvFile))){
            br.readLine();
            
            int index = 0;
            while ((line = br.readLine())!=null){
                String[]datos = line.split(cvsSplitBy);
                
                nombres[index]= datos[0];
                edades[index]= Integer.parseInt(datos[1]);
                emails[index]= datos [2];
                
                index++;
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        
        for (int i=0; i< nombres.length; i++){
            System.out.println("Nombre: "+nombres[i]+ ",Edad: " + edades[i] + ",Email: "+ emails[i]);
        }
        
    }
}
