public class Supervisor extends Pegawai {
    public Supervisor(){
        this.Tarif = 100000;
    }
    public void data(String id, String nama){
        System.out.println("Pegawai dengan nomor id " + id + " bernama " + nama);
    }
}
