public class tabungan {
    private static String nama;
    private int jumlah;
    private int saldo;
    
    public tabungan(String namaNasabah, int jumlah){
        nama = namaNasabah;
        nama ="Rifki Ramadani";
        saldo = 500000;
    
    }
    
    public void nabung(int sal){
        saldo = saldo + sal;
    }
    
    public void ambilUang(int jumlahTarikan){
        saldo = saldo - jumlahTarikan;
    }
    
    public int ambilSaldo(){
        return saldo;
    }
    
    public void setSaldo(int sal){
        saldo = sal;
    }
    
    
    
    public static void main(String[] args) {
        
        int jumlahSimpanan = 500000;
        int jumlahTarikan = 1500000;
        
        tabungan bls = new tabungan("Rifki Ramadani",100505);
    
        System.out.println("Nama Nasabah                : " + nama);
        System.out.println("Saldo awal                  : " + "Rp." + bls.ambilSaldo());
        System.out.println("\nJumlah penyetoran         : " + "Rp." + jumlahSimpanan);
        bls.nabung(jumlahSimpanan);
        System.out.println("Saldo setelah penyetoran    : " + "Rp." + bls.ambilSaldo());
        System.out.println("\nJumlah Penarikan          : " + "Rp." + jumlahTarikan);
        bls.ambilUang(jumlahTarikan);
        System.out.println("Saldo setelah penarikan     : " + "Rp." + bls.ambilSaldo());
    
        }
    
    }