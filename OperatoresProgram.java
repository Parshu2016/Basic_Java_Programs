package printingname;
public class OperatoresProgram {	
	public static void opadd()	{		
		int i=2;
		int j=10;
		int k=i+j;		
		System.out.println(" addition is = " +k);
	}
	public static void opsub()
	{		
		int i=20;
		int j=2;
		int k=i-j;		
		System.out.println(" substraction is = " +k);
		}
	public static void opmul()
	{	
		int i=2;
		int j=10;
		int k=i*j;		
		System.out.println(" multiplication is = " +k);
	}	
	public static void opdiv()
	{		
		int i=20;
		int j=2;
		int k=i/j;		
		System.out.println(" division is = " +k);
	}
	public static void opmod()
	{		
		int i=20;
		int j=3;
		int k=i%j;		
		System.out.println(" modulus is = " +k);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		opadd();	opsub();	opmul();		opdiv();		opmod();

	}

}
