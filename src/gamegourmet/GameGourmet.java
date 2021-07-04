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
 
    public static void main(String[] args) {
       GameShow game = new GameShow();
       game.startShow();
    }
}
