# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data tiket konser menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa notik dan nama, dan memberikan output berupa informasi detail dari notik tersebut seperti kode pendaftaran, kode posisi duduk, dan kode hari.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `TiketKonser`, `TiketKonserDetail`, dan `TiketKonserBeraksi` adalah contoh dari class.

```bash
public class TiketKonser {
    ...
}

public class TiketKonserDetail extends TiketKonser {
    ...
}

public class TiketKonserBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `tk[i] = new TiketKonserDetail(notik, nama);` adalah contoh pembuatan object.

```bash
tk[i] = new TiketKonserDetail(notik, nama);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `notik` dan `nama` adalah contoh atribut.

```bash
String notik;
String nama;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `TiketKonser` dan ``.

```bash
public TiketKonser(String notik, String nama) {
    this.notik = notik;
    this.nama = nama;
}

public TiketKonserDetail(String notik, String nama) {
    super(notik, nama);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNotik` dan `setNama` adalah contoh method mutator.

```bash
public void setNotik(String notik) {
    this.notik = notik;
}

public void setNama(String nama) {
    this.nama = nama;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNotik`, `getNama`, `getKodePendaftaran`, `getPosisiDuduk`, dan `getKodeHari` adalah contoh method accessor.

```bash
public String getNotik() {
    return notik;
}

public String getNama() {
    return nama;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `notik` dan `nama` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String notik;
private String nama;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `TiketKonserDetail` mewarisi `TiketKonser` dengan sintaks `extends`.

```bash
public class TiketKonserDetail extends TiketKonser {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `TiketKonser` merupakan overloading method `displayInfo` dan `displayInfo` di `TiketKonserDetail` merupakan override dari method `displayInfo` di `TiketKonser`.

```bash
public String displayInfo(String hp) {
    return displayInfo() + "\nNo.Telpon: " + hp;
}

@Override
public String displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getPosisiDuduk` dan seleksi `switch` dalam method `getHari`.

```bash
public String getPosisiDuduk() {
    if(getNotik().substring(3, 5).equals("07")){
        return "Kursi Duduk VIP";
    } else {
        return "Kursi Duduk Reguler";
    }

    //return getNotik().substring(3, 5).equals("07") ? "Kursi Duduk VIP" : "Kursi Duduk Reguler";
}

public String getHari() {
        
        String hari = getNotik().substring(5, 7);
        switch (hari) {
            case "01":
                return "Senin";
            case "02":
                return "Selasa";
            case "03":
                return "Rabu";
            case "04":
                return "Kamis";
            case "05":
                return "Jum'at";
            case "06":
                return "Sabtu";
            case "07":
                return "Minggu";
            default:
                return "Tanggal Tidak Ada";
        }
    }
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < tk.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukan No Tiket ke-" + (i + 1) + ": ");
String notik = scanner.nextLine();

System.out.println("\nData Pembeli:");
System.out.println(tk.displayInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `TiketKonserDetail[] tk = new TiketKonserDetail[2];` adalah contoh penggunaan array.

```bash
TiketKonserDetail[] tk = new TiketKonserDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Syauqi Ramadhan
NPM: 2110010016
