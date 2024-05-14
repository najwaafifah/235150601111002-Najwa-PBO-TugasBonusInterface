public class Civitas implements PesertaKelas {
    private String nama;
    private int umur;
    private boolean jenisKelamin;

    @Override
    public void masukKelas() {
        // implementation
    }

    public void makanDiKantin(String kantin) {
        // implementation
    }

    public void naikLift() {
        // implementation
    }

    @Override
    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public int getUmur() {
        return this.umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}
