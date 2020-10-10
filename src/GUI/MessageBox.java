package GUI;
import javax.swing.JOptionPane;
public class MessageBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = JOptionPane.showInputDialog("Enter your name");
		String numStr = JOptionPane.showInputDialog("Enter your number");
		String position;
		JOptionPane.showMessageDialog(null, "Your name is" + name, "User Data", JOptionPane.PLAIN_MESSAGE);
		//JOptionPane.showMessageDialog(null, "Name "+name, "User", JOptionPane.PLAIN_MESSAGE);
	}

}
