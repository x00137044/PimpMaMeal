/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ingredient;

import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class Ingredient {

    private int protein, fat, carb, id, calories,weight;
    private String name;

    Scanner in = new Scanner(System.in);

    public Ingredient(String name, int id, int protein, int fat, int carb, int weight) {
        this.name = name;
        this.id = id;
        this.protein = protein;
        this.fat = fat;
        this.carb = carb;
        
       
    }

    //create ingredient
    public void createIngredient(String name, int id, int protein, int fat, int carb,int weight) {
        System.out.println("Input name :");
        name = in.nextLine();
        System.out.println("Input Protein :");
        protein = in.nextInt();
        System.out.println("Input fat :");
        fat = in.nextInt();
        System.out.println("Input carb :");
        carb = in.nextInt();
        System.out.println("Input weight");
        weight = in.nextInt();
        
        //calculate calories
        this.calories = (protein*4)+(fat*9)+(carb*9);

    }

    public void setProtein(int protein) {
        this.protein = protein;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public void setCarb(int carb) {
        this.carb = carb;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIn(Scanner in) {
        this.in = in;
    }

    public int getProtein() {
        return protein;
    }

    public int getFat() {
        return fat;
    }

    public int getCarb() {
        return carb;
    }

    public int getId() {
        return id;
    }

    public int getCalories() {
        return calories;
    }

    public String getName() {
        return name;
    }

    public Scanner getIn() {
        return in;
    }
    

}
