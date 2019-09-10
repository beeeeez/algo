package hashing;

public class searching {

	String[][] data = { { "K0", "Abby Linc", "18", "al@ch.org" }, { "K1", "John Doe", "23", "jd@abc.com" },
			{ "K2", "Janet Basco", "39", "jb@ids.com" }, { "K3", "Charles River", "64", "cr@neit.edu" },
			{ "K4", "Barack Obama", "50", "bo@democrat.gov" }, { "K5", "Sarah Palin", "44", "sp@republican.gov" },
			{ "K6", "John Mccain", "72", "jm@it.com" }, { "K7", "George Bush", "54", "gb@white.org" },
			{ "K8", "Al Gore", "56", "ag@vp.edu" }, { "K9", "Dick Cheney", "60", "dc@vp.org" }, };

	String[][] dataHashed = new String[135][4];
	
	public int hash(String keyToSearch) {
		System.out.println("Searching for "+keyToSearch + " using hash method. ");
		
		int foundAtIndex=hashRoutine(keyToSearch);
		System.out.print("key " +keyToSearch + " is found at index "+foundAtIndex );
		System.out.println(" after 1 read. ");
		return foundAtIndex;
	}
	public int sequential(String keyToSearch) {

		System.out.println("Searching for " + keyToSearch + " using sequential method.");
		int i;
		for (i = 0; i < data.length; i++) {
			System.out.println("read " + i + ", key = " + data[i][0]);
			if (keyToSearch.equalsIgnoreCase(data[i][0])) {
				break;
			}
		}

		if (i >= data.length) {
			i = -1;
			System.out.println("key " + keyToSearch + " is not found");
		} else {
			System.out.println("key " + keyToSearch + " is found at index " + i);
			System.out.println(" after " + (i + 1) + " reads.");
		}
		return i;
	}

	public String displayRecord(int index) {
		return "Record - " 
				+data[index][0]
				+", "
				+data[index][1]
				+", "
			    +data[index][2]
				+", "
			    +data[index][3];
												
	}
	
	public int hashRoutine(String keyToSearch) {
		int len = keyToSearch.length();
		int sum=0;
		for(int i = 0;i<len;i++) {
			int decVal=keyToSearch.charAt(i);
			sum=sum+decVal;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		searching search = new searching();
		
		int rowFound = search.hash("K9");
		search.displayRecord(rowFound);
	}
}
