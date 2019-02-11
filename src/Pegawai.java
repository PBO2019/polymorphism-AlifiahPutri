public class Pegawai {
    protected int Tarif = 50000;

    public static void main(String[] args) {

        Supervisor supervisor = new Supervisor();
        Staff staff = new Staff();
        Gaji gaji = new Gaji();

        supervisor.data("SPR123", "Alifiah");
        gaji.hitungGaji(supervisor.Tarif);
        staff.data("STF123","Putri");
        gaji.hitungGaji(staff.Tarif);
    }
}
