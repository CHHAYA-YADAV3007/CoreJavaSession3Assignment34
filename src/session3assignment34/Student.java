/**

 * student.Java   
 * version  1.1
 * compiled on 2nd August 2017
 */
package session3assignment34;


/**
 * 
 * This class will depict the student class.
 * @author chhaya yadav
 *
 */
public class Student{
	
//Instance Variable Declaration
	
	private int roll_nr ;
	
	private String name ;
	
	private String phone_nr ;
	
	private String class_standard ;
	
	public int p_marks ;
	
	public int m_marks ;
	
	public int c_marks ;
	
	
//parent class parameterized constructor	
public Student(int roll_nr){
		
		this.roll_nr = roll_nr ;
		
		p_marks = 0 ;
		
		c_marks = 0 ;
		
		m_marks = 0 ;
		
	
	}
	
public int getRollNr(){
		return roll_nr ;
	}
	
public void setRollNr(int roll_nr){
		this.roll_nr = roll_nr ;
	}

public String getName() {
		return name;
	}

public void setName(String name) {
		this.name = name;
	}

public String getPhoneNr() {
		return phone_nr;
	}

public void setPhoneNr(String phone_nr) {
		this.phone_nr = phone_nr;
	}

public String getClassStandard() {
		return class_standard;
	}

public void setClassStandard(String class_standard) {
		this.class_standard = class_standard;
	}
	
// Method result to determine the student result based on the marks provided during user input
public String result(int roll_nr, int p_marks, int c_marks, int m_marks){
		
		int     average = 0 ;
		
		String  res  ;
		
		average = ((p_marks + c_marks + m_marks)/3) ;
		
		if (average >= 35 && p_marks >= 35 && c_marks >= 35 && m_marks >=35) {
			res = "PASS" ;
		} else {
			res = "FAIL" ;
 		}
				
		return res ;
	
	}
}