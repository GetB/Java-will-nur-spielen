package SwingObjects;

import java.awt.Dimension;

import javax.swing.JPanel;

public class SizedPanel extends JPanel{
	
	int preferredWidth = 400;
	int preferredHeight = 300;
	
	public SizedPanel(int w, int h){
		preferredHeight = h;
		preferredWidth = w;
	}
	
	public SizedPanel(){}
	
	@Override
	public Dimension getPreferredSize(){
		return new Dimension(preferredWidth, preferredHeight);
	}
	
	public static void main(String[] args) {
		ShowInFrame.show(new SizedPanel());
	}

}
