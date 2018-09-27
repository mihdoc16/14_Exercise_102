
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dominik
 */
public class FileComparer implements Comparator<Datei>{

    @Override
    public int compare(Datei t, Datei t1) {
        if(t.isDirectory()&&t1.isDirectory()){
            return t.getName().compareTo(t1.getName());
        }
        return -1;
    }
    
}
