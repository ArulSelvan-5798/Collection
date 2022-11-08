package collection;

public class Movie {
	String name;
	String heroName;
	boolean isBlockbuster;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setHeroName(String heroName) {
		this.heroName=heroName;
	}
	public String getHeroName() {
		return heroName;
	}
	public void setisBlockbuster(boolean isBlockbuster) {
		this.isBlockbuster=isBlockbuster;
	}
	public boolean getisBlockbuster() {
		return isBlockbuster;
	}
  Movie(String name,String heroName,boolean isBlockbuster){
	  this.name=name;
	  this.heroName=heroName;
	  this.isBlockbuster=isBlockbuster;
	   }
  public String toString() {
	  return name+" "+heroName+" "+isBlockbuster;
  }

}
