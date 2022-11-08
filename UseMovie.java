package collection;

import java.util.ArrayList;

public class UseMovie {
	public static void main(String[] args) {
		Movie m1=new Movie("Manmadhan","Simbu",true);
		Movie m2=new Movie("Vaanam","Simbu",true);
		Movie m3=new Movie("Vallavan","Simbu",true);
		
		ArrayList<Movie> m=new ArrayList<>();
		m.add(m1);
		m.add(m2);
		m.add(m3);
		
		for(int i=0;i<m.size();i++) {
			if(m.get(i).getName().charAt(m.get(i).getName().length()/2)=='a') {
				System.out.println(m.get(i));
			}
		}
	}

}
