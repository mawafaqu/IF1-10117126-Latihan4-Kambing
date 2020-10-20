
/*
 * 
 * @author
 * NAMA : MAWA FAQU ROCHMAN
 * KELAS : PBO1
 * NIM : 10117126
 * Deskripsi Program : 
 */
package if1.pkg10117126.latihan4.kambing;

/**
 *
 * @author MAWA
 */
public class Kambing {

    public void tambahKambing() {
        // Deklarasi variabel lokal
        int jumlahKambing = 0;

        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah: " + jumlahKambing);
    }

    public static void main(String[] args) {
        Kambing kambingJantan = new Kambing();
        kambingJantan.tambahKambing();
    }

}
