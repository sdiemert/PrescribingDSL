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
        | expr NEWLINE
        | NEWLINE
;

repeat: 'REPEAT' repeatValue | repeatValue 'REPEATS'; 

repeatValue: INT; 

atom : action medication dose timing repeat?;

action : 		
        D 	
    |   s=STRING 
;

medication : (STRING)+;

dose: titratingDose | fixedDose; 

fixedDose: specificDose | doseAtom;

doseAtom: doseAmount doseUnit; 
doseAmount: INT; 

doseUnit:	UNIT;

specificDose: '('(doseAtom',')*? doseAtom')';

titratingDose:  'TITRATE' titratingDirection  titratingStart titratingStop  titratingChange titratingInterval;

titratingDirection: 'up'|'down';
titratingStop: 'TO' doseAtom; 
titratingStart: 'FROM' doseAtom; 
titratingChange: 'BY' doseAtom; 
titratingInterval: 'per' durationAmount? durationUnit; //per 2 days, per 7 days, per 1 week

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
duration: durationAmount durationUnit;
durationAmount: (NUMBER|INT); 
durationUnit: (TIMEUNIT_PLURAL | TIMEUNIT);

