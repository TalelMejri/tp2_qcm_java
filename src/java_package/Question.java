/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_package;

import java.util.*;

/**
 *
 * @author talel
 */
public class Question {
    private ArrayList<String> options;
    private int pos;
    private String ennonce;
    
    public Question(String en){
        ennonce=en;
        options=new ArrayList();
    }
    public void ajouterquestion(String response){
        options.add(response);
    }
    public boolean lireResponseAuClavier(Scanner sc){
        System.out.println("Donner le numero de votre reponse : ");
        int rep=sc.nextInt();
        return rep==pos;
    }
    public int getPos(){
        return this.pos;
    }
    public void SetPos(int pos){
        this.pos=pos;
    }
     public String getEnonnce(){
        return this.ennonce;
    }
    public void SetEnnoce(String en){
        this.ennonce=en;
    }  
    @Override
    public String toString(){
        String str=getEnonnce()+"\n";
        for(String alt:options){
            str=alt+"\n";
        }
        return str;
    }
}
