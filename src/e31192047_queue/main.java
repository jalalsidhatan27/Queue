package e31192047_queue;

import java.util.Scanner;

/**
 *
 * @author Sidhat
 */

public class main {

    public static void main(String[] args) {
        //deklarasi variabel pilihan dan data tipe integer
        int pilihan;
        int data;
        Queue q = new Queue(3); //untuk memanggil kelas Queue dengan deklarasi max data = 3

        do {
            //mencetak daftar pilihan
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Lihat Isi Data");
            System.out.println("4. KELUAR");
            Scanner input = new Scanner(System.in); //deklarasi scanner
            pilihan = input.nextInt(); //untuk memasukkan pilihan dari keyboard

            //pilihan pertama dengan memanggil method Enqueue
            if (pilihan == 1) {
                System.out.print("Data yang ditambahkan : ");
                data = input.nextInt();
                q.Enqueue(data);
                //pilihan kedua dengan memanggil method Dequeue
            } else if (pilihan == 2) {
                System.out.println("data awal berhasil di Dequeue");
                q.Dequeue();
                //pilihan ketiga dengan memanggil method tampilkan
            } else if (pilihan == 3) {
                System.out.println("Isi Queue : ");
                q.tampilkan();
                //pilihan keempat untuk keluar/berhenti
            } else if (pilihan == 4) {
                System.exit(0);
                //manampilkan output "pilihan  yang anda masukkan tidak ada" jika menginput pilihan selain 1,2 3,4
            } else {
                System.out.println("pilihan  yang anda masukkan tidak ada");
            }
        } while (pilihan != 4);
        //selama pilihan tidak sama dengan 4 maka program akan diulang
        //jika memilih 4 program akan berhenti
    }
}

//Kesimpulan : 
//queue merupakan suatu prinsip semacam antrian yang menerapkan FIFO(First In First Out) yang berarti masuk paling awal dan keluar paling awal juga
//queue mempunyai 2 istilah yaitu enqueue untuk menambahkan data serta dequeue untuk mengeluarkan data dari antrian  
