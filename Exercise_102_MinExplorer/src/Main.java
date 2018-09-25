
import java.io.File;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dominik
 */
public class Main {
     public static void main(String[] args) {
        File dir = new File(".");
         for (File f : dir.listFiles()) {
             System.out.println(f.getAbsolutePath());
         }
    }
}
