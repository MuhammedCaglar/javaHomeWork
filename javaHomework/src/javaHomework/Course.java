package javaHomework;

public class Course {
	
	public Course() {
		System.out.println("Course Constructor �al��t�.");
	};
	
	public Course(int id,String name,int completePercent) {
		this.id=id;
		this.name=name;
		this.completePercent=completePercent;
		System.out.println("Course Constructor �al��t�.");
	};
	
	int id;
    String name;
    int completePercent;
    
}
