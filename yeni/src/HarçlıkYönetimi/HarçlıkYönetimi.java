package HarçlıkYönetimi;

import java.util.Scanner;
import java.util.Random;

public class HarçlıkYönetimi {

    // Harcama Durumuna göre etiket döndüren fonksiyon (Orijinaldeki Harf Notu karşılığı)
    /**
     * Kalan bakiye durumuna göre bir etiket döndürür.
     */
    public static String bakiyeDurumu(double kalanBakiye) {
        if (kalanBakiye > 50.0) {
            return "ZENGİN 😎"; // Çok para kaldı
        } else if (kalanBakiye >= 20.0) {
            return "NORMAL 🙂"; // Makul para kaldı
        } else if (kalanBakiye > 0.0) {
            return "AZ 😟"; // Az para kaldı
        } else if (kalanBakiye == 0.0) {
            return "TAM SIFIRLANDI! 😲";
        } else {
            return "BORÇLU! 😭"; // Negatif bakiye
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 1. Çocuğun Annesinden ve Babasından Aldığı Parayı Alma
        System.out.println("--- Çocuğun Harçlıklarını Giriniz ---");
        System.out.print("Anneden alınan para (TL): ");
        double anneParasi = scanner.nextDouble();
        
        System.out.print("Babadan alınan para (TL): ");
        double babaParasi = scanner.nextDouble();

        double toplamHarclik = anneParasi + babaParasi;
        System.out.printf("\n** Çocuğun Toplam Harçlığı: %.2f TL **\n", toplamHarclik);
        
        // 2. Ürün sayısını ve bilgilerini alma
        System.out.print("\nKaç çeşit ürün (oyuncak, yiyecek vb.) gireceksiniz (m): ");
        int urunSayisi = scanner.nextInt();
        
        String[] urunIsimleri = new String[urunSayisi];
        double[] urunFiyatlari = new double[urunSayisi];

        System.out.println("\n--- Ürün İsimleri ve Fiyatlarını Giriniz ---");
        for (int i = 0; i < urunSayisi; i++) {
            System.out.print((i + 1) + ". Ürünün Adı: ");
            urunIsimleri[i] = scanner.next();
            System.out.print(urunIsimleri[i] + " ürününün Fiyatı (TL): ");
            urunFiyatlari[i] = scanner.nextDouble();
        }

        // 3. Alışveriş Listesi Oluşturma ve Hesaplama
        System.out.println("\n==========================================");
        System.out.println("🛒 ÇOCUĞUN ALIŞVERİŞ LİSTESİ VE HARCAMASI:");
        System.out.println("BAŞLANGIÇ BAKİYE: " + String.format("%.2f TL", toplamHarclik));
        System.out.println("==========================================");

        double toplamHarcama = 0.0;
        double guncelBakiye = toplamHarclik;

        // Her bir ürün için rastgele alışveriş yapma
        for (int i = 0; i < urunSayisi; i++) {
            
            // Rastgele karar ver: Bu ürünü alsın mı? (%50 ihtimal)
            boolean satinAlindi = random.nextBoolean();
            
            if (satinAlindi) {
                // Miktar belirleme (Basitlik için 1 adet alınıyor)
                double fiyat = urunFiyatlari[i];

                if (guncelBakiye >= fiyat) {
                    // Satın alma işlemi
                    guncelBakiye -= fiyat;
                    toplamHarcama += fiyat;

                    System.out.printf("%-15s | Fiyat: %6.2f TL | *SATIN ALINDI* | Kalan Bakiye: %7.2f TL\n",
                                      urunIsimleri[i], fiyat, guncelBakiye);
                } else {
                    // Para yetmedi
                    System.out.printf("%-15s | Fiyat: %6.2f TL | *ALINAMADI* (Yetersiz Bakiye)\n",
                                      urunIsimleri[i], fiyat);
                }
            } else {
                // Rastgele almamaya karar verdi
                System.out.printf("%-15s | Fiyat: %6.2f TL | Atlandı.\n",
                                  urunIsimleri[i], urunFiyatlari[i]);
            }
        }
        
        // 4. Sonuçları Gösterme
        System.out.println("------------------------------------------");
        System.out.printf("TOPLAM HARCANAN MİKTAR: %.2f TL\n", toplamHarcama);
        System.out.printf("SON KALAN BAKİYE: %.2f TL\n", guncelBakiye);
        System.out.println("BAKİYE DURUMU: " + bakiyeDurumu(guncelBakiye));
        System.out.println("==========================================");

        scanner.close();
    }
}
