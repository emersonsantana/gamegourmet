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
public class NodeFood {

    private Food nodeElem;
    private NodeFood nodeChildRight;
    private NodeFood nodeChildLeft;

    public NodeFood(Food nodeElem) {
        this.nodeElem = nodeElem;
    }

    public Food getNodeElem() {
        return nodeElem;
    }

    public void setNodeElem(Food nodeElem) {
        this.nodeElem = nodeElem;
    }

    public NodeFood getNodeChildRight() {
        return nodeChildRight;
    }

    public void setNodeChildRight(NodeFood nodeChildRight) {
        this.nodeChildRight = nodeChildRight;
    }

    public NodeFood getNodeChildLeft() {
        return nodeChildLeft;
    }

    public void setNodeChildLeft(NodeFood nodeChildLeft) {
        this.nodeChildLeft = nodeChildLeft;
    }
    
    
    
}
