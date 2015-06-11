package by.kurs;

public class Puples implements Comparable {
	
	int id;
	String name;
	String surname;
	String clas;
	int math;
	int rus;
	int english;
	int average;
	String classhead;
	
	public Puples(int id, String name, String surname, String clas, int math,
			int rus, int english, String id_classhead) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.clas = clas;
		this.math = math;
		this.rus = rus;
		this.english = english;
		average = (math + rus + english)/3;
		this.classhead = id_classhead;
		
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
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getClas() {
		return clas;
	}
	
	public void setClas(String clas) {
		this.clas = clas;
	}
	
	public int getMath() {
		return math;
	}
	
	public void setMath(int math) {
		this.math = math;
	}
	
	public int getRus() {
		return rus;
	}
	
	public void setRus(int rus) {
		this.rus = rus;
	}
	public int getEnglish() {
		return english;
	}
	
	public void setEnglish(int english) {
		this.english = english;
	}

	public int getAverage() {
		return average;
	}

	public void setAverage(int average) {
		this.average = average;
	}
	
	@Override
	public String toString() {
		return "Puples [id=" + id + ", name=" + name + ", surname=" + surname
				+ ", clas=" + clas + ", math=" + math + ", rus=" + rus
				+ ", english=" + english + ", average=" + average + "]";
	}

	


	
	public static int makeAverage (int math, int rus, int english){
		return (math + rus + english)/3;
	}


	@Override
	public int compareTo(Object o) {
		 int compareAverage = ((Puples)o).getAverage();
		return  compareAverage - this.average;
	}

	public String getId_classhead() {
		return classhead;
	}

	public void setId_classhead(String id_classhead) {
		this.classhead = id_classhead;
	}
	

	
}
