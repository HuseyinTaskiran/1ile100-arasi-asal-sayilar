import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n,t;
        boolean sonuc=true;

        for (n=2;n<=100;n++){
            sonuc=true;
            for (t=2;t<=100;t++){
                if (n!=t){
                if (n%t==0){
                    sonuc=false;
                }}

            }

            if (sonuc){
                System.out.print(n+" ");
            }
        }
        }


    }








