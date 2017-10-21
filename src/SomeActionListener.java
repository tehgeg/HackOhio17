import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class SomeActionListener implements ActionListener{
	
	private JButton jb;
	public SomeActionListener(JButton jb) {
		this.jb = jb;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
        System.out.println("Fuck");
    }
}
