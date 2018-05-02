import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test {
	
	
	private JFrame frame;

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 309);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JButton btnForward = new JButton("Press");
		btnForward.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("Hello!");
			}
		});
		frame.getContentPane().add(btnForward, BorderLayout.NORTH);
		
		JButton btnBackward = new JButton("Quit");
		btnBackward.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(Thread.currentThread().getPriority());
				System.exit(0);
			}
		});
		frame.getContentPane().add(btnBackward, BorderLayout.SOUTH);
	}

}
