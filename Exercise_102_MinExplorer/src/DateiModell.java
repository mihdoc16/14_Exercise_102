
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

    ArrayList<Datei> dateien = new ArrayList<>();
    
    @Override
    public int getSize() {
        return dateien.size();
    }

    @Override
    public Object getElementAt(int i) {
        return dateien.get(i);
    }
    
}
