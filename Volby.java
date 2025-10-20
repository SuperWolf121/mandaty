package Domaci;
import java.util.Scanner;

public class Volby {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Kolik hlasu dostane strana A ?");
        int pocetHlasuA = sc.nextInt();


        System.out.println("Kolik hlasu dostane strana B ?");
        int pocetHlasuB = sc.nextInt();


        System.out.println("Kolik hlasu dostane strana C ?");
        int pocetHlasuC = sc.nextInt();


        System.out.println("Kolik hlasu dostane strana D ?");
        int pocetHlasuD = sc.nextInt();

        System.out.println("Kolik hlasu dostane strana E ?");
        int pocetHlasuE = sc.nextInt();


        System.out.println("Kolik hlasu dostane strana F ?");
        int pocetHlasuF = sc.nextInt();

        int pocetHlasuCelkem = pocetHlasuA + pocetHlasuB + pocetHlasuC + pocetHlasuD + pocetHlasuE + pocetHlasuF;

        int volebniCislo = (pocetHlasuCelkem + 16) / 17;

        int mandatA = pocetHlasuA / volebniCislo;
        int mandatB = pocetHlasuB / volebniCislo;
        int mandatC = pocetHlasuC / volebniCislo;
        int mandatD = pocetHlasuD / volebniCislo;
        int mandatE = pocetHlasuE / volebniCislo;
        int mandatF = pocetHlasuF / volebniCislo;

        int zbyloMandatu = 17 - (mandatA + mandatB + mandatC + mandatD + mandatE + mandatF);

        System.out.println("Prvni kolo dopadlo takhle:");
        System.out.println("Strana A ma: " + mandatA + ". mandatu");
        System.out.println("Strana B ma: " + mandatB + ". mandatu");
        System.out.println("Strana C ma: " + mandatC + ". mandatu");
        System.out.println("Strana D ma: " + mandatD + ". mandatu");
        System.out.println("Strana E ma: " + mandatE + ". mandatu");
        System.out.println("Strana F ma: " + mandatF + ". mandatu");

        if (zbyloMandatu > 0) {

            pocetHlasuA = pocetHlasuA - (mandatA * volebniCislo);
            pocetHlasuB = pocetHlasuB - (mandatB * volebniCislo);
            pocetHlasuC = pocetHlasuC - (mandatC * volebniCislo);
            pocetHlasuD = pocetHlasuD - (mandatD * volebniCislo);
            pocetHlasuE = pocetHlasuE - (mandatE * volebniCislo);
            pocetHlasuF = pocetHlasuF - (mandatF * volebniCislo);

            for (int i = 0; i < zbyloMandatu; zbyloMandatu = zbyloMandatu - 1) {

                if(pocetHlasuA > pocetHlasuB && pocetHlasuA > pocetHlasuC && pocetHlasuA > pocetHlasuD && pocetHlasuA > pocetHlasuE && pocetHlasuA > pocetHlasuF) {

                mandatA++;
                pocetHlasuA = 0;

                }else if(pocetHlasuB > pocetHlasuA && pocetHlasuB > pocetHlasuC && pocetHlasuB > pocetHlasuD && pocetHlasuB >  pocetHlasuE && pocetHlasuB > pocetHlasuF) {

                    mandatB++;
                    pocetHlasuB = 0;

                }else if(pocetHlasuC > pocetHlasuA && pocetHlasuC > pocetHlasuB && pocetHlasuC > pocetHlasuD && pocetHlasuC > pocetHlasuE && pocetHlasuC > pocetHlasuF) {

                    mandatC++;
                    pocetHlasuC = 0;

                }else if(pocetHlasuD > pocetHlasuA && pocetHlasuD > pocetHlasuB && pocetHlasuD > pocetHlasuC && pocetHlasuD > pocetHlasuE && pocetHlasuD > pocetHlasuF) {

                    mandatD++;
                    pocetHlasuD = 0;

                }else if(pocetHlasuE > pocetHlasuA && pocetHlasuE > pocetHlasuB && pocetHlasuE > pocetHlasuC && pocetHlasuE > pocetHlasuD && pocetHlasuE > pocetHlasuF) {

                    mandatE++;
                    pocetHlasuE = 0;

                }else if(pocetHlasuF > pocetHlasuA && pocetHlasuF > pocetHlasuB && pocetHlasuF > pocetHlasuC && pocetHlasuF > pocetHlasuD && pocetHlasuF > pocetHlasuE) {
                    mandatF++;
                    pocetHlasuF = 0;

                }

            }
            System.out.println();
            System.out.println("Druhe kolo dopadlo takhle:");
            System.out.println("Strana A ma: " + mandatA + ". mandatu");
            System.out.println("Strana B ma: " + mandatB + ". mandatu");
            System.out.println("Strana C ma: " + mandatC + ". mandatu");
            System.out.println("Strana D ma: " + mandatD + ". mandatu");
            System.out.println("Strana E ma: " + mandatE + ". mandatu");
            System.out.println("Strana F ma: " + mandatF + ". mandatu");

        }
    }
}

