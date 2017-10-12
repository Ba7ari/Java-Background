/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabackgaround;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @BatariSiahaan
 */
public class fileReader {
    public static String readFilesSetting(){
        String namaFile = null;
        String FILENAME = "Background";
        try{
            BufferedReader bf = new BufferedReader(new FileReader(FILENAME));
            String readFiles = bf.readLine();
            namaFile = readFiles;
        }catch(IOException IOE){
            IOE.printStackTrace();
        }
        return namaFile;
    }
}
