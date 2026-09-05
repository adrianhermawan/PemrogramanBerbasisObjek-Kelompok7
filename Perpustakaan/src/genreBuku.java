import java.util.ArrayList;
import java.util.List;

public class genreBuku {
    private String kodeGenre;
    private String namaGenre;
    private List<Buku> daftarBukuGenre;

    public genreBuku(String kodeGenre, String namaGenre){
        this.kodeGenre = kodeGenre;
        this.namaGenre = namaGenre;
        this.daftarBukuGenre = new ArrayList<>();
    }

    public String getkodeGenre(){
        return kodeGenre;
    }

    public String getnamaGenre(){
        return namaGenre;
    }

    public void tambahGenreBuku(Buku Judul){
        if(!daftarBukuGenre.contains(Judul)){
            daftarBukuGenre.add(Judul);
        }
    }
    
    public void tampilkanBuku(){
        int i = 1;

        System.out.println("Daftar Buku Bergenre "+namaGenre+":");
        for (Buku Judul : daftarBukuGenre){
            System.out.println(i+". "+Judul.getkodeBuku() + " - " + Judul.getJudul());
            i = i+1;
        }


    }
}
