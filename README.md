# Çiçek Sepeti 2019 Hackathon Sorusu

### Kurallar
* Kırmızı, Yeşil ve Mavi olmak üzere 3 adet çiçek bayisi bulunuyor.
* 3 bayinin ilgili adreslere teslim etmesi gereken 100 adet çiçek siparişi bulunuyor.
* Kırmızı Bayi: 20-30 arası sipariş dağıtmalıdır.
* Yeşil Bayi: 35-50 arası sipariş dağıtmalıdır.
* Mavi Bayi: 20-80 arası sipariş dağıtmalıdır.

### Beklenen Çözüm
* Siparişler bayilerin kotaları* göz önünde bulundurularak optimum şekilde dağıtmalıdır.
* Çiçek bayilerinin kat edeceği toplam kuş uçuşu mesafenin olabildiğince kısa olması gerekiyor.
* Çiçek bayilerinin kat edeceği toplam kuş uçuşu mesafenin olabildiğince kısa olması gerekiyor.

### Not
* Kota: Bir bayinin dağıtabileceği maksimum sipariş sayısıdır. (Örneğin Kırmızı Bayi’nin kotası 30’dur)

### Bayi Kordinatları
| Bayi Adı | Latitude  | Longitude | 
|----------|-----------|-----------| 
| Kırmızı  | 41.049792 | 29.003031 | 
| Yeşil    | 41.069940 | 29.019250 | 
| Mavi     | 41.049997 | 29.026108 | 

### Sipariş Kordinatları
| Sipariş Numarası | Latitude        | Longitude       | 
|------------------|-----------------|-----------------| 
| 100              | 41.078260000000 | 29.015770000000 | 
| ...              | ............... | ............... | 
| 110              | 41.060720000000 | 29.011340000000 | 
| ...              | ............... | ............... | 
| 120              | 41.042900000000 | 29.000040000000 | 
| ...              | ............... | ............... |
| 130              | 41.083220000000 | 29.013630000000 | 
| ...              | ............... | ............... | 
| 140              | 41.054610000000 | 29.027400000000 | 
| ...              | ............... | ............... |
| 150              | 41.060780000000 | 29.010830000000 | 
| ...              | ............... | ............... |
| 160              | 41.076840000000 | 29.015430000000 | 
| ...              | ............... | ............... |
| 170              | 41.056890000000 | 28.987130000000 | 
| ...              | ............... | ............... |
| 180              | 41.089100000000 | 29.035370000000 | 
| ...              | ............... | ............... | 
| 190              | 41.076840000000 | 29.015430000000 | 
| ...              | ............... | ............... | 
| 199              | 41.049030000000 | 29.023410000000 | 

### Çözüm
* Bayi ve sipariş kordinatları için gerekli sınıfları oluşturup gerekli tanımlamaları yaptım.
* Her bir siparişin üç bayiye olan uzaklıklarını hesaplattım. En kısa olanın kotası dolmamış ise o bayi gönderiyor, kotası dolmuş ise diğer en yakın bayi için aynı kontrolleri tekrar yapıyorum.
* Hangi bayinin göndereceği belirlendiğinde bayinin sipariş listesine ve siparişin hangi bayi tarafından gönderildiği bilgisini iki farklı sınıfta da tutuyorum.

### Çıktı
```
100 nolu siparisi teslim eden bayi: Yesil
...
110 nolu siparisi teslim eden bayi: Yesil
...
120 nolu siparisi teslim eden bayi: Kirmizi
...
130 nolu siparisi teslim eden bayi: Yesil
...
140 nolu siparisi teslim eden bayi: Mavi
...
150 nolu siparisi teslim eden bayi: Yesil
...
160 nolu siparisi teslim eden bayi: Yesil
...
170 nolu siparisi teslim eden bayi: Kirmizi
...
180 nolu siparisi teslim eden bayi: Yesil
...
190 nolu siparisi teslim eden bayi: Mavi
...
199 nolu siparisi teslim eden bayi: Mavi


Kirmizi bayi 30 adet siparis teslim etmistir.
Yesil bayi 50 adet siparis teslim etmistir.
Mavi bayi 20 adet siparis teslim etmistir.
```

### Kaynak
[Bayi Kordinatları](https://github.com/oguzhancevik/CicekSepeti-Hackathon/blob/master/kaynak/1-BayiKordinatlari.csv)
<br/>
[Sipariş Kordinatları](https://github.com/oguzhancevik/CicekSepeti-Hackathon/blob/master/kaynak/2-SiparisKordinatlari.csv)
<br/>
[Çıktı](https://github.com/oguzhancevik/CicekSepeti-Hackathon/blob/master/kaynak/3-Output.txt)