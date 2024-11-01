package inheritancesample;

public class SingleParentClass {
	int a=10;
	int b=20;
	public void add()
	{
		System.out.println(a+b);
	}
	public class SingleChildClass extends SingleParentClass
	{
		public void sub()
		{
			System.out.println(a-b);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleChildCLass ob=new SingleChildClass()
		

	}

}
