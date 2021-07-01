/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamegourmet;

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
    public static final String MSG_START_GAME = "Pense em um prato que gosta";
    public static final String PROJECT_NAME = "Game Gourmet";
    public static final String QUESTION_FOOD_CATEGORY = "O prato que você pensou é %s";
    public static final String CASE_SUCCESS = "Acertei de novo";
    public static final String WHAT_FOOD_THINK = "Qual prato você pensou?";
    public static final String WHAT_DIFERENCE_FOODS = "%s é _________, mas %s não";
 
    public static void main(String[] args) {
        List<Food> listFood = new ArrayList();
        List<Category> listCategory = new ArrayList();
        
        int startGame = JOptionPane.showConfirmDialog(null,
                MSG_START_GAME, PROJECT_NAME, JOptionPane.DEFAULT_OPTION);

        int input = JOptionPane.showConfirmDialog(null,
                QUESTION_FOOD_CATEGORY, PROJECT_NAME, JOptionPane.YES_NO_OPTION);

        if (input == 0) {
            int continueOK = JOptionPane.showConfirmDialog(null,
                    CASE_SUCCESS, PROJECT_NAME, JOptionPane.DEFAULT_OPTION);
        }
        if (input == 1) {
            listFood.add(new Food(showMenu()));
            listCategory.add(new Category(howDifference()));
        }

       // showList(listFood);
    }

    public String generateSuggestion() {
        //pegar da lista e sugerir
        return "teste";
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
