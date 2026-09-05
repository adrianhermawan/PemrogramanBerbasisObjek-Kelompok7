public class Main {
    public static void main(String[] args) {
        
        Mahasiswa m1 = new Mahasiswa("Adrian", "J040004");
        Mahasiswa m2 = new Mahasiswa("Ibrahim", "J04001");
        Mahasiswa m3 = new Mahasiswa("Yusuf", "J04002");
    
        MataKuliah mk1 = new MataKuliah("PBO", "TPL2021");
        MataKuliah mk2 = new MataKuliah("Basdat", "TPL2022");
        MataKuliah mk3 = new MataKuliah("MTK", "TPL2023");

        m1.tambahMatkul(mk3);
        m1.tambahMatkul(mk2);
        m1.tambahMatkul(mk1);
        System.out.println();
        m1.tampilkanMK();

        System.out.println();
        mk1.tampilkanMHS();

        mk1.tambahMahasiswa(m2);
        mk3.tambahMahasiswa(m3);
        
        System.out.println();
        mk1.tampilkanMHS();
    }
}
