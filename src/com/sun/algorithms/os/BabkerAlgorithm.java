package com.sun.algorithms.os;
import java.util.*;
public class BabkerAlgorithm {
	private int resource[] = new int[3]; //resource num
	private int max[][] = new int[5][3]; // max resource the process need
	private int current[] = new int[3];// the num of recourse now
	private int now[][] = new int[5][3]; // the num of five process having
	private int need[][] = new int[5][3];
	Scanner scanner = new Scanner(System.in);
	
	public BabkerAlgorithm() {
		System.out.println("please input the num of three rescoures");
		for(int i=0;i<3;i++) {
			resource[i] = scanner.nextInt();
			current[i] = resource[i];
		}
		System.out.println("please input the max num of the recourse the five processes need");
		for(int i=0;i<5;i++) {
			System.out.println("process "+i);
			for(int j=0;j<3;j++)
				max[i][j] = scanner.nextInt();
		}
		System.out.println("please input the num of the recourse the five processes having");
		for(int i=0;i<5;i++) {
			System.out.println("process "+i);
			for(int j=0;j<3;j++)
			{
				now[i][j] = scanner.nextInt();
				current[j] -= now[i][j];
				need[i][j] = max[i][j]-now[i][j];
			}
		}
		
	}
	
	public void UserInput() {
		System.out.println("please input the number of process(0=<n<3):");
		int n = scanner.nextInt();
		System.out.println("Input the number of three resources:");
		int request[] = new int[3];
		for(int i=0;i<3;i++) {
			request[i] = scanner.nextInt();
		}
		if(!checkData(n,request))
		{
			System.out.println("Error");
		}
		UserInput();
	}
	
	public boolean checkData(int n,int arr[]) {
		for(int i=0;i<3;i++) {
			if(max[n][i] < now[n][i]+arr[i]) {
				System.out.println("the inputs over the max num");
				return false;
			}
			if(resource[i] < current[i]+arr[i]) {
				System.out.println("the inputs over the rescoures nums");
				return false;
			}
		}
		int temp[] = new int[3];
		int safe[] = {0,0,0,0,0};
		int ec = 0;
		for(int i=0;i<3;i++){
//			temp[i] = current[i] -arr[i];
			temp[i] += current[i]+ now[n][i];
			
		}
		while(ec<5){
			for(int i=0;i<5;i++){
				if(safe[i]==1) continue;
				if(temp[0]>=need[i][0] && temp[1]>=need[i][1] &&temp[2]>=need[i][2] ){
					safe[i]=1;
					temp[0] += now[i][0];
					temp[1] += now[i][1];
					temp[2] += now[i][2];
				}
			}
			ec++;
		}
		if(safe(temp)){
			System.out.println("Success");
			for(int i=0;i<3;i++) {
				now[n][i] +=arr[i];
				current[i] -= arr[i];
			}
			return true;
		}
		else
			return false;
	}
	
	public boolean safe(int arr[]){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==0) return false;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BabkerAlgorithm test = new BabkerAlgorithm();
		test.UserInput();
	}

}
