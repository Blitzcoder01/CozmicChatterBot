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
    }

    }
