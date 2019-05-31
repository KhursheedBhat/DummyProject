import javax.swing.*;
class  TestSwing
{
	//TestSwing(String s){super(s);}
	
	public static void main(String[] args) 
	{
		JFrame jf=new JFrame("first swing frame");
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(300,300);

		JLabel l1=new JLabel("First GUI program using Swing");
		JLabel l2=new JLabel("First Number");		
		JLabel l3=new JLabel("Second Number");
		
		JLabel l4=new JLabel("---");

		JTextField t1=new JTextField();
		JTextField t2=new JTextField();
		JButton b1=new JButton("Click me");


		jf.setLayout(null);
		l1.setBounds(05,10,180,20);
		l2.setBounds(50,50,120,20);
		l3.setBounds(50,100,120,20);

		t1.setBounds(180,50,120,20);
		t2.setBounds(180,100,120,20);

		b1.setBounds(150,150,100,20);

		l4.setBounds(150,200,100,20);

	
		jf.add(l1);
		jf.add(l2);
		jf.add(l3);
		jf.add(l4);
		jf.add(t1);
		jf.add(t2);
		jf.add(b1);






	}
}
