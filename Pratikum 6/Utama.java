public class Utama{
    public static void main (String[] args){
    BangunDatar lingkaran = new Lingkaran("Hijau", 5);
    BangunDatar segitiga = new Segitiga("Biru", 10, 5);
    BangunDatar persegi = new Persegi("Merah", 10, 5);
        
    lingkaran.gambar();
    lingkaran.luas();
    System.out.println();
    segitiga.gambar();
    segitiga.luas();
    System.out.println();
    persegi.gambar();
    persegi.luas();
    
    }
}