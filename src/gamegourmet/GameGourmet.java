/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamegourmet;

import gamegourmet.entity.Food;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ermim
 */
public class GameGourmet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Food> listFood = new ArrayList();
        
        listFood.add(new Food("Macarrao"));
        listFood.add(new Food("Lasanha"));

       showList(listFood);
        
        listFood.add(new Food(showMenu()));
        
        showList(listFood);
    }
    
    public static String showMenu(){
        String foodOption = JOptionPane.showInputDialog( " Informe qual a comida: " );
        return foodOption;
    }
    
    public static void showList(List<Food> myList){
         for (int i = 0; i < myList.size(); i++) {
            String message = "Prato sugerido: " + myList.get(i).getDescription();
            JFrame frame = new JFrame("JOptionPane exemplo");
            JOptionPane.showMessageDialog(frame, message);
        }
    }

}
