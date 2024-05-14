public class Main {
    public static void main(String[] args) {
        // Membuat objek Asprak
        Asprak asprak = new Asprak();
        asprak.mengajar("Pemrograman Java");
        asprak.mengasihTugas();
        asprak.menilaiTugas();
        asprak.ngasihKomenDiGCR();

        // Membuat objek Civitas
        Civitas civitas = new Civitas();
        civitas.masukKelas();
        civitas.makanDiKantin("Kantin Z");
        civitas.naikLift();
        
        // Set nama dan umur civitas
        civitas.setNama("Agus Wahyudi");
        civitas.setUmur(30);
        System.out.println("Nama Civitas: " + civitas.getNama());
        System.out.println("Umur Civitas: " + civitas.getUmur());

        // Membuat objek Dosen
        Dosen dosen = new Dosen();
        dosen.mengajar("Struktur Data");
        dosen.mengasihTugas();
        dosen.menilaiTugas();
        dosen.melakukanPenelitian();

        // Membuat objek Mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.masukKelas();
        mahasiswa.belajar();
        System.out.println("Nama Mahasiswa: " + mahasiswa.getNama());
        System.out.println("Umur Mahasiswa: " + mahasiswa.getUmur());

        // Membuat objek Resepsionis
        Resepsionis resepsionis = new Resepsionis();
        resepsionis.melayani();
        resepsionis.melapor();
    }
}
