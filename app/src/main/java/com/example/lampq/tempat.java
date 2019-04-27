package com.example.lampq;

public class tempat {
    private String nama;
    private String alamat;
    private String jarak;

    public tempat(String nama, String alamat, String jarak) {
        this.nama = nama;
        this.alamat = alamat;
        this.jarak = jarak;

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJarak() {
        return jarak;
    }

    public void setJarak(String jarak) {
        this.jarak = jarak;
    }
}
