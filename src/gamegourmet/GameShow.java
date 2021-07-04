/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamegourmet;

import static Helpers.Strings.CASE_SUCCESS;
import static Helpers.Strings.MSG_START_GAME;
import static Helpers.Strings.PROJECT_NAME;
import static Helpers.Strings.QUESTION_FOOD_CATEGORY;
import static gamegourmet.GameGourmet.howDifference;
import gamegourmet.entity.Category;
import gamegourmet.entity.Food;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ermim
 */
public class GameShow {

    List<Food> listFood = new ArrayList();
    List<Category> listCategory = new ArrayList();

    public GameShow() {
        //nothing
    }

    public void startShow() {
        int startGame = JOptionPane.showConfirmDialog(null,
                MSG_START_GAME, PROJECT_NAME, JOptionPane.DEFAULT_OPTION);

        int input = JOptionPane.showConfirmDialog(null,
                QUESTION_FOOD_CATEGORY, PROJECT_NAME, JOptionPane.YES_NO_OPTION);

        if (input == 0) {
            int continueOK = JOptionPane.showConfirmDialog(null,
                    CASE_SUCCESS, PROJECT_NAME, JOptionPane.DEFAULT_OPTION);
        }

        if (input == 1) {
            //listFood.add(new Food(showMenu()));
            listCategory.add(new Category(howDifference()));
        }
    }

}
