# TugasRelasiClass2

## IOperationiSystem
- Merupakan relasi turunan
dimana sebuah class diciptakan
berdasarkan class lainnya.
- Relasi turunan sering disebut
dengan relasi IS-A

![image](https://user-images.githubusercontent.com/92787567/205922564-817f6b53-f570-4aa3-bc4a-62dadf968f5d.png)
<br>
<br>
<br>

## OperationSystem.java
- Realization merupakan relasi yang
terjadi akibat implementasi dari
interface.
- Dalam relasi realization, sebuah kelas
yang mengimplementasikan interface
tertentu, harus mendefinisikan/
mengimplementasikan seluruh method
yang dideklarasikan dalam interface
![image](https://user-images.githubusercontent.com/92787567/205922828-fc26b539-bd4d-4058-b34f-30a60236b676.png)
<br>
<br>
<br>

## DeviceAggregationRelation.java

- Hubungan agregasi serupa dengan
asosiasi, yaitu memiliki sebuah
atribut dengan tipe dari class lain.
- Namun hubungan diperkuat
dengan adanya dependensi pada
konstruktornya.

![image](https://user-images.githubusercontent.com/92787567/205914714-0f7cfc14-c6ad-45d5-b423-291b20ab571e.png)

## MainDeviceAggregationRelation.java
![image](https://user-images.githubusercontent.com/92787567/205916049-53cc7c7d-73a3-478a-8ab9-07c44dd8ed9d.png)

## output 
![image](https://user-images.githubusercontent.com/92787567/205917835-91b02fcd-a6a2-4d98-986a-86b0c4909dde.png)

<br>
<br>
<br>

## DeviceAssociationRelation.java
- Asosiasi didefinisikan sebagai
hubungan yang terstruktur, yang
secara konsep memiliki arti
bahwa dua komponen saling
terhubung satu sama lain.
- Asosiasi biasa disebut
menggunakan (uses)
![image](https://user-images.githubusercontent.com/92787567/205918488-5105fa41-7132-4c91-99de-7992723f2044.png)

## MainDeviceAssociationRelation.java
![image](https://user-images.githubusercontent.com/92787567/205919374-cfea395d-4f30-4ade-8168-0fe78a7feba3.png)

## output
![image](https://user-images.githubusercontent.com/92787567/205920302-7e2c2cd7-c664-4910-9d76-cbb8fb1e6fa9.png)
<br>
<br>
<br>

## DeviceCompositionRelation.java
- Composition merupakan relasi yang lebih
spesifik dari relasi aggregation.
- Pada relasi ini suatu kelas tidak hanya
dimiliki oleh kelas lainnya, tapi juga siklus
hidup kelas tersebut juga ditentukan oleh
kelas yang memilikinya.
- Pada relasi ini biasanya objek dari kelas
yang dimiliki diciptakan di dalam kelas
yang memilikinya.
- Komposisi biasa disebut pasti memiliki
(own)

![image](https://user-images.githubusercontent.com/92787567/205920698-d99d103d-6599-42b8-9f2d-894370491fb5.png)

## MainDeviceCompositionRelation.java
![image](https://user-images.githubusercontent.com/92787567/205921234-2e638246-5ba2-4c15-a0e0-b169403e0424.png)

## Output
![image](https://user-images.githubusercontent.com/92787567/205921308-ddc984bf-a67c-45e8-935b-9f5142885811.png)
<br>
<br>
<br>

## DeviceDependenciesRelation.java
- Dependency merupakan relasi antar
kelas dimana satu kelas membutuhkan
atau tergantung kepada kelas lainnya.
Tapi ketergantungan tersebut tidak
timbal balik.
-  Relasi dependency ini digambarkan
dengan panah yang dari satu kelas ke
kelas lainnya.
- Arah panah menunjukkan kelas yang
dibutuhkan. 
![image](https://user-images.githubusercontent.com/92787567/205921922-6af970ef-64b6-408a-8de3-cc8e7941cafc.png)

## MainDeviceDependenciesRelation.java
![image](https://user-images.githubusercontent.com/92787567/205922361-f6ee1a1a-db02-4ee2-a3fb-9fb29e33723e.png)







## Diagram Class
![Class Diagram Relasi Class drawio (1)](https://user-images.githubusercontent.com/92787567/205893578-99119d8f-9a17-430b-b15c-e04ffac95f2b.png)
