package e31192047_queue;

/**
 *
 * @author Sidhat
 */
public class Queue {

    //deklarasi variabel
    //head = data paling awal
    //tail = data paling akhir
    int data[];
    int head = 0;
    int tail = -1;

    //constructor digunakan untuk set nilai awal kelas Queue
    public Queue(int size) {
        data = new int[size];
    }
    
    //untuk mengecek apakah data kosong atau tidak
    //data masih ada jika dalam kondisi "tail == -1"
    public boolean isEmpty() {
        if (tail == -1) {
            return true;
        } else {
            return false;
        }
    }
    
    //untuk mengecek apakah data penuh atau tidak
    public boolean isFull() {
        if (tail == data.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    //method untuk menambahkan data baru
    public void Enqueue(int dataBaru) {
        //jika ruang masih kosong, maka data baru yang ditambahkan akan menjadi head sekaligus tail
        if (isEmpty()) {
            tail = head;
            data[tail] = dataBaru;
            System.out.println();
        //jika ruang masih ada(belum penuh), maka data baru yang ditambahkan akan berada pada urutan akhir
        } else if (!isFull()) {
            tail++;
            data[tail] = dataBaru;
            System.out.println();
        //jika ruang sudah penuh, maka akan tampil pesan "antrian sudah penuh"
        } else if (isFull()) {
            System.out.println("antrian sudah penuh");
        }
    }

    //method untuk mengeluarkan data yang dimulai dari data paling awal
    //diperlukan temp untuk penyimpanan data sementara pada saat proses penghapusan data
    public int Dequeue() {
        int temp = data[head]; //data awal disimpan dalam temp
        for (int i = head; i <= tail - 1; i++) {
            data[i] = data[i + 1];
            System.out.println();
        }
        tail--; //jumlah data menurun
        return temp; //untuk mengembalikan nilai temp
    }

    //method untuk menampilkan isi data
    public void tampilkan() {
        if (!isEmpty()) {
            int index = head;
            while (index <= tail) {
                System.out.println(data[index]);
                index++;
            }
        } else {
            System.out.println("Kosong");
        }
        System.out.println("\n"); //memberi jarak 1 spasi
    }
}