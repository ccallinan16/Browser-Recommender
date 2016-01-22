import java.applet.*;
import java.applet.Applet;
import javax.swing.JOptionPane;
import java.net.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Button;




public class ElectricityFinal extends Applet
{

	public ElectricityFinal()
	{
		Double initelec = 0.0; //we have to set the initial amount of electricity to 0, so that we can add on to it depending on country 
		Double initwatts = 0.0; //setting the initial number of watts used by computer
		Double batterycost = 0.0; //initial battery cost -- longer lifetime, more battery cost
		
		String input1 = JOptionPane.showInputDialog("How much did you purchase your computer for?");
		Double purchasecost = Double.parseDouble(input1); //Danny helped me with this line by showing me that we could use double.parsedouble
		
		String  comptype = JOptionPane.showInputDialog("Do you own a laptop or a desktop?");
		
				Object initwatts;
				if (comptype.equals("laptop")) { //this is to add up the watts for each type of laptop
					initwatts = initwatts + 30.0;
				String screensize = JOptionPane.showInputDialog("Is your laptop screen 11, 12,13, 14, or 15 inches?"); //size of the screen effects wattage 
				Double sceen = Double.parseDouble(screensize);
				int screensize1;
				if (screensize1 == 11){
					initwatts = initwatts + 5.0;
				}
				if (screensize1 == 12){
					initwatts = initwatts + 8.1;
				}
				if (screensize1 == 13){
					initwatts = initwatts + 8.6;
				}
				if (screensize1 == 14){
					initwatts = initwatts + 10.0;
				}
				if (screensize1 == 15){
					initwatts = initwatts + 10.0;
				} //this is copied and pasted straight from original code
				}
				
				if (comptype.equals("desktop")){ //figuring out the wattage if its a desktop and asking for screen size
					String desksize = JOptionPane.showInputDialog("Do you have a 21.5 inch desktop, or a 27 inch desktop?");
					Double desk = Double.parseDouble(desksize);
					if (desk == 21.5){
						initwatts = initwatts + 37.5;
					}
					if (desk == 27){
						initwatts = initwatts + 79.0;
					}	
				}
			}
	
		String brand = JOptionPane.showInputDialog("Do you have an intel or AMD CPU"); //this is for CPU
		if (brand.equals("AMD")){
			String amd = JOptionPane.showInputDialog("Do you have the AMD PHENOM™ II X4 925 W, the AMD PHENOM™ X4 9750, or the AMD PHENOM™ II X3 720?");
			Object initwatts;
			if (amd.equals("AMD PHENOM™ II X4 925 W")){//we have to adjust the wattage for each type of AMD
				initwatts = initwatts + 121.2;
			}
			if (amd.equals("AMD PHENOM™ X3 9750")){
				initwatts = initwatts + 126.0;
			}
			if (amd.equals("AMD PHENOM™ II X3 720")){
				initwatts = initwatts + 81.6;
			}
		}
		
		String numcores = JOptionPane.showInputDialog("How many cores do you have"); //this helps us figure out the wattage?
		Double cores = Double.parseDouble(numcores);
		
		String ramsize = JOptionPane.showInputDialog("How big is your ram in MB?");
		Double ram = Double.parseDouble(ramsize);
		
		String gigsize = JOptionPane.showInputDialog("How many gigabytes is your hard disk?");
		Double gig = Double.parseDouble(gigsize);
		
		String hardsize = JOptionPane.showInputDialog("Is your hard disk 2.5 inches or 3.5 inches?"); //used the most common hard disk sizes which effect the energy most
		Double hard = Double.parseDouble(hardsize);
		if (hard==3.5){ //wattage depending on the size of the hard disk 
			initwatts = initwatts + 192.0;
		}
		if (hard == 2.5){ 
			initwatts = initwatts + 12.5;
		}
		
		
		Object initelec;
		String origin = JOptionPane.showInputDialog("Do you live in USA, China, India, Mexico, Canada, Russia, Brazil or Japan?"); //To figure out the cost per KwH where they live
		Double country = Double.parseDouble(gigsize); //this question gives us information on the person's electricity cost per KwH
		if (country.equals("USA")){ //electricity cost per country
				initelec = initelec +.1273;
			}
		if (country.equals("China")){
			Object initelec = initelec + .08;
		}
		if (country.equals("India")){
			initelec = initelec +.08;
		}
		if (country.equals("Mexico")){
			initelec = initelec + .1;
		}
		if (country.equals("Canada")){
			initelec = initelec + .1;
		}
		if (country.equals("Russia")){
			initelec = initelec + .11;
		}
		if (country.equals("Brazil")){
			initelec = initelec + .17;
		}			
		if (country.equals("Japan")){
			elec = elec + .26;
			}
		
		Object batterycost;
		String batterylife = JOptionPane.showInputDialog("How many years do you expect to keep the computer?");
		Double battery = Double.parseDouble(batterylife); //cost for batteries -- longer you have it the more batteries
		if (battery<=4){ //if the number of years you want to keep the battery is 4 or greater, then it must be replaced
			batterycost = batterycost + 65 //US dollars
			
		String hourson = JOptionPane.showInputDialog("How many hours a day do you leave your computer on?"); //energy per day
		Double hours = Double.parseDouble(hourson);
		
	}

		//now we need to calculate how much each is going to cost -- Danny helped me by providing me with a few websites that explained the functions and then walked me through how it would work 
		double ec =  ((initwatts/1000) * hours * initelec)); //electricity costs per day
		
		double bc = (batterycost);//battery costs
		String battandkwh = "" + ec; //battery cost and the electricity costs
		
		private Object purchasecost;
		double cpy = (batterycost + purchasecost + (((((365*battery)*(initwatts/1000))*hours)*initelec)));//total costs 
		String batpurkwh = "" + cpy ;
		String fcost = "" + bc;
		
		JFrame frame = new JFrame("Total Cost"); //this sets up the pop-up window
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Button ecost = new Button("Electricity cost per day is");
		final JLabel label = new //Danny helped me with this part 
				JLabel(Long.toString(Long.MAX_VALUE)); //Danny showed me this command where it uses the maximum value 
					label.setText(a);
	
		Button totalcost = new Button("The total cost of the computer for "+ battery +" years is ");
		final JLabel label2 = new JLabel(Long.toString(Long.MAX_VALUE));
				label2.setText(b1);
		
				
		Button battcost = new Button("The cost of the battery is");
		final JLabel label3 = new JLabel(Long.toString(Long.MAX_VALUE));
			label3.setText(b3);
		
		
		Panel p = new Panel();//lets us attach other components
		p.setLayout(new GridLayout(0, 1, 100, 100));
		
		p.add(ecost);//adding everything to the panel
		p.add(label);
		p.add(totalcost);
		p.add(label2);
		p.add(battcost);
		p.add(label3);
		frame.add(p, BorderLayout.NORTH);
		frame.pack();
}
	public void stop() {}
		public void destroy() {} //this ends the program

			
}
