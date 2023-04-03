import java.util.ArrayList;

public class APprep {

	
	 public static int numberOfLeapYears(int year1, int year2) {

	 int total = 0;
	 for(int i = year1; i <= year2; i++) {
		 if (isLeapYear(i)) {
			 total++;
		 }
	 }
	 return total;
	 }
	
	
	 public static int dayOfWeek(int month, int day, int year) { 
		 
		 int ugh = firstDayOfYear(year) + dayOfYear(month,day,year);
		 
		 return ugh%7;
	  }
	 
	 public ArrayList<String> getDelimitersList(String[] tokens){
		 private String openDel;
		 private String closeDel;
		 
		 
		 public Delimiters(String open, String close) {
			 
		 }
		 public ArrayList<String> getDelimitersList(String[] tokens){
			 ArrayList<String> delimiters = new ArrayList<String>();
			 
			 for(int i = 0; i < tokens.length; i++) {
					if(tokens[i].equals(openDel)||tokens[i].equals(closeDel)) {
						delimiters.add(tokens[i]);
					}
					
				}
			 return delimiters;
		 }
		 public boolean isBalanced(ArrayList<String> delimiters) {
			 int balanced = 0;
			 for(int i = 0; i < delimiters.size(); i++) {
				 if(delimiters.get(i).equals(openDel)) {
					 balanced++;
				 }
				 else if (delimiters.get(i).equals(closeDel)) {
					 balanced--;
				 }
				 if (balanced <0) {
					 return false;
				 }
			 }
			 if (balanced == 0) {
				 return true;
			 }
			 
			 return false;
		 }
		 
		 
		 
	 }
	 
}
	 
public class StepTracker {
	
	int totalSteps;
	int activeDays;
	int totalDays;
	
	public void addDailySteps(int x) {		
		if(x >= 10000) {
			activeDays++;
		}
		
	totalSteps+=x;	
	totalDays++;
	
	}
	public int activeDays() {
		return activeDays;
	}
	public double averageSteps() {
		if (totalSteps == 0||totalDays == 0) {
			return 0.0;
		}
		
		return (double)(totalSteps)/totalDays;
	}
	
}




















