package com.capg.vijay.lab6.exec4;
import java.util.*;
import java.io.*;
import java.lang.*;

public class ReplaceAllConsonants 
{
	String paragraph;
	
	ReplaceAllConsonants(String paragraph) //
	{
		super();
		this.paragraph = paragraph;
		alterString(paragraph);
	}
	

	static boolean isVowel(char ch)
	{
		if(ch !='a' &&ch !='e'&&ch !='i'&&ch !='o'&&ch !='u')
		{
			return false;
		}
		return true;
	}
	
	String alterString(String paragraph)
	{
		char[] ch = paragraph.toCharArray();
		for(int loop=0;loop<ch.length;loop++)
		{
			if(!isVowel(ch[loop]))
			{
				if(ch[loop]=='z')
				{
					ch[loop] ='a';
				}
				else
				{
					ch[loop] = (char)(ch[loop]+1);
					if(isVowel(ch[loop]))
					{
						ch[loop] = (char)(ch[loop]+1);
					}
				}
			}
		}
		return String.valueOf(ch);
	}
}
