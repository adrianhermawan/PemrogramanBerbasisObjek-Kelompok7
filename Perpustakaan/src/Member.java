import java.util.ArrayList;
import java.util.List;

public class Member {
    private String idMember;
    private String Nama;
    private List<Buku> daftarBuku;

    public Member(String id, String nm){
        this.idMember = id;
        this.Nama = nm;
        this.daftarBuku = new ArrayList<>();
    }

    public String getNama(){
        return Nama;
    }

    public String getID(){
        return idMember;
    }

    public void tambahBuku(Buku Judul){
        if(!daftarBuku.contains(Judul)){
            daftarBuku.add(Judul);
            Judul.tambahMember(this);
        }
    }

    public void tampilkanBuku(){
        int i = 1;

        System.out.println("Daftar Buku yang Dipinjam "+Nama+":");
        for (Buku Judul : daftarBuku){
            System.out.println(i+". "+Judul.getkodeBuku() + " - " + Judul.getJudul());
            i = i+1;
        }


    }
}