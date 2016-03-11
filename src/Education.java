
public class Education {
	private String nameOfSchool;
	private int yearsOfEducation;
	
	public String getNameOfSchool() {
		return nameOfSchool;
	}

	public void setNameOfSchool(String nameOfSchool) {
		this.nameOfSchool = nameOfSchool;
	}

	public int getYearsOfEducation() {
		return yearsOfEducation;
	}




	public void setYearsOfEducation(int yearsOfEducation) {
		this.yearsOfEducation = yearsOfEducation;
	}

	@Override
	public String toString()
	{
		return "Name of School: " + nameOfSchool + "\n" +
				"Years of education: " + yearsOfEducation + "\n";
	}
}
