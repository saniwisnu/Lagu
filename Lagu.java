package com.company;

/**
 * Created by VAIO on 6/10/2015.
 */
public class Lagu {
        private String Judullagu;
        private String Genre;
        private double Durasi;
        private pencipta Pencipta;

    public Lagu(String judullagu, String genre, double durasi, pencipta pencipta) {
        Judullagu = judullagu;
        Genre = genre;
        Durasi = durasi;
        Pencipta = pencipta;
    }

    public Lagu(String callinghours, String hardcore, String s) {
    }

    public String getJudullagu() {
        return Judullagu;
    }

    public void setJudullagu(String judullagu) {
        Judullagu = judullagu;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public double getDurasi() {
        return Durasi;
    }

    public void setDurasi(double durasi) {
        Durasi = durasi;
    }

    public pencipta getPencipta() {
        return Pencipta;
    }

    public void setPencipta(pencipta pencipta) {
        Pencipta = pencipta;
    }

    @Override
    public String toString() {
        return "Lagu{" +
                "Judullagu='" + Judullagu + '\'' +
                ", Genre='" + Genre + '\'' +
                ", Durasi=" + Durasi +
                ", Pencipta=" + Pencipta +
                '}';
    }
}
