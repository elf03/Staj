package manavhesaplama;

import java.util.Scanner;
import java.util.Random;

public class ManavHesaplama {

    // Stok Durumuna Göre Etiket (Az Stok, Normal, Yüksek)
    /**
     * Verilen stok miktarına göre bir stok etiketi döndürür.
     * NOT: Orijinaldeki "Harf Notu" fonksiyonunun karşılığıdır.
     */
    public static String stokEtiketiHesapla(int stokMiktari) {
        // Etiket Aralıkları:
        // 0 - 10 : KRİTİK (K)
        // 11 - 30 : AZ (A)
        // 31 - 60 : NORMAL (N)
        // 61 - 100 : YÜKSEK (Y)

        if (stokMiktari <= 10) { 
            return "KRİTİK";
        } else if (stokMiktari <= 30) { 
            return "AZ";
        } else if (stokMiktari <= 60) { 
            return "NORMAL";
        } else { 
            return "YÜKSEK";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 1. Kullanıcıdan müşteri ve ürün (sebze/meyve) sayılarını alma
        System.out.print("Müşteri sayısını (n) giriniz: ");
        int musteriSayisi = scanner.nextInt();
        
        System.out.print("Ürün/Sebze sayısını (m) giriniz: ");
        int urunSayisi = scanner.nextInt();

        // Dizileri tanımlama
        String[] urunIsimleri = new String[urunSayisi];
        double[] birimFiyatlari = new double[urunSayisi];
        int[] urunStoklari = new int[urunSayisi]; // Başlangıç stoklarını tutar
        
        // Müşterilerin toplam borçlarını tutmak için dizi
        double[] musteriBorclari = new double[musteriSayisi];

        // 2. Ürün adı ve birim fiyatlarının girilmesi
        System.out.println("\n--- Ürün Bilgilerini ve Fiyatlarını Giriniz ---");
        for (int i = 0; i < urunSayisi; i++) {
            System.out.print((i + 1) + ". Ürünün Adı: ");
            urunIsimleri[i] = scanner.next();
            System.out.print(urunIsimleri[i] + " ürününün Birim Fiyatı (TL/kg): ");
            // Fiyatlar için ondalıklı giriş
            birimFiyatlari[i] = scanner.nextDouble(); 
            
            // Başlangıç stoğunu rastgele ata (1 - 100 kg arası)
            urunStoklari[i] = random.nextInt(100) + 1; 
        }
        
        System.out.println("\n** GİRDİ ÖZETİ: Manavda toplam " + urunSayisi + " çeşit ürün var. **\n");
        
        // Stok durumunu göster
        System.out.println("--- GÜNCEL STOK DURUMU ---");
        for (int i = 0; i < urunSayisi; i++) {
            System.out.printf("%-15s | Stok: %3d kg | Etiket: %s\n", 
                               urunIsimleri[i], urunStoklari[i], stokEtiketiHesapla(urunStoklari[i]));
        }
        System.out.println("--------------------------\n");


        // Her bir müşteri için döngü
        for (int i = 0; i < musteriSayisi; i++) {
            System.out.println("==========================================");
            System.out.println("MÜŞTERİ " + (i + 1) + " ALIŞVERİŞ DETAYI:");
            System.out.println("==========================================");

            double toplamBorc = 0.0; // Müşterinin toplam ödemesi (Orijinaldeki toplamKalitePuani)

            // Her bir ürün için döngü (müşterinin sepete eklemesi)
            for (int j = 0; j < urunSayisi; j++) {
                
                // Müşterinin rastgele aldığı miktar (0 - 10 kg arası)
                // Orijinaldeki Vize/Final notlarına karşılık gelir.
                double alinanMiktar = random.nextDouble() * 10;
                
                // Toplam maliyeti hesaplama: Miktar * Fiyat
                // Orijinaldeki Ortalama Hesaplamasına karşılık gelir.
                double urunMaliyeti = alinanMiktar * birimFiyatlari[j]; 
                
                // Orijinal kodda ortalama not üzerinden harf notu hesaplanıyordu, 
                // Burada rastgele miktar üzerinden stok etiketini hesaplayalım.
                String stokEtiketi = stokEtiketiHesapla((int) alinanMiktar * 10); // Basitçe miktar * 10 
                
                // Çıktı formatı
                System.out.printf("%-15s | Fiyat: %5.2f TL | Miktar: %5.2f kg | Maliyet: %7.2f TL\n", 
                                  urunIsimleri[j], birimFiyatlari[j], alinanMiktar, urunMaliyeti);

                // Toplam borcu güncelleme
                toplamBorc += urunMaliyeti; 
            }
            
            musteriBorclari[i] = toplamBorc;
            
            System.out.println("------------------------------------------");
            System.out.printf("MÜŞTERİ %d TOPLAM BORÇ (ÖDEME): %.2f TL\n", (i + 1), toplamBorc);
            System.out.println("==========================================");
        }
        
        // Müşterilere ait toplam borçları toplu gösterme
        System.out.println("\n** TÜM MÜŞTERİLERİN TOPLAM BORÇLARI **");
        for (int i = 0; i < musteriSayisi; i++) {
             System.out.printf("Müşteri %d Toplam Borç: %.2f TL\n", (i + 1), musteriBorclari[i]);
        }

        scanner.close();
    }
}