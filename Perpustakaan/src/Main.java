public class Main {
    // Kelompok 4 - PBO
    // Adrian Hermawan - J0403251044
    // Diaz Ramaananta Harahap - J0403251048
    // Firly Ramadhani Tubagus - J0403251115
    // Mohammad Azmi Zaelani - J0403251020
    // Midori Harahap - J0403251018
    
    public static void main(String[] args) {
        

        //add genre
        genreBuku novel = new genreBuku("G01", "Novel");
        genreBuku pendidikan = new genreBuku("G02", "Pendidikan");


        //add buku
        Buku buku1 = new Buku("B01", "Laskar Pelangi", novel);
        Buku buku2 = new Buku("B02", "Bumi", novel);
        Buku buku3 = new Buku("B03", "Matematika", pendidikan);

        //add member
        Member member1 = new Member("M01", "Asep");
        Member member2 = new Member("M02", "Budi");


        //member pinjam buku
        member1.tambahBuku(buku1);
        System.out.println("");
        member1.tambahBuku(buku2);
        System.out.println("");
        member2.tambahBuku(buku3);
        System.out.println("");

        //tampilkan buku yang dipinjam member
        member1.tampilkanBuku();
        System.out.println("");
        member2.tampilkanBuku();
        System.out.println("");

        //tampilkan member yang meminjam buku
        buku1.tampilkanMember();
        System.out.println("");
        buku2.tampilkanMember();
        System.out.println("");
        buku3.tampilkanMember();


        //daftar buku sesuai gender
        System.out.println("");
        novel.tampilkanBuku();
        System.out.println("");
        pendidikan.tampilkanBuku();
        

    }
}
