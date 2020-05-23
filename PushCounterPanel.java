package New_Lab13;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.concurrent.ThreadLocalRandom;
//mport New_Lab10.panel.ButtonListner;

public class PushCounterPanel extends JPanel
{
   private int count;
   private JButton push;
   private JLabel label;
   private JTextField rangemin;
   private JTextField rangemax;
   private Integer min;
   private Integer max;
   

   //-----------------------------------------------------------------
   //  Constructor: Sets up the GUI.
   //-----------------------------------------------------------------
   public PushCounterPanel()
   {
	   JLabel rangelabel = new JLabel("Random Value Range: ");

	   JLabel minlabel = new JLabel("Min: ");
	   rangemin = new JTextField(5);
	   
	   JLabel maxlabel = new JLabel("Max: ");
	   rangemax = new JTextField(5);
	   
	   rangemin.addActionListener(new ButtonListener());
	   rangemax.addActionListener(new ButtonListener());
	   
//	    max = Integer.valueOf(rangemax.getText());
//	    min = Integer.valueOf(rangemin.getText());
	   

      push = new JButton("Generate Random");
      label = new JLabel();
      push.addActionListener(new ButtonListener());
      add(rangelabel);
      add(maxlabel);
      add(rangemax);
      add(minlabel);
      add(rangemin);
      add(push);
      add(label);

      setBackground(Color.cyan);
      setPreferredSize(new Dimension(680, 40));
   }

   //*****************************************************************
   //  Represents a listener for button push (action) events.
   //*****************************************************************
	private class ButtonListener implements ActionListener
	{
	public void actionPerformed(ActionEvent event)
  	{
        if(event.getSource() == push) {
        	max = Integer.valueOf(rangemax.getText());
    	    min = Integer.valueOf(rangemin.getText());
    	    
    	    int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
        	//int num = rand.nextInt();
        	label.setText("Result: " + randomNum);
        	
        }
  	}
 	}
}

