package com.sun.tools.javac.api;

public class JANOption
{
	private String name;
	public String name() { return name; }
	
	private boolean hasArgs;
	public boolean hasArgs() { return hasArgs; }
	
	public JANOption( String name, boolean hasArgs )
	{
		this.name = name;
		this.hasArgs = hasArgs;
	}
}
