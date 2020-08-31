package com.sun.tools.javac.parser;

import com.sun.tools.javac.parser.Tokens.Comment.CommentStyle;

/**
 * Helper class to store all comments from source
 */
public class JANComment {
	
	/**
	 * No default constructor
	 */
	public JANComment( long line, long col, long endLine, long endCol, CommentStyle style, String text )
	{
		this.line = line;
		this.col = col;
		this.endLine = endLine;
		this.endCol = endCol;
		this.style = style;
		this.text = text;
	}

	/**
	 * The starting position of the comment
	 */
	private long line;
	public long line() { return line; }
	public void line( long newLine ) { line = newLine; }
	
	private long col;
	public long col() { return col; }
	public void col( long newCol ) { col = newCol; }
	
	/**
	 * The ending position of the comment
	 */
	private long endLine;
	public long endLine() { return endLine; }
	public void endLine( long newLine ) { endLine = newLine; }
	
	private long endCol;
	public long endCol() { return endCol; }
	public void endCol( long newCol ) { endCol = newCol; }
	
	/**
	 * The style of the comment
	 * - SINGLE LINE
	 * - MULTILINE
	 * - JAVADOC
	 */
	private CommentStyle style;
	public CommentStyle style() { return style; }
	public void style( CommentStyle newStyle ) { style = newStyle; }
	
	/**
	 * The text of the comment
	 */
	private String text;
	public String text() { return text; }
	public void text( String newText ) { text = newText; }
	
	public String toString()
	{
		return "( [" + line + ";" + col + "] -> [" + endLine + ";" + endCol + "] , " + style + ")=|" + text +"|";
	}
}
