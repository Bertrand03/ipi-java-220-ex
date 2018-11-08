package com.ipiecoles.java.java220;

public class TechnicienException extends Exception{
    public TechnicienException(Technicien technicien, Integer gradeIncorrect){
        super("Le grade doit être compris entre 1 et 5 : "
                + gradeIncorrect
                + ", technicien : "
                + technicien.toString());

        System.out.println(this.getMessage());
    }
}
