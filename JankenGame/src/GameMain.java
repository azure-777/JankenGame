import javax.swing.JFrame;

public class GameMain {

	public static void main(String[] args) {

        // ウィンドウの設定
	    JFrame frame=new JFrame("じゃんけんゲーム");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(640,480);
	    frame.setLocationRelativeTo(null);
	    frame.setResizable(false);

	    Panel.createPanel(frame);

	    // ウィンドウの表示
	    frame.setVisible(true);
	}
}
