import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String roman = kb.next();

        System.out.println(romanToInt(roman));
    }
            public static int romanToInt(String s) {
                int finalNum = 0;
                int prevNum = 0;

                for (int i = s.length() - 1; i >= 0; i--) {
                    int currentNum = 0;

                    switch (s.charAt(i)) {
                        case 'I':
                            currentNum = 1;
                            break;
                        case 'V':
                            currentNum = 5;
                            break;
                        case 'X':
                            currentNum = 10;
                            break;
                        case 'L':
                            currentNum = 50;
                            break;
                        case 'C':
                            currentNum = 100;
                            break;
                        case 'D':
                            currentNum = 500;
                            break;
                        case 'M':
                            currentNum = 1000;
                            break;
                    }

                    if (currentNum < prevNum) {
                        finalNum -= currentNum;
                    } else {
                        finalNum += currentNum;
                    }

                    prevNum = currentNum;
                }

                return finalNum;
            }
        }


