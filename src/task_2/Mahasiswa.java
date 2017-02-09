/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_2;

/**
 * Nama : Kukuh Sanddi Razaq
 * Nim  : 1301154264
 * Kelas : IF 39-12
 * @author Kukuh Sanddi
 */
public class Mahasiswa {
    private String nim;
    private String nama;
    private String status;
    private char[]nilai;
    private int i = 0;

    public Mahasiswa(){
        this.status = "Tidak Lulus";
        this.i = 0;
        nilai = new char[10];
    }
    
    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.status = "Tidak Lulus";
        this.i = 0;
        nilai = new char[10];
    }
    
    public void addNilai (char nilai){
        if(i<10){
            this.nilai[i] = nilai;
        }
        i++;
    }
    
    public String toString(){
        String x = null;
        int y = 0;
        x = "NIM = "+nim+"\nNama = "+nama+"\nStatus = "+status+"\nNilai = ";
            while (y<i){
                x = x + nilai[y] + ", ";
                y++;
            }
        return x;
    }
    
    
    
    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public char getNilai(int i) {
        return nilai[i];
    }

    public void setNilai(char[] nilai) {
        this.nilai = nilai;
    }
 public char cekNilai(Mahasiswa m) {
        int a = 0;
        int b = 0;
        char x = 'X';
         while (a < i){
             while (b != i){
                 if(m.nilai[a]== nilai[b]){
                     if (m.nilai[a] != x){
                         x = m.nilai[a];
                     }
                 }
                 b++;
             }
             b=0;
             a++;
         }
         return x;
    }   
}
