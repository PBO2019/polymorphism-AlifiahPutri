public class Staff extends Pegawai {
    public Staff(){
        this.Tarif = 50000;
    }
    public void data(String id, String nama){
        System.out.println("Pegawai dengan nomor id " + id + " bernama " + nama);
    }
}
