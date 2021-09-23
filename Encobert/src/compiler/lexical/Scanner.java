/* The following code was generated by JFlex 1.4.1 on 22/09/21 23:09 */

package compiler.lexical;

//Importaciones

import compiler.syntax.sym;
import compiler.lexical.Token;
import es.uned.lsi.compiler.lexical.ScannerIF;
import es.uned.lsi.compiler.lexical.LexicalError;
import es.uned.lsi.compiler.lexical.LexicalErrorManager;


//Directivas


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.1
 * on 22/09/21 23:09 from the specification file
 * <tt>C:/Users/Andres/Encobert/Encobert/doc/specs/scanner.flex</tt>
 */
public class Scanner implements java_cup.runtime.Scanner, ScannerIF {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int COMMENT = 1;
  public static final int COMILLASDOB = 2;

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  1,  0,  1,  1,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     1,  0,  8,  0,  0,  0,  0,  0,  5,  7,  6,  0,  9, 23, 30,  0, 
    10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 22, 21,  0, 25, 24,  0, 
     0, 35, 31, 39, 36, 32, 41, 33, 45, 34, 11, 11, 38, 42, 28, 26, 
    44, 11, 27, 40, 29, 43, 46, 47, 11, 37, 11, 19,  0, 20,  0,  0, 
     0, 11, 11, 15, 17, 16,  2, 11, 11,  3, 11, 11, 11, 11,  4, 14, 
    12, 11, 13, 11, 11, 18, 11, 11, 11, 11, 11,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\3\2\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\4\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\4\4\1\22\13\4\2\3\1\1"+
    "\1\23\1\4\1\24\1\4\1\25\1\26\1\27\1\30"+
    "\2\4\1\31\10\4\1\32\2\4\1\33\7\4\1\34"+
    "\1\35\4\4\1\36\5\4\1\37\3\4\1\40\1\4"+
    "\1\41\3\4\1\42\4\4\1\43\1\44\1\45\2\4"+
    "\1\46\13\4\1\47\1\4\1\50\1\51\1\52\4\4"+
    "\1\53\1\54\2\4\1\55\5\4\1\56\1\57\2\4"+
    "\1\60\3\4\1\61\1\4\1\62\1\63\2\4\1\64";

  private static int [] zzUnpackAction() {
    int [] result = new int[148];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\60\0\140\0\220\0\220\0\300\0\360\0\u0120"+
    "\0\220\0\220\0\220\0\220\0\u0150\0\u0180\0\u01b0\0\220"+
    "\0\220\0\u01e0\0\220\0\220\0\220\0\u0210\0\u0240\0\u0270"+
    "\0\u02a0\0\220\0\u02d0\0\u0300\0\u0330\0\u0360\0\u0390\0\u03c0"+
    "\0\u03f0\0\u0420\0\u0450\0\u0480\0\u04b0\0\u04e0\0\u0510\0\u0540"+
    "\0\220\0\u0570\0\220\0\u05a0\0\220\0\220\0\360\0\360"+
    "\0\u05d0\0\u0600\0\360\0\u0630\0\u0660\0\u0690\0\u06c0\0\u06f0"+
    "\0\u0720\0\u0750\0\u0780\0\360\0\u07b0\0\u07e0\0\360\0\u0810"+
    "\0\u0840\0\u0870\0\u08a0\0\u08d0\0\u0900\0\u0930\0\220\0\220"+
    "\0\u0960\0\u0990\0\u09c0\0\u09f0\0\360\0\u0a20\0\u0a50\0\u0a80"+
    "\0\u0ab0\0\u0ae0\0\360\0\u0b10\0\u0b40\0\u0b70\0\360\0\u0ba0"+
    "\0\360\0\u0bd0\0\u0c00\0\u0c30\0\360\0\u0c60\0\u0c90\0\u0cc0"+
    "\0\u0cf0\0\360\0\360\0\360\0\u0d20\0\u0d50\0\360\0\u0d80"+
    "\0\u0db0\0\u0de0\0\u0e10\0\u0e40\0\u0e70\0\u0ea0\0\u0ed0\0\u0f00"+
    "\0\u0f30\0\u0f60\0\360\0\u0f90\0\360\0\360\0\360\0\u0fc0"+
    "\0\u0ff0\0\u1020\0\u1050\0\360\0\360\0\u1080\0\u10b0\0\360"+
    "\0\u10e0\0\u1110\0\u1140\0\u1170\0\u11a0\0\360\0\360\0\u11d0"+
    "\0\u1200\0\360\0\u1230\0\u1260\0\u1290\0\360\0\u12c0\0\360"+
    "\0\360\0\u12f0\0\u1320\0\360";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[148];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\4\1\5\1\6\2\7\1\10\1\11\1\12\1\13"+
    "\1\14\1\15\1\7\1\16\6\7\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\1\7\1\35\1\36\1\37\2\7"+
    "\1\40\1\7\1\41\1\42\1\7\1\43\1\7\1\44"+
    "\1\45\5\5\1\46\1\47\51\5\10\50\1\51\47\50"+
    "\62\0\1\7\1\52\1\7\5\0\11\7\7\0\4\7"+
    "\1\0\21\7\2\0\3\7\5\0\11\7\7\0\4\7"+
    "\1\0\21\7\6\0\1\53\63\0\1\15\47\0\3\7"+
    "\5\0\3\7\1\54\5\7\7\0\4\7\1\0\21\7"+
    "\24\0\1\55\64\0\1\56\30\0\3\7\5\0\11\7"+
    "\7\0\1\7\1\57\2\7\1\0\12\7\1\60\6\7"+
    "\2\0\3\7\5\0\11\7\7\0\4\7\1\0\1\7"+
    "\1\61\17\7\2\0\3\7\5\0\11\7\7\0\1\62"+
    "\3\7\1\0\21\7\2\0\3\7\5\0\11\7\7\0"+
    "\1\63\1\64\2\7\1\0\6\7\1\65\7\7\1\66"+
    "\2\7\2\0\3\7\5\0\11\7\7\0\1\67\3\7"+
    "\1\0\1\7\1\70\17\7\2\0\3\7\5\0\11\7"+
    "\7\0\2\7\1\71\1\7\1\0\7\7\1\72\11\7"+
    "\2\0\3\7\5\0\11\7\7\0\2\7\1\73\1\7"+
    "\1\0\12\7\1\74\6\7\2\0\3\7\5\0\11\7"+
    "\7\0\1\7\1\75\1\76\1\7\1\0\21\7\2\0"+
    "\3\7\5\0\11\7\7\0\1\77\3\7\1\0\21\7"+
    "\2\0\3\7\5\0\11\7\7\0\1\100\3\7\1\0"+
    "\21\7\2\0\3\7\5\0\11\7\7\0\1\101\3\7"+
    "\1\0\4\7\1\102\14\7\2\0\3\7\5\0\11\7"+
    "\7\0\1\103\3\7\1\0\21\7\2\0\3\7\5\0"+
    "\11\7\7\0\1\7\1\104\2\7\1\0\21\7\2\0"+
    "\3\7\5\0\11\7\7\0\4\7\1\0\4\7\1\105"+
    "\14\7\2\0\3\7\5\0\11\7\7\0\1\7\1\106"+
    "\2\7\1\0\21\7\6\0\1\107\60\0\1\110\50\0"+
    "\10\50\1\0\47\50\2\0\2\7\1\111\5\0\11\7"+
    "\7\0\4\7\1\0\21\7\2\0\3\7\5\0\4\7"+
    "\1\112\4\7\7\0\4\7\1\0\21\7\2\0\3\7"+
    "\5\0\11\7\7\0\3\7\1\113\1\0\10\7\1\114"+
    "\10\7\2\0\3\7\5\0\11\7\7\0\3\7\1\115"+
    "\1\0\21\7\2\0\3\7\5\0\11\7\7\0\4\7"+
    "\1\0\14\7\1\116\4\7\2\0\3\7\5\0\11\7"+
    "\7\0\4\7\1\0\15\7\1\117\3\7\2\0\3\7"+
    "\5\0\11\7\7\0\4\7\1\0\1\7\1\120\17\7"+
    "\2\0\3\7\5\0\11\7\7\0\1\121\3\7\1\0"+
    "\21\7\2\0\3\7\5\0\11\7\7\0\4\7\1\0"+
    "\2\7\1\122\16\7\2\0\3\7\5\0\11\7\7\0"+
    "\4\7\1\0\5\7\1\123\13\7\2\0\3\7\5\0"+
    "\11\7\7\0\4\7\1\0\11\7\1\124\7\7\2\0"+
    "\3\7\5\0\11\7\7\0\3\7\1\125\1\0\21\7"+
    "\2\0\3\7\5\0\11\7\7\0\1\7\1\126\2\7"+
    "\1\0\21\7\2\0\3\7\5\0\11\7\7\0\4\7"+
    "\1\0\5\7\1\127\13\7\2\0\3\7\5\0\11\7"+
    "\7\0\2\7\1\130\1\7\1\0\21\7\2\0\3\7"+
    "\5\0\11\7\7\0\1\7\1\131\2\7\1\0\21\7"+
    "\2\0\3\7\5\0\11\7\7\0\4\7\1\0\7\7"+
    "\1\132\11\7\2\0\3\7\5\0\11\7\7\0\4\7"+
    "\1\0\5\7\1\133\13\7\2\0\3\7\5\0\11\7"+
    "\7\0\1\134\3\7\1\0\21\7\2\0\3\7\5\0"+
    "\11\7\7\0\1\7\1\135\2\7\1\0\21\7\2\0"+
    "\3\7\5\0\11\7\7\0\4\7\1\0\3\7\1\136"+
    "\15\7\1\0\1\5\3\7\5\0\11\7\7\0\4\7"+
    "\1\0\21\7\2\0\3\7\5\0\5\7\1\137\3\7"+
    "\7\0\4\7\1\0\21\7\2\0\3\7\5\0\11\7"+
    "\7\0\4\7\1\0\14\7\1\140\4\7\2\0\3\7"+
    "\5\0\11\7\7\0\1\141\3\7\1\0\21\7\2\0"+
    "\3\7\5\0\11\7\7\0\4\7\1\0\1\7\1\142"+
    "\17\7\2\0\3\7\5\0\11\7\7\0\4\7\1\0"+
    "\1\7\1\143\17\7\2\0\3\7\5\0\11\7\7\0"+
    "\2\7\1\144\1\7\1\0\21\7\2\0\3\7\5\0"+
    "\11\7\7\0\4\7\1\0\7\7\1\145\11\7\2\0"+
    "\3\7\5\0\11\7\7\0\4\7\1\0\3\7\1\146"+
    "\15\7\2\0\3\7\5\0\11\7\7\0\4\7\1\0"+
    "\1\7\1\147\17\7\2\0\3\7\5\0\11\7\7\0"+
    "\4\7\1\0\1\7\1\150\17\7\2\0\3\7\5\0"+
    "\11\7\7\0\4\7\1\0\4\7\1\151\14\7\2\0"+
    "\3\7\5\0\11\7\7\0\4\7\1\0\11\7\1\152"+
    "\7\7\2\0\3\7\5\0\11\7\7\0\4\7\1\0"+
    "\11\7\1\153\7\7\2\0\3\7\5\0\11\7\7\0"+
    "\4\7\1\0\14\7\1\154\4\7\2\0\3\7\5\0"+
    "\11\7\7\0\4\7\1\0\10\7\1\155\10\7\2\0"+
    "\3\7\5\0\11\7\7\0\3\7\1\156\1\0\21\7"+
    "\2\0\3\7\5\0\6\7\1\157\2\7\7\0\4\7"+
    "\1\0\21\7\2\0\3\7\5\0\11\7\7\0\1\7"+
    "\1\160\2\7\1\0\21\7\2\0\3\7\5\0\11\7"+
    "\7\0\1\7\1\161\2\7\1\0\21\7\2\0\3\7"+
    "\5\0\11\7\7\0\4\7\1\0\1\7\1\162\17\7"+
    "\2\0\3\7\5\0\11\7\7\0\2\7\1\163\1\7"+
    "\1\0\21\7\2\0\3\7\5\0\11\7\7\0\4\7"+
    "\1\0\2\7\1\164\16\7\2\0\3\7\5\0\11\7"+
    "\7\0\4\7\1\0\6\7\1\165\12\7\2\0\3\7"+
    "\5\0\11\7\7\0\3\7\1\166\1\0\21\7\2\0"+
    "\3\7\5\0\11\7\7\0\4\7\1\0\1\7\1\167"+
    "\17\7\2\0\3\7\5\0\11\7\7\0\4\7\1\0"+
    "\7\7\1\170\11\7\2\0\3\7\5\0\11\7\7\0"+
    "\4\7\1\0\1\7\1\171\17\7\2\0\3\7\5\0"+
    "\11\7\7\0\4\7\1\0\1\7\1\172\17\7\2\0"+
    "\3\7\5\0\7\7\1\173\1\7\7\0\4\7\1\0"+
    "\21\7\2\0\3\7\5\0\11\7\7\0\2\7\1\174"+
    "\1\7\1\0\21\7\2\0\3\7\5\0\11\7\7\0"+
    "\4\7\1\0\5\7\1\175\13\7\2\0\3\7\5\0"+
    "\11\7\7\0\4\7\1\0\4\7\1\176\14\7\2\0"+
    "\3\7\5\0\11\7\7\0\4\7\1\0\1\7\1\177"+
    "\17\7\2\0\3\7\5\0\11\7\7\0\4\7\1\0"+
    "\1\7\1\200\17\7\2\0\3\7\5\0\11\7\7\0"+
    "\4\7\1\0\5\7\1\201\13\7\2\0\3\7\5\0"+
    "\11\7\7\0\4\7\1\0\3\7\1\202\3\7\1\203"+
    "\1\7\1\204\7\7\2\0\3\7\5\0\10\7\1\205"+
    "\7\0\4\7\1\0\21\7\2\0\3\7\5\0\11\7"+
    "\7\0\2\7\1\206\1\7\1\0\21\7\2\0\3\7"+
    "\5\0\11\7\7\0\1\7\1\207\2\7\1\0\21\7"+
    "\2\0\3\7\5\0\11\7\7\0\4\7\1\0\14\7"+
    "\1\210\4\7\2\0\3\7\5\0\11\7\7\0\2\7"+
    "\1\211\1\7\1\0\21\7\2\0\3\7\5\0\11\7"+
    "\7\0\2\7\1\212\1\7\1\0\21\7\2\0\3\7"+
    "\5\0\11\7\7\0\3\7\1\213\1\0\21\7\2\0"+
    "\3\7\5\0\3\7\1\214\5\7\7\0\4\7\1\0"+
    "\21\7\2\0\3\7\5\0\11\7\7\0\1\7\1\215"+
    "\2\7\1\0\21\7\2\0\3\7\5\0\11\7\7\0"+
    "\3\7\1\216\1\0\21\7\2\0\3\7\5\0\11\7"+
    "\7\0\1\7\1\217\2\7\1\0\21\7\2\0\3\7"+
    "\5\0\6\7\1\220\2\7\7\0\4\7\1\0\21\7"+
    "\2\0\3\7\5\0\11\7\7\0\4\7\1\0\1\7"+
    "\1\221\17\7\2\0\3\7\5\0\11\7\7\0\4\7"+
    "\1\0\3\7\1\222\15\7\2\0\3\7\5\0\11\7"+
    "\7\0\2\7\1\223\1\7\1\0\21\7\2\0\3\7"+
    "\5\0\11\7\7\0\4\7\1\0\2\7\1\224\16\7";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4944];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\1\2\11\3\1\4\11\3\1\2\11\1\1"+
    "\3\11\4\1\1\11\16\1\1\11\1\1\1\11\1\1"+
    "\2\11\30\1\2\11\114\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[148];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  LexicalErrorManager lexicalErrorManager = new LexicalErrorManager ();
  private int comment_count = 0;
  private int comilladob_count = 0;
  
  Token crearToken (int x){
  						   Token token = new Token (x);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;}


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Scanner(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Scanner(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzPushbackPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead < 0) {
      return true;
    }
    else {
      zzEndRead+= numRead;
      return false;
    }
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = zzPushbackPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) throws LexicalError {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new LexicalError(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  throws LexicalError {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
    	if (comment_count>0)  {                                            
            LexicalError error = new LexicalError ();
            error.setLine (yyline + 1);
            error.setColumn (yycolumn + 1);
            error.setLexema (yytext ());
            lexicalErrorManager.lexicalError (error + " "+ comment_count + " Comentarios mal balanceado");
            }
            
    if (comilladob_count>0)  {                                            
            LexicalError error = new LexicalError ();
            error.setLine (yyline + 1);
            error.setColumn (yycolumn + 1);
            error.setLexema (yytext ());
            lexicalErrorManager.lexicalError (error + " "+ comment_count + "Comilla doble mal balanceado");
            }
  yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException, LexicalError {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = zzLexicalState;


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 29: 
          { comment_count = comment_count - 1;
       			if (comment_count == 0) { yybegin(YYINITIAL); }
          }
        case 53: break;
        case 26: 
          { return crearToken(sym.IF);
          }
        case 54: break;
        case 14: 
          { return crearToken(sym.DOSPUNTOS);
          }
        case 55: break;
        case 23: 
          { return crearToken(sym.DISYUNCION);
          }
        case 56: break;
        case 52: 
          { return crearToken(sym.WRITESTRING);
          }
        case 57: break;
        case 2: 
          { LexicalError error = new LexicalError ();
                           error.setLine (yyline + 1);
                           error.setColumn (yycolumn + 1);
                           error.setLexema (yytext ());
                           lexicalErrorManager.lexicalError (error);
          }
        case 58: break;
        case 4: 
          { return crearToken(sym.ID);
          }
        case 59: break;
        case 31: 
          { return crearToken(sym.END);
          }
        case 60: break;
        case 30: 
          { return crearToken(sym.NEGACION);
          }
        case 61: break;
        case 41: 
          { return crearToken(sym.CONST);
          }
        case 62: break;
        case 32: 
          { return crearToken(sym.AND);
          }
        case 63: break;
        case 18: 
          { return crearToken(sym.ACREGISTRO);
          }
        case 64: break;
        case 45: 
          { return crearToken(sym.MODULE);
          }
        case 65: break;
        case 48: 
          { return crearToken(sym.WRITELN);
          }
        case 66: break;
        case 42: 
          { return crearToken(sym.FALSE);
          }
        case 67: break;
        case 24: 
          { return crearToken(sym.OF);
          }
        case 68: break;
        case 44: 
          { return crearToken(sym.RECORD);
          }
        case 69: break;
        case 43: 
          { return crearToken(sym.RETURN);
          }
        case 70: break;
        case 25: 
          { return crearToken(sym.TO);
          }
        case 71: break;
        case 15: 
          { return crearToken(sym.RESTA);
          }
        case 72: break;
        case 22: 
          { return crearToken(sym.ASIGNACION);
          }
        case 73: break;
        case 1: 
          { return crearToken(sym.LITERAL);
          }
        case 74: break;
        case 21: 
          { return crearToken(sym.ACVECTOR);
          }
        case 75: break;
        case 50: 
          { Token token = new Token(1);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
          }
        case 76: break;
        case 47: 
          { return crearToken(sym.INTEGER);
          }
        case 77: break;
        case 51: 
          { return crearToken(sym.PROCEDURE);
          }
        case 78: break;
        case 19: 
          { comilladob_count = comilladob_count - 1;
       			if (comilladob_count == 0) { yybegin(YYINITIAL); }
          }
        case 79: break;
        case 46: 
          { return crearToken(sym.BOOLEAN);
          }
        case 80: break;
        case 35: 
          { return crearToken(sym.TRUE);
          }
        case 81: break;
        case 34: 
          { return crearToken(sym.VAR);
          }
        case 82: break;
        case 13: 
          { return crearToken(sym.PUNTOCOMA);
          }
        case 83: break;
        case 36: 
          { return crearToken(sym.TYPE);
          }
        case 84: break;
        case 39: 
          { return crearToken(sym.BEGIN);
          }
        case 85: break;
        case 10: 
          { return crearToken(sym.ENTERO);
          }
        case 86: break;
        case 16: 
          { return crearToken(sym.MAYOR);
          }
        case 87: break;
        case 38: 
          { return crearToken(sym.ELSE);
          }
        case 88: break;
        case 37: 
          { return crearToken(sym.THEN);
          }
        case 89: break;
        case 33: 
          { return crearToken(sym.FOR);
          }
        case 90: break;
        case 12: 
          { return crearToken(sym.CIERCORCHE);
          }
        case 91: break;
        case 6: 
          { return crearToken(sym.PRODUCTO);
          }
        case 92: break;
        case 20: 
          { comment_count++; yybegin (COMMENT);
          }
        case 93: break;
        case 40: 
          { return crearToken(sym.ARRAY);
          }
        case 94: break;
        case 11: 
          { return crearToken(sym.ABRECORCHE);
          }
        case 95: break;
        case 17: 
          { return crearToken(sym.IGUAL);
          }
        case 96: break;
        case 28: 
          { comment_count = comment_count + 1;
          }
        case 97: break;
        case 49: 
          { return crearToken(sym.WRITEINT);
          }
        case 98: break;
        case 27: 
          { return crearToken(sym.DO);
          }
        case 99: break;
        case 9: 
          { return crearToken(sym.COMA);
          }
        case 100: break;
        case 7: 
          { return crearToken(sym.CIERPARENT);
          }
        case 101: break;
        case 3: 
          { 
          }
        case 102: break;
        case 5: 
          { return crearToken(sym.ABREPARENT);
          }
        case 103: break;
        case 8: 
          { comilladob_count++; yybegin (COMILLASDOB);
          }
        case 104: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}