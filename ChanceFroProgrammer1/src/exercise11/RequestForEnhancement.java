package exercise11;

//Define an annotation type for an enhancement request with elements 
//id, synopsis, engineer, and date. Specify the default value as unassigned 
//for engineer and unknown for date.

/**
* Describes the Request-for-Enhancement (RFE) annotation type.
*/

public @interface RequestForEnhancement {
	
	int id();
	String synopsis();
	String engineer() default "[unassigned]";
	String date() default "[unknown]";

}
