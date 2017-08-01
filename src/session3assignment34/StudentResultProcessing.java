/**

 * StudentResultProcessing.Java   
 * version  1.1
 * compiled on 2nd August 2017
 */
package session3assignment34;


/**
 * 
 *Importing the Scanner class from java.util package to take user input
 *
 */
import java.util.Scanner ; 
/**
 * 
 * This class will depict the StudentResultProcessing child class.
 * Author: chhaya yadav
 *
 */
public class StudentResultProcessing extends Student{
	
	protected String studentres ;

	public static final Scanner nr = new Scanner(System.in);
	

// Child class parameterized constructor declaration
	
public StudentResultProcessing(int roll_number){
		
	
		super(roll_number);       // Calling parent class parameterized constructor	
		
	}
	
// Method declared for user input
	
public void inputMarks(StudentResultProcessing s){
				
		System.out.println("Enter the physics marks ");
				
	   	       s.p_marks = nr.nextInt();     // Take input from user
				 
		System.out.println("Enter the chemistry marks ");
						
			   s.c_marks = nr.nextInt();    // Take input from user
						 
		System.out.println("Enter the maths marks ");
								
			   s.m_marks = nr.nextInt();    // Take input from user
		 
	}
	
//Method declared to calculate the student result	
public void calculateResult(StudentResultProcessing s){
				 
		 s.studentres = s.result(s.getRollNr(), s.p_marks, s.c_marks, s.m_marks);
			
	     System.out.println("STUDENT RESULT :" + s.studentres);       // print the student result	
		 	
		
	}
	
//Method declared to display the student details	
	
public void displayStudentDetails(StudentResultProcessing s){
			
		System.out.println("-----------------------------------------");
		System.out.println("==============STUDENT DETAILS================");
		System.out.println("STUDENT ROLL NUMBER :"+   s.getRollNr());
	    System.out.println("STUDENT NAME        : "+  s.getName());
        System.out.println("STUDENT PHONE NR    : "+  s.getPhoneNr()) ;
	    System.out.println("STUDENT CLASS       : "+  s.getClassStandard());
	       		
	}

public static void main(String[] args) {
	
		StudentResultProcessing s1 = new StudentResultProcessing(1111);        // declaration of first object of child class
		
		s1.setRollNr(1111);
			
		s1.setName("AKSHAY BAJAJ") ;
		
		s1.setPhoneNr("9886952197") ;
		
		s1.setClassStandard("V");
		       
		s1.displayStudentDetails(s1);
		
		s1.inputMarks(s1);
		
		s1.calculateResult(s1);
        

        
        StudentResultProcessing s2 = new StudentResultProcessing(2222);         // declaration of second object of child class
		
		s2.setRollNr(2222);
			
		s2.setName("MANOJ KUMAR YADAV") ;
		
		s2.setPhoneNr("9886952199") ;
		
		s2.setClassStandard("VI");
			
        s2.displayStudentDetails(s2);
        
		s2.inputMarks(s2);
		
		s2.calculateResult(s2);
        
        
        
        StudentResultProcessing s3 = new StudentResultProcessing(3333);        // declaration of third object of child class
		
		s3.setRollNr(3333);
			
		s3.setName("CHHAYA YADAV") ;
		
		s3.setPhoneNr("9886952198") ;
		
		s3.setClassStandard("VIII");
			
        s3.displayStudentDetails(s3);
        
		s3.inputMarks(s3);
		
		s3.calculateResult(s3);
        
       nr.close();
        
	}

}
