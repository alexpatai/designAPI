package com.patai.designapi;


public class ComplementaryColor {

    public String getComplementaryColor(String color){
        if(color.equals("red")|| color.equals("Red")){
            return "green";
        }
        if(color.equals("orange") || color.equals("Orange")){
            return "blue";
        }
        if( color.equals("yellow") || color.equals("Yellow")){
            return "purple";
        }
        if(color.equals("green") || color.equals("Green")){
            return "red";
        }
        if(color.equals("blue") || color.equals("Blue")){
            return "orange";
        }
        if(color.equals("purple") || color.equals("Purple")){
            return "yellow";
        }

        return "Invalid color!";
    }

}
