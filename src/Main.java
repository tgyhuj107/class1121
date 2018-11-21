import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
//        int a=scn.nextInt(),b=scn.nextInt();
//        int n=a,m=b;
//        if (m>n){
//            int x=n;
//            n=m;
//            m=x;
//        }
//        while (m>0){
//           int k=m;
//            m=n%m;
//            n=k;
//        }
//        System.out.println(n);
//        System.out.println((a*b)/n);

//        float max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
//        for (int i=1;i<=10;i++){
//            float n=scn.nextFloat();
//            max=Math.max(max,n);
//            min=Math.min(min,n);
//        }
//        System.out.printf("%.2f",max);
//        System.out.println();
//        System.out.printf("%.2f",min);
//        System.out.println();

        int n=scn.nextInt(),i=0,sum=0;
        while (sum<n){
            sum=sum+i;
            i++;
        }
        System.out.println(i);


    }
}
