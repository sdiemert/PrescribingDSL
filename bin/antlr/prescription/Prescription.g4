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

dose: dose_amount u=dose_unit;

dose_amount: INT; 
dose_unit:	UNIT;

timing : 
        interval  'FOR'  duration 
    |   interval
;

interval:
        frequency interval_length
    |   frequency  INTERVAL_MODIFIER  interval_length //5 per day, 5 times per day, 5xdaily, 
    | 	frequency //once, twice etc....
;

frequency: (INTERVAL_FREQ|INT|NUMBER) ;
interval_length:  (TIMEUNIT|INTERVAL_LENGTH|TIMEUNIT_PLURAL); //once daily, twice weekly etc...
duration: n=duration_amount tu=duration_unit;
duration_amount: (NUMBER|INT);
duration_unit: (TIMEUNIT_PLURAL | TIMEUNIT);

