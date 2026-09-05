
import java.util.ArrayList;
import java.util.List;

public class Mahasiswa{
    private String Nama;
    private String nim;
    private List<MataKuliah> daftarMatkul;

    public Mahasiswa(String na, String ni){
        this.Nama = na;
        this.nim = ni;
        this.daftarMatkul = new ArrayList<>();
    }

    public String getnama(){
        return Nama;
    }

    public String getnim(){
        return nim;
    }

    public void tambahMatkul(MataKuliah mk){
        if(!daftarMatkul.contains(mk)){
            daftarMatkul.add(mk);
            mk.tambahMahasiswa(this);
        }
    }

    public void tampilkanMK(){
        int i=1;
        System.out.println("DAFTAR MATA KULIAH "+Nama+":");
        for(MataKuliah mk: daftarMatkul){
            System.out.println(i+". "+mk.getKode()+" - "+mk.getnamaMatkul());
            i=i+1;
        }
    }
}