package principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
/*	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] matrix=new int[n][n];
		
		for(int l=0; l<n;l++)
		{
			for(int c=0; c<n;c++)
			{
				matrix [l][c]=sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal:");
		for(int i=0; i<n;i++)
			System.out.print(matrix[i][i]+" ");
		
		int cont=0;
		for(int l=0; l<n;l++)
		{
			for(int c=0; c<n;c++)
			{
				if(matrix[l][c]<0)
				cont++;
			}
		}
		System.out.println();
		System.out.print("Negative Numbers = "+cont);
		sc.close();
*/		
//EXERCÍCIO MATRIX
/*		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Matrix matrix = new Matrix();
		
		int l = sc.nextInt();
		int c = sc.nextInt();
		
		int[][] mat = new int[l][c];
		
		for(int i=0;i<mat.length;i++)//PRENCHE MATRIX
			for(int j=0;j<mat[i].length;j++)
				mat[i][j]=sc.nextInt();
			
		int n=sc.nextInt();//N° PROCURADO
		int cont=0;
		List <Integer> line = new ArrayList<>();
		List <Integer> colun = new ArrayList<>();
		
		for(int i=0;i<mat.length;i++)//CONTA QUANTOS N° NA MATRIX
			for(int j=0;j<mat[i].length;j++)
				if(mat[i][j]==n)
					{
					cont++;
					 line.add(i);
					 colun.add(j);
					}
		
		for(int i=0;i<cont;i++)
		{
			System.out.println("Position "+line.get(i)+","+colun.get(i));
			
			if(matrix.Left(mat, line.get(i), colun.get(i))!=null) {
			System.out.print("Left: "+matrix.Left(mat, line.get(i), colun.get(i)));
			System.out.println();}
			
			if(matrix.Right(mat,line.get(i), colun.get(i))!=null) {
			System.out.print("Right: "+matrix.Right(mat,line.get(i), colun.get(i)));
			System.out.println();}
			
			if(matrix.Up(mat,line.get(i), colun.get(i))!=null) {
			System.out.print("Up: "+matrix.Up(mat,line.get(i), colun.get(i)));
			System.out.println();}
			
			if(matrix.Down(mat,line.get(i), colun.get(i))!=null) {
			System.out.print("Down: "+matrix.Down(mat,line.get(i), colun.get(i)));
			System.out.println();}
		}
				

		sc.close();
*/		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date x1 = new Date();
		
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		
		
		System.out.println("y1: "+sdf2.format(y1));
		System.out.println("y2: "+sdf2.format(y2));
		
		System.out.println("--------------------");
		System.out.println(sdf1.format(x1));
		System.out.println(sdf2.format(x1));
		sc.close();
	}


}