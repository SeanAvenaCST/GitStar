package p4;

//*********************************************************** 
// VoteCounterPanel.java 
// 
// Panel for the GUI that tallies votes for two candidates, 
// Joe and Sam. 
//*********************************************************** 

import java.awt.*; 
import java.awt.event.*; 

import javax.swing. *; 

public class VoteCounterPanel extends JPanel { 
    
    private int votesForJoe; 
    private JButton joe; 
    private JLabel labelJoe; 

    private int votesForSam; 
    private JButton sam; 
    private JLabel labelSam;     
    
    //------------------------------------------------- 
    // Constructor: Sets up the GUI. 
    //------------------------------------------------- 
    public VoteCounterPanel() { 
        votesForJoe = 0; 
        votesForSam = 0;

        joe = new JButton("Vote for Joe"); 
        joe.addActionListener(new VoteButtonListener()); 
        
        sam = new JButton("Vote for Sam"); 
        sam.addActionListener(new VoteButtonListener()); 
        
        labelJoe = new JLabel("Votes for Joe: " + votesForJoe);
        labelSam = new JLabel("Votes for Joe: " + votesForSam);

        add(joe); 
        add(labelJoe); 
        
        add(sam); 
        add(labelSam); 

        setPreferredSize(new Dimension(300, 80)); 
        setBackground(Color.cyan); 
} 

    //************************************************** 
    // Represents a listener for button push (action) events 
    //************************************************** 
    
    private class VoteButtonListener implements ActionListener { 

        //---------------------------------------------- 
        // Updates the appropriate vote counter when a 
        // button is pushed for one of the candidates. 
        //---------------------------------------------- 
        public void actionPerformed(ActionEvent event) { 
            
            Object source = event.getSource();

            if (source == joe) {
                votesForJoe++; 
                labelJoe.setText("Votes for Joe: " + votesForJoe); 
         
            } else {
                votesForSam++; 
                labelSam.setText("Votes for Sam: "
                        + votesForSam);               
            } 
        } 

    } 
}
