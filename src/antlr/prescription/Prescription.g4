grammar Prescription;

// START:tokens
INT 	:   '0'..'9'+ ;

NUMBER  :   ('zero' | 'one' | 'two' |'three'|'four'|'five'|'six'|'seven'|'eight'|'nine'|'ten')+;
TIMEUNIT:   ('hour'| 'day'| 'week'|'month'|'year')+;
TIMEUNIT_PLURAL : TIMEUNIT's'+;

UNIT 	:   ('mg' | 'g' | 'kg' | 'mcg' | 'ng') ;

INTERVAL_FREQ : ('once'|'twice'|'thrice');
INTERVAL_MODIFIER : ('per' | 'times per' |'x' | 'times');
INTERVAL_LENGTH : ('daily'|'weekly'|'monthly'|'yearly'|'annually');

STRING	:   ('a'..'z'|'A'..'Z')+ ;
ID  	:   ('a'..'z'|'A'..'Z')+ ;



NEWLINE	:   '\r'? '\n' ;
WS  	:   (' '|'\t'|'\n'|'\r')+ {skip();} ;
	
script : expr+; 

expr :
          expr 'THEN' expr
		| assignment NEWLINE
        | a=action m=medication d=dose t=timing
        | expr NEWLINE
        | NEWLINE
;

assignment: 
	  'ACTION' ID '=' a=action
	| 'DOSE' ID '=' d=dose
	| 'MEDICATION' ID '=' m=medication
	| 'TIMING' ID '=' t=timing
;

action : 		
        ID 	
    |   s=STRING 
;

medication : s=STRING;

dose: 
    INT u=('mg' | 'g' | 'kg' | 'mcg' | 'ng')
;

timing : 
        interval  'FOR'  duration 
    |   interval
;

interval:
        (INTERVAL_FREQ|INT|NUMBER)  (TIMEUNIT|INTERVAL_LENGTH|TIMEUNIT_PLURAL) //once daily, twice weekly etc...
    |   (INTERVAL_FREQ|INT|NUMBER)  INTERVAL_MODIFIER  (TIMEUNIT|TIMEUNIT_PLURAL|INTERVAL_LENGTH) //5 per day, 5 times per day, 5xdaily, 
   | 	(INTERVAL_FREQ|INT|NUMBER) //once, twice etc....
;

duration: 
        n=(NUMBER|INT) tu=TIMEUNIT_PLURAL
    |   n=(NUMBER|INT) tu=TIMEUNIT
;

