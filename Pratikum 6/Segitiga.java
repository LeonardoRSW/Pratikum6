public class Segitiga extends BangunDatar {
    private int alas;
    private int tinggi;

    public Segitiga(String warna, int alas , int tinggi){
        super(warna);
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public void gambar(){
        System.out.println("Warna Bangun Datar adalah " + warna);
    }

    public float luas(){
        System.out.println("Menghitung Luas Segitiga");
		System.out.println("Alas = " + alas);
        System.out.println("Tinggi = " + tinggi);	
		System.out.println("Luas Segitiga = " + (0.5 * alas * tinggi ) + " cm");
			return 1;
	}
    }

