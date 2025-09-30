/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_package;

import java.util.Scanner;

/**
 *
 * @author talel
 */
public class TestQcm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Questionnaire questionnaire=new Questionnaire("QCM DE Géographie");
        Question question=new Question("Ques est java");
        question.ajouterquestion("une ile");
        question.ajouterquestion("une ile2");
        question.SetPos(1);
        questionnaire.ajouterQuestion(question);
         Question question1=new Question("Ques est php");
        question1.ajouterquestion("une ile");
        question1.ajouterquestion("une ile2");
        question1.SetPos(1);
        questionnaire.ajouterQuestion(question1);
        questionnaire.reinitialiser();
        System.out.println(questionnaire.getTitre());
        Scanner sc=new Scanner(System.in);
        while(questionnaire.resteDesQuestions()){
            questionnaire.afficherQuestionSuivante();
            questionnaire.testerReponse(sc);
            System.out.println();
            System.out.println("Votre note :"+questionnaire.resultat());
            questionnaire.reinitialiser();
        }
     }
}
