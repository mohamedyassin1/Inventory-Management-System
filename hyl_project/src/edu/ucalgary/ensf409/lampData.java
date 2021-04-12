/**
 * Holds data pertaining to a specific lamp in the database
 * 
 *	@author Kyle Hasan, John Abo , Farhad Alishov, Mohamed Yassin
 *	@version 1.3
 *	@since 1.0
 */

package edu.ucalgary.ensf409;
//class to store lamp data
class lampData {
	//contains data for lamp entry
	 boolean Bulb = false;
	 boolean Base = false;
	 String ID = "";
	int price;
	 /**
	  * Constructor
	  * @param id id of lamp entry
	  * @param base1 base of lamp entry
	  * @param bulb1 bulb of lamp entry
     
	  * @param price price of lamp entry
	
	  */

	public lampData( String id, String base1, String bulb1, int price) {
		this.ID = id;
		this.price = price;
		//converts Y and N into booleans
		if(base1.equals("Y")) {
			Base = true;
			
		}
		
		if(bulb1.equals("Y")) {
			Bulb = true;
			
		}
	}
}
