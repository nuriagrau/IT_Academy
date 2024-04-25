package S1_T02_n2exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
     static Scanner input = new Scanner(System.in);
     static boolean inputError = false;

     public static void setAndRequestInput(String missatge) {
         inputError = false;
         System.out.println(missatge);
     }
     public static void reactToInputMismatchException(InputMismatchException e) {
         inputError = true;
         System.out.println("Error de format");
         input.nextLine();
     }

    public static void reactToException(Exception e) {
        inputError = true;
        System.out.println("Error de format");
        input.nextLine();
    }

        public static Byte llegirByte (String missatge){
            byte bt = 0;
            do {
                setAndRequestInput(missatge);
                try {
                    bt = input.nextByte();
                    input.nextLine();
                } catch (InputMismatchException e) {
                    reactToInputMismatchException(e);
                }
            } while (inputError);
            return bt;
        }

        public static int llegirInt (String missatge){
            int i = 0;
            do {
                setAndRequestInput(missatge);
                try {
                    i = input.nextInt();
                    input.nextLine();
                } catch (InputMismatchException e) {
                    reactToInputMismatchException(e);
                }
            } while (inputError);
            return i;
        }

        public static float llegirFloat (String missatge){
            float fl = 0f;
            do {
                setAndRequestInput(missatge);
                try {
                    fl = input.nextFloat();
                    input.nextLine();
                } catch (InputMismatchException e) {
                    reactToInputMismatchException(e);
                }
            } while (inputError);
            return fl;
        }

        public static double llegirDouble (String missatge){
            double db = 0d;
            do {
                setAndRequestInput(missatge);
                try {
                    db = input.nextDouble();
                    input.nextLine();
                } catch (InputMismatchException e) {
                    reactToInputMismatchException(e);
                }
            } while (inputError);
            return db;
        }

        public static char llegirChar (String missatge){
            char c = ' ';
            do {
                setAndRequestInput(missatge);
                try {
                    c = input.next().charAt(0);
                    input.nextLine();
                } catch (Exception e) {
                    reactToException(e);
                }
            } while (inputError);
            return c;
        }

        public static String llegirString (String missatge){
            String string = "";
            do {
                setAndRequestInput(missatge);
                try {
                    string = input.nextLine();
                    input.nextLine();
                } catch (Exception e) {
                    reactToException(e);
                }
            } while (inputError);
            return string;
        }

        public static boolean llegirSiNo(String missatge) { /// si l’usuari/ària introdueix “s”, retorna “true”, si l’usuari introdueix “n”, retorna “false”.
            boolean siNo = false;
            boolean wrongValue = false;
            String string = "";
            do {
                setAndRequestInput(missatge);
                try {
                    string = input.next();
                    siNo = (string.equalsIgnoreCase("si") ? true : (
                            string.equalsIgnoreCase("no") ? false : (wrongValue = true)));
                    if (wrongValue) throw new InputMismatchException();
                    input.nextLine();
                } catch (Exception e) {
                    reactToException(e);
                } finally {
                    wrongValue = false;
                }
            } while (inputError);
            return siNo;
        }
    }
