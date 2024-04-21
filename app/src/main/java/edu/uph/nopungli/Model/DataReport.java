package edu.uph.nopungli.Model;

import io.realm.RealmObject;

public class DataReport extends RealmObject {
    private String Nama;
    private String NoTelp;
    private String Kota;
    private String Kecamatan;
    private String Keluhan;

    public DataReport() {
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getNoTelp() {
        return NoTelp;
    }

    public void setNoTelp(String noTelp) {
        NoTelp = noTelp;
    }

    public String getKota() {
        return Kota;
    }

    public void setKota(String kota) {
        Kota = kota;
    }

    public String getKecamatan() {
        return Kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        Kecamatan = kecamatan;
    }

    public String getKeluhan() {
        return Keluhan;
    }

    public void setKeluhan(String keluhan) {
        Keluhan = keluhan;
    }
}
