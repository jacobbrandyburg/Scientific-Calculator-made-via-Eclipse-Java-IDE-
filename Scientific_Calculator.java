package calc;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Insets;


public class Scientific_Calculator implements ActionListener{
		//define variables
		public JFrame myFrame;
		public JPanel bottomPanel;
		public JTextField inputField, outputField;
		public GridBagLayout gbl;
		public GridBagConstraints gbc;
		public JButton Clear, Seven, Eight, Nine, Multiplication, Division, Squared;
		public JButton Four, Five, Six, Addition, Subtraction, Cubed;
		public JButton One, Two, Three, Equals, Modulo;
		public JButton Zero, Decimal, Negative, Ratio, Percentage, SquareRoot;
		public JButton Sine, Cosine, Tangent, Logarithm, NaturalLog;
		public JButton InverseSine, InverseCosine, InverseTangent, ScientificNot, AbsoluteValue;
		public JButton HyperbolicSine, HyperbolicCosine, HyperbolicTangent, EXIT;
		
		public double n1=0,n2=0,result;
		public String op;

		
		// create constructor
		Scientific_Calculator(){
			// initialize variables
			JFrame myFrame = new JFrame("Scientific Calculator");
			
			Clear = new JButton("C");
			Seven = new JButton("7");
			Eight = new JButton("8");
			Nine = new JButton("9");
			Multiplication = new JButton("x");
			Division = new JButton("÷");
			Squared = new JButton("x^2");
			
			Four = new JButton("4");
			Five = new JButton("5");
			Six = new JButton("6");
			Addition = new JButton("+");
			Subtraction = new JButton("-");
			Cubed = new JButton("x^3");
			
			One = new JButton("1");
			Two = new JButton("2");
			Three = new JButton("3");
			Equals = new JButton("=");
			Modulo = new JButton("Mod");
			
			Zero = new JButton("0");
			Decimal = new JButton(".");
			Negative = new JButton("+/-");
			Ratio = new JButton("1/n");
			Percentage = new JButton("%");
			SquareRoot = new JButton("√");
			
			Sine = new JButton("sin");
			Cosine = new JButton("cos");
			Tangent = new JButton("tan");
			Logarithm = new JButton("log");
			NaturalLog = new JButton("ln");
			
			InverseSine = new JButton("asin");
			InverseCosine = new JButton("acos");
			InverseTangent = new JButton("atan");
			ScientificNot = new JButton("10^n");
			AbsoluteValue = new JButton("abs");
			
			HyperbolicSine = new JButton("sinh");
			HyperbolicCosine = new JButton("cosh");
			HyperbolicTangent = new JButton("tanh");
			EXIT = new JButton("EXIT");
			gbl = new GridBagLayout();
			gbc = new GridBagConstraints();
			
			inputField = new JTextField(10);
			inputField.setEditable(false);
			inputField.setText("0");
			outputField = new JTextField(10);
			outputField.setEditable(false);
			inputField.setText("0");
			
			gbc.fill = GridBagConstraints.HORIZONTAL;
			myFrame.setLayout(gbl);
			myFrame.setSize(400,500);
			myFrame.setBackground(Color.GRAY);
			
			gbc.insets = new Insets(3,5,0,0);
			
			gbc.gridx=0;
			gbc.gridy=0;
			gbc.gridwidth=6;
			myFrame.add(inputField, gbc);
			
			gbc.gridx=0;
			gbc.gridy=1;
			gbc.gridwidth=6;
			myFrame.add(outputField, gbc);
			
			gbc.insets = new Insets(20,5,0,0);
			
			gbc.gridx=5;
			gbc.gridy=2;
			gbc.gridwidth=1;
			myFrame.add(Clear, gbc);
			
			gbc.insets = new Insets(3,5,0,0);
			
			gbc.gridx=0;
			gbc.gridy=3;
			myFrame.add(Seven, gbc);
			
			gbc.gridx=1;
			gbc.gridy=3;
			myFrame.add(Eight, gbc);
			
			gbc.gridx=2;
			gbc.gridy=3;
			myFrame.add(Nine, gbc);
			
			gbc.gridx=3;
			gbc.gridy=3;
			myFrame.add(Multiplication, gbc);
			
			gbc.gridx=4;
			gbc.gridy=3;
			myFrame.add(Division, gbc);
			
			gbc.gridx=5;
			gbc.gridy=3;
			myFrame.add(Squared, gbc);
			
			gbc.gridx=0;
			gbc.gridy=4;
			myFrame.add(Four, gbc);
			
			gbc.gridx=1;
			gbc.gridy=4;
			myFrame.add(Five, gbc);
			
			gbc.gridx=2;
			gbc.gridy=4;
			myFrame.add(Six, gbc);
			
			gbc.gridx=3;
			gbc.gridy=4;
			myFrame.add(Addition, gbc);
			
			gbc.gridx=4;
			gbc.gridy=4;
			myFrame.add(Subtraction, gbc);
			
			gbc.gridx=5;
			gbc.gridy=4;
			myFrame.add(Cubed, gbc);
			
			gbc.gridx=0;
			gbc.gridy=5;
			myFrame.add(One, gbc);
			
			gbc.gridx=1;
			gbc.gridy=5;
			myFrame.add(Two, gbc);
			
			gbc.gridx=2;
			gbc.gridy=5;
			myFrame.add(Three, gbc);
			
			gbc.gridx=3;
			gbc.gridy=5;
			gbc.gridwidth=2;
			myFrame.add(Equals, gbc);
			
			gbc.gridx=5;
			gbc.gridy=5;
			gbc.gridwidth=1;
			myFrame.add(Modulo, gbc);
			
			gbc.gridx=0;
			gbc.gridy=6;
			gbc.gridwidth=1;
			gbc.gridheight=1;
			myFrame.add(Zero, gbc);
			
			gbc.gridx=1;
			gbc.gridy=6;
			gbc.gridwidth=1;
			gbc.gridheight=1;
			myFrame.add(Decimal, gbc);
			
			gbc.gridx=2;
			gbc.gridy=6;
			gbc.gridwidth=1;
			gbc.gridheight=1;
			myFrame.add(Negative, gbc);
			
			gbc.gridx=3;
			gbc.gridy=6;
			gbc.gridwidth=1;
			gbc.gridheight=1;
			myFrame.add(Ratio, gbc);
			
			gbc.gridx=4;
			gbc.gridy=6;
			gbc.gridwidth=1;
			gbc.gridheight=1;
			myFrame.add(Percentage, gbc);
			
			gbc.gridx=5;
			gbc.gridy=6;
			gbc.gridwidth=1;
			gbc.gridheight=1;
			myFrame.add(SquareRoot, gbc);

			
			//These buttons are on a separate panel
			
			gbc.insets = new Insets(20,5,0,0);
			
			gbc.gridx=0;
			gbc.gridy=7;
			gbc.gridwidth=1;
			myFrame.add(Sine, gbc);
			
			gbc.gridx=1;
			gbc.gridy=7;
			gbc.gridwidth=1;
			myFrame.add(Cosine, gbc);
			
			gbc.gridx=2;
			gbc.gridy=7;
			gbc.gridwidth=1;
			myFrame.add(Tangent, gbc);
			
			gbc.gridx=3;
			gbc.gridy=7;
			gbc.gridwidth=1;
			myFrame.add(Logarithm, gbc);
			
			gbc.gridx=4;
			gbc.gridy=7;
			gbc.gridwidth=1;
			myFrame.add(NaturalLog, gbc);
			
			gbc.insets = new Insets(3,5,0,0);
			
			gbc.gridx=0;
			gbc.gridy=8;
			gbc.gridwidth=1;
			myFrame.add(InverseSine, gbc);
			
			gbc.gridx=1;
			gbc.gridy=8;
			gbc.gridwidth=1;
			myFrame.add(InverseCosine, gbc);
			
			gbc.gridx=2;
			gbc.gridy=8;
			gbc.gridwidth=1;
			myFrame.add(InverseTangent, gbc);
			
			gbc.gridx=3;
			gbc.gridy=8;
			gbc.gridwidth=1;
			myFrame.add(ScientificNot, gbc);
			
			gbc.gridx=4;
			gbc.gridy=8;
			gbc.gridwidth=1;
			myFrame.add(AbsoluteValue, gbc);
			
			gbc.gridx=0;
			gbc.gridy=9;
			gbc.gridwidth=1;
			myFrame.add(HyperbolicSine, gbc);
			
			gbc.gridx=1;
			gbc.gridy=9;
			gbc.gridwidth=1;
			myFrame.add(HyperbolicCosine, gbc);
			
			gbc.gridx=2;
			gbc.gridy=9;
			gbc.gridwidth=1;
			myFrame.add(HyperbolicTangent, gbc);
			
			gbc.gridx=3;
			gbc.gridy=9;
			gbc.gridwidth=2;
			myFrame.add(EXIT, gbc);
			
			
			//adding action listeners
			Zero.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==Zero) {
						outputField.setText(outputField.getText().concat(String.valueOf("0")));
					}}
			});
			
			One.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==One) {
						outputField.setText(outputField.getText().concat(String.valueOf("1")));
					}}
			});
			
			Two.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==Two) {
						outputField.setText(outputField.getText().concat(String.valueOf("2")));
					}}
			});
			
			Three.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==Three) {
						outputField.setText(outputField.getText().concat(String.valueOf("3")));
					}}
			});
			
			Four.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==Four) {
						outputField.setText(outputField.getText().concat(String.valueOf("4")));
					}}
			});
			
			Five.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==Five) {
						outputField.setText(outputField.getText().concat(String.valueOf("5")));
					}}
			});
			
			Six.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==Six) {
						outputField.setText(outputField.getText().concat(String.valueOf("6")));
					}}
			});
			
			Seven.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==Seven) {
						outputField.setText(outputField.getText().concat(String.valueOf("7")));
					}}
			});
			
			Eight.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==Eight) {
						outputField.setText(outputField.getText().concat(String.valueOf("8")));
					}}
			});
			
			Nine.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==Nine) {
						outputField.setText(outputField.getText().concat(String.valueOf("9")));
					}}
			});
			
			Decimal.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==Decimal) {
						outputField.setText(outputField.getText().concat("."));
					}}
			});
			
			Negative.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==Negative) {
						double temp = Double.parseDouble(outputField.getText());
						temp*=-1;
						outputField.setText(String.valueOf(temp));
					}}
			});
			
			
			// operation action listeners
			
			Addition.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==Addition) {
						n1 = Double.parseDouble(outputField.getText());
						op = "+";
						inputField.setText(n1 + " +");
						outputField.setText("");
						
					}}
			});
			
			Subtraction.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==Subtraction) {
						n1 = Double.parseDouble(outputField.getText());
						op = "-";
						inputField.setText(n1 + " -");
						outputField.setText("");
						
					}}
			});
			
			Multiplication.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==Multiplication) {
						n1 = Double.parseDouble(outputField.getText());
						op = "x";
						inputField.setText(n1 + " x");
						outputField.setText("");
						
					}}
			});
			
			Division.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==Division) {
						n1 = Double.parseDouble(outputField.getText());
						op = "÷";
						inputField.setText(n1 + " ÷");
						outputField.setText("");
						
					}}
			});
			
			Modulo.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==Modulo) {
						n1 = Double.parseDouble(outputField.getText());
						op = "Mod";
						inputField.setText(n1 + " Mod");
						outputField.setText("");
						
					}}
			});
			
			
			
			
			Squared.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==Squared) {
						n1 = Double.parseDouble(outputField.getText());
						inputField.setText(n1 + "^2");
						outputField.setText(n1*n1+"");
						
					}}
			});
			
			
			Cubed.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==Cubed) {
						n1 = Double.parseDouble(outputField.getText());
						inputField.setText(n1 + "^3");
						outputField.setText(n1*n1*n1+"");
						
					}}
			});
			
			Ratio.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==Ratio) {
						n1 = Double.parseDouble(outputField.getText());
						inputField.setText("1/"+n1);
						outputField.setText(1/n1+"");
						
					}}
			});
			
			SquareRoot.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==SquareRoot) {
						n1 = Double.parseDouble(outputField.getText());
						inputField.setText("√"+n1);
						outputField.setText(Math.sqrt(n1)+"");
						
					}}
			});
			
			Percentage.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==Percentage) {
						n1 = Double.parseDouble(outputField.getText());
						op = "%";
						inputField.setText(n1 + " %");
						outputField.setText(n1/100+"");
						
					}}
			});
			
			
			Sine.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==Sine) {
						n1 = Double.parseDouble(outputField.getText());
						inputField.setText("sin("+n1+")");
						outputField.setText(Math.sin(n1) +"");
						
					}}
			});
			
			Cosine.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==Cosine) {
						n1 = Double.parseDouble(outputField.getText());
						inputField.setText("cos("+n1+")");
						outputField.setText(Math.cos(n1) +"");
						
					}}
			});
			
			Tangent.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==Tangent) {
						n1 = Double.parseDouble(outputField.getText());
						inputField.setText("tan("+n1+")");
						outputField.setText(Math.tan(n1) +"");
						
					}}
			});
			
			Logarithm.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==Logarithm) {
						n1 = Double.parseDouble(outputField.getText());
						inputField.setText("log("+n1+")");
						outputField.setText(Math.log10(n1) +"");
						
					}}
			});
			
			NaturalLog.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==NaturalLog) {
						n1 = Double.parseDouble(outputField.getText());
						inputField.setText("ln("+n1+")");
						outputField.setText(Math.log(n1) +"");
						
					}}
			});
			
			InverseSine.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==InverseSine) {
						n1 = Double.parseDouble(outputField.getText());
						inputField.setText("asin("+n1+")");
						outputField.setText(Math.asin(n1) +"");
						
					}}
			});
			
			InverseCosine.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==InverseCosine) {
						n1 = Double.parseDouble(outputField.getText());
						inputField.setText("acos("+n1+")");
						outputField.setText(Math.acos(n1) +"");
						
					}}
			});
			
			
			InverseTangent.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==InverseTangent) {
						n1 = Double.parseDouble(outputField.getText());
						inputField.setText("atan("+n1+")");
						outputField.setText(Math.atan(n1) +"");
						
					}}
			});
			
			
			ScientificNot.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==ScientificNot) {
						n1 = Double.parseDouble(outputField.getText());
						inputField.setText("10^"+n1);
						outputField.setText(Math.pow(10,n1) +"");
						
					}}
			});
			
			
			AbsoluteValue.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==AbsoluteValue) {
						n1 = Double.parseDouble(outputField.getText());
						inputField.setText("|"+n1+"|");
						outputField.setText(Math.abs(n1) +"");
						
					}}
			});
			
			
			HyperbolicSine.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==HyperbolicSine) {
						n1 = Double.parseDouble(outputField.getText());
						inputField.setText("sinh"+n1);
						outputField.setText(Math.sinh(n1) +"");
						
					}}
			});
			
			
			HyperbolicCosine.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==HyperbolicCosine) {
						n1 = Double.parseDouble(outputField.getText());
						inputField.setText("cosh"+n1);
						outputField.setText(Math.cosh(n1) +"");
						
					}}
			});
			
			
			HyperbolicTangent.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==HyperbolicTangent) {
						n1 = Double.parseDouble(outputField.getText());
						inputField.setText("tanh"+n1);
						outputField.setText(Math.tanh(n1) +"");
						
					}}
			});
			
			Equals.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					n2=Double.parseDouble(outputField.getText());
					
					switch(op) {
					case"+":
						result=n1+n2;
						inputField.setText(n1 + " + "+ n2);
						break;
					case"-":
						result=n1-n2;
						inputField.setText(n1 + " - "+ n2);
						break;
					case"x":
						result=n1*n2;
						inputField.setText(n1 + " x "+ n2);
						break;
					case"÷":
						result=n1/n2;
						inputField.setText(n1 + " ÷ "+ n2);
						break;
					case"Mod":
						result=n1%n2;
						inputField.setText(n1 + " Mod " + n2);
						break;
						
					
					}
					outputField.setText(String.valueOf(result));
					n1=result;
				}
			});
			
			EXIT.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
			
			Clear.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					inputField.setText("");
					outputField.setText("");
				}
			});
			
			myFrame.setVisible(true);
			
		}
		
		public static void main(String[] args) {
			
			Scientific_Calculator calc = new Scientific_Calculator();
			
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
}
