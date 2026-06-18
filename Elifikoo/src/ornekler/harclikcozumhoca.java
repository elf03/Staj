
package ornekler;

import java.util.Random;


public class harclikcozumhoca {
    public static void main(String[] args) {
        System.out.println("ornekler.harclikcozumhoca.main()");
         int yaslar[] = {9, 13, 14, 18, 21};
        String[] cocuklar = {"Arazi", "Mütevazi", "Farazi", "Terazi", "Niyazi"};
        double[] babaharclik = new double[cocuklar.length];
        double[] anneharclik = new double[cocuklar.length];
        double[] toplamharclik = new double[cocuklar.length];

        Random rnd = new Random();

        double maas = rnd.nextInt(30000, 50001);
        double zamlimaas = maas * 1.5; // maas + (maas * 0.5)
        double evgideri = zamlimaas * 0.75;
        double kalanpara = (zamlimaas - evgideri);
        double ozelpara = kalanpara * 0.25;
        kalanpara = kalanpara - ozelpara; //HARÇLIK PARASI 

        double xbabatoplam = 0, xannetoplam = 0, xgeneltoplam = 0;

        System.out.println("Maas:" + maas);
        System.out.println("Zamli Maas:" + zamlimaas);
        System.out.println("Ev Gideri:" + evgideri);
        System.out.println("ozelpara:" + ozelpara);
        System.out.println("Harclik Parasi: :" + kalanpara);

        System.out.printf("\n%-20s %-15s %-15s %-15s \n", "Çocuk", "BabaPara", "AnnePara", "ToplamPara");

        for (int i = 0; i < cocuklar.length; i++) {
            double xharclik = rnd.nextInt(200, 751);
            //System.out.println("KalanPara: " + kalanpara + " xharçlik: " + xharclik);

            if (kalanpara >= xharclik) {
                babaharclik[i] = xharclik;
                kalanpara = kalanpara - xharclik;
            } else {
                babaharclik[i] = 0;
            }

            anneharclik[i] = getAnneHarclik(yaslar[i], xharclik);

            toplamharclik[i] = babaharclik[i] + anneharclik[i];

            System.out.printf("%-20s %-15.2f %-15.2f %-15.2f \n",
                    cocuklar[i], babaharclik[i], anneharclik[i], toplamharclik[i]);

            xbabatoplam += babaharclik[i];
            xannetoplam += anneharclik[i];
            xgeneltoplam += babaharclik[i] + anneharclik[i];
        }//for
        System.out.println("-------------------------------------------------------");
        System.out.printf("%-20s %-15.2f %-15.2f %-15.2f \n",
                "TOplam Tutar", xbabatoplam, xannetoplam, xgeneltoplam);

        System.out.println("Baba Kalan PARA: \t" + (kalanpara + ozelpara));

    }//main

    static double getAnneHarclik(int yas, double harclik) {
        double xannepara = 0;

        if (yas % 2 == 0) {
            xannepara = harclik * 0.40;
        } else {
            xannepara = harclik * 0.30;
        }

        return xannepara;
    }
}
