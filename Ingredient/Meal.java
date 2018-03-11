/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ingredient;

/**
 *
 * @author Kevin
 */
public class Meal extends Ingredient{
    private String name;
    private int calories;

   
    public Meal(String name, int id, int protein, int fat, int carb, String mName, int calories ) {
        super(name, id, protein, fat, carb);
        this.name = mName;
        this.calories = calories;
    }

    

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
    
    public void addIngredient(){
        
    }
    
    
    
    
}
