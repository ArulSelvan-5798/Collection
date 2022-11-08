package collection;

import java.util.ArrayList;
import java.util.Arrays;

public class UseStudent {
	public static void main(String[] args) {
		Student s1=new Student("Arul",20000,"Male");
		Student s2=new Student("Simbu",20000,"Male");
		Student s3=new Student("Hansika",20000,"FeMale");
		Student s4=new Student("CableRaja",20000,"Male");
		Student s5=new Student("Manmadhan",20000,"Male");
		Student s6=new Student("Vallavan",20000,"Male");
		
		ArrayList<Student> s=new ArrayList<>();
		ArrayList<String> li=new ArrayList<>(Arrays.asList("SilambarasanTR","Arul"));
		System.out.println(li);
		System.out.println("***************");
		
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		s.add(s5);
		s.add(s6);
		for(int i=0;i<s.size();i++) {
			System.out.println(s.get(i).getName().toUpperCase());
		}
		System.out.println("------------");
		
		//n enhanced for
	    for(Student o:s) {
	    	System.out.println(o.getFees());
	    }
	    System.out.println("------------");
		//n for each
	    
		s.forEach(x-> {
			if(x.getGender().equalsIgnoreCase("female")) {
				System.out.println(x);
			}
		});
		
		System.out.println("==============================");
		
		s.forEach(x-> {
			if(x.getName().equalsIgnoreCase("Simbu")){
				System.out.println(x);
			}
					
		});
		
	}

}
