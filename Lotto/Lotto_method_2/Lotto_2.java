
public class Lotto_2 
{
	public static void main(String[] args) 
	{
		/*6 lotto numbers*/
		int[] random=new int[6];
		int number;
		
		/*get 6 numbers*/
		for(int i=0;i<6;i++)
		{
			/*lotto number range from 1-49*/
			number=(int)(Math.random()*49+1);
			/*checks number repeat?*/
			for(int x=0;x<i;x++)
			{
				/*number check*/
				if(random[x]==number)
				{
					number=(int)(Math.random()*49+1);
					x=-1;//restart the loop
				}
			}
			random[i]=number;
		}
		for(int i=0;i<random.length;i++)
		{
			System.out.print(random[i]+" ");
		}
	}
}
