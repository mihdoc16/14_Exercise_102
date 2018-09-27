
import java.io.File;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

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
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.YYYY HH:mm");
        if(isDirectory()){
            return this.getName();
        }
        else{
            LocalDateTime ldt = LocalDateTime.ofEpochSecond(this.lastModified()/1000, 0, ZoneOffset.UTC);
            
            return this.getName() + " " + ldt.format(dtf) + " " + this.length() +" KB";
        }
    }
}
