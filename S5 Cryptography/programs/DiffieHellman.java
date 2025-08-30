import java.util.Scanner;
import java.lang.Math;
public class DiffieHellman{
    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in); int P,G,a,b,ka,kb;
        double x,y;
        System.out.println("Enter a Prime: "); P=sc.nextInt();
        System.out.println("Enter a primitive root of " + P +": "); G=sc.nextInt();
        System.out.println("Enter the private key of alice: "); a=sc.nextInt();
        System.out.println("Enter the private key of bob: "); b=sc.nextInt();
        x=(Math.pow(G,a))%P;
        y=(Math.pow(G,b))%P;
        System.out.println("Pub key of alice: "+x);
        System.out.println("Pub key of bob: "+y);
        ka=(int)(Math.pow(y,a))%P;
        kb=(int)(Math.pow(x,b))%P;
        System.out.println("Private shared key: "+ka); System.out.println("Private shared key: "+kb);
    }
}