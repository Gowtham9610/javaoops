package multiArray;

public class maxvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] allnum= {{5,6,7},{4,2,1},{1,1,9}};
		int min=allnum[0][0];
		
		
		for(int i=0;i<allnum.length;i++) {
			for(int j=0;j<allnum.length;j++)
			{
				if(allnum[i][j]<min) {
					min=allnum[i][j];
				}
			}
		}
		
		
		System.out.println(min);
		
		int rowcount=0;
		
		outerloop:
		for(int i=0;i<allnum.length;i++) {
			for(int j=0;j<allnum.length;j++)
			{
				if(allnum[i][j]==min)
				{
					rowcount=i;
					break outerloop;
				}
			}
	}
		
		int max=min;
		for(int j=0;j<allnum.length;j++)
		{
			if(allnum[rowcount][j]>max)
			{
				max=allnum[rowcount][j];
			}
		}
		
		System.out.println(max);
		

}
}
