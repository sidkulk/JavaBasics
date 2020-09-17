import java.util.*;
import java.io.*;

class SchedOneClass {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter total processes: ");
		int totProc = in.nextInt();
		System.out.println("Enter number of resources per process: ");
		int totRes = in.nextInt();
		
		ArrayList<String> Processes = new ArrayList<String>();
		for(int i=0;i<totProc;i++) {
			Processes.add("P"+i);
		}
		
		@SuppressWarnings("unchecked")
		List<Integer> AllResource[] = new LinkedList[totProc];
		
		System.out.println("Enter resource allocation for each process: ");
		for(int i=0;i<totProc;i++) {
			for(int j=0;j<totRes;j++) {
				int res = in.nextInt();
				if(AllResource[i]==null) {
					AllResource[i] = new LinkedList<Integer>();
				}
				AllResource[i].add(res);
			}
		}
		
		System.out.println("Resource Allocation table: ");
		for(int i=0;i<totProc;i++) {
			System.out.println(AllResource[i]);
		}
		
		System.out.println("Enter Max Resource limit per process: ");
	
		List<Integer> MaxResourceList[] = new LinkedList[totProc];
		for(int i=0;i<totProc;i++) {
			for(int j=0;j<totRes;j++) {
				int MaxRes = in.nextInt();
				if(MaxResourceList[i]==null) {
					MaxResourceList[i] = new LinkedList<Integer>();
				}
				MaxResourceList[i].add(MaxRes);
			}
		}
		
		System.out.println("Max Resource table: ");
		for(int i=0;i<totProc;i++) {
			System.out.println(MaxResourceList[i]);
		}
		
		System.out.println("Resource requirement calculated");
		List<Integer>needResource[] = new LinkedList[totProc];
		for(int i=0;i<totProc;i++) {
			for(int j=0;j<totRes;j++) {
				if(needResource[i]==null) {
					needResource[i] = new LinkedList<Integer>();
				}
				int mxRes = MaxResourceList[i].get(j);
				int allRes = AllResource[i].get(j);
				needResource[i].add(mxRes-allRes);
			}
		}
		
		
		System.out.println("Required Resource table: ");
		for(int i=0;i<totProc;i++) {
			System.out.println(needResource[i]);
		}
		
		System.out.println("Enter available resource");
		int[] AvailRes = new int[totRes];
		for(int i=0;i<totRes;i++) {
			AvailRes[i] = in.nextInt();
		}
		Vector<String> processQueue = new Vector<String>();
		int flag, tmp=0;
		int completedProcess=0;
		System.out.println();
		
		for(int i=0;i<totProc;i++) {
			flag = 0;
			for(int j=0;j<totRes;j++) {
				if((AvailRes[j]-needResource[i].get(j))<0) {
					flag++;
					tmp = j;
				}
			}
			if(flag==0) {
				processQueue.add("P"+i);
				needResource[i].clear();
				for(int j=0;j<totRes;j++) {
					AvailRes[j] = AvailRes[j]+AllResource[i].get(j); //resources freed
				}
			}
			else {
				System.out.println("Process P"+i+" needs more resource");
			}
		}
		
		System.out.println();
		System.out.println("Available resource: ");
		for(int i=0;i<totRes;i++) {
			System.out.print(AvailRes[i]+" ");
		}
		
		System.out.println();
		
		System.out.println("Resources after process execution: ");
		for(int i=0;i<totProc;i++) {
			System.out.println(" "+needResource[i]);
		}
		
		System.out.println("Resource Queue: ");
		for(int i=0;i<processQueue.size();i++) {
			System.out.print(" "+processQueue.get(i));
		}
		
		in.close();
	}
}
