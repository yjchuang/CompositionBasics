import java.util.ArrayList;
import java.util.Scanner;

public class CompositionBasicsApp {

	public static void main(String[] args) {
		
		Person bobby = new Person();
		Job job = new Job();
		ArrayList<Education> education = new ArrayList<Education>();
		//Education e = new Education();
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++)
		{
			Education e = new Education();
			System.out.println("Enter School name: ");
			String school = sc.nextLine();
			e.setNameOfSchool(school);
			
			System.out.println("Enter years: ");
			int years = sc.nextInt();
			sc.nextLine();
			e.setYearsOfEducation(years);
			
			education.add(e);
		}
		
		bobby.setEducation(education);
		
		//bobby.addSchool("U. of Maryland", 4);
		
		job.setId(1122);
		job.setSalary(2000);
		job.setRole("engineer");
		
		bobby.setJob(job);
		
		//for(Education edu : bobby.getEducation())
		//{
			//System.out.println(edu);
		//System.out.println("School Name: " + edu.getNameOfSchool() + ";\n years attended: " + edu.getYearsOfEducation());
			System.out.println(bobby.toString());
		//}
		
		System.out.println(bobby.getSalary());	
		sc.close();
	}
	
}

