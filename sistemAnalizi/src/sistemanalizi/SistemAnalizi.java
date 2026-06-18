
package sistemanalizi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

public class SistemAnalizi {

 
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Haber sitesi URL giriniz: ");
        String url = scanner.nextLine();

        try {

            URL site = new URL(url);
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(site.openStream()));

            String satir;
            String icerik = "";

            while ((satir = reader.readLine()) != null) {
                icerik += satir.toLowerCase();
            }

            reader.close();

            int puan = analizEt(icerik);

            if (puan >= 5) {
                System.out.println("⚠ Bu site SAHTE HABER içerebilir.");
            } else {
                System.out.println("✔ Site büyük ihtimalle güvenilir.");
            }

        } catch (Exception e) {
            System.out.println("Siteye erişilemedi.");
        }
    }

    public static int analizEt(String metin) {

        int puan = 0;

        String[] sahteKelimeler = {
                "şok", "inanılmaz", "hemen paylaş",
                "gerçekleri saklıyorlar",
                "medya bunu göstermiyor",
                "tüm gerçekler burada"
        };

        for (String kelime : sahteKelimeler) {
            if (metin.contains(kelime)) {
                puan++;
            }
        }

        return puan;
    }
}
    
    

