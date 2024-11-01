package stringsample;

public class StringBuffer{

	public static void main(String[] args) {
		StringBuffer ob= new StringBuffer();
		System.out.println(ob);
		//append
		ob.append("false");
		System.out.println(ob);
		
		//insert
		ob.insert(1,"hello");
		System.out.println(ob);
		 //replace
		ob.replace(1,3,"welcome");
		System.out.println(ob);
		//delete
		ob.delete(1,3);
		System.out.println(ob);
		//rverse
		ob.reverse();
		System.out.println(ob);
		

	}

}
