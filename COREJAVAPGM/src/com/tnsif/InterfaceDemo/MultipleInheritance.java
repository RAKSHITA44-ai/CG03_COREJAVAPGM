package com.tnsif.InterfaceDemo;

interface TechnicalRole {
	void DesignArchitect();
}

interface ManagementalRole {
	void ManageTeam();
}


class ProjectManager implements TechnicalRole, ManagementalRole {
	
	private String name;
	private String Projectname;
	private int teamsize;
	private double ProjectBudget;
	
	public ProjectManager(String name, String Projectname, int teamsize,double ProjectBudget) {
		super();
		this.name=name;
		Projectname=Projectname;
		this.teamsize=teamsize;
		this.ProjectBudget=ProjectBudget;
	}
	

	@Override
	public void ManageTeam() {
		System.out.println("Managing a team of"+teamsize+"Developer");
		
		
	}
	
	

	@Override
	public void DesignArchitect() {
		System.out.println(name+"is architect for"+Projectname);
		
		
	}
	void checkBudget() {
		if(ProjectBudget>1000000) {
			System.out.println("High Budget Project");
		}
	}
	
	
	void displayProjectDetails() {
		System.out.println("Project Details");
		System.out.println("manager"+name);
		System.out.println("Project"+Projectname);
		System.out.println("Size"+teamsize);
		System.out.println("Budget"+ProjectBudget);
	}
	
}


public class MultipleInheritance {
	public static void main(String[] args) {
		ProjectManager m=new ProjectManager("Anil","E-Commerce Platform",8,250000);
		m.DesignArchitect();
		m.ManageTeam();
		m.checkBudget();
		m.displayProjectDetails();
	}

}
