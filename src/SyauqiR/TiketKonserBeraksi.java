package SyauqiR;

import java.util.Scanner;

public class TiketKonserBeraksi {
     public static void main(String[] args) {
         
//        object
//        TiketKonser tk = new TiketKonser("0010103", "Syauqi Ramadhan");
//
//        System.out.println(tk.displayInfo());
//        System.out.println(tk.displayInfo("085705936369"));

 try{
        //io sederhana
        Scanner scanner = new Scanner(System.in);

        // array
        TiketKonserDetail[] tk = new TiketKonserDetail[2];

        // perulangan
            for (int i = 0; i < tk.length; i++) {
                System.out.print("Masukan No Tiket " + (i + 1) + ": ");
                String notik = scanner.nextLine();
                System.out.print("Masukan Nama " + (i + 1) + ": ");
                String nama = scanner.nextLine();

            // objek
                tk[i] = new TiketKonserDetail(notik, nama);
            }

        //perulangan
            for (TiketKonserDetail data : tk) {
                System.out.println("");
                System.out.println("=========================");
                System.out.println("Data Pembeli");
                System.out.println(data.displayInfo());
            }
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Kesalahan Format No.Tiket : "+e.getMessage());
        }catch (Exception e){
            System.out.println("Kesalahan Umum : "+e.getMessage());
        }
    }
    }

