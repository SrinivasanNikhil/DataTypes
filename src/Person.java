
public class Person {

	String name;
	int age;
	double height;
	double weight;
	
	public Person(String aName, int aAge, double aHeight, double aWeight)
	{
		name = aName;
		age = aAge;
		height = aHeight;
		weight = aWeight;
		
	}
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String pName) {
		name = pName;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int pAge) {
		age = pAge;
	}
	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(double pHeight) {
		height = pHeight;
	}
	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double pWeight) {
		weight = pWeight;
	}
	
	
}
