import java.util.Scanner;

public class furkenkss {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("n1 sayısı");
        int n1= input.nextInt();
        System.out.println("n2 sayısı");
        int n2= input.nextInt();
        int ebob=1,i=1;

        while (i<=n1){
            if (n1%i==0 && n2%i==0){
                ebob=i;
            }

            i++;
        }

        while (i<=(n1*n2)){
            if (i%n1==0&&i%n2==0){
                break;
            }

            i++;
        }


        System.out.println((n1*n2)/ebob);
    }
}
