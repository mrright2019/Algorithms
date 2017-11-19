package com.sun.algorithm.heap;

public class heap {
	private int array[];
	private int sorting_size;
	public heap(int arr[]) {
		array = arr;
		sorting_size = array.length - 1;
		build_max_heap();
	}
	int left(int i) {
		return 2*(i+1) - 1;
	}
	int right(int i) {
		return 2*(i+1);
	}
	int parent(int i) {
		return i/2;
	}
	void build_max_heap() {
		for(int i = sorting_size/2;i>=0;i--) {
			max_heapify(i);
		}
	}
	void max_heapify(int i) {
		int l = left(i);
		int r = right(i);
		int largest = i;
		if(l<=this.sorting_size && array[l]>array[i]) {
			largest = l;
		}
		if(r<=this.sorting_size && array[r]>array[largest]) {
			largest = r;
		}
		if(largest != i) {
			int temp = array[i];
			array[i]=array[largest];
			array[largest] = temp;
			max_heapify(largest);
		}
	}

	void output() {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+"\t");
		}
		System.out.println();;
	}
	int[] sort() {
		for(int i=0;i<=array.length-1;i++) {
			int temp = array[sorting_size];
			array[sorting_size] = array[0];
			array[0] = temp;
			sorting_size--;
			build_max_heap();
		}
		int res[] = new int[array.length];
		for(int i=0;i<array.length;i++) {
			res[i]=array[i];
		}
		return res;
	}
	
	
	
	public static void main(String args[]) {
		int arr[] = {2,3,6,1,7,4,9,0,10};
		heap a = new heap(arr);
		a.output();
		System.out.println(arr.length);
		int res[] = a.sort();
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+"\t");
		}
		System.out.println();
		res[0] = 1000;
		a.output();
	}
	
}
