
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
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

    ArrayList<Datei> dateien = new ArrayList<>();
    
    public void addFile(String path){
        dateien.add(new Datei(path));
        fireIntervalAdded(this, dateien.size()-1, dateien.size()-1);
    }
    
    public void wechseln(String path){
        dateien.clear();
        File dir = new File(path);
        Datei f1 = new Datei(path);
        dateien.add(f1);
        for (File f : dir.listFiles()) {
            //model.wechseln(f.getAbsolutePath());
            Datei ftest = new Datei(f.getAbsolutePath());
            dateien.add(ftest);
        }
        fireIntervalAdded(this, dateien.size()-1, dateien.size()-1);
    }
    
    public void sort(){
        Collections.sort(dateien);
        fireContentsChanged(this, 0, dateien.size()-1);
    }
    
    @Override
    public int getSize() {
        return dateien.size();
    }

    @Override
    public Datei getElementAt(int i) {
        return dateien.get(i);
    }
    
}
