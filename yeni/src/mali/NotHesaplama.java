/**
 * Paket Adı: mali
 * Amaç: Öğrenci notlarını, ortalamalarını ve harf notlarını hesaplayan bir sınıf.
 */
package mali;

import java.util.Random; // Rastgele notlar üretmek için gerekli
import java.util.Scanner; // Kullanıcıdan girdi almak için gerekli

public class NotHesaplama {

    /**
     * Vize ve final notlarını kullanarak ders ortalamasını hesaplar.
     * Vize %40, Final %60 ağırlığa sahiptir.
     *
     * @param vize Öğrencinin vize notu (0-100)
     * @param finall Öğrencinin final notu (0-100)
     * @return Hesaplanan ders ortalaması
     */
    public static double ortalamaHesapla(int vize, int finall) {
        // Formül: Vize * 0.4 + Final * 0.6
        return vize * 0.4 + finall * 0.6;
    }

    /**
     * Ortalamaya karşılık gelen harf notunu belirler.
     *
     * @param ortalama Hesaplanan ders veya dönem ortalaması
     * @return Harf notu (örneğin: "AA", "BB", "FF")
     */
    public static String harfNotuHesapla(double ortalama) {
        if (ortalama >= 90) {
            return "AA"; // 90 ve üzeri
        } else if (ortalama >= 85) {
            return "BA"; // 85-89
        } else if (ortalama >= 80) {
            return "BB"; // 80-84
        } else if (ortalama >= 75) {
            return "CB"; // 75-79
        } else if (ortalama >= 70) {
            return "CC"; // 70-74
        } else if (ortalama >= 65) {
            return "DC"; // 65-69
        } else if (ortalama >= 60) {
            return "DD"; // 60-64
        } else if (ortalama >= 55) {
            return "FD"; // 55-59
        } else {
            return "FF"; // 55 altı
        }
    }

    /**
     * Programın ana çalışma metodu.
     * Kullanıcıdan girdi alır, notları rastgele üretir ve sonuçları yazdırır.
     *
     * @param args Komut satırı argümanları (kullanılmıyor)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Konsol girişini okumak için
        Random random = new Random(); // Rastgele sayı (not) üretmek için

        System.out.print("Ogrenci sayisini girin : ");
        int n = scanner.nextInt(); // Öğrenci sayısını oku

        System.out.print("Ders sayisini girin : ");
        int m = scanner.nextInt(); // Ders sayısını oku

        // Öğrenci isimleri, ders adları ve ders kredileri için diziler oluşturulur
        String[] ogrenciIsimleri = new String[n];
        String[] dersAdlari = new String[m];
        int[] krediler = new int[m];

        // Öğrenci isimlerini kullanıcıdan al
        System.out.println("\n Ogrenci isimlerini girin:");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". ögrenci adi: ");
            ogrenciIsimleri[i] = scanner.next();
        }

        // Ders bilgilerini (ad ve kredi) kullanıcıdan al
        System.out.println("\nDers bilgilerini girin:");
        for (int i = 0; i < m; i++) {
            System.out.print((i + 1) + ". ders adi: ");
            dersAdlari[i] = scanner.next();
            System.out.print((i + 1) + ". ders kredisi: ");
            krediler[i] = scanner.nextInt();
        }

        System.out.println("OGRENCİ NOT HESAPLAMA SİSTEMİ");
        System.out.println("===========================================================");

        // Her öğrenci için döngü
        for (int i = 0; i < n; i++) {
            // Öğrenci adını büyük harfle yazdır
            System.out.println("\n" + ogrenciIsimleri[i].toUpperCase() + ":");
            System.out.println("-----------------------------------------------------------");
            // Tablo başlıklarını biçimli olarak yazdır
            System.out.printf("%-12s %-8s %-8s %-12s %-8s%n",
                    "Ders", "Vize", "Final", "Ortalama", "Harf");
            System.out.println("-----------------------------------------------------------");

            double toplamAgirlikliNot = 0; // Toplam (Ortalama * Kredi) değerini tutar
            int toplamKredi = 0; // Öğrencinin aldığı toplam krediyi tutar

            // Öğrencinin aldığı her ders için döngü
            for (var j = 0; j < m; j++) {
                // 0-100 arasında rastgele vize ve final notu üret
                int vize = random.nextInt(101);
                int finall = random.nextInt(101);
                double ortalama = ortalamaHesapla(vize, finall); // Ders ortalamasını hesapla
                String harfNotu = harfNotuHesapla(ortalama); // Dersin harf notunu hesapla

                // Dönem ortalaması için gerekli toplamları güncelle (Ağırlıklı Ortalama)
                toplamAgirlikliNot += ortalama * krediler[j];
                toplamKredi += krediler[j];

                // Dersin detaylarını biçimli olarak yazdır
                System.out.printf("%-12s %-8d %-8d %-12.2f %-8s%n",
                        dersAdlari[j], vize, finall, ortalama, harfNotu);
            }

            // Dönem ortalamasını hesapla: (Toplam Ağırlıklı Not / Toplam Kredi)
            double donemOrtalamasi = toplamAgirlikliNot / toplamKredi;
            System.out.println("-----------------------------------------------------------");
            // Dönem ortalamasını ve buna karşılık gelen harf notunu yazdır
            System.out.printf("Donem Ortalamasi: %.2f - Harf Notu: %s%n", donemOrtalamasi, harfNotuHesapla(donemOrtalamasi));
        }
        
        // Scanner nesnesini kapat
        scanner.close(); 
    }
}
