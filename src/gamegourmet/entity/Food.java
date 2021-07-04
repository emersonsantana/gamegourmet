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
public class Food {
    private String description;
    private boolean isCategory;

    public Food(String description, boolean isCategory) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isIsCategory() {
        return isCategory;
    }

    public void setIsCategory(boolean isCategory) {
        this.isCategory = isCategory;
    }    
}
