import java.util.*;

class Horse
{
	public static int fsqrt(int x) 
    { 
        if (x == 0 || x == 1) 
            return x; 
        int i = 1, result = 1; 
          
        while (result <= x) { 
            i++; 
            result = i * i; 
        } 
        return i - 1; 
    } 
public static void main(String args[])
	{
		int h=25,w=3,i,j,rq=0,c=0,k;
		System.out.println("Total number of Horses= " + h);
		System.out.println("We have to find top " + w + " Horses");
		System.out.println("You can conduct race among at most 5 \n");
		
		int[][] matrix=new int[50][50];
		int[][] matrix1=new int[50][50];
		int[][] matrix2=new int[50][50];
		int n=fsqrt(h);
		
		rq=n;
		k=w;
		for(i=0; i<n; i++)
				{
					for(j=0;j<n;j++)
					{
						matrix[i][j]=3;
					}
					
				}
		for(i=0; i<w; i++)
				{
					for(j=0; j<n;j++)
					{
						matrix1[i][j]= matrix[i][j];	
					}
				}
		rq=rq+1;
		
		for(i=0; i<w; i++)
				{
					for(j=0; j<n;j++)
					{
						matrix2[i][j]= matrix1[i][j];	
					}
				}
			
		for(i=0; i<w; i++)
				{
					for(j=k; j<n;j++)
					{
						matrix2[i][j]=0;
					}
					k=k-1;
				}
		for(i=0; i<w; i++)
				{
					for(j=0; j<n;j++)
					{
							if(matrix2[i][j]!=0){
								c++;
							}
					}
				}
			if((c-1)==n){
				rq=rq+1;
			}
			System.out.println("\n Total number of races required= \n" + rq);
	}
}