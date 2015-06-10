package com.company;

/**
 * Created by VAIO on 6/10/2015.
 */
public class pencipta {
    private String namaband;
    private String alamatband;

    public pencipta(String namaband, String alamatband) {
        this.namaband = namaband;
        this.alamatband = alamatband;
    }

    public String getNamaband() {
        return namaband;
    }

    public void setNamaband(String namaband) {
        this.namaband = namaband;
    }

    public String getAlamatband() {
        return alamatband;
    }

    public void setAlamatband(String alamatband) {
        this.alamatband = alamatband;
    }
    public String toString() {
        return "pencipta{" +
                "namaband='" + namaband + '\'' +
                ", alamatband='" + alamatband + '\'' +
                '}';
    }
}
