package com.School.Ajay.Project;

public class Teachers {
	
	 
		private int id;
		private String name;
		
	   public Teachers(int id, String name) {
		   this.id = id;
		   this.name = name;
	   }
	   public Teachers() {}
	   public Teachers(String name) {
		   this.name = name;
	   }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
