public class Dosen extends Civitas implements PesertaKelas, Pengajar {
    private String nip;
    private double gaji;

    public Dosen(String nama, int umur, boolean jenisKelamin, String nip, double gaji) {
        super(nama, umur, jenisKelamin);
        this.nip = nip;
        this.gaji = gaji;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    @Override
    public void naikLift() {
        System.out.println(getNama() + " naik lift");
    }

    @Override
    public void masukKelas() {
        System.out.println(getNama() + " masuk kelas");
    }

    @Override
    public void mengajar(String matkul) {
        System.out.println(getNama() + " mengajar mata kuliah " + matkul);
    }

    @Override
    public void mengasihTugas() {
        System.out.println(getNama() + " memberi tugas");
    }

    @Override
    public void menilaiTugas() {
        System.out.println(getNama() + " menilai tugas");
    }
}


