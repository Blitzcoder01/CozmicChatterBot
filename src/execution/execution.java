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
                        if(s3.equals("two tired")){
                            speak.doSpeak("correct!");
                            System.out.println(">>Correct! you guess the right answer.");
                        }
                        else {
                            speak.doSpeak("Wrong!");
                            System.out.println(">>Best Of Luck For The Next Time!!.");
                            speak.doSpeak("the answer is");
                            speak.doSpeak("it's two tired");
                        }
                    }
                    else if(rand_int1==3){
                        for(int i=0;i<26;i++)
                            System.out.print("# ");
                        System.out.println("");
                        System.out.println(">>What do clouds wear under their shorts?");
                        speak.doSpeak("What do clouds wear under their shorts?");
                        System.out.print(">>Your Guess: ");
                        String s3=sc.nextLine();
                        if(s3.equals("thunderpants")){
                            speak.doSpeak("correct!");
                            System.out.println(">>Correct! you guess the right answer.");
                        }
                        else {
                            speak.doSpeak("Wrong!");
                            System.out.println(">>Best Of Luck For The Next Time!!.");
                            speak.doSpeak("the answer is");
                            speak.doSpeak("Thunderpants");
                        }
                    }
                    else if(rand_int1==4){
                        for(int i=0;i<26;i++)
                            System.out.print("# ");
                        System.out.println("");
                        System.out.println(">>What do you call a shoe made out of a banana?");
                        speak.doSpeak("What do you call a shoe made out of a banana?");
                        System.out.print(">>Your Guess: ");
                        String s3=sc.nextLine();
                        if(s3.equals("slipper")){
                            speak.doSpeak("correct!");
                            System.out.println(">>Correct! you guess the right answer.");
                        }
                        else {
                            speak.doSpeak("Wrong!");
                            System.out.println(">>Best Of Luck For The Next Time!!.");
                            speak.doSpeak("the answer is");
                            speak.doSpeak("a slipper");
                        }
                    }
                    for(int i=0;i<26;i++)
                        System.out.print("# ");
                    System.out.println("");
                    System.out.println(">>How was the Joke?");
                    speak.doSpeak("so How was the Joke?");
                    try {
                        System.out.println(">>Press 1 if it was good");
                        System.out.println(">>Press 2 if it was ok");
                        System.out.println(">>Press 3 if it was bad");
                        System.out.print(">>Your Choice:");
                        int choice5=sc.nextInt();
                        if(choice5==1){
                            System.out.println(">>Thank's I've got more where that came from");
                            speak.doSpeak("Thank's I've got more where that came from");
                        }
                        else if(choice5==2){
                            System.out.println(">>And here I was hoping to win the World Comedy Championship. \n I think you should help me curate better jokes.");
                            speak.doSpeak("And here I was hoping to win the World Comedy Championship. \n I think you should help me curate better jokes.");
                        }
                        else if(choice5==3){
                            System.out.println(">>Well, I tried my hardest.Maybe next time I'll try my softest");
                            speak.doSpeak("Well!, I tried my hardest.Maybe next time I'll try my softest");
                        }

                    }
                    catch (InputMismatchException e){
                        System.out.println(">>Wrong Input");
                        speak.doSpeak("Wrong Input");
                    }
                }
                else if(choice2==2){
                    System.out.println("=> Make sure your device must be connected with internet");
                    speak.doSpeak("Make sure your device must be connected with internet");
                    System.out.println("");
                    System.out.println(">>Alright! which one would you like to try?");
                    speak.doSpeak("Alright! which one would you like to try?");
                    System.out.println("1>>Tower of Hanoi");
                    speak.doSpeak("Tower of Hanoi");
                    System.out.println("2>>Tic Tac Toe");
                    speak.doSpeak("Tic Tac Toe");
                    for(int i=0;i<26;i++)
                        System.out.print("# ");
                    System.out.println("");
                    System.out.println(">>Press 1 to play Tower of Hanoi");
                    System.out.println(">>Press 2 to play Tic Tac Toe");
                    try {
                        System.out.print("Your Choice: ");
                        int count4 = sc.nextInt();
                        for(int i=0;i<26;i++)
                            System.out.print("# ");
                        System.out.println("");
                        if (count4 == 1) {
                            System.out.println(">>Wait a second and Enjoy The Game");
                            speak.doSpeak("Wait a second and Enjoy The Game");
                            TowerOfHanoi play = new TowerOfHanoi();
                            play.PlayTowerOfHanoi();
                        }
                        else if (count4 == 2) {
                            System.out.println(">>Wait a second and Enjoy The Game");
                            speak.doSpeak("Wait a second and Enjoy The Game");
                            TicTacToe play = new TicTacToe();
                            play.playTicTacToe();
                        }
                        else {
                            System.out.println(">>Wrong Try, Try Again!");
                            speak.doSpeak("Wrong Try, Try Again!");
                        }
                    }
                    catch (InputMismatchException e) {
                        System.out.println(">>Wrong Try, Try Again!");
                        speak.doSpeak("wrong try, try again!");
                    }
                }
                else{
                    System.out.println(">>Wrong Attempt");
                    speak.doSpeak("oh oh! wrong attempt");
                }
            }
            else if(choice==2){
                for(int i=0;i<26;i++)
                    System.out.print("# ");
                System.out.println("");
                System.out.println(">>Great! so what do you like to do?");
                speak.doSpeak("Great! so what do you like to do?");
                System.out.println("1>>Search from a Dictionary");
                speak.doSpeak("Search from a Dictionary");
                System.out.println("2>>Ask a Query");
                speak.doSpeak("ask a query");
                for(int i=0;i<26;i++)
                    System.out.print("# ");
                System.out.println("");
                System.out.println(">>Press 1 for search from a dictionary");
                System.out.println(">>Press 2 for ask a query");
                try {
                    System.out.print(">>Your choice: ");
                    int choice3 = sc.nextInt();
                    if (choice3 == 1) {
                        System.out.println("=> Make sure your device must be connected with internet");
                        speak.doSpeak("Make sure your device must be connected with internet");
                        System.out.println("");
                        System.out.println(">>Just a Second ");
                        speak.doSpeak("Just a Second");
                    }
                } catch (InputMismatchException e){
                    System.out.println(">>Wrong Input.");
                    speak.doSpeak("wrong input.");
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


