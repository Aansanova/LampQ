package com.example.lampq;

public class Tempat {

    private String nama;
    private String alamat;
    private String jarak;
    private int thumbnail;


    public Tempat(String nama, String alamat, String jarak, int thumbnail) {
        this.nama = nama;
        this.alamat = alamat;
        this.jarak = jarak;
        this.thumbnail = thumbnail;

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

    public int getThumbnail(){
        return thumbnail;
    }

    public void setThumbnail(int thumbnail){
        this.thumbnail = thumbnail;
    }

}