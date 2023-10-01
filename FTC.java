import java.util.Scanner;

/**
 * FTC
 */
public class FTC {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int Start = s.nextInt();
        int End = s.nextInt();
        int Step = s.nextInt();
        while (Start <= End) {
            int Celsius = ((Start - 32) * 5) / 9;
            System.out.println(Start + " " + Celsius);
            Start = Start + Step;
        }
        s.close();
    }
}