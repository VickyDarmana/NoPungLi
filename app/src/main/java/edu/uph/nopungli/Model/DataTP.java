package edu.uph.nopungli.Model;
public class DataTP {
    // atribut
    private String NamaJuru;
    private String DaerahJuru;
    private int gambarJuru;

    public DataTP(String NamaJuru, String DaerahJuru, int gambarJuru) {
        this.NamaJuru = NamaJuru;
        this.DaerahJuru = DaerahJuru;
        this.gambarJuru = gambarJuru;
    }

    public String getNamaJuru() {
        return NamaJuru;
    }

    public void setNamaJuru(String namaJuru) {
        NamaJuru = namaJuru;
    }

    public String getDaerahJuru() {
        return DaerahJuru;
    }

    public void setDaerahJuru(String daerahJuru) {
        DaerahJuru = daerahJuru;
    }

    public int getGambarJuru() {
        return gambarJuru;
    }

    public void setGambarJuru(int gambarJuru) {
        this.gambarJuru = gambarJuru;
    }
}
