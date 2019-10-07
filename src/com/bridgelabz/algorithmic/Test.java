package com.bridgelabz.algorithmic;

class Generic<T>
{
	 T obj,obj1;
//	U obj2;
	 Generic(T obj)
	 {
		 this.obj=obj;
	 }
	 public void print()
	 {
		 System.out.println(obj1);
		// System.out.println(obj2);
	 }
	/*// Generic(T obj)
	// {
		 this.obj1=obj1;
		// this.obj2=obj2;
	// }
	*/ public T getObject()
	 {
		 return this.obj;
	 } 
	 
}
public class Test {

	public static void main(String[] args) {
		Generic<Integer> g=new Generic<Integer>(10);
		System.out.println(g.getObject());
		
		//Generic<String> g1=new Generic<String>("Hello");
		//System.out.println(g1.getObject());
		
		//Generic<Double> g2=new Generic<Double>(15.23);
		//System.out.println(g2.getObject());
		
		//Generic<Integer,String> g3=new Generic<Integer,String>(10,"Generic");
		//g3.print();
		
		

 	}

}
