package execution;
import Bot_communication.BotCommunication;
import Dictionary.dictionary;
import TicTacToe.TicTacToe;
import TowerOfHanoi.TowerOfHanoi;
import WebSearch.WebSearch;
import java.util.Random;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.speech.*;
import javax.speech.synthesis.*;
import java.util.Locale;
import java.io.IOException;
import java.net.MalformedURLException;
public class execution {
    public static void main(String[] args) throws Exception {
        BotCommunication speak = new BotCommunication();
        Random rand = new Random();
        speak.voice("kevin16");
        System.out.println("********Learning Chat Bot***********");
        for(int i=0;i<26;i++)
            System.out.print("# ");
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi there! I am Cozmo, your personal learning assistant chatbot.\nPlease tell me your name?");
        speak.doSpeak("Hi there! I am Cozmo, your personal learning assistant chatbot! please tell me your name?");
        System.out.print("Enter your name here: ");
        String name = sc.nextLine();
        for(int i=0;i<26;i++)
            System.out.print("# ");
        System.out.println("");
        System.out.println("Hello there! " + name+".Well nice to meet you.\nso what would you like to do:");
        speak.doSpeak("Hello there. " + name+".well! nice to meet you so what would you like to do: ");
        System.out.println("1>> fun");
        speak.doSpeak("fun ");
        System.out.println("2>> Ask Something");
        speak.doSpeak("ask something");
        for(int i=0;i<26;i++)
            System.out.print("# ");
        System.out.println("");
        System.out.println(">>Press 1 for fun");
        System.out.println(">>Press 2 for ask me anything");
        try {
            System.out.print(">>Your Choice:");
            int choice=sc.nextInt();
            if(choice==1){
                for(int i=0;i<26;i++)
                    System.out.print("# ");
                System.out.println("");
                System.out.println("Great Choice! so what do you like to do ?");
                speak.doSpeak("Great choice! so what do you like to do?");
                System.out.println("1>> Listen a Joke");
                speak.doSpeak("listen a joke");
                System.out.println("2>> Play a Game");
                speak.doSpeak("play a game");
                for(int i=0;i<26;i++)
                    System.out.print("# ");
                System.out.println("");
                System.out.println(">>Press 1 for a joke");
                System.out.println(">>Press 2 for  play a game");
                System.out.print(">>Your Choice: ");
            }
        }
        catch (InputMismatchException e){
            System.out.println(">>Wrong Attempt.Try Again..");
            speak.doSpeak("wrong attempt.Try again");
        }
        //speak.terminate();
        }
    }


