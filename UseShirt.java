package collection;

import java.util.ArrayList;

public class UseShirt {
	public static void main(String[] args) {
		Shirt s1=new Shirt("ABC",500,false);
		Shirt s2=new Shirt("BC",1000,true);
		Shirt s3=new Shirt("AC",700,true);
		Shirt s4=new Shirt("AAC",800,true);
		Shirt s5=new Shirt("CCC",900,true);
		
		ArrayList<Shirt> s=new ArrayList<>();
		ArrayList<Shirt> checked=new ArrayList<>();
		
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		s.add(s5);
		
		for(int i=0;i<s.size();i++) {
			System.out.println(s.get(i));
		}
		System.out.println("*************");
		// for each
		s.forEach(x->{
			if(x.getBrand().equals("ABC")) {
		System.out.println(x);
		
		}});
		System.out.println("**************");
		
		//n enhanced for
		
		for(Shirt o:s) {
			if(o.getIsChecked()==true) {
				checked.add(o);
			}
		}
		checked.forEach(x->System.out.println(x));
		}

	}
