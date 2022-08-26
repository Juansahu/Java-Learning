package java_data_types;
abstract class Marks{
	abstract int getPercentage();
}
class StudentAA extends Marks {
	 int Subject1;
	 int Subject2;
	 int Subject3;
	 StudentAA(int Subject1, int Subject2, int Subject3){
		this.Subject1 = Subject1;
		this.Subject2 = Subject2;
		this.Subject3 = Subject3;
	}
	int getPercentage(){
		int percentage =  ((Subject1+ Subject2+ Subject3)/3);
		return percentage;
	}
}
class StudentBB extends Marks{
	 int Subject1;
	 int Subject2;
	 int Subject3;
	 int Subject4;
	 StudentBB(int Subject1, int Subject2, int Subject3, int Subject4){
		this.Subject1 = Subject1;
		this.Subject2 = Subject2;
		this.Subject3 = Subject3;
		this.Subject4 = Subject4;
	}
	int getPercentage() {
		int percentage =  ((Subject1+ Subject2+ Subject3+Subject4)/4);
		return percentage;
	}
}
public class GetPercentage_Task {

	public static void main(String[] args) {
		StudentAA StudentA = new StudentAA(40,50,70);
		System.out.println(("Percentage of student A : "+StudentA.getPercentage()));
		StudentBB StudentB = new StudentBB(30,50,60,80);
		System.out.println(("Percentage of student B : "+StudentB.getPercentage()));
	}
}
