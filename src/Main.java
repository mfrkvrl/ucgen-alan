import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double kenar1,kenar2,hipotenus,alan,u;
        System.out.println("İlk kenarın uzunluğunu girin");
        kenar1=scanner.nextDouble();
        System.out.println("İkinci kenarın uzunluğunu girin");
        kenar2=scanner.nextFloat();
        hipotenus=Math.sqrt(kenar1*kenar1+kenar2*kenar2);
        System.out.println("hipotenüs uzunluğu " + hipotenus);
        u=(kenar1+kenar2+hipotenus)/2;
        alan=Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-hipotenus));
        System.out.println("Üçgen alanı " +alan);
    }
}
