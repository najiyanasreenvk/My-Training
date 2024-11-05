package polimorfismsample;

public class ClassChild extends ClassParent {
	public void display()
	{super.display();}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassChild ob=new ClassChild();
		ob.display();
		ClassParent ob1=new ClassParent();
		ob1.display();

	}

}
