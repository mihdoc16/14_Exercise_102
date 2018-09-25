
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
public class Datei extends File{
    
    File f;
    
    public Datei(String string) {
        super(string);
    }
    
    @Override
    public String toString(){
        if(f.isDirectory()){
            return String.format("%s",f.getName());
        }
        else{
            return String.format("%s %o %o %s",f.getName(),f.lastModified(),f.getTotalSpace());
        }
    }
}
