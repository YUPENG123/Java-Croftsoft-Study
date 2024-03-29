     package com.croftsoft.apps.compiler.mini.parse;
     import java.io.*;
     import java.text.*;
     import java.util.*;
     import java_cup.runtime.*;
     /*********************************************************************
     * Token scanner for the Mini programming language.
     *
     * <B>Reference:</B>
     *
     * <P>
     *
     * "JLex: A Lexical Analyzer Generator for Java"<BR>
     * <A HREF="http://www.cs.princeton.edu/~appel/modern/java/JLex/">
     * http://www.cs.princeton.edu/~appel/modern/java/JLex/</A>
     *
     * @author
     *   <A HREF="http://www.alumni.caltech.edu/~croft/">David W. Croft</A>
     * @version
     *   1999-04-24
     *********************************************************************/
     //////////////////////////////////////////////////////////////////////
     // Portions of this code machine-generated by JLex.
     //////////////////////////////////////////////////////////////////////


public class MiniScanner implements MiniSymbols, CUPTokenScanner {
	private final int YY_BUFFER_SIZE = 512;
	private final int YY_F = -1;
	private final int YY_NO_STATE = -1;
	private final int YY_NOT_ACCEPT = 0;
	private final int YY_START = 1;
	private final int YY_END = 2;
	private final int YY_NO_ANCHOR = 4;
	private final char YYEOF = '\uFFFF';

     //////////////////////////////////////////////////////////////////////
     //////////////////////////////////////////////////////////////////////
     private static final String [ ]  TEST_FILES = {
         "../test/Test.mini" };
     //////////////////////////////////////////////////////////////////////
     //////////////////////////////////////////////////////////////////////
     public static void  main ( String [ ]  args )
       throws Exception
     //////////////////////////////////////////////////////////////////////
     {
       for ( int  i = 0; i < TEST_FILES.length; i++ )
       {
         test ( new FileReader ( TEST_FILES [ i ] ) );
       }
     }
     public static void  test ( Reader  reader )
       throws Exception
     //////////////////////////////////////////////////////////////////////
     {
       MiniScanner  miniScanner = new MiniScanner ( reader );
       Symbol  symbol = null;
       loop:
       while ( ( symbol = miniScanner.nextToken ( ) ).sym != EOF )
       {
         System.out.println (
           "Symbol:  " + symbol + "  Value:  " + symbol.value );
       }
     }
     public static Symbol  scanConstant ( String  text )
     //////////////////////////////////////////////////////////////////////
     {
       try
       {
         return new Symbol ( CONSTANT, new Integer ( text ) );
       }
       catch ( NumberFormatException  ex )
       {
         return null;
       }
     }
     //////////////////////////////////////////////////////////////////////
     //////////////////////////////////////////////////////////////////////
	private java.io.BufferedReader yy_reader;
	private int yy_buffer_index;
	private int yy_buffer_read;
	private int yy_buffer_start;
	private int yy_buffer_end;
	private char yy_buffer[];
	private int yychar;
	private int yyline;
	private int yy_lexical_state;

	public MiniScanner (java.io.Reader reader) {
		this ();
		if (null == reader) {
			throw (new Error("Error: Bad input stream initializer."));
		}
		yy_reader = new java.io.BufferedReader(reader);
	}

	public MiniScanner (java.io.InputStream instream) {
		this ();
		if (null == instream) {
			throw (new Error("Error: Bad input stream initializer."));
		}
		yy_reader = new java.io.BufferedReader(new java.io.InputStreamReader(instream));
	}

	private MiniScanner () {
		yy_buffer = new char[YY_BUFFER_SIZE];
		yy_buffer_read = 0;
		yy_buffer_index = 0;
		yy_buffer_start = 0;
		yy_buffer_end = 0;
		yychar = 0;
		yyline = 0;
		yy_lexical_state = YYINITIAL;
	}

	private boolean yy_eof_done = false;
	private final int YYINITIAL = 0;
	private final int yy_state_dtrans[] = {
		0
	};
	private void yybegin (int state) {
		yy_lexical_state = state;
	}
	private char yy_advance ()
		throws java.io.IOException {
		int next_read;
		int i;
		int j;

		if (yy_buffer_index < yy_buffer_read) {
			return yy_buffer[yy_buffer_index++];
		}

		if (0 != yy_buffer_start) {
			i = yy_buffer_start;
			j = 0;
			while (i < yy_buffer_read) {
				yy_buffer[j] = yy_buffer[i];
				++i;
				++j;
			}
			yy_buffer_end = yy_buffer_end - yy_buffer_start;
			yy_buffer_start = 0;
			yy_buffer_read = j;
			yy_buffer_index = j;
			next_read = yy_reader.read(yy_buffer,
					yy_buffer_read,
					yy_buffer.length - yy_buffer_read);
			if (-1 == next_read) {
				return YYEOF;
			}
			yy_buffer_read = yy_buffer_read + next_read;
		}

		while (yy_buffer_index >= yy_buffer_read) {
			if (yy_buffer_index >= yy_buffer.length) {
				yy_buffer = yy_double(yy_buffer);
			}
			next_read = yy_reader.read(yy_buffer,
					yy_buffer_read,
					yy_buffer.length - yy_buffer_read);
			if (-1 == next_read) {
				return YYEOF;
			}
			yy_buffer_read = yy_buffer_read + next_read;
		}
		return yy_buffer[yy_buffer_index++];
	}
	private void yy_move_start () {
		if ((byte) '\n' == yy_buffer[yy_buffer_start]) {
			++yyline;
		}
		++yychar;
		++yy_buffer_start;
	}
	private void yy_pushback () {
		--yy_buffer_end;
	}
	private void yy_mark_start () {
		int i;
		for (i = yy_buffer_start; i < yy_buffer_index; ++i) {
			if ((byte) '\n' == yy_buffer[i]) {
				++yyline;
			}
		}
		yychar = yychar
			+ yy_buffer_index - yy_buffer_start;
		yy_buffer_start = yy_buffer_index;
	}
	private void yy_mark_end () {
		yy_buffer_end = yy_buffer_index;
	}
	private void yy_to_mark () {
		yy_buffer_index = yy_buffer_end;
	}
	private java.lang.String yytext () {
		return (new java.lang.String(yy_buffer,
			yy_buffer_start,
			yy_buffer_end - yy_buffer_start));
	}
	private int yylength () {
		return yy_buffer_end - yy_buffer_start;
	}
	private char[] yy_double (char buf[]) {
		int i;
		char newbuf[];
		newbuf = new char[2*buf.length];
		for (i = 0; i < buf.length; ++i) {
			newbuf[i] = buf[i];
		}
		return newbuf;
	}
	private final int YY_E_INTERNAL = 0;
	private final int YY_E_MATCH = 1;
	private java.lang.String yy_error_string[] = {
		"Error: Internal error.\n",
		"Error: Unmatched input.\n"
	};
	private void yy_error (int code,boolean fatal) {
		java.lang.System.out.print(yy_error_string[code]);
		java.lang.System.out.flush();
		if (fatal) {
			throw new Error("Fatal Error.\n");
		}
	}
private int [][] unpackFromString(int size1, int size2, String st)
    {
      int colonIndex = -1;
      String lengthString;
      int sequenceLength = 0;
      int sequenceInteger = 0;
      int commaIndex;
      String workString;
      int res[][] = new int[size1][size2];
      for (int i= 0; i < size1; i++)
	for (int j= 0; j < size2; j++)
	  {
	    if (sequenceLength == 0) 
	      {	
		commaIndex = st.indexOf(',');
		if (commaIndex == -1)
		  workString = st;
		else
		  workString = st.substring(0, commaIndex);
		st = st.substring(commaIndex+1);
		colonIndex = workString.indexOf(':');
		if (colonIndex == -1)
		  {
		    res[i][j] = Integer.parseInt(workString);
		  }
		else 
		  {
		    lengthString = workString.substring(colonIndex+1);  
		    sequenceLength = Integer.parseInt(lengthString);
		    workString = workString.substring(0,colonIndex);
		    sequenceInteger = Integer.parseInt(workString);
		    res[i][j] = sequenceInteger;
		    sequenceLength--;
		  }
	      }
	    else 
	      {
		res[i][j] = sequenceInteger;
		sequenceLength--;
	      }
	  }
      return res;
    }
	private int yy_acpt[] = {
		YY_NOT_ACCEPT,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR,
		YY_NO_ANCHOR
	};
	private int yy_cmap[] = {
		0, 0, 0, 0, 0, 0, 0, 0,
		0, 0, 0, 0, 0, 0, 0, 0,
		0, 0, 0, 0, 0, 0, 0, 0,
		0, 0, 0, 0, 0, 0, 0, 0,
		0, 0, 0, 0, 0, 1, 0, 0,
		2, 3, 4, 5, 6, 7, 0, 8,
		9, 9, 9, 9, 9, 9, 9, 9,
		9, 9, 10, 11, 12, 13, 14, 0,
		0, 0, 0, 0, 0, 0, 0, 0,
		0, 0, 0, 0, 0, 0, 0, 0,
		0, 0, 0, 0, 0, 0, 0, 0,
		0, 0, 0, 0, 0, 0, 15, 0,
		0, 16, 17, 18, 19, 20, 21, 22,
		23, 24, 25, 25, 26, 25, 27, 28,
		29, 25, 30, 31, 32, 33, 25, 34,
		25, 25, 25, 0, 0, 0, 0, 0
		
	};
	private int yy_rmap[] = {
		0, 1, 1, 1, 1, 1, 1, 1,
		1, 1, 2, 1, 3, 1, 4, 1,
		5, 1, 1, 1, 1, 5, 5, 5,
		5, 5, 5, 5, 5, 5, 5, 5,
		5, 5, 5, 6, 7, 8, 9, 10,
		11, 12, 13, 14, 15, 16, 17, 18,
		19, 20, 21, 22, 23, 24, 25, 26,
		27, 28, 29, 30, 31, 32, 33, 34,
		35, 36, 37, 38, 39, 40, 41, 42,
		43, 44, 45, 46 
	};
	private int yy_nxt[][] = unpackFromString(47,35,
"1,2,3,4,5,6,7,8,9,10,35,11,12,13,14,15,16,67,60,36,50,37,16:2,38,16:4,75,61,16,39,16,68,-1:44,10,-1:38,18,19,-1:33,20,-1:30,16,-1:6,16:19,-1:13,17,-1:30,16,-1:6,16:12,21,16:6,-1:9,16,-1:6,16:8,22,16:10,-1:9,16,-1:6,16:5,23,16:5,71,16:7,-1:9,16,-1:6,16:7,54,16:4,24,16:6,-1:9,16,-1:6,16:3,25,16:15,-1:9,16,-1:6,16:10,26,16:8,-1:9,16,-1:6,16:4,27,16:14,-1:9,16,-1:6,16:3,28,16:15,-1:9,16,-1:6,16:11,29,16:7,-1:9,16,-1:6,16:11,30,16:7,-1:9,16,-1:6,16:4,31,16:14,-1:9,16,-1:6,16:4,32,16:14,-1:9,16,-1:6,16:14,33,16:4,-1:9,16,-1:6,16:4,34,16:14,-1:9,16,-1:6,16:10,52,40,16:7,-1:9,16,-1:6,16:10,41,16:8,-1:9,16,-1:6,16:15,42,16:3,-1:9,16,-1:6,43,16:18,-1:9,16,-1:6,16:4,44,16:14,-1:9,16,-1:6,16:8,45,16:10,-1:9,16,-1:6,16:10,46,16:8,-1:9,16,-1:6,16:16,47,16:2,-1:9,16,-1:6,16:4,48,16:14,-1:9,16,-1:6,16:14,49,16:4,-1:9,16,-1:6,51,16:18,-1:9,16,-1:6,16:4,53,16:14,-1:9,16,-1:6,16:6,55,16:12,-1:9,16,-1:6,16:8,56,16:10,-1:9,16,-1:6,16:8,57,16:10,-1:9,16,-1:6,16:6,58,16:12,-1:9,16,-1:6,16:17,59,16,-1:9,16,-1:6,16:4,62,16:14,-1:9,16,-1:6,16:7,63,16:6,64,16:4,-1:9,16,-1:6,16:4,65,16:14,-1:9,16,-1:6,16:3,66,16:15,-1:9,16,-1:6,16:16,69,16:2,-1:9,16,-1:6,16:4,70,16:14,-1:9,16,-1:6,16:2,72,16:16,-1:9,16,-1:6,16:12,73,16:6,-1:9,16,-1:6,16:14,74,16:4");
	public Symbol nextToken ()
		throws java.io.IOException {
		char yy_lookahead;
		int yy_anchor = YY_NO_ANCHOR;
		int yy_state = yy_state_dtrans[yy_lexical_state];
		int yy_next_state = YY_NO_STATE;
		int yy_last_accept_state = YY_NO_STATE;
		boolean yy_initial = true;
		int yy_this_accept;

		yy_mark_start();
		yy_this_accept = yy_acpt[yy_state];
		if (YY_NOT_ACCEPT != yy_this_accept) {
			yy_last_accept_state = yy_state;
			yy_mark_end();
		}
		while (true) {
			yy_lookahead = yy_advance();
			yy_next_state = YY_F;
			if (YYEOF != yy_lookahead) {
				yy_next_state = yy_nxt[yy_rmap[yy_state]][yy_cmap[yy_lookahead]];
			}
			if (YY_F != yy_next_state) {
				yy_state = yy_next_state;
				yy_initial = false;
				yy_this_accept = yy_acpt[yy_state];
				if (YY_NOT_ACCEPT != yy_this_accept) {
					yy_last_accept_state = yy_state;
					yy_mark_end();
				}
			}
			else {
				if (YYEOF == yy_lookahead && true == yy_initial) {

  return new Symbol ( EOF );
				}
				else if (YY_NO_STATE == yy_last_accept_state) {
					throw (new Error("Lexical Error: Unmatched Input."));
				}
				else {
					yy_to_mark();
					yy_anchor = yy_acpt[yy_last_accept_state];
					if (0 != (YY_END & yy_anchor)) {
						yy_pushback();
					}
					if (0 != (YY_START & yy_anchor)) {
						yy_move_start();
					}
					switch (yy_last_accept_state) {
					case 1:
						{ yybegin ( YYINITIAL ); }
					case -2:
						break;
					case 2:
						{ return new Symbol ( MOD       ); }
					case -3:
						break;
					case 3:
						{ return new Symbol ( LPAREN    ); }
					case -4:
						break;
					case 4:
						{ return new Symbol ( RPAREN    ); }
					case -5:
						break;
					case 5:
						{ return new Symbol ( TIMES     ); }
					case -6:
						break;
					case 6:
						{ return new Symbol ( PLUS      ); }
					case -7:
						break;
					case 7:
						{ return new Symbol ( COMMA     ); }
					case -8:
						break;
					case 8:
						{ return new Symbol ( MINUS     ); }
					case -9:
						break;
					case 9:
						{ return new Symbol ( DIVIDE    ); }
					case -10:
						break;
					case 10:
						{ return scanConstant ( yytext ( ) ); }
					case -11:
						break;
					case 11:
						{ return new Symbol ( SEMICOLON ); }
					case -12:
						break;
					case 12:
						{ return new Symbol ( LT        ); }
					case -13:
						break;
					case 13:
						{ return new Symbol ( EQ        ); }
					case -14:
						break;
					case 14:
						{ return new Symbol ( GT        ); }
					case -15:
						break;
					case 15:
						{ return new Symbol ( EXP       ); }
					case -16:
						break;
					case 16:
						{ return new Symbol ( NAME, yytext ( ) ); }
					case -17:
						break;
					case 17:
						{ return new Symbol ( ASSIGN    ); }
					case -18:
						break;
					case 18:
						{ return new Symbol ( LE        ); }
					case -19:
						break;
					case 19:
						{ return new Symbol ( NE        ); }
					case -20:
						break;
					case 20:
						{ return new Symbol ( GE        ); }
					case -21:
						break;
					case 21:
						{ return new Symbol ( DO        ); }
					case -22:
						break;
					case 22:
						{ return new Symbol ( FI        ); }
					case -23:
						break;
					case 23:
						{ return new Symbol ( IF        ); }
					case -24:
						break;
					case 24:
						{ return new Symbol ( TO        ); }
					case -25:
						break;
					case 25:
						{ return new Symbol ( END       ); }
					case -26:
						break;
					case 26:
						{ return new Symbol ( CALL      ); }
					case -27:
						break;
					case 27:
						{ return new Symbol ( ELSE      ); }
					case -28:
						break;
					case 28:
						{ return new Symbol ( READ      ); }
					case -29:
						break;
					case 29:
						{ return new Symbol ( THEN      ); }
					case -30:
						break;
					case 30:
						{ return new Symbol ( BEGIN     ); }
					case -31:
						break;
					case 31:
						{ return new Symbol ( WHILE     ); }
					case -32:
						break;
					case 32:
						{ return new Symbol ( WRITE     ); }
					case -33:
						break;
					case 33:
						{ return new Symbol ( INTEGER   ); }
					case -34:
						break;
					case 34:
						{ return new Symbol ( PROCEDURE ); }
					case -35:
						break;
					case 35:
						{ yybegin ( YYINITIAL ); }
					case -36:
						break;
					case 36:
						{ return new Symbol ( NAME, yytext ( ) ); }
					case -37:
						break;
					case 37:
						{ return new Symbol ( NAME, yytext ( ) ); }
					case -38:
						break;
					case 38:
						{ return new Symbol ( NAME, yytext ( ) ); }
					case -39:
						break;
					case 39:
						{ return new Symbol ( NAME, yytext ( ) ); }
					case -40:
						break;
					case 40:
						{ return new Symbol ( NAME, yytext ( ) ); }
					case -41:
						break;
					case 41:
						{ return new Symbol ( NAME, yytext ( ) ); }
					case -42:
						break;
					case 42:
						{ return new Symbol ( NAME, yytext ( ) ); }
					case -43:
						break;
					case 43:
						{ return new Symbol ( NAME, yytext ( ) ); }
					case -44:
						break;
					case 44:
						{ return new Symbol ( NAME, yytext ( ) ); }
					case -45:
						break;
					case 45:
						{ return new Symbol ( NAME, yytext ( ) ); }
					case -46:
						break;
					case 46:
						{ return new Symbol ( NAME, yytext ( ) ); }
					case -47:
						break;
					case 47:
						{ return new Symbol ( NAME, yytext ( ) ); }
					case -48:
						break;
					case 48:
						{ return new Symbol ( NAME, yytext ( ) ); }
					case -49:
						break;
					case 49:
						{ return new Symbol ( NAME, yytext ( ) ); }
					case -50:
						break;
					case 50:
						{ return new Symbol ( NAME, yytext ( ) ); }
					case -51:
						break;
					case 51:
						{ return new Symbol ( NAME, yytext ( ) ); }
					case -52:
						break;
					case 52:
						{ return new Symbol ( NAME, yytext ( ) ); }
					case -53:
						break;
					case 53:
						{ return new Symbol ( NAME, yytext ( ) ); }
					case -54:
						break;
					case 54:
						{ return new Symbol ( NAME, yytext ( ) ); }
					case -55:
						break;
					case 55:
						{ return new Symbol ( NAME, yytext ( ) ); }
					case -56:
						break;
					case 56:
						{ return new Symbol ( NAME, yytext ( ) ); }
					case -57:
						break;
					case 57:
						{ return new Symbol ( NAME, yytext ( ) ); }
					case -58:
						break;
					case 58:
						{ return new Symbol ( NAME, yytext ( ) ); }
					case -59:
						break;
					case 59:
						{ return new Symbol ( NAME, yytext ( ) ); }
					case -60:
						break;
					case 60:
						{ return new Symbol ( NAME, yytext ( ) ); }
					case -61:
						break;
					case 61:
						{ return new Symbol ( NAME, yytext ( ) ); }
					case -62:
						break;
					case 62:
						{ return new Symbol ( NAME, yytext ( ) ); }
					case -63:
						break;
					case 63:
						{ return new Symbol ( NAME, yytext ( ) ); }
					case -64:
						break;
					case 64:
						{ return new Symbol ( NAME, yytext ( ) ); }
					case -65:
						break;
					case 65:
						{ return new Symbol ( NAME, yytext ( ) ); }
					case -66:
						break;
					case 66:
						{ return new Symbol ( NAME, yytext ( ) ); }
					case -67:
						break;
					case 67:
						{ return new Symbol ( NAME, yytext ( ) ); }
					case -68:
						break;
					case 68:
						{ return new Symbol ( NAME, yytext ( ) ); }
					case -69:
						break;
					case 69:
						{ return new Symbol ( NAME, yytext ( ) ); }
					case -70:
						break;
					case 70:
						{ return new Symbol ( NAME, yytext ( ) ); }
					case -71:
						break;
					case 71:
						{ return new Symbol ( NAME, yytext ( ) ); }
					case -72:
						break;
					case 72:
						{ return new Symbol ( NAME, yytext ( ) ); }
					case -73:
						break;
					case 73:
						{ return new Symbol ( NAME, yytext ( ) ); }
					case -74:
						break;
					case 74:
						{ return new Symbol ( NAME, yytext ( ) ); }
					case -75:
						break;
					case 75:
						{ return new Symbol ( NAME, yytext ( ) ); }
					case -76:
						break;
					default:
						yy_error(YY_E_INTERNAL,false);
					case -1:
					}
					yy_initial = true;
					yy_state = yy_state_dtrans[yy_lexical_state];
					yy_next_state = YY_NO_STATE;
					yy_last_accept_state = YY_NO_STATE;
					yy_mark_start();
					yy_this_accept = yy_acpt[yy_state];
					if (YY_NOT_ACCEPT != yy_this_accept) {
						yy_last_accept_state = yy_state;
					}
				}
			}
		}
	}
}
