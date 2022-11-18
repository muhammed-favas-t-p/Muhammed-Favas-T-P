
import java.awt.Color;
import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.SwingConstants;









public class Calculator implements ActionListener{
	
	boolean isOperatorClicked=false; 
	 
	String oldValue=0+"";
	String oldValues=0+"";
	 
	int mChoice=0;
	 
	
	float result=0;
	
	 
	float choice=0;
	String sum=0+"";
	String minus=0+"";
	String multi=0+"";
	String div=0+"";
	 

	
		 
	 
	 
	JFrame jf;
	JLabel displayJLabel;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	
	JButton zeroButton;
	JButton dotButton;
	JButton equalButton;
	JButton divButton;
	JButton multButton;
	JButton minusButton;
	JButton plusButton;
	JButton clearButton;
	
	public Calculator() {
		
		
		
		jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(600,600);
		jf.setLocation(300,200);
		
		
		 
		displayJLabel=new JLabel( );
		displayJLabel.setBounds(30, 50, 540, 40);
		displayJLabel.setBackground(Color.red);
		displayJLabel.setOpaque(true);
		displayJLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayJLabel.setForeground(Color.WHITE);
		displayJLabel.setFont(displayJLabel.getFont().deriveFont(28f));
		jf.add(displayJLabel);
		
		
		
		sevenButton=new JButton("7");
		sevenButton.setBounds(30, 130, 80, 80);
		sevenButton.setFont(new Font("Arial", Font.PLAIN,20));
		sevenButton.setBackground(Color.gray);
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
		
		
		eightButton=new JButton("8");
		eightButton.setBounds(130, 130, 80, 80);
		eightButton.setFont(new Font("Arial", Font.PLAIN,20));
		eightButton.setBackground(Color.gray);
		eightButton.addActionListener(this);
		jf.add(eightButton);
		
		nineButton=new JButton("9");
		nineButton.setBounds(230, 130, 80, 80);
		nineButton.setFont(new Font("Arial", Font.PLAIN,20));
		nineButton.setBackground(Color.gray);
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
		fourButton=new JButton("4");
		fourButton.setBounds(30, 230, 80, 80);
		fourButton.setFont(new Font("Arial", Font.PLAIN,20));
		fourButton.setBackground(Color.gray);
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
		fiveButton=new JButton("5");
		fiveButton.setBounds(130, 230, 80, 80);
		fiveButton.setFont(new Font("Arial", Font.PLAIN,20));
		fiveButton.setBackground(Color.gray);
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
		
		sixButton=new JButton("6");
		sixButton.setBounds(230, 230, 80, 80);
		sixButton.setFont(new Font("Arial", Font.PLAIN,20));
		sixButton.setBackground(Color.gray);
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
		oneButton=new JButton("1");
		oneButton.setBounds(30, 330, 80, 80);
		oneButton.setFont(new Font("Arial", Font.PLAIN,20));
		oneButton.setBackground(Color.gray);
		oneButton.addActionListener(this);
		jf.add(oneButton);
		
		twoButton=new JButton("2");
		twoButton.setBounds(130, 330, 80, 80);
		twoButton.setFont(new Font("Arial", Font.PLAIN,20));
		twoButton.setBackground(Color.gray);
		twoButton.addActionListener(this);
		jf.add(twoButton);
		
		threeButton=new JButton("3");
		threeButton.setBounds(230, 330, 80, 80);
		threeButton.setFont(new Font("Arial", Font.PLAIN,20));
		threeButton.setBackground(Color.gray);
		threeButton.addActionListener(this);
		jf.add(threeButton);
		
	
		zeroButton=new JButton("0");
		zeroButton.setBounds(30, 430, 80, 80);
		zeroButton.setFont(new Font("Arial", Font.PLAIN,20));
		zeroButton.setBackground(Color.gray); 
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
		
		dotButton=new JButton(".");
		dotButton.setBounds(130, 430, 80, 80);
		dotButton.setFont(new Font("Arial", Font.PLAIN,30));
		dotButton.setBackground(Color.gray);
		dotButton.addActionListener(this);
		jf.add(dotButton);
		
		equalButton=new JButton("=");
		equalButton.setBounds(230, 430, 80, 80);
		equalButton.setFont(new Font("Arial", Font.PLAIN,25));
		equalButton.setForeground(Color.BLACK);
		equalButton.setBackground(Color.WHITE);
		equalButton.addActionListener(this);
		jf.add(equalButton);
		
		
		
		divButton=new JButton("/");
		divButton.setBounds(330, 130, 80, 80);
		divButton.setFont(new Font("Arial", Font.PLAIN,20));
		divButton.setBackground(Color.GRAY);
		divButton.addActionListener(this);
		jf.add(divButton);
		
		multButton=new JButton("*");
		multButton.setBounds(330, 230, 80, 80);
		multButton.setFont(new Font("Arial", Font.PLAIN,22));
		multButton.setBackground(Color.GRAY);
		multButton.addActionListener(this);
		jf.add(multButton);
		
		minusButton=new JButton("-");
		minusButton.setBounds(330, 330, 80, 80);
		minusButton.setFont(new Font("Arial", Font.PLAIN,22));
		minusButton.setBackground(Color.GRAY);
		minusButton.addActionListener(this);
		jf.add(minusButton);
		
		plusButton=new JButton("+");
		plusButton.setBounds(330, 430, 80, 80);
		plusButton.setFont(new Font("Arial", Font.PLAIN,21));
		plusButton.setBackground(Color.GRAY);
		plusButton.addActionListener(this);
		jf.add(plusButton);
		
		clearButton=new JButton("C");
		clearButton.setBounds(430, 430, 80, 80);
		clearButton.setFont(new Font("Arial", Font.PLAIN,21));
		clearButton.setBackground(Color.GRAY);
		clearButton.addActionListener(this);
		jf.add(clearButton);
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
		
		
	}
	
	
	
	public static void main(String[] args) {
		new Calculator();
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
		
		if (e.getSource()== sevenButton) {
			
			if(isOperatorClicked) {
				oldValue=displayJLabel.getText();
				oldValues=displayJLabel.getText();
				displayJLabel.setText("7");
				isOperatorClicked=false;
				
				
			}else {
				displayJLabel.setText(displayJLabel.getText()+"7");
				
			}
			
			
			
		}else if (e.getSource()==eightButton) {
			if(isOperatorClicked) {
				oldValue=displayJLabel.getText();
				oldValues=displayJLabel.getText();
				displayJLabel.setText("8");
				isOperatorClicked=false;
			}else {
				displayJLabel.setText(displayJLabel.getText()+"8");
			}
			
			
		}else if (e.getSource()==nineButton) {
			if(isOperatorClicked) {
				oldValue=displayJLabel.getText();
				oldValues=displayJLabel.getText();
				displayJLabel.setText("9");
				isOperatorClicked=false;
			}else {
				displayJLabel.setText(displayJLabel.getText()+"9");
			}
				

		}else if (e.getSource()==fourButton) {
			if(isOperatorClicked) {
				oldValue=displayJLabel.getText();
				oldValues=displayJLabel.getText();
				displayJLabel.setText("4");
				isOperatorClicked=false;
			}else {
				displayJLabel.setText(displayJLabel.getText()+"4");
			}
			
		}else if (e.getSource()==fiveButton) {
			if(isOperatorClicked) {
				oldValue=displayJLabel.getText();
				oldValues=displayJLabel.getText();
				displayJLabel.setText("5");
				isOperatorClicked=false;
			}else {
				displayJLabel.setText(displayJLabel.getText()+"5");
			}
			
		}else if (e.getSource()==sixButton) {
			if(isOperatorClicked) {
				oldValue=displayJLabel.getText();
				oldValues=displayJLabel.getText();
				displayJLabel.setText("6");
				isOperatorClicked=false;
			}else {
				displayJLabel.setText(displayJLabel.getText()+"6");
			}
			
		}else if (e.getSource()==oneButton) {
			if(isOperatorClicked) {
				oldValue=displayJLabel.getText();
				oldValues=displayJLabel.getText();
				displayJLabel.setText("1");
				isOperatorClicked=false;
			}else {
				displayJLabel.setText(displayJLabel.getText()+"1");
			}
			
		}else if (e.getSource()==twoButton) {
			if(isOperatorClicked) {
				oldValue=displayJLabel.getText();
				oldValues=displayJLabel.getText();
				displayJLabel.setText("2");
				isOperatorClicked=false;
			}else {
				displayJLabel.setText(displayJLabel.getText()+"2");
			}
			
		}else if (e.getSource()==threeButton) {
			if(isOperatorClicked) {
				oldValue=displayJLabel.getText();
				oldValues=displayJLabel.getText();
				displayJLabel.setText("3");
				isOperatorClicked=false;
			}else {
				displayJLabel.setText(displayJLabel.getText()+"3");
			}
			
	
		}else if (e.getSource()==zeroButton) {
			if(isOperatorClicked) {
				oldValue=displayJLabel.getText();
				oldValues=displayJLabel.getText();
				displayJLabel.setText("0");
				isOperatorClicked=false;
			}else {
				displayJLabel.setText(displayJLabel.getText()+"0");
			}
			
			
		}else if (e.getSource()==dotButton) {
			if(isOperatorClicked) {
				oldValue=displayJLabel.getText();
				oldValues=displayJLabel.getText();
				displayJLabel.setText(".");
				isOperatorClicked=false;
			}else {
				displayJLabel.setText(displayJLabel.getText()+".");
			}
			
			
		}else if (e.getSource()==equalButton) {
			
			String newValue=displayJLabel.getText();
			
			
			float oldValueF=Float.parseFloat(oldValue);
			float newValueF=Float.parseFloat(newValue);
			
			
			
			
			
			
			
			if (choice==1) {
				
				
				result =oldValueF+newValueF;
				
				
			}else if (choice==2) {
				
				result =oldValueF-newValueF ;
				
			
				
			}else if (choice==3) {
				
				result =oldValueF*newValueF ;
				
			
				
			}else if (choice==4) {
				
				result =oldValueF/newValueF ;
				
			}
		
			
			
				
				
			displayJLabel.setText(result+"");
		
			
			
			
			
			
			
			
		}else if (e.getSource()==divButton) {
			
			isOperatorClicked=true;
			choice=4;
			if(mChoice==1) {
				String newValues=displayJLabel.getText();
				

				
				float newValuesF=Float.parseFloat(newValues);
				
				div=newValuesF+"";
				
				
				 displayJLabel.setText(div);
				 
				 mChoice=2;
				
			}else if(mChoice==2) {
				
			String newValues=displayJLabel.getText();
			

			
			float newValuesF=Float.parseFloat(newValues);
			float oldValuesF=Float.parseFloat(oldValues);
			
			
			
			
			 div= oldValuesF/newValuesF+"";
			
		
			 displayJLabel.setText(div);
			  
			}
				
			
			
				
			
			
			
		}else if (e.getSource()==multButton) {
			isOperatorClicked=true;
			choice=3;
			
			if(mChoice==1) {
				String newValues=displayJLabel.getText();
				

				
				float newValuesF=Float.parseFloat(newValues);
				
				multi=newValuesF+"";
				
				
				 displayJLabel.setText(multi);
				 
				 mChoice=2;
				
			}else if(mChoice==2) {
				
			String newValues=displayJLabel.getText();
			

			
			float newValuesF=Float.parseFloat(newValues);
			float oldValuesF=Float.parseFloat(oldValues);
			
			
			
			
			 multi= oldValuesF*newValuesF+"";
			
		
			 displayJLabel.setText(multi);
			}
				
			
			
		}else if (e.getSource()==minusButton) {
			isOperatorClicked=true;
			choice=2;
			
			if(mChoice==1) {
				String newValues=displayJLabel.getText();
				

				
				float newValuesF=Float.parseFloat(newValues);
				
				minus=newValuesF+"";
				
				
				 displayJLabel.setText(minus);
				 
				 mChoice=2;
				
			}else if(mChoice==2) {
				
			String newValues=displayJLabel.getText();
			

			
			float newValuesF=Float.parseFloat(newValues);
			float oldValuesF=Float.parseFloat(oldValues);
			
			
			
			
			 minus= oldValuesF-newValuesF+"";
			
		
			 displayJLabel.setText(minus);
			}
			
			
		}else if (e.getSource()==plusButton) {
			
		
							
						
				isOperatorClicked=true;
					
					  choice=1;
					
				
					
					String newValues=displayJLabel.getText();
					

					
					float newValuesF=Float.parseFloat(newValues);
					float oldValuesF=Float.parseFloat(oldValues);
					
					
					
					
					 sum=oldValuesF+newValuesF+"";
					
				
					 displayJLabel.setText(sum);
					
					
					
			      

				
				
				
				
		
				
				
				
					
					
					
				
			
					
				
				
			
			
		}else if (e.getSource()==clearButton) {
			displayJLabel.setText("");
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
	}

	



	

}
