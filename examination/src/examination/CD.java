/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package examination;

/**
 *
 * @author HP
 */






/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.*;

/**
 *
 * @author HP
 */
public class CD extends JLabel implements ActionListener 
{
   
   
protected String resfin=null;
    private static final long serialVersionUID = 1L;
    protected long count;
    private long timerStart;
    protected DateFormat dateFormat;
protected int flag=0;
    javax.swing.Timer timer = new javax.swing.Timer(1000, this);

    
    public CD(int minutes, int seconds) {
        // suppose to show as in 30 MIN 30 SEC.
        super(" ", JLabel.CENTER);

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MINUTE, minutes);
        cal.set(Calendar.SECOND, seconds);
        count = cal.getTime().getTime();

        dateFormat = new SimpleDateFormat("mm:ss");

        timer.start();
        timerStart = System.currentTimeMillis();
        long elapsedTime = System.currentTimeMillis()-timerStart;

        System.out.println(elapsedTime);

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        // suppose to countdown till 00 MIN 00 SEC
        
      setText(dateFormat.format(count));
        count -= 1000;

        
        
        
          
        if (dateFormat.format(count).equalsIgnoreCase("00:00")) 
        {
        
       

        closewindow();
        
        
        }
            
            
            
            
            
            }
    
    
    
      
    public void closewindow()   
    {
        
        timer.stop();
        setText("exam ended");
        this.setVisible(false);
        estud3 es3=new estud3();
        results rest=new results();
        rest.setVisible(true);
        rest.res2.setEditable(false);
        rest.res3.setEditable(false);
        rest.res4.setEditable(false);
        int jaba=Integer.parseInt(estud3.ssum);
        if (jaba>=1)
        {
            //JOptionPane.showMessageDialog(null,"zero");
        rest.res2.setText(estud3.ssum);
        rest.res3.setText(estud3.ssum);
        
      int answrr=Integer.parseInt(estud3.max);
      int ssumm=Integer.parseInt(estud3.ssum);
      int wrongg=answrr-ssumm;
      rest.res4.setText(String.valueOf(wrongg));
        }
      else if (jaba<1)
        {
           // JOptionPane.showMessageDialog(null,"zero");
            rest.res2.setText("0");
        rest.res3.setText("0");
        rest.res4.setText("0");
        }
        else
      {
          
      }
    }
        
        
        
        
        
                 
        
        
        
        
        
        
        
        
        
        
        
        
        

        
        
        
        
        
           
 
        
        
        
        
                
        
        
         
         
         
         
   

    public static void main(String[] args) {
 
        
        
        
        }
}