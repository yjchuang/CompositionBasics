import java.util.ArrayList;

//Person.java
public class Person {
	//composition has-a relationship
	private Job job;
	private ArrayList<Education> education;
	
	
	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public ArrayList<Education> getEducation() {
		return education;
	}

	public void setEducation(ArrayList<Education> education) {
		this.education = education;
	}

	public long getSalary() {
		return job.getSalary();
	}
	
	public void addSchool(String school, int years)
	{
		Education e = new Education();
		
		e.setNameOfSchool(school);
		e.setYearsOfEducation(years);
		
		education.add(e);
	}
	
	
	
	@Override
	public String toString()
	{
		String str = "";
		int years = 0;
		
		for (Education edu : education)
		{
			str += " " + edu.getNameOfSchool() + ",";
			years += edu.getYearsOfEducation();
		}
			return "Your " + 
				job.toString() + "\nThe schools you have attended: " + str + "\nYears of education: " + years;
	}
}

