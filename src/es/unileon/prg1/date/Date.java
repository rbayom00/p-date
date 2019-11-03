package es.unileon.prg1.date;

public class Date {
	private int day;

	private int month;

	private int year;
	
	private int daysofmonth=31;

	Date(int day, int month, int year) throws DateException {
		this.day = day;
		this.month = month;
		this.year = year;		
		StringBuilder error = new StringBuilder();
		if (month<1 || month>12) {
									error.append("Date error:Value "+month+" not valid. Value between 1 and 12");
								} else if (day<1 || day>this.daysOfMonth(month)){
																					error.append("Date error:Value"+day+" not valid.");	
								} else if (year<0){
													error.append("Date error:Value"+year+" not valid. Value can not be 0");
								} else{
	  									this.day = day;
	  									this.month = month;
	  									this.year = year;
								}
		if(error.length()>0){
		throw new DateException(error.toString());
		}
	}
	public int getYear() {
		return this.year;
		
		}



	public int daysOfMonth(int month) {
		return this.daysofmonth;
	}



		public int getDay() {
		return this.day;
		
		}





		public int getMonth() {
		return this.month;
		
		}






		public boolean isSameDay(Date date) {
			if(date.getDay() == this.day) {
				return true;
			}else{
				return false;
			}
		}
		
		
		
		
		
	
		public boolean isSameYear(Date date) {
			boolean result = false;
			if(this.year==date.getYear() ) {
				result=true;
			}
			return result;
		}









		public boolean isMonthDayRight() {
		boolean right = false;		
		switch(this.month) {
			case(1):;
			case(3):;
			case(5):;
			case(7):;
			case(8):;
			case(10):;
			case(12):;
			if (this.day <=31 && this.day>0) {	
			right = true;
			}
			break;
			default:;
			}
			return right;
	}


		



		String whichSeason() {
			String resultado = new String();
		switch(this.month) {
			case(1):;
				resultado = "Is Spring";
				break;
			case(2):;
				resultado = "Is Summer";
				break;
			case(3):;
			    resultado = "Is Autumn";
				break;
			case(4):;
				resultado = "Is Winter";
				break;
			default:;
			
			}
		return resultado;
		}
		
		
		
		
		public String toString() {
			return "Date [day=" + day + ", month=" +month+ ", year=" +year+ "]";
		}
}		
