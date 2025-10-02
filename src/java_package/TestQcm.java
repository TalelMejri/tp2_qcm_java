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
        Questionnaire questionnaire = new Questionnaire("QCM SUR JAVA");
        
        Question question1 = new Question("Qu'est-ce que Java?");
        question1.ajouterOption("Un langage de programmation");
        question1.ajouterOption("Une île en Indonésie");
        question1.ajouterOption("Un type de café");
        question1.ajouterOption("Un système d'exploitation");
        question1.setPos(1);
        questionnaire.ajouterQuestion(question1);
        
        Question question2 = new Question("Quel mot-clé permet de définir une classe en Java?");
        question2.ajouterOption("class");
        question2.ajouterOption("interface");
        question2.ajouterOption("struct");
        question2.ajouterOption("object");
        question2.setPos(1);
        questionnaire.ajouterQuestion(question2);
 
        Question question4 = new Question("Quel mot-clé permet l'héritage en Java?");
        question4.ajouterOption("inherits");
        question4.ajouterOption("extends");
        question4.ajouterOption("implements");
        question4.ajouterOption("super");
        question4.setPos(2);
        questionnaire.ajouterQuestion(question4);
        
    
        Question question5 = new Question("Quelle méthode est le point d'entrée d'un programme Java?");
        question5.ajouterOption("start()");
        question5.ajouterOption("main()");
        question5.ajouterOption("run()");
        question5.ajouterOption("execute()");
        question5.setPos(2);
        questionnaire.ajouterQuestion(question5);
        
       
        questionnaire.reinitialiser();
        
    
        System.out.println("=== " + questionnaire.getTitre() + " ===");
        System.out.println("Répondez aux questions en entrant le numéro de votre choix.\n");
        
        Scanner sc = new Scanner(System.in);
        
        while(questionnaire.resteDesQuestions()){
            questionnaire.afficherQuestionSuivante();
            questionnaire.testerReponse(sc);
        }
        
        questionnaire.afficherResultatFinal();
        
        sc.close();
    }
}