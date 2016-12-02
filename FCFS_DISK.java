import java.util.Random;
import java.util.Scanner;
public class FCFS_DISK {
	public static void main(String args[]){
//		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		int i,j,n,start;
//		n = 1 + random.nextInt(20);
		n = scan.nextInt();
//		start = 1 + random.nextInt(200);
		start = scan.nextInt();
		int Memory[] = new int[200];
		int Output[] = new int[200];
		for( i=1 ; i<=n ; i++ ){
			Memory[i] = scan.nextInt();
//			Memory[i] = 1 + random.nextInt(200);
		}
		Output[1] = start;
		for(i=1,j=2;i<=n;i++,j++){
			Output[j] = Memory[i];
		}
		int N = n+1;
		for(i=1;i<=N;i++){
			System.out.printf("%d ",Output[i]);
		}
		System.out.println("");
		// Output - {1 to N}
	}
}
