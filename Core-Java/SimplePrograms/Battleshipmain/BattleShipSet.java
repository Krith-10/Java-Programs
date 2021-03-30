package Battleshipmain;

import java.util.ArrayList;

public class BattleShipSet{
	private ArrayList<String> dotComNames = new ArrayList<String>();
	private String s;
	
	public void setName(String name) {
		s = name;
	}
	
	public void setLocation(ArrayList<String> loc) {
		dotComNames = loc;
	}
	
	public String checkYourself(String userInput) {
		String result = "miss";
		int index = dotComNames.indexOf(userInput);
		if(index >= 0) {
			dotComNames.remove(index);
			
			if(dotComNames.isEmpty()) {
				result = "sink";
				System.out.println(result);
				System.out.println("You sinked "+s+".Great!!");
			}
			
			else {
				result = "hit";
			}
		}
		return result;
	}
	
}