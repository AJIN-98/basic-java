package com.exm;

public class example {
	
	private int n1 ;
	private int n2 ;
	
	
	public example(int ref1,int ref2){
		this.n1=ref1;
		this.n2=ref2;
	}
	
	public static example callByRef(example object) {
		object.n2=20;
		return object;
	}

	
	public static void main(String[] args) {

				
		example obj= new example(2,3);
		
		example result = callByRef(obj);
		
		System.out.println("before calling :"+ obj.n1+" "+obj.n2);
		
		System.out.println(" after call by reference value"+result.n1+" "+result.n2);

	}

}
