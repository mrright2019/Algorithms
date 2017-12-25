package com.sun.algorithms.os;
import java.util.*;
public class BabkerAlgorithm {
	private int resource[] = new int[3]; //resource num
	private int max[][] = new int[5][3]; // max resource the process need
	private int current[] = new int[3];// the num of recourse now
	private int now[][] = new int[5][3]; // the num of five process having
	Scanner scanner = new Scanner(System.in);
	
	public BabkerAlgorithm() {
		System.out.println("please input the num of three rescoures");
		for(int i=0;i<3;i++) {
			resource[i] = scanner.nextInt();
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
		
		System.out.println("Success");
		for(int i=0;i<3;i++) {
			now[n][i] += arr[i];
			current[i] -= arr[i];
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BabkerAlgorithm test = new BabkerAlgorithm();
		test.UserInput();
	}

}
