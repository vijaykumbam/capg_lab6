package com.capg.vijay.lab6.exec2;
import java.io.FileInputStream;
public class ReadingFileData 
{
	static int count=1;

	public static void main(String[] args) throws Exception
	{
		//Reading from the file 
		char ch;
		FileInputStream fis = new FileInputStream("readableFile.txt");
		int n= fis.available();
		System.out.print(count++ +":");
		for(int loop=0;loop<n;loop++)
		{
			ch=(char)fis.read();
            System.out.print(ch);
            if(ch=='\n')
            {
                  System.out.print(count+++":");
                       
            }
		}

	}
}