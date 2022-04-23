/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import domen.Pacijent;
import domen.TerminTestiranja;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import kontroler.Kontroler;

/**
 *
 * @author ddjok
 */
public class ModelTabeleTerminTestiranja extends AbstractTableModel {

    private List<TerminTestiranja> list;
    private String[] header = {"Pacijent", "Datum termina", "Napomena"};

    @Override
    public int getRowCount() {
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        TerminTestiranja t = list.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return t.getPacijent().toString();
            case 1:
                return Kontroler.getInstance().getSdf().format(t.getDatum());
            case 2:
                return t.getNapomena();

            default:
                return "N/A";
        }
    }

    @Override
    public String getColumnName(int i) {
        return header[i];
    }

    public List<TerminTestiranja> getList() {
        return list;
    }

    public void setList(List<TerminTestiranja> list) {
        this.list = list;
    }
    

}
