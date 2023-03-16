import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x,y;
        int dem=0;
        int shc=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap x");
        x= scanner.nextInt();
        System.out.println("nhap y");
        y= scanner.nextInt();
        for (int i=6;i<=y;i++){
            for (int j=1;j<i;j++){
                if (i%j==0){
                    shc=shc+j;
                }
            }
            if (shc==i){
                dem++;
                shc=0;
            }
            else {
                shc=0;
            }
        }
        System.out.println("co "+dem+"so hoan chinh");
        System.exit(0);
    }
}