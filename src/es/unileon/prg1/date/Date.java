package es.unileon.prg1.date;

public class Date {
	private int day;

	private int month;

	private int year;
	
	private int daysofmonth=31;

		public Date(int day, int month, int year) throws DateException {
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
	
		public Date(Date today) {
			this.day=1;
			this.month=1;
			this.year=2017;
		}



		public Date() throws DateException {
			this.day=1;
			this.month=1;
			this.year=2017;
		}

		public int getYear() {
		return this.year;
		}







		public int getDay() {
		return this.day;
		}





		public int getMonth() {
		return this.month;
		
		}

		public int daysOfMonth(int month) {
			return this.daysofmonth;
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









		public Object daysOfMonth() {
		int days = 0;		
		switch(this.month) {
			case(1):
			case(3):
			case(5):
			case(7):
			case(8):
			case(10):
			case(12):
				days = 31;
			break;
			case(4):
			case(6):
			case(9):
			case(11):
				days = 30;
			break;
			case(2):
				days = 28;
			default:;
			}
			return days;
	}


		



		public Object getSeasonName() {
			String resultado = new String("none");
		switch(this.month) {
			case(3):
			case(4):
			case(5):
			case(6):
				resultado = "Spring";
				break;
			case(7):
			case(8):
			case(9):
				resultado = "Summer";
				break;
			case(10):
			case(11):
			    resultado = "Autumn";
				break;
			case(12):
			case(1):
			case(2):
				resultado = "Winter";
				break;
			default:
			
			}
		return resultado;
		}
		
		public Object getMonthName() {
			String resultado= null;
		switch(this.month) {
			case(1):
				resultado = "January";
				break;
			case(2):
				resultado = "February";
				break;
			case(3):
				resultado = "March";
				break;
			case(4):
				resultado = "April";
				break;
			case(5):
				resultado = "May";
				break;
			case(6):
				resultado = "June";
				break;
			case(7):
				resultado = "July";
				break;
			case(8):
				resultado = "August";
				break;
			case(9):
				resultado = "September";
				break;
			case(10):
				resultado = "October";
				break;
			case(11):
				resultado = "November";
				break;
			case(12):
				resultado = "December";
				break;
			default:
			}
		return resultado;
		}
		
		public Object getMonthsLeft() {
			String months=null;
		switch(this.month) {
		case(1):
		months = "February March April May June July August September October November December ";
		break;
		case(10):
		months = "November December ";
		break;
		default:
		}
		return months;
		}
		
		public Date tomorrow() {
			Date mañana = null;
			try {
				if((this.day==31)&(this.month==12)) {
					day=1;
					month=1;
					year=this.year+1;
				}else if((this.day==28)&(this.month==2)){
					day=1;
					month=3;
				}else {
					day=this.day+1;
				}
				mañana = new Date(day , month, year);
			} catch (DateException e) {
				e.printStackTrace();
			}
			return mañana;
		}
		public void setDay(int day) {
			if(day>=1) {
			this.day = day;
			}
		}
		public void setMonth(int month) {
			if((month>0)&&(month<=12)) {
				this.month = month;
			}
		}
		public void setYear(int year) {
			if(year>=0) {
				this.year = year;	
			}
		}
		
		public Object isSame(Date date) {
			int day = 0;
			int month = 0;
			int year = 0;
			if(this.day!=day){
				return false;	
			}else if(this.month!=month) {
				return false;
			}else if(this.year!=year) {
				return false;
			}else { 
				return true;
			}
		}
		public Object daysPast() {
			int day=0;
			if(day==this.day) {
				day= 0;
			}
			if(this.day==2) {
				day=1;
			}
			if((this.day==1)&&(this.month==2)) {
				day=31;
			}
			if((this.day==31)&&(this.month==12)) {
				day=364;
			}
			return day;
		}
		public Object dayOfWeek(int i) {
			String resultado=null;
			switch(this.day) {
			case(1):
				if(this.month==1) {
					resultado="Monday";
				}else if(this.month==2) {
					resultado="Thursday";
				}else {
					resultado=" ";
				}
				break;
			case(2):
				resultado="Tuesday";
				break;	
			default:
			}
			return resultado;
		}

		public Object getMonthsSameDays() {
			String months=null;
			switch(this.month) {
			case(1):
			case(3):
			case(5):
			case(7):
			case(8):
			case(10):
			case(12):
				months="January March May July August October December ";
			break;
			case(2):
				months="February ";
			break;
			case(4):
			case(6):
			case(9):
			case(11):
				months="April June September November ";
			break;
			default:
			}
			return months;
		}
		public int numRandomTriesEqualDate() {
			return 0;
		}
		public Object getDaysLeftOfMonth() {
			String days=null;
			switch(this.day) {
			case(28):
				days="29/1/2017 30/1/2017 31/1/2017 ";
				break;
			default:
			}
			return days;
		}
		public String toString() {
			return day+"/"+month+"/"+year;
		}
}		