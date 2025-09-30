/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_package;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author talel
 */
public class Questionnaire {
    private String titre;
    private int numero=-1;
    private ArrayList<Question> questions;
    private double total=0;
    public Questionnaire(String titre){
        this.titre=titre;
        questions=new ArrayList();
    }
    public String getTitre() {
        return titre;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public void ajouterQuestion(Question qst){
        questions.add(qst);
    }
    public boolean resteDesQuestions(){
        setNumero(getNumero() + 1);
        return (questions.size()>getNumero());
    }
    public void afficherQuestionSuivante(){
        System.out.println(questions.get(getNumero()));
    }
    public void testerReponse(Scanner sc){
        boolean b=questions.get(getNumero()).lireResponseAuClavier(sc);
        if(b){
            setTotal(getTotal() + 20);
        }
    }
    public double resultat(){
        return (getTotal()/questions.size());
    }
    public void reinitialiser(){
        setNumero(-1);
        setTotal(0);
        
    }

  
}
