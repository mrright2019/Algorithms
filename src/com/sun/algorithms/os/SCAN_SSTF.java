package com.sun.algorithms.os;
package os.scan_sstf;
import java.util.Arrays;
public class SCAN_SSTF {
 private int position; private int dirction;
 public float scan(int request[]) {  int temp[] = new int[request.length];  for (int i = 0; i < request.length; i++) {   temp[i] = request[i];  }  Arrays.sort(temp);  float total = 0.0f;  if(dirction==1) total = temp[temp.length-1]-position+temp[temp.length-1]-temp[0];  if(dirction==-1) total=position-temp[0]+temp[temp.length-1]-temp[0];  int c=0;  for(;c<temp.length;c++) {   if(temp[c]>position) {    break;   }  }  if(dirction==-1) c = (c-1)>=0?c-1:c;  go(temp,c,c,1);  System.out.print("\n");  return total/temp.length;   } public void go(int temp[],int i,int j,int c) {    System.out.print(temp[i]+"->");  if(i==temp.length-1 && dirction==1) {   if(c==2) return;   dirction=-1;   go(temp,j-1,j,2);  }  else if(i==0 && dirction==-1) {   if(c==2) return;   dirction = 1;   go(temp,j+1,j,2);  }else {   go(temp,i+dirction,j,c);  }   }
 public float sstf(int request[]) {  int temp[] = new int[request.length];  for (int i = 0; i < request.length; i++) {   temp[i] = request[i];  }  float total = 0.0f;  for (int i = 0; i < temp.length; i++) {   int minindex = mindispoint(temp, 0);   System.out.print(temp[minindex] + "->");   total += abs(temp[minindex] - position);   position = temp[minindex];   temp[minindex] = Integer.MAX_VALUE;  }  System.out.println();  return total / temp.length;
 }
 public int abs(int i) {  return i > 0 ? i : -i; }
 public int mindispoint(int arr[], int m) {  if (m == 0) {   int minindex = 0;   int mindis = abs(arr[0] - position);   for (int i = 0; i < arr.length; i++) {    if (abs(arr[i] - position) < mindis) {     minindex = i;     mindis = abs(arr[i] - position);    }   }   return minindex;  }else {   int minindex = 0;   return minindex;  } }
 public SCAN_SSTF(int a1, int a2) {  position = a1;  dirction = a2; }
 public static void main(String[] args) {   SCAN_SSTF test = new SCAN_SSTF(100, -1);  int request[] = { 55,58,39,18,90,160,150,38,184 };  System.out.println(test.sstf(request));//  System.out.println(test.scan(request)); }
}
