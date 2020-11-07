package if1.pkg10119032.latihan31.objectorientedperkenalanmahasiswa;

/**
 *
 * @author Ginanjar Tubagus Gumilar
 * Nama     : Ginanjar Tubagus Gumilar
 * Kelas    : IF 1
 * NIM      : 10119032
 * Deskripsi Program : Berisi program untuk menampilkan
 * NIM dan nama seorang Mahasiswa ke layar
 */
public class IF110119032Latihan31ObjectOrientedPerkenalanMahasiswa {

    static class Mahasiswa{
        public String nim;
        public String nama;
        
        public void perkenalkanDiri(){
            System.out.println("Hallo Everyone\n"
                    + "My NIM is " + nim
                    + "\nMy Name is " + nama + "\n");
        }
    }
    
    public static void main(String[] args) {
        //membuat objek m dari kelas Mahasiswa
        Mahasiswa m = new Mahasiswa();
        
        //nim dan nama dari mahasiswa 1
        m.nim = "10110269";
        m.nama = "Rizki Adam Kurniawan";
        m.perkenalkanDiri();
        
        //nim dan nama dari mahasiswa 2
        m.nim = "10110270";
        m.nama = "Indra Tiola";
        m.perkenalkanDiri();        
        
        //nim dan nama dari mahasiswa 3
        m.nim = "10110271";
        m.nama = "Tanzil Ganefi";
        m.perkenalkanDiri();         
        
        //nim dan nama dari mahasiswa 4
        m.nim = "10110269";
        m.nama = "Muhammad Nur Awaludin";
        m.perkenalkanDiri(); 
    }
    
}
