public class Lingkaran extends BangunDatar{
    private int r;

    public Lingkaran(String warna , int r){
        super(warna);
        this.r = r;
    }
    
    public void gambar(){
        System.out.println("Warna Bangun Datar adalah : " + warna);
    }
    public float luas() {
		System.out.println("Menghitung Luas Lingkaran");
		System.out.println("r = " + r);	
		System.out.println("Luas Lingkaran = " + (3.14 * r * r ) + " cm^2");
			return 1;
	}
}