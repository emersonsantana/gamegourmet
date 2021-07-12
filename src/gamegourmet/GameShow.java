/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamegourmet;

import static Helpers.Strings.*;
import gamegourmet.entity.TreeFactory;
import gamegourmet.entity.Food;
import gamegourmet.entity.NodeFood;
import static java.lang.String.format;
import javax.swing.JOptionPane;

/**
 *
 * @author ermim
 */
public class GameShow {

    public static final int YES_FOOD_CORRECT = 0;
    public static final int NO_FOOD_INCORRECT = 1;
    private int countSuccess = 0;
    private TreeFactory treeFactory;
    private NodeFood root;

    public GameShow() {
        root = startNode();
        treeFactory = new TreeFactory(startNode());
    }

    public NodeFood startNode() {
        Food massa = new Food("Massa", true);
        Food boloDeChocolate = new Food("Bolo de Chocolate", false);
        Food lasanha = new Food("Lasanha", false);

        NodeFood root = new NodeFood(massa);
        root.setNodeChildRight(new NodeFood(lasanha));
        root.setNodeChildLeft(new NodeFood(boloDeChocolate));
        return root;
    }

    public void startShow() {
        int startGame = JOptionPane.showConfirmDialog(null,
                MSG_START_GAME, PROJECT_NAME, JOptionPane.DEFAULT_OPTION);

        question(root);
    }

    public void question(NodeFood node) {
        int input = JOptionPane.showConfirmDialog(null,
                format(QUESTION_FOOD_NAME, node.getNodeElem().getDescription()),
                PROJECT_NAME, JOptionPane.YES_NO_OPTION);

        if (input == YES_FOOD_CORRECT && !node.getNodeElem().isCategory()) {
            JOptionPane.showConfirmDialog(null, countSuccess > 0 ? CASE_SUCCESS_AGAIN : CASE_SUCCESS_FIRST,
                            PROJECT_NAME,
                            JOptionPane.DEFAULT_OPTION);
            countSuccess++;
            startShow();
        } else if (input == 0 && treeFactory.getRootFood().getNodeChildRight() != null) {
            question(node.getNodeChildRight());
        }

        if (input == NO_FOOD_INCORRECT && !node.getNodeElem().isCategory()) {
            newElementInTree(node);
        } else {
            question(node.getNodeChildLeft());
        }
    }

    public void newElementInTree(NodeFood node) {
        String foodItem = getFoodThink();
        String category = howDifference(foodItem, node.getNodeElem().getDescription());
        treeFactory.generateNode(node, foodItem, category);
        startShow();
    }

    public static String getFoodThink() {
        String foodOption = JOptionPane.showInputDialog(WHAT_FOOD_THINK);
        return foodOption;
    }

    public static String howDifference(String foodItem, String compareItem) {
        String differenceFood = JOptionPane.showInputDialog(format(WHAT_DIFERENCE_FOODS, foodItem, compareItem));
        return differenceFood;
    }

}
