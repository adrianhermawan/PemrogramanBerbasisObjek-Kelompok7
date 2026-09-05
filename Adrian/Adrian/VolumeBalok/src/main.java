import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Panjang (cm): ");
        double x = sc.nextDouble();
        System.out.print("Lebar (cm): ");
        double y = sc.nextDouble();
        System.out.print("Tinggi (cm): ");
        double z = sc.nextDouble();
        
        Balok obj01 = new Balok(x,y,z);
        System.out.println("Volume: "+obj01.hitungVolume());
        
    }
}
