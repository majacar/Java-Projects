package maja;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gui extends JFrame{
	
	private JTextField tf;
	private Font pf, bf, itf, bif;
	private JRadioButton pb, bb, itb, bit;
	private ButtonGroup group;
	
	public Gui(){
		super("Naslov");
		setLayout(new FlowLayout());
		
		tf = new JTextField("Recenica", 25);
		add(tf);
		
		pb = new JRadioButton("plain", true);
		bb = new JRadioButton("bold", false);
		itb = new JRadioButton("italic", false);
		bit = new JRadioButton("bold and italic", false);
		add(pb);
		add(bb);
		add(itb);
		add(bit);
		
		group = new ButtonGroup();
		group.add(pb);
		group.add(bb);
		group.add(itb);
		group.add(bit);
		
		pf = new Font("Serif", Font.PLAIN, 14);
		bf = new Font("Serif", Font.BOLD, 14);
		itf = new Font("Serif", Font.ITALIC, 14);
		bif = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
		tf.setFont(pf);
		
		// wait for event to happen
		 pb.addItemListener(new Klasa(pf));			
		 bb.addItemListener(new Klasa(bf));
		 itb.addItemListener(new Klasa(itf));
		 bit.addItemListener(new Klasa(bif));
		
		
	}
	
	private class Klasa implements ItemListener{		
			private Font font;
			  
			  public Klasa(Font f){
			   font = f;
			  }
			  
			  public void itemStateChanged(ItemEvent event){
			   tf.setFont(font);
			   }			
		}
	}
	


	
	
	

