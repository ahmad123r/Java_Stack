package project_class;

import java.util.ArrayList;

public class Protfilo {
	public ArrayList<Project_Class> Projects;
	public Protfilo() {
		this.Projects=new ArrayList<Project_Class>() ;
	}
	 public void AddToPortfolio(Project_Class p) {
	        Projects.add(p);
	    }
	 public String getPortfolio() {
	        return Projects.toString();
	    }
	    public void showPortfolio() {
	        double total = 0;
	        for (Project_Class p : Projects) {
	            total += p.getIntialCost();
	            System.out.println(p.elevatorPitch());
	        }
	        System.out.println(String.format("Total Cost: %f", total));

	    }
	 

}
