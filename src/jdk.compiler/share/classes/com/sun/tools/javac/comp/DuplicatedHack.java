package com.sun.tools.javac.comp;

import java.util.HashMap;
import java.util.Map;

import com.sun.tools.javac.code.Symbol.ClassSymbol;
import com.sun.tools.javac.util.Name;

public class DuplicatedHack {

	public static Map<Name, Name> duplicatedTypeDeclarations = new HashMap<>();
	
	public static Map<Name, ClassSymbol> classesNotVisitedEarly = new HashMap<>();

}
