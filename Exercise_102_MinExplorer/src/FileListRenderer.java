
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dominik
 */
public class FileListRenderer implements ListCellRenderer{

    @Override
    public Component getListCellRendererComponent(JList list, Object o, int i, boolean isSelected, boolean hasFocused) {
        
        JLabel label = new JLabel(o.toString());
        label.setOpaque(true);
        
        if( o instanceof Datei ){
            Datei datei = (Datei)o;
            if(datei.isDirectory()){
                label.setFont(new Font("Courier New", 12));
            }
        }
        
        label.setBackground( isSelected ? Color.lightGray : Color.white );
        
        return label;
    }
    
}
