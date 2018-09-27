
import java.io.File;
import java.util.ArrayList;
import javax.swing.AbstractListModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dominik
 */
public class DateiModell extends AbstractListModel{

    ArrayList<File> dateien = new ArrayList<>();
    
    public void addFile(String path){
        dateien.add(new Datei(path));
        fireIntervalAdded(this, dateien.size()-1, dateien.size()-1);
    }
    
    @Override
    public int getSize() {
        return dateien.size();
    }

    @Override
    public Object getElementAt(int i) {
        return dateien.get(i);
    }
    
}
