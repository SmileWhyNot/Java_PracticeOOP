package Mistakes;

import java.util.Scanner;

public class CatchMistake {
    public static String ReadText(){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if (str != "" && str.matches("[а-яА-Яa-zA-Z]+")) return str;
        else return "Undefined";
    }
    public static int ReadPositiveInt(){
        Scanner scan = new Scanner(System.in);
        int i = 0;
        if (scan.hasNextInt()) i = scan.nextInt();
        if (i > 0) return i;
        else return 0;
    }
    public static float ReadPositiveFloat(){
        Scanner scan = new Scanner(System.in);
        float i = 0f;
        if (scan.hasNextFloat()) i = scan.nextFloat();
        if (i > 0) return i;
        else return 0;
    }
}