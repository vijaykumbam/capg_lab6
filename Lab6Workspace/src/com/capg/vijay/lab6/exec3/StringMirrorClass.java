package com.capg.vijay.lab6.exec3;
import java.util.*;
import java.lang.*;
import java.io.*;
public class StringMirrorClass 
{
	String inPutword;
	StringMirrorClass(String inPutword)
	{
		this.inPutword = inPutword;
		getImage(inPutword);
	}
	
	public String getImage(String word)
	{
		StringBuilder sbreference = new StringBuilder();
		sbreference.append(word);
		sbreference = sbreference.reverse();  
	    return word+"|"+sbreference.toString();  
	}
}
