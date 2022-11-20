
public class VictoryOrDefeat {
	public static int point = 0;

	public static final void decisionVictoryOrDefeat(int computerHand, int playerHand) {
		int playerHandTemp = playerHand;
		playerHandTemp++;

		if(playerHand == computerHand) {
			Panel.headerLabel.setText("あいこ");
		}
		else if((playerHand == 3 && computerHand == 1) || (playerHandTemp == computerHand)){
			point+=1;
			Panel.headerLabel.setText("勝ち");
		}
		else {
			point=0;
			Panel.headerLabel.setText("負け");
		}
	}

}
