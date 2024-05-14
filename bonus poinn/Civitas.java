public abstract class Civitas {
    private String nama;
    private int umur;
    private boolean jenisKelamin;
    
    public Civitas() {}

    public Civitas(String nama, int umur, boolean jenisKelamin) {
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public boolean isJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void makanDiKantin(String kantin) {
        System.out.println(nama + " makan di kantin " + kantin);
    }

    public void mainGameCorner() {
        System.out.println(nama + " bermain di Game Corner");
    }

    public abstract void naikLift();
}

