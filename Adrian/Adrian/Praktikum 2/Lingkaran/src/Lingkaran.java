public class Lingkaran {
    //Atribut
    private double jarijari;
    


    //method
    public Lingkaran(double r){
        this.jarijari = r;
    }
    
    public double keliling(){
        return 2 * Math.PI * jarijari;
    }

    public double luas(){
        return Math.PI * jarijari * jarijari;
    }
}
