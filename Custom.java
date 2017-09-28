public class Excep3BankException extends Exception
{
	private static int[] accountNumber={1002,2003,3004,4005,5006};
	private static String[] name={"chidam","leene","harini","praveen","tamiz"};
	private static double[] balance={43243,43432,4324,325,43656};

	Excep3BankException(String str)
	{
		super(str);
	}
	public static void main(String[] args) throws Excep3BankException
	{
		try
		{
			//
			System.out.println("Account number "+"Customer "+"Balance ");
			for(int i=0;i<5;i++)
			{
				System.out.println(accountNumber[i]+" "+name[i]+" "+balance[i]);
				
				if(balance[i]<1000)
				{
					Excep3BankException be=new Excep3BankException("balance is less than 1000");
					throw be;
				}
			}
			
		}
		catch(Excep3BankException be)
		{
			//be.printStackTrace();		
			System.out.println(be);
		}
	}

}
