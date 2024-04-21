package edu.uph.nopungli.Model;

import io.realm.RealmObject;

public class DataTP extends RealmObject {
    private String NamaJuru;
    private String DaerahJuru;
    private int gambarJuru;
    private String DesJuru;

    public DataTP() {
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

    public String getDesJuru() {
        return DesJuru;
    }

    public void setDesJuru(String desJuru) {
        DesJuru = desJuru;
    }
}
