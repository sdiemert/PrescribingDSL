grammar Prescription;

// START:tokens
INT 	:   '0'..'9'+ ;

NUMBER  :   ('zero' | 'one' | 'two' |'three'|'four'|'five'|'six'|'seven'|'eight'|'nine'|'ten')+;
TIMEUNIT:   ('hour'| 'day'| 'week'|'month'|'year')+;
TIMEUNIT_PLURAL : TIMEUNIT's'+;

UNIT 	:   ('mg' | 'g' | 'kg' | 'mcg' | 'ng');

INTERVAL_FREQ : ('once'|'twice'|'thrice');
INTERVAL_MODIFIER : ('per' |'times'| 'times per' |'x');
INTERVAL_LENGTH : ('daily'|'weekly'|'monthly'|'yearly'|'annually');

STRING	:   ('a'..'z'|'A'..'Z'|'-')+ ;
ID  	:   ('a'..'z'|'A'..'Z')+ ;



NEWLINE	:   '\r'? '\n' ;
WS  	:   (' '|'\t'|'\n'|'\r')+ {skip();} ;
	
script : expr+; 

expr :
          expr 'THEN' expr
        | atom
		| assignment NEWLINE
        | expr NEWLINE
        | NEWLINE
;

atom : a=action m=medication d=dose t=timing;

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

medication : (STRING)+;

dose: titratingDose | specificDose | dose_amount dose_unit;

dose_amount: INT; 

dose_unit:	UNIT;

specificDose: '('(dose_amount dose_unit',')*? dose_amount dose_unit')';

titratingDose:  'TITRATE' titratingDirection  titratingStart titratingStop  titratingChange titratingInterval;

titratingDirection: 'up'|'down';
titratingStop: 'TO' dose_amount dose_unit; 
titratingStart: 'FROM' dose_amount dose_unit; 
titratingChange: 'BY' dose_amount dose_unit; 
titratingInterval: 'per' duration_amount? duration_unit; //per 2 days, per 7 days, per 1 week

timing : 
        interval specificTiming 'FOR'  duration
    |   interval specificTiming
    |   interval 'FOR' duration 
    | 	interval
;

instant :  INT; 

specificTiming : '('(instant',')*? instant')'; //(8, 12, 14)  


interval:
        frequency intervalLength //once daily, twice daily... etc...
    |   frequency  INTERVAL_MODIFIER  intervalLength //5 per day, 5 times per day, 5xdaily, 
    | 	frequency //once, twice etc....
;

frequency: (INTERVAL_FREQ|INT|NUMBER) ;
intervalLength:  (TIMEUNIT|INTERVAL_LENGTH|TIMEUNIT_PLURAL); //once daily, twice weekly etc...
duration: n=duration_amount tu=duration_unit;
duration_amount: (NUMBER|INT);
duration_unit: (TIMEUNIT_PLURAL | TIMEUNIT);

