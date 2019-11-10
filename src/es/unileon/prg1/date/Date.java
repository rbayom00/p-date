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
													error.append("Date error:Value"+year+" not valid. Value can not be below 0");
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
		
		
		public boolean isSameMonth(Date date) {
			if(date.getMonth() == this.month) {
				return true;
			}else {
				return false;
			}
		}
		
		
	
		public boolean isSameYear(Date date) {
			boolean result = false;
			if(date.getYear() == this.year) {
				result=true;
			}
			return result;
		}









		public boolean isMonthDayRight(Date date) {
		boolean right = false;		
		switch(this.month) {
			case(1):
			case(3):
			case(5):
			case(7):
			case(8):
			case(10):
			case(12):
			if (this.day <=31 && this.day>0) {	
			right = true;
			}
			break;
			case(4):
			case(6):
			case(9):
			case(11):
			if (this.day <=30 && this.day>0) {
			right = true;	
			}
			break;
			case(2):
				if(this.day <=28 && this.day>0) {
					right = true;
				}
			default:;
			}
			return right;
	}


		



		public String whichSeason(Date date) {
			String resultado = new String("none");
		switch(this.month) {
			case(3):
			case(4):
			case(5):
			case(6):
				resultado = "Is Spring";
				break;
			case(7):
			case(8):
			case(9):
				resultado = "Is Summer";
				break;
			case(10):
			case(11):
			    resultado = "Is Autumn";
				break;
			case(12):
			case(1):
			case(2):
				resultado = "Is Winter";
				break;
			default:
			
			}
		return resultado;
		}
		
		public String nameOfMonth(Date date) {
			String resultado=new String("none");
		switch(this.month) {
			case(1):
				resultado = "Enero";
				break;
			case(2):
				resultado = "Febrero";
				break;
			case(3):
				resultado = "Marzo";
				break;
			case(4):
				resultado = "Abril";
				break;
			case(5):
				resultado = "Mayo";
				break;
			case(6):
				resultado = "Junio";
				break;
			case(7):
				resultado = "Julio";
				break;
			case(8):
				resultado = "Agosto";
				break;
			case(9):
				resultado = "Septembre";
				break;
			case(10):
				resultado = "Octubre";
				break;
			case(11):
				resultado = "Noviembre";
				break;
			case(12):
				resultado = "Diciembre";
				break;
			default:
			}
		return resultado;
		}
		
		public int monthsTilEndOfYear(Date date) {
			int months=0;
		switch(this.month) {
		case(1):
		months = 11;
		case(2):
		months = 10;
		case(3):
		months = 9;
		case(4):
		months = 8;
		case(5):
		months = 7;
		case(6):
		months = 6;
		case(7):
		months = 5;
		case(8):
		months = 4;
		case(9):
		months = 3;
		case(10):
		months = 2;
		case(11):
		months = 1;
		case(12):
		months = 0;
		default:
		}
		return months;
		}
		
		public String toString() {
			return "Date [day=" + day + ", month=" +month+ ", year=" +year+ "]";
		}
		
}		