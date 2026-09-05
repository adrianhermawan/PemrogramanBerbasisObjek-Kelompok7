
import java.util.ArrayList;
import java.util.List;

public class MataKuliah {
    private String namaMatkul;
    private String kode;
    private List<Mahasiswa> daftarMahasiswa;

    public MataKuliah(String nm, String ko){
        this.namaMatkul = nm;
        this.kode = ko;
        this.daftarMahasiswa = new ArrayList<>();
    }

    public String getnamaMatkul(){
        return namaMatkul;
    }

    public String getKode(){
        return kode;
    }

    public void tambahMahasiswa(Mahasiswa mhs){
        if(!daftarMahasiswa.contains(mhs)){
            daftarMahasiswa.add(mhs);
            mhs.tambahMatkul(this);
        }
    }

    public void tampilkanMHS(){
        int i=1;
        System.out.println("DAFTAR PESERTA MATA KULIAH "+namaMatkul+":");
        for(Mahasiswa mhs: daftarMahasiswa){
            System.out.println(i+". "+mhs.getnama()+" - "+mhs.getnim());
            i=i+1;
        }
    }
    
}
