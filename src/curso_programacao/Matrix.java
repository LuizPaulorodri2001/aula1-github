package curso_programacao;

public class Matrix {

public Integer Down(int mat[][],int l,int c)
{
	for(int i=0;i<mat.length;i++)
		for(int j=0;j<mat[i].length;j++)
			if(l==(mat.length-1))
				return null;
	return mat[l+1][c];
}

public Integer Up(int mat[][],int l,int c)
{
	for(int i=0;i<mat.length;i++)
		for(int j=0;j<mat[i].length;j++)
			if(l==0)
				return null;
	return mat[l-1][c];
}

public Integer Left(int mat[][],int l,int c)
{
	for(int i=0;i<mat.length;i++)
		for(int j=0;j<mat[i].length;j++)
			if(c==0)
				return null;
	return mat[l][c-1];
}

public Integer Right(int mat[][],int l,int c)
{
	for(int i=0;i<mat.length;i++)
		for(int j=0;j<mat[i].length;j++)
			if(c==(mat[i].length-1))
				return null;
	return mat[l][c+1];
}

}
