package com.mak.corejava.four.flowControl;

public class BreakWithLabel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		label1:
		for(int i=0;i<3;i++){
			System.out.println("in first for loop:"+i);
			for(int j=0;j<3;j++){
				System.out.println("\tin second for loop:"+j);
				for(int k=0;k<3;k++){
					if(k==1){
						break label1;
					}
					System.out.println("\t\tin third for loop:"+k);
					for(int l=0;l<3;l++){
						System.out.println("\t\t\tin fourth for loop:"+l);
					}
				}
			}
		}
	}

}
