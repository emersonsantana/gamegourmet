/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamegourmet;

import static Helpers.Strings.*;
import gamegourmet.entity.Category;
import gamegourmet.entity.Food;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
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
       GameShow game = new GameShow();
       game.startShow();
    }
    
    public static String showMenu() {
        String foodOption = JOptionPane.showInputDialog(WHAT_FOOD_THINK);
        return foodOption;
    }
    
     public static String howDifference() {
        String differenceFood = JOptionPane.showInputDialog(WHAT_DIFERENCE_FOODS);
        return differenceFood;
    }     
     
//todo teste
    public static void showList(List<Food> myList) {
        for (int i = 0; i < myList.size(); i++) {
            String message = "Prato sugerido: " + myList.get(i).getDescription();
            JFrame frame = new JFrame("JOptionPane exemplo");
            JOptionPane.showMessageDialog(frame, message);
        }
    }
}
