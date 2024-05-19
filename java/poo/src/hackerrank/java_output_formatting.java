package hackerrank;
import java.util.Scanner;

// Nessa aqui foi doido, porque eu não sabia que a gente tinha como fazer essas coisas
//Esse link aqui do stackoverflox sobre duas colunas me salvou demais https://stackoverflow.com/questions/699878/is-there-an-easy-way-to-output-two-columns-to-the-console-in-java
public class java_output_formatting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.printf("%-14s %03d\n",s1,x);
        }
        System.out.println("================================");

    }
}
