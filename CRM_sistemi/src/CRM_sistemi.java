import java.util.*;

class Musteri {
    String ad;
    String sehir;
    String sorun;

    public Musteri(String ad, String sehir, String sorun) {
        this.ad = ad;
        this.sehir = sehir;
        this.sorun = sorun;
    }
}

class DestekTemsilcisi {
    String ad;
    String sehir;
    boolean musait;

    public DestekTemsilcisi(String ad, String sehir, boolean musait) {
        this.ad = ad;
        this.sehir = sehir;
        this.musait = musait;
    }
}

class Kampanya {
    String ad;
    double maliyet;
    double beklenenGetiri;

    public Kampanya(String ad, double maliyet, double beklenenGetiri) {
        this.ad = ad;
        this.maliyet = maliyet;
        this.beklenenGetiri = beklenenGetiri;
    }
}

public class CRM_sistemi {

    public static void destekTemsilcisiAta(List<Musteri> musteriler, List<DestekTemsilcisi> temsilciler) {
        System.out.println("\nMüşteri Destek Temsilcisi Yönlendirme:");
        for (Musteri musteri : musteriler) {
            for (DestekTemsilcisi temsilci : temsilciler) {
                if (temsilci.sehir.equals(musteri.sehir) && temsilci.musait) {
                    System.out.println(musteri.ad + " adlı müşteriye " + temsilci.ad + " temsilcisi atandı.");
                    temsilci.musait = false;
                    break;
                }
            }
        }
    }

    public static void enIyiKampanyalariSec(List<Kampanya> kampanyalar, double butce) {
        System.out.println("\nSeçilen Pazarlama Kampanyaları:");
        kampanyalar.sort((k1, k2) -> Double.compare(k2.beklenenGetiri / k2.maliyet, k1.beklenenGetiri / k1.maliyet));
        double toplamMaliyet = 0;
        for (Kampanya kampanya : kampanyalar) {
            if (toplamMaliyet + kampanya.maliyet <= butce) {
                double roi = kampanya.beklenenGetiri / kampanya.maliyet;
                System.out.printf("%s kampanyası seçildi. Beklenen Getiri: %.2f, ROI: %.2f\n",
                        kampanya.ad, kampanya.beklenenGetiri, roi);
                toplamMaliyet += kampanya.maliyet;
            }
        }
    }

    public static void main(String[] args) {
        List<Musteri> musteriler = Arrays.asList(
                new Musteri("Ahmet", "Istanbul", "Fatura Sorunu"),
                new Musteri("Mehmet", "Ankara", "Hizmet Kesintisi"),
                new Musteri("Ayşe", "Istanbul", "Ürün Şikayeti")
        );

        List<DestekTemsilcisi> temsilciler = Arrays.asList(
                new DestekTemsilcisi("Ali", "Istanbul", true),
                new DestekTemsilcisi("Fatma", "Ankara", false),
                new DestekTemsilcisi("Zeynep", "Istanbul", true)
        );

        List<Kampanya> kampanyalar = Arrays.asList(
                new Kampanya("İndirim Kampanyası", 5000, 12000),
                new Kampanya("Sadakat Programı", 3000, 7000),
                new Kampanya("Yeni Ürün Tanıtımı", 7000, 15000)
        );

        destekTemsilcisiAta(musteriler, temsilciler);
        enIyiKampanyalariSec(kampanyalar, 8000);
    }

}
