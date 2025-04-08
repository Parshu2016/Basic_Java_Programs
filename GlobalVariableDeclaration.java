package printingname;

public class GlobalVariableDeclaration {
	int a=22;
	int b=10;
	int c;
	void div()
	{
		c=a/b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		GlobalVariableDeclaration g=new GlobalVariableDeclaration();
		g.div();

	}

}
