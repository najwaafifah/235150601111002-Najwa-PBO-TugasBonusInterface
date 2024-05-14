public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("Budi", 20, true, "123456", 3.8, 2);
        Dosen dosen = new Dosen("Dr. Siti", 40, false, "654321", 15000000);
        Asprak asprak = new Asprak("Andi", 21, true, "234567", 3.9, 1);
        Resepsionis resepsionis = new Resepsionis("Ani", 25, false, 101, "Supervisor", 5000000);

        Civitas civitasMahasiswa = mahasiswa;
        Civitas civitasDosen = dosen;
        Civitas civitasAsprak = asprak;
        Civitas civitasResepsionis = resepsionis;

        mahasiswa.ngerjainTugas();
        mahasiswa.naikLift();
        mahasiswa.masukKelas();

        dosen.mengajar("Matematika");
        dosen.mengasihTugas();
        dosen.menilaiTugas();
        dosen.naikLift();

        asprak.ngasihKomenDiGCR();
        asprak.mengajar("Pemrograman");
        asprak.naikLift();

        resepsionis.melayani();
        resepsionis.melapor();
        resepsionis.naikLift();

        civitasMahasiswa.makanDiKantin("A");
        civitasDosen.makanDiKantin("B");
        civitasAsprak.mainGameCorner();
        civitasResepsionis.mainGameCorner();
    }
}

