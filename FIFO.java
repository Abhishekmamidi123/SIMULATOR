

// 7 0 1 2 0 3 0 4 2 3 0 3 2 1 2 0 1 7 0 1      Ans : 15 PageFaults.
// 4 7 3 0 1 7 3 8 5 4 5 3 4 7                  Ans : 12 PageFaults.
// 1 2 3 4 1 2 5 1 2 3 4 5						Ans : 9  PageFaults.
import java.util.Random;
import java.util.Scanner;
public class FIFO {
	public static int fifo(int n,int Frames,int Pages[],int Memory_Table[][],int PageFault[]){
		Random random = new Random();
//		Scanner random = new Scanner(System.in);
		int i,j,pointer=1,PageFaults,flag,flag1=1;
//		n = 1 + random.nextInt(20);
//		n = random.nextInt();
//		Frames = random.nextInt();
//		int Pages[]     = new int[21];
		int Memory[]    = new int[10];
//		int PageFault[] = new int[21];
//		n = 20;
		PageFaults = 1;
		for(i=1;i<=n;i++){
			System.out.printf("%d ",Pages[i]);
		}
		System.out.println("\n");
		
		for(i=1;i<=Frames;i++){
			Memory[i] = -1;
		}
		pointer = 1;
		Memory[1] = Pages[1];
		for(j=1;j<=Frames;j++){
			System.out.printf("%d ",Memory[j]);
			Memory_Table[j][1] = Memory[j];
		}
		System.out.println("");
		for(i=2;i<=n;i++){
			flag1 = 1;
			flag = 0;
			for(j=1;j<=Frames;j++){
				if(Pages[i]==Memory[j]){
					flag = 1;
					break;
				}
			}
			if(flag == 1){
				PageFault[i] = 1;
				//Do nothing.
			}
			else{
				flag1 = 0;
				for(j=1;j<=Frames;j++){
					if(Memory[j] == -1){
						flag1 = 1;
						break;
					}
				}
				if(flag1==1){
					Memory[j] = Pages[i];
					PageFaults = PageFaults + 1;
					PageFault[i] = 0;
				}
			}
			if(flag1==0){
				for(j=1;j<=Frames;j++){
					if(Pages[pointer]==Memory[j]){
						Memory[j] = Pages[i];
						break;
					}
				}
				PageFaults = PageFaults + 1;
				PageFault[i] = 0;
				
				for(j=pointer+1;;j++){
					if(PageFault[j]==0){
						break;
					}
					pointer = pointer + 1;
				}
				pointer = pointer + 1;
			}
			
			for(j=1;j<=Frames;j++){
				System.out.printf("%d ",Memory[j]);
				Memory_Table[j][i] = Memory[j];
			}
			System.out.println("");
		}
		System.out.println(PageFaults);
		for(j=1;j<=n;j++){
			System.out.printf("%d ",PageFault[j]);
		}
		System.out.println("\n");
		for(int y=1;y<=Frames;y++){
			for(int z=1;z<=n;z++){
				System.out.printf("%d ",Memory_Table[y][z]);
			}
			System.out.println("");
		}
		return PageFaults;
	}
}