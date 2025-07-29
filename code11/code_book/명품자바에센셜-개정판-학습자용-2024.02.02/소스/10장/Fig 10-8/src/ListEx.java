import javax.swing.*;
import java.awt.*;

public class ListEx extends JFrame {
	private String [] fruits= {"apple", "banana", "kiwi", "mango",
			"pear", "peach", "berry", "strawberry", "blackberry"};
	public ListEx() {
		setTitle("리스트 만들기  예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JList<String> strList = new JList<String>(fruits); // 문자열 리스트 생성
		c.add(strList);
	
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String [] args) {
		new ListEx();
	}
} 