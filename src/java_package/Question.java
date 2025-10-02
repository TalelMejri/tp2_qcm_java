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
        ennonce = en;
        options = new ArrayList<>();
    }
    
    public void ajouterOption(String option){
        options.add(option);
    }
    
    public boolean lireResponseAuClavier(Scanner sc){
        System.out.println("Donner le numero de votre reponse (1-" + options.size() + "): ");
        int rep = sc.nextInt();
        return rep == pos;
    }
    
    public int getPos(){
        return this.pos;
    }
    
    public void setPos(int pos){
        this.pos = pos;
    }
    
    public String getEnnonce(){
        return this.ennonce;
    }
    
    public void setEnnonce(String en){
        this.ennonce = en;
    }  
    
    @Override
    public String toString(){
        StringBuilder str = new StringBuilder(getEnnonce() + "\n");
        for(int i = 0; i < options.size(); i++){
            str.append((i + 1)).append(". ").append(options.get(i)).append("\n");
        }
        return str.toString();
    }
}