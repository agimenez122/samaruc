package compiler.lexical;

//Importaciones

import compiler.syntax.sym;
import compiler.lexical.Token;
import es.uned.lsi.compiler.lexical.ScannerIF;
import es.uned.lsi.compiler.lexical.LexicalError;
import es.uned.lsi.compiler.lexical.LexicalErrorManager;


//Directivas

%%
%public
%class Scanner
%char
%line
%column
%cup
%full
%state COMMENT COMILLASDOB 

%implements ScannerIF
%scanerror LexicalError

//Otras directivas

%{
  LexicalErrorManager lexicalErrorManager = new LexicalErrorManager ();
  private int comment_count = 0;
  private int comilladob_count = 0;
  
  Token crearToken (int x){
  						   Token token = new Token (x);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;}
%}  

//Definicion de End of File

%eof{
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
%eof}
  
//Definicion de macros

ESPACIO_BLANCO=[ \t\r\n\f]
fin = "fin"{ESPACIO_BLANCO}
COMENTARIOINI= "(*"
COMENTARIOFIN= "*)"
COMIDOB= "\""
COMA= ","
ENTERAS=[0-9]+
ID=[a-zA-Z]([a-zA-Z]|[0-9])*

%%

<YYINITIAL> 
{
    "(*" {comment_count++; yybegin (COMMENT);}
    "\"" {comilladob_count++; yybegin (COMILLASDOB);}
			       
    // incluir aqui el resto de las reglas patron - accion
    "procedure" 	{
			   Token token = new Token(1);
                           token.setLine (yyline + 1);
                           token.setColumn (yycolumn + 1);
                           token.setLexema (yytext ());
           			       return token;
			}

{ENTERAS} { return crearToken(sym.ENTERO); }
			
//DELIMITADORES		

"("   { return crearToken(sym.ABREPARENT); } 
")"   { return crearToken(sym.CIERPARENT); } 
"["   { return crearToken(sym.ABRECORCHE); } 
"]"   { return crearToken(sym.CIERCORCHE); } 

";"   { return crearToken(sym.PUNTOCOMA); } 
":"   { return crearToken(sym.DOSPUNTOS); } 
		
//OPERADORES

"-"   { return crearToken(sym.RESTA); }
"*"   { return crearToken(sym.PRODUCTO); }
">"   { return crearToken(sym.MAYOR); }
"="   { return crearToken(sym.IGUAL); }
"OR"   { return crearToken(sym.DISYUNCION); }
"NOT"   { return crearToken(sym.NEGACION); }

":="   { return crearToken(sym.ASIGNACION); }
","  { return crearToken(sym.COMA); }
"."   { return crearToken(sym.ACREGISTRO); }
"[]"   { return crearToken(sym.ACVECTOR); }

//PALABRA CLAVE

"BEGIN"   { return crearToken(sym.BEGIN); }
"AND"     { return crearToken(sym.AND); }
"ARRAY"   { return crearToken(sym.ARRAY); }
"BOOLEAN" { return crearToken(sym.BOOLEAN); }
"CONST"   { return crearToken(sym.CONST); }
"DO"      { return crearToken(sym.DO); }
"ELSE"    { return crearToken(sym.ELSE); }
"END"     { return crearToken(sym.END); }
"FALSE"   { return crearToken(sym.FALSE); }
"FOR"     { return crearToken(sym.FOR); }
"IF"      { return crearToken(sym.IF); }
"INTEGER" { return crearToken(sym.INTEGER); }
"MODULE"  { return crearToken(sym.MODULE); }
"NOT"     { return crearToken(sym.NOT); }
"OF"      { return crearToken(sym.OF); }
"OR"      { return crearToken(sym.OR); }
"PROCEDURE"   { return crearToken(sym.PROCEDURE); }
"RECORD"      { return crearToken(sym.RECORD); }
"RETURN"      { return crearToken(sym.RETURN); }
"THEN"    { return crearToken(sym.THEN); }
"TO"      { return crearToken(sym.TO); }
"TRUE"    { return crearToken(sym.TRUE); }
"TYPE"    { return crearToken(sym.TYPE); }
"VAR"     { return crearToken(sym.VAR); }
"WRITESTRING" { return crearToken(sym.WRITESTRING); }
"WRITEINT"    { return crearToken(sym.WRITEINT); }
"WRITELN"     { return crearToken(sym.WRITELN); }

//IDENTIFICADORES

{ID} { return crearToken(sym.ID); }

{ESPACIO_BLANCO}	{}
   
{fin} {}

    // error en caso de coincidir con ning�n patr�n
	[^]     
                        {                                               
                           LexicalError error = new LexicalError ();
                           error.setLine (yyline + 1);
                           error.setColumn (yycolumn + 1);
                           error.setLexema (yytext ());
                           lexicalErrorManager.lexicalError (error);
                        }
}

//Tratamos los comentarios

<COMMENT>  
{
	{COMENTARIOINI}   { comment_count = comment_count + 1; }
	{COMENTARIOFIN}   { comment_count = comment_count - 1;
       			if (comment_count == 0) { yybegin(YYINITIAL); }
    }
	[^] {}
}

//Tratamos las comillas

<COMILLASDOB>  
{
	{COMIDOB}   { comilladob_count = comilladob_count - 1;
       			if (comilladob_count == 0) { yybegin(YYINITIAL); }
    }
	[^\"]* {return crearToken(sym.LITERAL);}
}