
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
             File f1 = f.getParentFile();
            // File f2 = f1.getParentFile();
             String v = f1.getAbsolutePath();
             System.out.println(v);
             System.out.println(f.getAbsolutePath());
         }
    }
}
