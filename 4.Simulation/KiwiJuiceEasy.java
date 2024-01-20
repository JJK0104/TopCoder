
public class KiwiJuiceEasy {
	
  public static void main(String[] args){
    int[] capacities = {20,20};
    int[] bottles = {5,8};
    int[] fromId = {0};
    int[] toId = {1};
    int[] Returns = thePouring(capacities, bottles, fromId, toId);
    
    for(int i = 0; i < Returns.length; i++){
      System.out.println(Returns[i]);
    }
  }

	public static int[] thePouring(int[] capacities, int[] bottles, int[] fromId, int[] toId) {
		
		for (int i = 0; i < fromId.length; i++) {
			int f = fromId[i];
			int t = toId[i];
			int space = capacities[t] - bottles[t];
			
			if(space >= bottles[f]) {
				int vol = bottles[f];
				bottles[t] += vol;
				bottles[f] = 0;
			} else {
				int vol = space;
				bottles[t] += vol;
				bottles[f] -= vol;
			}
		}
		//
		return bottles;
	}
}
