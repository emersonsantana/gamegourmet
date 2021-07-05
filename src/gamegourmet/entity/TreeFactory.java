/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamegourmet.entity;

/**
 *
 * @author ermim
 */
public class TreeFactory {
    private NodeFood rootFood;

    public TreeFactory(NodeFood rootFood) {
        this.rootFood = rootFood;
    }

    public NodeFood getRootFood() {
        return rootFood;
    }

    public void setRootFood(NodeFood rootFood) {
        this.rootFood = rootFood;
    }
}
