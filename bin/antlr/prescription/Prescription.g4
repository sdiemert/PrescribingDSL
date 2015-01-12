grammar Prescription;

@header{
	import java.util.HashMap;
}
@members{
	HashMap memory = new HashMap();
}

// START:tokens
STRING	: 	('a'..'z'|'A'..'Z')+ ;
ID  	:   ('a'..'z'|'A'..'Z')+ ;
UNIT 	: 	('mg' | 'g' | 'kg' | 'mcg' | 'ng') ;
INT 	:   '0'..'9'+ ;
NEWLINE	:	'\r'? '\n' ;
WS  	:   (' '|'\t'|'\n'|'\r')+ {skip();} ;
	
script : expr+; 

expr :
	a=action m=medication d=dose t=timing NEWLINE {System.out.println("a="+$a.val+" m="+$m.val+" d="+$d.text+" t="+$t.text);}
	| expr 'THEN' expr NEWLINE
	| assignment NEWLINE
	| NEWLINE
;

assignment: 
	  'ACTION' ID '=' a=action {memory.put($ID.text, $a.text);}
	| 'DOSE' ID '=' d=dose {memory.put($ID.text, $d.text);}
	| 'MEDICATION' ID '=' m=medication {memory.put($ID.text, $m.text);}
	| 'TIMING' ID '=' t=timing {memory.put($ID.text, $t.text);}
;

action returns [String val]: 		
 	ID 		{ 
				String s = (String)memory.get($ID.text);
				if(s != null){
					$val = s;
				}
			}	
	| s=STRING {$val = $s.text; System.out.println("action: "+$val);} 
;

medication returns [String val]: s=STRING{$val = $s.text; System.out.println("med: "+$val);};

dose returns [String val]: INT u=('mg' | 'g' | 'kg' | 'mcg' | 'ng') {$val = $INT.text + $u.text; System.out.println("dose: "+$val);};

timing returns [String val] : x=STRING+? {$val = $x.text; System.out.println("timing: "+$x.text);}; 

