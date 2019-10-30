import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class CalculatorEngine2  implements ActionListener{

	Calculator parent;
	String x;
	double num1, num2;
	double result;
	
	public CalculatorEngine2(Calculator parent) {
		this.parent = parent;
	}
	
		public void actionPerformed (ActionEvent e){
		
		try{
			JButton clickedButton = (JButton) e.getSource();
			
			String dispFieldText = parent.getDisplayValue();
			String clickedButtonLable = clickedButton.getText();
			parent.setDisplayValue(dispFieldText+clickedButtonLable);
			
			double displayValue = 0;
			
			if (!"".equals(dispFieldText)){
				displayValue = Double.parseDouble(dispFieldText);
			}
			
			Object src = e.getSource();
			
			if (src == parent.button22){
				parent.setDisplayValue(null);
			}
			if (src == parent.button21){
				num1 = displayValue;
				parent.setDisplayValue("");
				x="+";
			}
			
			if (src == parent.button20){
				num1 = displayValue;
				parent.setDisplayValue("");
				x="-";
			}
				
			if (src == parent.button19){
				num1 = displayValue;
				parent.setDisplayValue("");
				x="*";
			}
			
			if (src == parent.button18){
				num1 = displayValue;
				parent.setDisplayValue("");
				x="/";
			}
			
			
			
			
			if(src == parent.button26){
				num2 = displayValue;
			
				if("+".equals(x)){
				parent.setDisplayValue((num1+num2)+"");
					}
				if("-".equals(x)){
					parent.setDisplayValue((num1-num2)+"");
					}
				if("*".equals(x)){
					parent.setDisplayValue((num1*num2)+"");
					}
				if("/".equals(x)){
					parent.setDisplayValue((num1/num2)+"");
					}
				if("".equals(x)){
					parent.setDisplayValue((num1+num2)+"");
					}
				if("%".equals(x)){
					parent.setDisplayValue((num1*num2/100)+"");
					}
				
			}
			
			if(src == parent.button9){
				num2 = 0;
				result = num1;
				parent.setDisplayValue("" + result);		
			}
			if (src == parent.button13){
				result = -displayValue;
				parent.setDisplayValue("" + result);
			}
			if (src == parent.button25){
				result = 1/displayValue;
				parent.setDisplayValue("" + result);
			}
				
			if (src == parent.button23){
				result = Math.sqrt(displayValue);
				parent.setDisplayValue("" + result);
			}
			
		
		}catch (Exception ex){ JOptionPane.showMessageDialog(null, "¬ведите в поле число");
		}
}
}
		
