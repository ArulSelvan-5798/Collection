package collection;

public class Student {
	private String name;
	private int fees ;
	private String gender;
	
	public void setName(String name){
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setFees(int fees) {
		this.fees=fees;
	}
	public String getFees() {
		return "Fees:"+fees;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}
	public String getGender(){
		return gender;
		}
   public Student(String name,int fees,String gender) {
	   this.name=name;
	   this.fees=fees;
	   this.gender=gender;
	   }
   public String toString() {
	   return name+" "+fees+" "+gender;
   }
}
