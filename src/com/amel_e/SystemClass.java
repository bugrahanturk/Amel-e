
package com.amel_e;




import static com.amel_e.GOrder.lbl_total;
import static com.amel_e.GOrder.tbl_basket;
import static com.amel_e.GOrder.total;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;



public class SystemClass {

    private ArrayList<String> orders = new ArrayList<>();

    public void add() {
        //Müşterinin basket tablosuna ürün eklediği ve toplam tutatı hesapladığı method. 
        DefaultTableModel model = (DefaultTableModel) GOrder.tbl_basket.getModel();
        int secili_row1 = -1;
        int secili_row2 = -1;
        int secili_row3 = -1;
        secili_row1 = GOrder.tbl_food.getSelectedRow();
        secili_row2 = GOrder.tbl_drink.getSelectedRow();
        secili_row3 = GOrder.tbl_others.getSelectedRow();
        String[] control = new String[3];
        String[] money;
        if (GOrder.rb_food.isSelected() && secili_row1 != -1) {
            control[0] = GOrder.tbl_food.getValueAt(secili_row1, 0).toString();
            control[1] = GOrder.tbl_food.getValueAt(secili_row1, 1).toString();
            control[2] = GOrder.tbl_food.getValueAt(secili_row1, 2).toString();
        }
        if (GOrder.rb_drink.isSelected() && secili_row2 != -1) {
            control[0] = GOrder.tbl_drink.getValueAt(secili_row2, 0).toString();
            control[1] = GOrder.tbl_drink.getValueAt(secili_row2, 1).toString();
            control[2] = GOrder.tbl_drink.getValueAt(secili_row2, 2).toString();
        }
        if (GOrder.rb_other.isSelected() && secili_row3 != -1) {
            control[0] = GOrder.tbl_others.getValueAt(secili_row3, 0).toString();
            control[1] = GOrder.tbl_others.getValueAt(secili_row3, 1).toString();
            control[2] = GOrder.tbl_others.getValueAt(secili_row3, 2).toString();
        }
        money = control[2].split("TL");
        GOrder.total += Double.valueOf(money[0]);
        Object[] eklenecek = {control[0], control[1], control[2]};
        orders.add(control[0]);

        model.addRow(eklenecek);
        GOrder.lbl_total.setText("Total: " + String.valueOf(GOrder.total) + " TL");
    }

    public void delete() {
        //Basket tablosundan ürün siliyor müşteri
        DefaultTableModel model = (DefaultTableModel) tbl_basket.getModel();
        int secili_row = tbl_basket.getSelectedRow();
        if (secili_row != -1) {
            String control;
            double amount = Double.valueOf(control = tbl_basket.getValueAt(secili_row, 2).toString().split("TL")[0]);
            total -= amount;
            model.removeRow(secili_row);
            lbl_total.setText("Total: " + String.valueOf(total) + " TL");
        }
    }

    public void search() {
        //Adminin müşterinin sipariş geçmişine baktığı kod.
      
        String nameSurname = GManagerHome.tf_namesurname.getText();
        String res = "Customer Name And Surname: " + nameSurname + "\n";
        BufferedReader reader;
        String line;
        

        try {
            reader = new BufferedReader(new FileReader("/home/nbt/Documents/Amel_e/src/com/amel_e/Orders.txt"));
            line = reader.readLine();
            while (line != null) {
                while (line.equals(nameSurname.split(" ")[0] + nameSurname.split(" ")[1])) {
                    line = reader.readLine();
                    while (!line.equals("key")) {
                        res += line + "\n";
                        line = reader.readLine();
                    }

                }

                line = reader.readLine();

            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        GManagerHome.ta_customerInfo.setText(res);
    }
        

    public String display() {
        //Siparişleri gösteren kod
        String res = "";
        res += "********Orders*******\n";
        for (String s : orders) {
            res += s + "\n";
        }
        res += "If you want give tips for our handsome cariers (Give Your Amount and Press \"OK\" or \"Cancel\") ";
        return res;
    }

}
