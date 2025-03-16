# CRM Sistemi Projesi

Bu Java uygulaması, müşteri ilişkileri yönetimi (CRM) sistemi işlevlerini simüle eden basit bir projedir. Müşterilere destek temsilcisi atama ve bütçeye uygun en verimli pazarlama kampanyalarını seçme gibi işlemler gerçekleştirilir.

## Proje Yapısı

Proje, üç ana sınıftan oluşmaktadır:

- **Musteri**: Müşterinin adı, şehir bilgisi ve sorun bilgilerini tutar.
- **DestekTemsilcisi**: Destek temsilcisinin adı, şehir bilgisi ve müsaitlik durumunu tutar.
- **Kampanya**: Pazarlama kampanyasının adı, maliyeti ve beklenen getirisini tutar.

## Kullanılan Algoritmalar

### 1. Destek Temsilcisi Atama Algoritması

- **Amaç**: Müşterilerin bulunduğu şehirdeki müsait destek temsilcilerini bulup, müşterilere en uygun temsilciyi atamak.
- **Kullanım Nedeni**: Bu algoritma, her müşteri için hızlı ve doğru bir şekilde uygun temsilcilerin bulunmasını sağlar. Bu, CRM sisteminin performansını artırır ve müşterilere hızlı bir şekilde destek alınmasını sağlar.
  
### 2. En İyi Kampanyaları Seçme Algoritması

- **Amaç**: Verilen bütçe ile en yüksek getiri sağlayacak pazarlama kampanyalarını seçmek.
- **Kullanım Nedeni**: Bu algoritma, sınırlı bir bütçe ile en verimli kampanyaların seçilmesini sağlar. Kampanyalar, getiri/maliyet oranına göre sıralanır ve bütçeye uygun olanlar seçilir.

## Dinamik Programlama ve Diğer Algoritma Yöntemleri

### Dinamik Programlama

Dinamik programlama, karmaşık problemleri küçük alt problemlere ayırarak çözen bir yöntemdir. Genellikle optimizasyon problemleri için kullanılır ve daha önce hesaplanmış çözümleri saklayarak verimliliği artırır.

- **Avantajları**: Alt problemlerin çözümleri tekrar hesaplanmaz, dolayısıyla çözüm süresi azalır.
- **Dezavantajları**: Daha fazla bellek kullanımı ve karmaşık tasarım gerekebilir.

### Diğer Algoritma Yöntemleri

- **Açgözlü Algoritmalar (Greedy Algorithms)**: Her adımda en iyi yerel seçimi yapar, ancak her zaman en iyi global çözümü vermez.
- **Böl ve Yönet (Divide and Conquer)**: Problemi küçük parçalara böler ve her parçayı ayrı çözer.
- **Geriye Dönük Arama (Backtracking)**: Olası çözümleri dener, başarısız olursa geri dönerek farklı çözümler arar.

## Sonuç

Bu proje, CRM sistemine temel işlevler eklemek için basit ve etkili algoritmalar kullanmaktadır. Destek temsilcisi atama ve kampanya seçme algoritmaları, sistemin verimli ve hızlı bir şekilde çalışmasını sağlar. Dinamik programlama ve diğer algoritma yaklaşımları, çeşitli problem türleri için uygun çözümler sunar ve her birinin avantajları ve dezavantajları vardır.
