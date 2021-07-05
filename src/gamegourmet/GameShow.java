/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamegourmet;

import static Helpers.Strings.*;
import gamegourmet.entity.TreeFactory;
import gamegourmet.entity.Food;
import static java.lang.String.format;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ermim
 */
public class GameShow {

    public static final int YES_FOOD_CORRECT = 0;
    public static final int NO_FOOD_INCORRECT = 1;
    
    public GameShow() {
        //nothing
    }

    public void startShow() {
        int startGame = JOptionPane.showConfirmDialog(null,
                MSG_START_GAME, PROJECT_NAME, JOptionPane.DEFAULT_OPTION);

        question();
    }

    public void question() {

        int input = JOptionPane.showConfirmDialog(null,
                format(QUESTION_FOOD_CATEGORY, "teste"), PROJECT_NAME, JOptionPane.YES_NO_OPTION);

        if (input == YES_FOOD_CORRECT) {
            int continueOK = JOptionPane.showConfirmDialog(null,
                    CASE_SUCCESS, PROJECT_NAME, JOptionPane.DEFAULT_OPTION);

            startShow();
        }

        if (input == NO_FOOD_INCORRECT) {
            //adicionar e rodar os no
            Food foodItem = new Food(getFoodThink(), false);
            Food category = new Food(howDifference(foodItem, new Food("coca", false)), true);
            //cria o novo no e start novamente
            startShow();
        }
    }

    public static String getFoodThink() {
        String foodOption = JOptionPane.showInputDialog(WHAT_FOOD_THINK);
        return foodOption;
    }

    public static String howDifference(Food foodItem, Food compareItem) {
        String differenceFood = JOptionPane.showInputDialog(format(WHAT_DIFERENCE_FOODS, foodItem.getDescription(), compareItem.getDescription()));
        return differenceFood;
    }

}
