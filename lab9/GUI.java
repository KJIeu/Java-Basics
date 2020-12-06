package lab9;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    JFrame frame = new JFrame("Lab 9");
    //All objects on frame
    private JButton CalculateButton = new JButton("Calculate");
    private JTextField Dividend = new JTextField();
    private JTextField Divisor = new JTextField();
    private JLabel Title = new JLabel("Welcome to Unlucky Divisor");
    private JLabel DividendLabel = new JLabel("Dividend:");
    private JLabel DivisorLabel = new JLabel("Divisor:");
    private JLabel ResultLabel = new JLabel("Result:");
    private JLabel ExceptionLabel = new JLabel();

    private void FrameSettings(){
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);// Teams and Skype tribute XD
        frame.setSize(360,360); //dimensions
        frame.setLocationRelativeTo(null); //location on frame
        frame.setLayout(null); //type of layout
        frame.setVisible(true);
    }

    private void SetTitle(){
        Title.setSize(180,20);
        Title.setLocation(100,30);
        Title.setForeground(Color.RED);
        frame.getContentPane().add(Title);
    }

    private void SetDividends(){ ////TextField & Label
        Dividend.setSize(100,20);
        Dividend.setLocation(160,70);
        frame.getContentPane().add(Dividend);

        DividendLabel.setSize(70,20);
        DividendLabel.setLocation(70,70);
        frame.getContentPane().add(DividendLabel);
    }

    private void SetDivisors(){ //TextField & Label
        Divisor.setSize(100,20);
        Divisor.setLocation(160,120);
        frame.getContentPane().add(Divisor);

        DivisorLabel.setSize(70,20);
        DivisorLabel.setLocation(70,120);
        frame.getContentPane().add(DivisorLabel);
    }

    private void SetResults(double res){
        ResultLabel.setSize(100,20);
        ResultLabel.setLocation(30,180);
        frame.getContentPane().add(ResultLabel);
        ExceptionLabel.setText(" ");
        ResultLabel.setText("Result: " + res);
    }

    private void SetExceptions(String ExceptionText){
        ExceptionLabel.setForeground(Color.red);
        ExceptionLabel.setSize(400,20);
        ExceptionLabel.setLocation(30,180);
        frame.getContentPane().add(ExceptionLabel);
        ResultLabel.setText(" ");
        ExceptionLabel.setText(ExceptionText);
    }

    private void SetCalculate(){
        CalculateButton.setSize(100,40);
        CalculateButton.setLocation(130,210);
        CalculateButton.setBackground(Color.GREEN);
        CalculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                try {
                    System.out.println(2);
                    double num1 = Float.parseFloat(Dividend.getText());
                    double num2 = Float.parseFloat(Divisor.getText());

                    if (num2 == 13) {
                        throw new UnluckyException();
                    }

                    SetResults(num1/num2);

                } catch (NullPointerException NPE) {
                    SetExceptions("Error: You must fill in all fields!");
                } catch (NumberFormatException NFE) {
                    SetExceptions("Error: Wrong Input. I can calculate only numbers.");
                } catch (ArithmeticException AE) {
                    SetExceptions("Error: Wrong input. Can't evaluate this expression.");
                } catch (UnluckyException UE) {
                    SetExceptions("Sorry, you caught Unlucky Exception.");
                }
            }
        });

        frame.getContentPane().add(CalculateButton);

    }

    public void create() {
        FrameSettings();
        SetTitle();
        SetDivisors();
        SetDividends();
        SetCalculate();
    }
}
