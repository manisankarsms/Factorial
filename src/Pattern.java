import java.util.Scanner;

public class Pattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        for(int i = 1,z=i;i <= 2*n-1; i++) {
            for (int j = 1,k=1,l=1,m=1; j <= 2*n-1; j++,k++) {
                if(i==1 || i==2*n-1 || j==1 || j==2*n-1)
                    System.out.print("\t"+n);
                else if (i==j && j!=((2*n-1)+1)/2 && i<=((2*n-1)+1)/2 && j<=((2*n-1)+1)/2)
                    System.out.print("\t"+(n-j+1));
                else if (i==j && j!=((2*n-1)+1)/2 && i>=((2*n-1)+1)/2 && j>=((2*n-1)+1)/2)
                    System.out.print("\t"+(j-n+1));
                else if(i<j && i!=(2*n-1)-i+1) {
                    System.out.print("\t" + (j - i + z));
                    z--;
                }
                /**else if(i<j) {
                    System.out.print("\t" + (j - i + l));
                    l--;
                }
                else if(j<i) {
                    System.out.print("\t" + (i - j + m));
                    m++;
                }**/
                else if (i==j && j==((2*n-1)+1)/2)
                    System.out.print("\t"+1);
                else
                    System.out.print("\t");
            }
            System.out.println(" ");
        }
    }
}
