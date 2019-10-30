import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class ReadFile {
 
	static String s =null;
	static int x1;
	static int x2;
	static int y1;
	static int y2;
	static int x3;
	static int y3;
	static int p1;
	static int p2;
	static int p3;
	static int p4;
	static int p5;
	static int p6;
	static double abc = 0.0;
	static double max = 0;
	static String [] arr = null;
	private static PrintWriter p;
		
	
		public static void main(String[] args) throws IOException {	   	
			ReadFile readFile = new ReadFile();
					
			readFile.read(args[0]);
			readFile.write(args[1]);
			
		}
		
		public void read(String in){
						
			BufferedReader br =null;
		        try{
		            br = new BufferedReader(new InputStreamReader(new FileInputStream(in)));
		            while ((s = br.readLine()) != null) {
			            arr= s.split(" ");	
			            if (arr.length==6){
						
			            	try{
			            	x1 = Integer.parseInt(arr[0]);
					        y1 = Integer.parseInt(arr[1]);
					        x2 = Integer.parseInt(arr[2]);
					        y2 = Integer.parseInt(arr[3]);
					        x3 = Integer.parseInt(arr[4]);
					        y3 = Integer.parseInt(arr[5]);
					     
			            	int ab =  ((x2-x1)^2 + (y2-y1)^2)^(1/2);
					        int bc = ((x3-x2)^2 + (y3-y2)^2)^(1/2);
					        int ac = ((x3-x1)^2 + (y3-y1)^2)^(1/2);
					   
					        if (ab <0 ){
						        	  ab = ab*(-1);
					       }if (ac <0 ){
						        	  ac = ac*(-1); 
					       }if (bc <0 ){
						        	  bc = bc*(-1);
					       }			           
					        if ((ab<bc+ac || bc<ab+ac ||ac<ab+bc) & (ab==bc || bc==ac || ab==ac)){
					          abc = ((x2-x1)*(y3-y1)-(x3-x1)*(y2-y1))/2;
					          	if (abc <0){
					          		abc = abc*(-1);
					          	}
					        	  
					         }else { abc=0;
					         }
					        
					        
					       if(abc> max){
					        	max=abc; p1=x1; p2=y1; p3=x2; p4=y2; p5=x3; p6=y3;  
					        
					        }else{ max=0;
					        
					      }
					     
			            	}catch (NumberFormatException e1){abc=0;
				            	
			            	}
			            	}else {	abc=0;
					
			            	}
			            	}
			            	
			        } catch (FileNotFoundException e) {
						 JOptionPane.showMessageDialog(null, "Файл не найден!");
		 		                  e.printStackTrace();
			         
			 		}catch (IOException e) {
						           e.printStackTrace();
					
					}finally{
						try {
						br.close();
					
						} catch (IOException e) {				
						e.printStackTrace();
					} 
					}
		}
		        	            
		            
			public void write(String out) throws FileNotFoundException{	
		
			
			p = new PrintWriter (new OutputStreamWriter(new FileOutputStream(out)));
			if(max>0){
		p.print(p1 + " ");
		p.print(p2 + " ");
		p.print(p3 + " ");
		p.print(p4 + " ");
		p.print(p5 + " ");		
		p.print(p6 + " ");
			}else{
				p.print("");
			}
				
			p.close();
		}
	}     

