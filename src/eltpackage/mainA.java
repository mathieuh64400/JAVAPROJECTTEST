package eltpackage;

import java.io.*;
import java.util.*;

import interfaceelt.Comparaiblepair;

public class mainA {
	
	public static void main(String[] args) {
		
		Comparaiblepair arr[] = new Comparaiblepair[4];
		int[] arr1= new int[4];
		
		arr1[0]=3;
		arr1[1]=4;
		arr1[2]=5;
		arr1[3]=2;
		
		String[] arr2= new String[4];
		
		arr2[0]="a";
		arr2[1]="abc";
		arr2[2]="bc";
		arr2[3]="ab";
		for(int i=0; i<4;i++) {
			arr[i]= new Comparaiblepair(arr2[i],arr1[i]);
			System.out.println(arr[i]);
			
		}
		
		System.out.println("-------------");
		 Arrays.sort(arr);
			for(int i=0; i<4;i++) {
				
				System.out.println(arr[i]);
				
			}
		
	}

}
