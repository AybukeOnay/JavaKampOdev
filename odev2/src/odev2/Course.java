package odev2;

public class Course {
	int id;
	String name;
	String educator;
	boolean completionStatus;
	String description;
	
	public Course() {
		
	}
	
	public Course(int vrb_id,String vrb_name,String vrb_educator,String vrb_description) {
		this.id=vrb_id;
		this.name=vrb_name;
		this.educator=vrb_educator;
		this.description=vrb_description;
	}
}
