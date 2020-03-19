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
                int choice2=sc.nextInt();
                for(int i=0;i<26;i++)
                    System.out.print("# ");
                System.out.println("");
                if(choice2==1) {
                    int rand_int1 = rand.nextInt(5);
                    sc.nextLine();
                    System.out.println(">>Well! I have a joke for you");
                    speak.doSpeak("Well! i have a joke for you");
                    if(rand_int1==0){
                        for(int i=0;i<26;i++)
                            System.out.print("# ");
                        System.out.println("");
                        System.out.println(">>What's the first thing a monster eats after\n he's had his teeth checked?");
                        speak.doSpeak("What's the first thing a monster eats after he's had his teeth checked?");
                        System.out.print(">>Your Guess: ");
                        String s1=sc.nextLine();
                        if(s1.equals("dentist")){
                            speak.doSpeak("correct!");
                            System.out.println(">>Correct! you guess the RIGHT ANSWER.");
                        }
                        else {
                            speak.doSpeak("Wrong!");
                            System.out.println(">>Best Of Luck For The Next Time!!.");
                            speak.doSpeak("the answer is");
                            speak.doSpeak("dentist");
                        }
                    }
                    else if(rand_int1==1) {
                        for(int i=0;i<26;i++)
                            System.out.print("# ");
                        System.out.println("");
                        System.out.println(">>What happens when a frog's car breaks?");
                        speak.doSpeak("What happens when a frog's car breaks?");
                        System.out.print(">>Your Guess: ");
                        String s2=sc.nextLine();
                        if(s2.equals("it gets toad")){
                            speak.doSpeak("correct!");
                            System.out.println(">>Correct! you guess the right answer.");
                        }
                        else {
                            speak.doSpeak("Wrong!");
                            System.out.println(">>Best Of Luck For The Next Time!!.");
                            speak.doSpeak("the answer is");
                            speak.doSpeak("it gets toad");
                        }
                    }
                    else if(rand_int1==2){
                        for(int i=0;i<26;i++)
                            System.out.print("# ");
                        System.out.println("");
                        System.out.println(">>Why can't a bicycle stand on its own?");
                        speak.doSpeak("Why can't a bicycle stand on its own?");
                        System.out.print(">>Your Guess: ");
                        String s3=sc.nextLine();
                    }
                }
            }
        }
        catch (InputMismatchException e){
            System.out.println(">>Wrong Attempt.Try Again..");
            speak.doSpeak("wrong attempt.Try again");
        }
        //speak.terminate();
        }
    }


