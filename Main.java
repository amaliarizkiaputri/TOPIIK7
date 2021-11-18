public class Main {

        public static void main(String[] args) {

            Karyawan karyawan1 = new Tetap("AMALIA", 2100000, 5500000);
            Karyawan karyawan2 = new Tetap("RIZKIA", 1700000, 6700000);

            Karyawan karyawan3 = new Kontrak("HAIKAL", 3, 2000000);
            Karyawan karyawan4 = new Kontrak("GEDE", 2, 1500000);

            Departemen departemen = new Departemen("GEDE");

            departemen.addKaryawan(karyawan1);
            departemen.addKaryawan(karyawan2);
            departemen.addKaryawan(karyawan3);
            departemen.addKaryawan(karyawan4);

            System.out.println("\n Data Semua Kayawan ===");
            departemen.displayAll();
            System.out.println("\n Data Karyawan Tetap ===");
            departemen.displayTetap();
            System.out.println("\n Data Karyawan Kontrak ===");
            departemen.displayKontrak();
        }
    }

