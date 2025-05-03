public class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;

    public Mahasiswa(String nama) {
        this.nama = "Sahrul Mahdi M";
        this.nim = "20230040137";
        this.jurusan = "Teknik Informatika";
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
