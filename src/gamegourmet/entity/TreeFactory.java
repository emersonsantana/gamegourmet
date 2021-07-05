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
    
    public void generateNode(NodeFood node, String description, String category){
        Food presentFood =  node.getNodeElem();
        Food newFood = new Food(category, true);
        node.setNodeElem(newFood);
        
        Food foodChildRight = new Food(description, false);
        
        NodeFood nodeChildRight = new NodeFood(foodChildRight);
        node.setNodeChildRight(nodeChildRight);
        NodeFood nodeChildLeft = new NodeFood(presentFood);
        node.setNodeChildLeft(nodeChildLeft);
    }

    public NodeFood getRootFood() {
        return rootFood;
    }

    public void setRootFood(NodeFood rootFood) {
        this.rootFood = rootFood;
    }
}
