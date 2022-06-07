import java.util.Scanner;
import java.lang.Math;
import Bangun3Dimensi.Balok;
import Bangun3Dimensi.Kerucut;
import Bangun3Dimensi.Bola;
import Bangun3Dimensi.Tabung;
import Bangun3Dimensi.Kubus;

public class App {
    public static void main(String[] args) throws Exception {


        Scanner masukan = new Scanner(System.in);
        
        String yn;
        do{
            bersihkanLayar();
            System.out.println("Program by Jodie Ivana Salim (1.Tabung)");
            System.out.println("1. Tabung");
            System.out.println("2. Kubus");
            System.out.println("3. Kerucut");
            System.out.println("4. Balok");
            System.out.println("5. Bola");
            System.out.println("6. Keluar");
            System.out.print("Pilihan (1/2/3/4/5/6) : ");
            int pilihan;
            pilihan = masukan.nextInt();

            if (pilihan == 1) {
                bersihkanLayar();
                menuTabung (masukan);
            }

            else if (pilihan == 2) {
                bersihkanLayar();
                menuKubus (masukan);
            }

            else if (pilihan == 3) {
                bersihkanLayar();
                menuKerucut (masukan);
            }

            else if (pilihan == 4) {
                bersihkanLayar();
                menuBalok (masukan);
            }

            else if (pilihan == 5) {
                bersihkanLayar();
                menuBola (masukan);
            }

            else if (pilihan == 6) {
               break;
            }

            System.out.print("Apakah Anda ingin kembali ke menu utama? (y/n) : ");
            yn = masukan.next();

            bersihkanLayar();
        }while (yn.equalsIgnoreCase("y"));

        System.out.print("\n================================\n");
        System.out.print("Terima kasih\n\n");
    }

    public static void bersihkanLayar(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void menuTabung(Scanner masukan){
        Tabung myTabung = new Tabung();
        
        Scanner masukTabung = new Scanner(System.in);
        double dataTabung;

        System.out.print("Masukkan jari-jari : ");
        dataTabung = masukTabung.nextDouble();
        myTabung.setJari(dataTabung);

        System.out.print("Masukkan tinggi : ");
        dataTabung = masukTabung.nextDouble();
        myTabung.setTinggi(dataTabung);

        System.out.println();

        myTabung.hitungLuasTabung();
        myTabung.tampilLuasTabung();

        System.out.println();

        myTabung.hitungVolumeTabung();
        myTabung.tampilVolumeTabung();

        System.out.println();

        int hitungGanjilLuas = 0; 
        System.out.println("Berikut adalah bilangan ganjil dari 0 sampai Luas Peremukaan Tabung : ");
        for(int i = 1; i < Math.round(myTabung.getLuas()); i += 2){
            System.out.print(i + ", ");
            hitungGanjilLuas++;
        }
        System.out.println();
        System.out.println("Jumlah Bilangan Ganjil adalah " + hitungGanjilLuas + "\n");

        int hitungGenapLuas = 0; 
        System.out.println("Berikut adalah bilangan Genap dari 0 sampai Luas Permukaan Tabung : ");
        for(int i = 0; i < Math.round(myTabung.getLuas()); i += 2){
            System.out.print(i + ", ");
            hitungGenapLuas++;
        }
        System.out.println();
        System.out.println("Jumlah Bilangan Genap adalah " + hitungGenapLuas + "\n");

        int hitungGanjilVol = 0; 
        System.out.println("Berikut adalah bilangan ganjil dari 0 sampai Volume Tabung : ");
        for(int i = 1; i < Math.round(myTabung.getVolume()); i += 2){
            System.out.print(i + ", ");
            hitungGanjilVol++;
        }
        System.out.println();
        System.out.println("Jumlah Bilangan Ganjil adalah " + hitungGanjilVol + "\n");

        int hitungGenapVol = 0; 
        System.out.println("Berikut adalah bilangan Genap dari 0 sampai Volume Tabung : ");
        for(int i = 0; i < Math.round(myTabung.getVolume()); i += 2){
            System.out.print(i + ", ");
            hitungGenapVol++;
        }
        System.out.println();
        System.out.println("Jumlah Bilangan Genap adalah " + hitungGenapVol + "\n");

        System.out.println();
    }

    public static void menuKubus(Scanner masukan){
        Kubus myKubus = new Kubus();
        
        myKubus.inputData();
        myKubus.hitungLuasKubus();
        myKubus.hitungVolumeKubus();
        myKubus.tampilLuasKubus();
        myKubus.tampilVolumeKubus();
    }

    public static void menuBola(Scanner masukan){
        Bola myBola = new Bola();
        
        myBola.inputData();
        myBola.hitungLuasBola();
        myBola.hitungVolumeBola();
        myBola.tampilLuasBola();
        myBola.tampilVolumeBola();
    }

    public static void menuBalok(Scanner masukan){
        Balok myBalok = new Balok();
        
        myBalok.inputData();
        myBalok.hitungLuasBalok();
        myBalok.hitungVolumeBalok();
        myBalok.tampilLuasBalok();
        myBalok.tampilVolumeBalok();
    }

    public static void menuKerucut(Scanner masukan){
        Kerucut myKerucut = new Kerucut();
        
        myKerucut.inputData();
        myKerucut.hitungLuasKerucut();
        myKerucut.hitungVolumeKerucut();
        myKerucut.tampilLuasKerucut();
        myKerucut.tampilVolumeKerucut();
    }
}