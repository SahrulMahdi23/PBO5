import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input Nama Mahasiswa 
        System.out.print("Masukkan Nama Mahasiswa: ");
        String namaMhs = input.nextLine();
        Mahasiswa mahasiswa = new Mahasiswa(namaMhs);

        // Dosen dan Mata Kuliah sudah di tetapkan
        Dosen dosen = new Dosen();
        MataKuliah mk = new MataKuliah();

        // Output
        System.out.println("\n=== Data Lengkap ===");
        System.out.println("Mahasiswa: " + mahasiswa.getNama() + " | NIM: " + mahasiswa.getNim() + " | Jurusan: " + mahasiswa.getJurusan());
        System.out.println("Dosen: " + dosen.getNama() + " | NIP: " + dosen.getNip() + " | Fakultas: " + dosen.getFakultas());
        System.out.println("Mata Kuliah: " + mk.getNama() + " (" + mk.getKode() + ") - " + mk.getSks() + " SKS");

        input.close();
    }
}
