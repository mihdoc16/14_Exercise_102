
import java.io.File;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

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

    public Datei(String absolutePath) {
        super(absolutePath);
    }
    
    @Override
    public String toString(){
        if(isDirectory()){
            return this.getName();
        }
        else{
            LocalDateTime ldt = LocalDateTime.ofEpochSecond(this.lastModified()/1000, 0, ZoneOffset.UTC);
            
            return this.getName() + " " + this.length() + " KB";
        }
    }
}
