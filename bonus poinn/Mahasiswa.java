public class Mahasiswa extends Civitas implements PesertaKelas {
    private String nim;
    private double ipk;
    private int golUkt;
    
    public Mahasiswa() {}

    public Mahasiswa(String nama, int umur, boolean jenisKelamin, String nim, double ipk, int golUkt) {
        super(nama, umur, jenisKelamin);
        this.nim = nim;
        this.ipk = ipk;
        this.golUkt = golUkt;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public int getGolUkt() {
        return golUkt;
    }

    public void setGolUkt(int golUkt) {
        this.golUkt = golUkt;
    }

    public void ngerjainTugas() {
        System.out.println(getNama() + " sedang mengerjakan tugas");
    }

    public void pasrah() {
        System.out.println(getNama() + " sedang pasrah");
    }

    public void mengikutiOrganisasi() {
        System.out.println(getNama() + " mengikuti organisasi");
    }

    public void presentasi() {
        System.out.println(getNama() + " melakukan presentasi");
    }

    @Override
    public void naikLift() {
        System.out.println(getNama() + " naik lift");
    }

    @Override
    public void masukKelas() {
        System.out.println(getNama() + " masuk kelas");
    }
}

