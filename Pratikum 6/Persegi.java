public class Persegi extends BangunDatar{
    private float panjang;
    private float lebar;

    public Persegi(String warna, float panjang , float lebar){
        super(warna);
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public void gambar(){
        System.out.println("Warna Bangun Datar adalah : " + warna);
    }

    public float luas(){
        System.out.println("Menghitung Luas Persegi");
		System.out.println("panjang = " + panjang);
        System.out.println("Lebar = " + lebar);	
		System.out.println("Luas Persegi = " + (panjang * lebar ) + " cm");
			return 1;
    }
}