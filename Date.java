public class Date
{
	/********** CONSTANTS *********/
	public static final String DEFAULT_MONTH = "Nocember";
	public static final int DEFAULT_DAY = 7;
	public static final int DEFAULT_YEAR = 1794;


	/********** INSTANCE VARIABLES **********/	
	private String month;
	private int day;
	private int year; 
	
	
	/********** CONSTRUCTORS **********/
	public Date()
	{
		this(DEFAULT_MONTH, DEFAULT_DAY, DEFAULT_YEAR);
	}
	
	public Date(String month, int day, int year)
	{
		boolean isValid;
		
		isValid = this.setAll(month, day, year); 
		if( !isValid )
		{
			System.out.println("ERROR: bad date in full constructor!");
			System.out.println("Exiting program...");
			System.exit(0);
		}
	}
	public Date(int month, int day, int year)
	{
		this(Date.monthToString(month), day, year);
	}
	
	public Date(Date original)
	{
		if (original != null)
		{
			this.setAll(original.month, original.day, original.year);
		}
		else
		{
			System.out.println("ERROR: trying to copy NULL Date object. Exiting program...");
			System.exit(0);
		}
		
	}

	
	/********** SETTERS / MUTATORS **********/
	public boolean setMonth(String month)
	{
		boolean isValid;

		isValid = Date.isValidMonth(month);

		if (isValid) {
			this.month = month;
		}

		return isValid;

	}
	
	public boolean setMonth(int month)
	{
		boolean isValid;

		isValid = (month >= 1 && month <= 12);
		
		if(isValid)
		{
			this.month = Date.monthToString(month); 
		}
		
		return isValid;
	}
	
	public boolean setDay(int day)
	{
		boolean isValid;
		
		isValid = Date.isValidDay(day);
		
		if(isValid)
		{
			this.day = day;
		}
		
		return isValid;
	}
	
	public boolean setYear(int year)
	{
		boolean isValid;
		
		isValid = Date.isValidYear(year);
		
		if(isValid)
		{
			this.year = year;
		}
		
		return isValid;
	}
	
	public boolean setAll(String month, int day, int year) {
		boolean isValid;
		
		isValid = Date.isValidMonth(month) && Date.isValidDay(day)
					&& Date.isValidYear(year);		
		if(isValid)
		{
			this.setMonth(month);
			this.setDay(day);
			this.setYear(year);
		}
					
		return isValid;
	}
	
	

	/********** GETTERS / ACCESSOR METHODS **********/
	public String getMonth()
	{
		return this.month;
	}
	
	public int getDay()
	{
		return this.day;
	}

	public int getYear()
	{
		return this.year;
	}
	
	
	
	/********** OTHER REQUIRED METHODS **********/
	@Override
	public String toString()
	{
		return Date.monthToInt(this.month) + "/" + this.day + "/" + this.year;
	}
	
	@Override
	public boolean equals(Object other)
	{
		Date otherDate;
		
		if(other == null)
		{
			return false;
		}
		else if(! (other instanceof Date))
		{
			return false;
		}
		else
		{
			otherDate = (Date) other;
			return this.month.equals(otherDate.month) && this.day == otherDate.day
					&& this.year == otherDate.year;
		}
	}

	public boolean precedes(Date other)
	{
		int otherMonth, thisMonth;
		otherMonth = Date.monthToInt(other.month);
		thisMonth = Date.monthToInt(this.month);

		return (this.year < other.year) ||
			(this.year == other.year && thisMonth < otherMonth) ||
			(this.year == other.year && thisMonth == otherMonth && this.day < other.day);
	}

	/********** VALIDITY METHODS **********/

	public static boolean isValidMonth(String month)
	{
		return Date.monthToInt(month) != 0;
	}

	public static boolean isValidDay(int day)
	{
		return day >= 1 && day <= 31;
	}
	
	public static boolean isValidYear(int year)
	{
		return year >= 1000 && year <= 9999;
	}
	
	
	/********** HELPER METHODS **********/

	private static int monthToInt(String month)
	{
		int result;
		
		if(month.equalsIgnoreCase("January"))
		{
			result = 1;
		}
		else if (month.equalsIgnoreCase("February"))
		{
			result = 2;
		}
		else if (month.equalsIgnoreCase("March"))
		{
			result = 3;
		}
		else if (month.equalsIgnoreCase("April"))
		{
			result = 4;
		}
		else if (month.equalsIgnoreCase("May"))
		{
			result = 5;
		}
		else if (month.equalsIgnoreCase("June"))
		{
			result = 6;
		}
		else if (month.equalsIgnoreCase("July"))
		{
			result = 7;
		}
		else if (month.equalsIgnoreCase("August"))
		{
			result = 8;
		}
		else if(month.equalsIgnoreCase("September"))
		{
			result = 9;
		}
		else if (month.equalsIgnoreCase("October"))
		{
			result = 10;
		}
		else if (month.equalsIgnoreCase("November"))
		{
			result = 11;
		}
		else if (month.equalsIgnoreCase("December"))
		{
			result = 12;
		}
		else
		{
			result = 0; 
		}
		
		return result;
	}
	
	private static String monthToString(int month)
	{
		String result;
		
		switch(month)
		{
			case 1:
				result = "January";
				break;
			case 2:
				result = "February";
				break;
			case 3:
				result = "March";
				break;
			case 4:
				result = "April";
				break;
			case 5:
				result = "May";
				break;
			case 6:
				result = "June";
				break;
			case 7:
				result = "July";
				break;
			case 8:
				result = "August";
				break;
			case 9:
				result = "September";
				break;
			case 10:
				result = "October";
				break;
			case 11:
				result = "November";
				break;
			case 12:
				result = "December";
				break;
			default:
				result = null;	//indicates error
				break;
		}
		
		return result;
	}
}