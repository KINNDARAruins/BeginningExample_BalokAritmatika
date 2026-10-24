public class Balok {
    public double panjang;
    protected double lebar;
    double tinggi;
    public static double jumVolumeTotalBalok;
    public static int jumBalok;

    public static double Volume, luasPermukaan, diagonalRuang,digSisiDepan, digSisiSamping,digSisiAtas;

    
    public double hitungVolume(){
        Volume = panjang * lebar * tinggi;
        return Volume;
    }

    public double hitungLuasPermukaan(){
        luasPermukaan = 2 * (panjang * lebar + panjang * tinggi + tinggi * lebar);
        return luasPermukaan;
    }

    public double hitungDiagonalRuang(){
        diagonalRuang = Math.sqrt(Math.pow(hitungDiagonalSisiDepan(), 2) + Math.pow(lebar, 2));
        return diagonalRuang;
    }

    double hitungDiagonalSisiDepan(){
        digSisiDepan = Math.sqrt((Math.pow(panjang, 2)) + (Math.pow(tinggi, 2)));
        return digSisiDepan;
    }

    protected double hitungDiagonalSisiSamping(){
        digSisiSamping = Math.sqrt((Math.pow(lebar, 2)) + (Math.pow(tinggi, 2)));
        return digSisiSamping;
    }

    private double hitungDiagonalSisiAtas(){
        digSisiAtas = Math.sqrt((Math.pow(panjang, 2)) + (Math.pow(lebar, 2)));
        return digSisiAtas;
    }

    public static double jumTotalVolume(){
        jumVolumeTotalBalok = jumVolumeTotalBalok + Volume;
        return jumVolumeTotalBalok;
    }

    public static void tamJumlahBalok(){
        jumBalok ++;
    }

    public void tampilData(){
        System.out.println("Panjang               : "+panjang);
        System.out.println("Lebar                 : "+lebar);
        System.out.println("Tinggi                : "+tinggi);
    }

    public static void main(String[] args) {
        Balok b1 = new Balok();
        b1.panjang = 4;
        b1.lebar = 2;
        b1.tinggi = 3;

        b1.hitungVolume();
        b1.hitungLuasPermukaan();
        b1.hitungDiagonalSisiDepan();
        b1.hitungDiagonalRuang();
        b1.hitungDiagonalSisiSamping();
        b1.hitungDiagonalSisiAtas();
        Balok.jumTotalVolume();
        Balok.tamJumlahBalok();

        b1.tampilData();
        System.out.println("Volume                : "+b1.hitungVolume());
        System.out.println("Luas Permukaan        : "+b1.hitungLuasPermukaan());
        System.out.println("Diagonal Ruang        : "+b1.hitungDiagonalRuang());
        System.out.println("Diagonal Sisi Depan   : "+b1.hitungDiagonalSisiDepan());
        System.out.println("Diagonal Sisi Samping : "+b1.hitungDiagonalSisiSamping());
        System.out.println("Diagonal Sisi Atas    : "+b1.hitungDiagonalSisiAtas());

        Balok b2 = new Balok();
        b2.panjang = 5;
        b2.lebar = 3;
        b2.tinggi = 4;

        b2.hitungVolume();
        b2.hitungLuasPermukaan();
        b2.hitungDiagonalSisiDepan();
        b2.hitungDiagonalRuang();
        b2.hitungDiagonalSisiSamping();
        b2.hitungDiagonalSisiAtas();
        Balok.tamJumlahBalok();

        b2.tampilData();
        System.out.println("Volume                : "+b2.hitungVolume());
        System.out.println("Luas Permukaan        : "+b2.hitungLuasPermukaan());
        System.out.println("Diagonal Ruang        : "+b2.hitungDiagonalRuang());
        System.out.println("Diagonal Sisi Depan   : "+b2.hitungDiagonalSisiDepan());
        System.out.println("Diagonal Sisi Samping : "+b2.hitungDiagonalSisiSamping());
        System.out.println("Diagonal Sisi Atas    : "+b2.hitungDiagonalSisiAtas());
        System.out.println("JUMLAH SEMUA VOLUME BALOK    : "+Balok.jumTotalVolume());
        System.out.println("JUMLAH BALOK YANG DIBUAT     : "+Balok.jumBalok);
    }
}