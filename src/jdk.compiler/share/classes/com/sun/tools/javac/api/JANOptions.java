package com.sun.tools.javac.api;

import java.util.Map;
import java.util.HashMap;

public class JANOptions
{
	public static final JANOption[] validOptions = new JANOption[]
	{
		new JANOption( "-JAN_tabinc", true ),
		new JANOption( "-JAN_string_folding", true )
	};
	
	private static Map<String, String> options = new HashMap<String, String>();
	public static Map<String, String> map() { return options; }
	
	static
	{
		// default values
		options.put("JAN_tabinc", "1");
		options.put("JAN_string_folding", "false");
	}
	
	public static void set( String key, String value )
	{
		options.put(key, value);
	}
	
	public static String get( String key )
	{
		return options.get(key);
	}
	
	public static int getInt( String key )
	{
		return Integer.parseInt( options.get(key) );
	}
	
	public static boolean getBool( String key )
	{
		return Boolean.parseBoolean( options.get(key) );
	}
}
