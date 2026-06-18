

import java.util.*;

class Ders {
    String ad;
    int kredi;

    public Ders(String ad, int kredi) {
        this.ad = ad;
        this.kredi = kredi;
    }
}

class Ogrenci {
    String ad;
    Map<Ders, int[]> notlar = new HashMap<>(); // {vize, final}

    public Ogrenci(String ad) {
        this.ad = ad;
    }
}


public class senakuntkir{
    {
    // Ortalama hesaplayan fonksiyon
}
    public static double ortalamaHesapla(int vize, int fin) {
        return vize * 0.40 + fin * 0.60;
    }

    // Harf notu ve katsayısı döndüren fonksiyon
    public static String harfNotu(double ort) {
        if (ort >= 90) return "AA";
        if (ort >= 80) return "BA";
        if (ort >= 70) return "BB";
        if (ort >= 65) return "CB";
        if (ort >= 55) return "CC";
        if (ort >= 50) return "DC";
        if (ort >= 45) return "DD";
        if (ort >= 40) return "FD";
        return "FF";
    }

    // Harf notuna göre katsayı
    public static double katsayi(String hn) {
        switch (hn) {
            case "AA": return 4.0;
            case "BA": return 3.5;
            case "BB": return 3.0;
            case "CB": return 2.5;
            case "CC": return 2.0;
            case "DC": return 1.5;
            case "DD": return 1.0;
            case "FD": return 0.5;
            default: return 0.0;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        System.out.print("Öğrenci sayısı (n): ");
        int n = sc.nextInt();

        System.out.print("Ders sayısı (m): ");
        int m = sc.nextInt();

        // Dersleri oluştur
        List<Ders> dersler = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            System.out.print(i + ". ders adı: ");
            String ad = sc.next();
            System.out.print(i + ". ders kredisi: ");
            int kredi = sc.nextInt();
            dersler.add(new Ders(ad, kredi));
        }

        // Öğrenciler
        List<Ogrenci> ogrenciler = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            ogrenciler.add(new Ogrenci("Ogrenci_" + i));
        }

        // Her öğrenciye rastgele ders seçme ve not atama
        for (Ogrenci ogr : ogrenciler) {
            int toplamKredi = 0;

            List<Ders> karisik = new ArrayList<>(dersler);
            Collections.shuffle(karisik);

            for (Ders d : karisik) {
                if (toplamKredi + d.kredi <= 20) {
                    int vize = rnd.nextInt(101);  // 0-100
                    int fin = rnd.nextInt(101);

                    ogr.notlar.put(d, new int[]{vize, fin});
                    toplamKredi += d.kredi;
                }
            }
        }

        // ÇIKTI
        System.out.println("\n================ SONUÇ =================");

        for (Ogrenci ogr : ogrenciler) {
            System.out.println("\n" + ogr.ad);
            System.out.println("-----------------------------------");

            double toplamAgirlikliPuan = 0;
            int toplamKredi = 0;

            for (Map.Entry<Ders, int[]> entry : ogr.notlar.entrySet()) {
                Ders d = entry.getKey();
                int v = entry.getValue()[0];
                int f = entry.getValue()[1];

                double ort = ortalamaHesapla(v, f);
                String harf = harfNotu(ort);
                double kats = katsayi(harf);

                System.out.println("Ders: " + d.ad +
                        " | Kredi: " + d.kredi +
                        " | Vize: " + v +
                        " | Final: " + f +
                        " | Ortalama: " + String.format("%.2f", ort) +
                        " | Harf: " + harf);

                toplamAgirlikliPuan += kats * d.kredi;
                toplamKredi += d.kredi;
            }

            double gno = toplamAgirlikliPuan / toplamKredi;
            System.out.println("Dönem Sonu Ortalaması (GNO): " + String.format("%.2f", gno));
        }
    }
}