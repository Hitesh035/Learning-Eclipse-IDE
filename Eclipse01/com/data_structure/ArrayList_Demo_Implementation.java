package com.data_structure;



public class ArrayList_Demo_Implementation {
	
	
	private Object [ ] a;
	private int position = 0;
	
	public ArrayList_Demo_Implementation( int i){
		this.a = new Object [i];
	}
	
	public ArrayList_Demo_Implementation() {
		this.a = new Object [1];
	}
	
	public int size() {
		return this.position;
	}
	
	private void recreateArray() {
		Object [] temp = new Object[this.size()+2];
		
		for(int i = 0 ; i< this.a.length; i++) {
			
			temp[i] = this.a[i];
		}
		this.a= temp;
		
	}
	
	public void add (Object e) {
		if(this.size() >= this.a.length) this.recreateArray();
		a[position] = e;
		position++;
	}
	
	public void insert(Object e, int index) {
		if (index<0 || index>this.size()) {
			throw new IndexOutOfBoundsException();
		}
		if(this.size() >= this.a.length) this.recreateArray();
		
		for(int i = this.size(); i>= index; i--) {
			this.a[i] = this.a [i-1]; 
		}
		this.a[index] = e;
		position++;
		
	}
	
	public Object get(int index) {
		if(index<0 || index >this.size()) throw new IndexOutOfBoundsException();
		
		return this.a[index];
	}
	
	public void remove (int index) {
		if(index<0 || index >this.size()) throw new IndexOutOfBoundsException();
		
		for (int i = index+1 ; i<this.size() ; i++) {
			
			this.a[i-1] = this.a[i];
		}
		this.a[this.size()-1] = null;
		position--;
	}
	
	public void clear() {
		
		Object [] temp = new Object [this.a.length];
		
		this.a= temp;
		this.position = 0;
	}
	public static void main(String[] args) {
		
		ArrayList_Demo_Implementation a1 = new ArrayList_Demo_Implementation();
		System.out.println(a1.position);
		System.out.println(a1.size());
		System.out.println(a1.a.length);
		a1.add("h");
		System.out.println(a1.position);
		System.out.println(a1.size());
		System.out.println(a1.a.length);
		a1.insert("e",1);
		System.out.println(a1.position);
		System.out.println(a1.size());
		System.out.println(a1.a.length);
		a1.insert("4",1);
		System.out.println(a1.position);
		System.out.println(a1.size());
		System.out.println(a1.a.length);
		a1.insert("3",1);
		System.out.println(a1.position);
		System.out.println(a1.size());
		System.out.println(a1.a.length);
		a1.remove(2);
		System.out.println(a1.position);
		System.out.println(a1.size());
		System.out.println(a1.a.length);
		a1.clear();
		System.out.println(a1.position);
		System.out.println(a1.size());
		System.out.println(a1.a.length);
		
		for (int i = 0 ; i<a1.size() ; i++) {
			System.out.println(a1.get(i));
		}
	}

}
