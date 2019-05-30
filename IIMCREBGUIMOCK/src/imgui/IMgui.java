package imgui;

import java.awt.*;
import javax.swing.*;

public class IMgui {
	
	private JFrame contacts;
	private JFrame message;
	private JFrame main;
	private JFrame add;
	private JFrame delete;
	private JFrame login;
	private JFrame register;
	private JFrame change;
	private JFrame status;
	
	
	public IMgui()
	{
		main = new JFrame("IIMCREB");
		contacts = new JFrame("IIMCREB Contact List");
		message = new JFrame("IIMCREB Message");
		add = new JFrame("IIMCREB Add Friend");
		delete = new JFrame("IIMCREB Delete Friend");
		login  = new JFrame("IIMCREB Login");
		register = new JFrame("IIMCREB Register");
		change = new JFrame("IIMCREB Change Username");
		status = new JFrame("IIMCREB Status");
		
		
		JPanel conPnl = new JPanel();
		JPanel msgPnl = new JPanel();
		JPanel mainPnl = new JPanel();
		JPanel addPnl = new JPanel();
		JPanel delPnl = new JPanel();
		JPanel logPnl = new JPanel();
		JPanel regPnl = new JPanel();
		JPanel chaPnl = new JPanel();
		JPanel staPnl = new JPanel();
		
		conPnl.setLayout(new GridBagLayout());
		msgPnl.setLayout(new GridBagLayout());
		mainPnl.setLayout(new GridBagLayout());
		addPnl.setLayout(new GridBagLayout());
		delPnl.setLayout(new GridBagLayout());
		logPnl.setLayout(new GridBagLayout());
		regPnl.setLayout(new GridBagLayout());
		chaPnl.setLayout(new GridBagLayout());
		staPnl.setLayout(new GridBagLayout());
		
		GridBagConstraints c = new GridBagConstraints();
		
		JTextArea chat = new JTextArea();
		chat.setText("Alice: Hi!\nBob: Hello");
		
		c.gridx = 0;
		c.gridy = 0;
		c.weightx = 0.8;
		c.weighty = 0.9;
		c.fill = GridBagConstraints.BOTH;
		
		msgPnl.add(chat,c);
		
		JTextField send = new JTextField("How are you?");
		
		c.gridx = 0;
		c.gridy = 1;
		c.weightx = 0.8;
		c.weighty = 0.1;
		c.fill = GridBagConstraints.HORIZONTAL;
		
		msgPnl.add(send,c);
		
		JButton sendBtn = new JButton("Send");
		
		c.gridx = 1;
		c.gridy = 1;
		c.weightx = 0.2;
		c.weighty = 0.1;
		c.fill = GridBagConstraints.HORIZONTAL;
		
		msgPnl.add(sendBtn,c);
		
		JLabel aliceLbl = new JLabel("Alice");
		
		c.gridx = 0;
		c.gridy = 0;
		c.weighty = 0.1;
		c.weightx = 0.6;
		
		conPnl.add(aliceLbl, c);
		
		JLabel friendsLbl = new JLabel("Friends");
		
		c.gridy = 1;
		
		conPnl.add(friendsLbl, c);
		
		JButton bobBtn = new JButton("Bob");
		
		c.gridy = 2;
		
		conPnl.add(bobBtn, c);
		
		JButton carolBtn = new JButton("Carol");
		
		c.gridy = 3;
		
		conPnl.add(carolBtn, c);
		
		JButton conAddBtn = new JButton("Add Friend");
		c.gridy = 4;
		conPnl.add(conAddBtn, c);
		
		JButton conChaBtn = new JButton("Change Username");
		c.gridy = 5;
		conPnl.add(conChaBtn, c);
		
		JButton aliceStat = new JButton("Online");
		
		c.gridx = 1;
		c.gridy = 0;
		c.weighty = 0.1;
		c.weightx = 0.4;
		
		conPnl.add(aliceStat, c);
		
		JLabel bobStat = new JLabel("Online");
		
		c.gridy = 2;
		
		conPnl.add(bobStat, c);
		
		JLabel carolStat = new JLabel("Busy");
		
		c.gridy = 3;
		
		conPnl.add(carolStat, c);
		
		JButton conDelBtn = new JButton("Delete Friend");
		c.gridy = 4;
		conPnl.add(conDelBtn, c);
		
		JButton conLogBtn = new JButton("Logout");
		c.gridy = 5;
		conPnl.add(conLogBtn, c);
		
		JButton mainRegBtn = new JButton("Register");
		JButton mainLogBtn = new JButton("Login");
		
		c.gridx = 0;
		c.gridy = 0;
		c.weighty = 0.5;
		c.weightx = 0.5;
		
		mainPnl.add(mainRegBtn,c);
		
		c.gridx = 1;
		
		mainPnl.add(mainLogBtn, c);
		
		JLabel logUsernameLbl = new JLabel("Username");
		JLabel logPasswordLbl = new JLabel("Password");
		
		JTextField logUsernameTxt = new JTextField();
		JTextField logPasswordTxt = new JTextField();
		
		JLabel regUsernameLbl = new JLabel("Username");
		JLabel regPasswordLbl = new JLabel("Password");
		
		JTextField regUsernameTxt = new JTextField();
		JTextField regPasswordTxt = new JTextField();
		
		JButton regRegBtn = new JButton("Register");
		JButton logLogBtn = new JButton("Login");
		
		JButton staOnBtn = new JButton("Online");
		JButton staBuBtn = new JButton("Busy");
		JButton staOfBtn = new JButton("Offline");
		
		JLabel addUsernameLbl = new JLabel("Username");
		JLabel delUsernameLbl = new JLabel("Username");
		JLabel chaUsernameLbl = new JLabel("Username");
		
		JTextField addUsernameTxt = new JTextField();
		JTextField delUsernameTxt = new JTextField();
		JTextField chaUsernameTxt = new JTextField();
		
		JButton addUsernameBtn = new JButton("Add Friend");
		JButton delUsernameBtn = new JButton("Delete Friend");
		JButton chaUsernameBtn = new JButton("Change Username");
		
		
		c.gridx = 0;
		c.gridy = 0;
		c.weighty = 0.5;
		c.weightx = 0.5;
		
		logPnl.add(logUsernameLbl, c);
		regPnl.add(regUsernameLbl, c);
		addPnl.add(addUsernameLbl, c);
		delPnl.add(delUsernameLbl, c);
		chaPnl.add(chaUsernameLbl, c);
		
		c.gridy = 1;
		
		logPnl.add(logPasswordLbl, c);
		regPnl.add(regPasswordLbl, c);
		
		c.gridx = 1;
		c.gridy = 0;
		
		logPnl.add(logUsernameTxt, c);
		regPnl.add(regUsernameTxt, c);
		staPnl.add(staOnBtn, c);
		
		addPnl.add(addUsernameTxt, c);
		delPnl.add(delUsernameTxt, c);
		chaPnl.add(chaUsernameTxt, c);
		
		c.gridy = 1;
		
		logPnl.add(logPasswordTxt, c);
		regPnl.add(regPasswordTxt, c);
		staPnl.add(staBuBtn, c);
		
		addPnl.add(addUsernameBtn, c);
		delPnl.add(delUsernameBtn, c);
		chaPnl.add(chaUsernameBtn, c);
		
		c.gridy = 2;
		
		logPnl.add(logLogBtn, c);
		regPnl.add(regRegBtn, c);
		staPnl.add(staOfBtn, c);
		
		message.add(msgPnl);	//	add panel to frame
		message.setPreferredSize(new Dimension(500, 500));	//	preferred frame size
		message.pack();	//	pack frame
		message.setVisible(true);	//	show frame
		
		
		contacts.add(conPnl);	//	add panel to frame
		contacts.setPreferredSize(new Dimension(250, 500));	//	preferred frame size
		contacts.pack();	//	pack frame
		contacts.setVisible(true);	//	show frame
		
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		main.add(mainPnl);	//	add panel to frame
		main.setPreferredSize(new Dimension(200, 100));	//	preferred frame size
		main.pack();	//	pack frame
		main.setVisible(true);	//	show frame
		
		add.add(addPnl);	//	add panel to frame
		add.setPreferredSize(new Dimension(200, 150));	//	preferred frame size
		add.pack();	//	pack frame
		add.setVisible(true);	//	show frame
		
		delete.add(delPnl);	//	add panel to frame
		delete.setPreferredSize(new Dimension(200, 150));	//	preferred frame size
		delete.pack();	//	pack frame
		delete.setVisible(true);	//	show frame
		
		login.add(logPnl);	//	add panel to frame
		login.setPreferredSize(new Dimension(200, 150));	//	preferred frame size
		login.pack();	//	pack frame
		login.setVisible(true);	//	show frame
		
		register.add(regPnl);	//	add panel to frame
		register.setPreferredSize(new Dimension(200, 150));	//	preferred frame size
		register.pack();	//	pack frame
		register.setVisible(true);	//	show frame
		
		change.add(chaPnl);	//	add panel to frame
		change.setPreferredSize(new Dimension(200, 150));	//	preferred frame size
		change.pack();	//	pack frame
		change.setVisible(true);	//	show frame
		
		status.add(staPnl);	//	add panel to frame
		status.setPreferredSize(new Dimension(100, 200));	//	preferred frame size
		status.pack();	//	pack frame
		status.setVisible(true);	//	show frame
	}
}
