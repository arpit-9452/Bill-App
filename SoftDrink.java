import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SoftDrink {
    public static void main(String args[]) {
        System.out.println("Testing..");
        // Creating Fonts
        Font font = new Font("Roboto", Font.BOLD, 22);
        Font fontforNav = new Font("Sans-Seriff", Font.BOLD, 28);

        // Creating Nav Panels----------------------
        JPanel navPanel = new JPanel();
        navPanel.setLayout(null);
        navPanel.setBackground(Color.BLUE);
        navPanel.setBounds(0, 0, 1050, 55);

        // Creting Center Panle----------------------
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(null);
        centerPanel.setBackground(Color.CYAN);
        centerPanel.setBounds(0, 0, 1050, 609);

        // Creating Produc Panel----------------------
        JPanel productPanel = new JPanel();
        productPanel.setLayout(null);
        productPanel.setBackground(Color.GREEN);
        productPanel.setBounds(275, 70, 420, 520);

        // Creating Labels for ProductPanel----------------------------
        JLabel lableForProductPanel = new JLabel();
        lableForProductPanel.setText("Products");
        lableForProductPanel.setFont(font);
        lableForProductPanel.setBounds(0, 0, 220, 25);

        // Creating Lables For Price-----------------------
        JLabel labelForPrice = new JLabel();
        labelForPrice.setText("Quantity");
        labelForPrice.setFont(font);
        labelForPrice.setBounds(260, 2, 220, 25);

        // Creating Product for ProductPanel..--------------------------
        int mazaPrice = 65;
        int spritePrice = 85;
        int cokePrice = 95;
        int limcaPrice = 93;

        // Tax on Product On
        int mazaTax = 16;
        int spriteTax = 18;
        int coketax = 17;
        int limcaTax = 15;

        JLabel labelForMaza = new JLabel();
        labelForMaza.setText("Maza");
        labelForMaza.setFont(font);
        labelForMaza.setBounds(9, 50, 220, 25);

        JLabel labelForSprite = new JLabel();
        labelForSprite.setText("Sprite");
        labelForSprite.setFont(font);
        labelForSprite.setBounds(9, 110, 220, 25);

        JLabel labelForCoke = new JLabel();
        labelForCoke.setText("Coke");
        labelForCoke.setFont(font);
        labelForCoke.setBounds(9, 170, 220, 25);

        JLabel labelForLimca = new JLabel();
        labelForLimca.setText("Limca");
        labelForLimca.setFont(font);
        labelForLimca.setBounds(9, 230, 220, 25);

        // Creating Text-Fields For Product
        // Quantity...--------=========================---

        JTextField fieldForMaza = new JTextField();
        fieldForMaza.setFont(font);
        fieldForMaza.setBounds(255, 50, 100, 29);

        JTextField fieldForSprite = new JTextField();
        fieldForSprite.setFont(font);
        fieldForSprite.setBounds(255, 110, 100, 29);

        JTextField fieldForCoke = new JTextField();
        fieldForCoke.setFont(font);
        fieldForCoke.setBounds(255, 170, 100, 29);

        JTextField fieldForLimca = new JTextField();
        fieldForLimca.setFont(font);
        fieldForLimca.setBounds(255, 230, 100, 29);

        // Creating Result Labels----------------------------
        JLabel resultLableTotal = new JLabel();
        resultLableTotal.setText("Sub Total Amount");
        resultLableTotal.setLayout(null);
        resultLableTotal.setBounds(6, 350, 220, 25);
        resultLableTotal.setFont(font);

        JLabel resultLableTax = new JLabel();
        resultLableTax.setText(" Total Tax Amount");
        resultLableTax.setLayout(null);
        resultLableTax.setBounds(0, 395, 220, 25);
        resultLableTax.setFont(font);

        JLabel resultTotal = new JLabel();
        resultTotal.setText(" Total Amount");
        resultTotal.setLayout(null);
        resultTotal.setBounds(0, 445, 220, 25);
        resultTotal.setFont(font);

        // Creating Result TextFileds================================
        JTextField resultTextField = new JTextField();
        resultTextField.setFont(font);
        resultTextField.setLayout(null);
        resultTextField.setBounds(200, 340, 180, 35);
        // SubTotal TExtarea-----------

        JTextField resultTextFieldTax = new JTextField();
        resultTextFieldTax.setFont(font);
        resultTextFieldTax.setLayout(null);
        resultTextFieldTax.setBounds(200, 395, 180, 35);
        // Tax Textarea

        JTextField totalTextField = new JTextField();
        totalTextField.setFont(font);
        totalTextField.setLayout(null);
        totalTextField.setBounds(200, 440, 180, 35);
        // Total Textrea

        // Creating Button for Calculate---------------
        JButton buttonCalc = new JButton();
        buttonCalc.setText("Eval");
        buttonCalc.setLayout(null);
        buttonCalc.setBounds(200, 290, 178, 40);
        buttonCalc.setFont(font);

        buttonCalc.addActionListener((e) -> {
            System.out.println("This button is Clicked..");
            String mazaValue = fieldForMaza.getText();
            String spriteValue = fieldForSprite.getText();
            String cokeValue = fieldForCoke.getText();
            String limcaValue = fieldForLimca.getText();

            int mazaValueInt = Integer.parseInt(mazaValue);
            int spriteValueInt = Integer.parseInt(spriteValue);
            int cokeValueInt = Integer.parseInt(cokeValue);
            int limcaValueInt = Integer.parseInt(limcaValue);

            // Creating SubToTal Value..---------------------
            int subTotalMaza = mazaPrice * mazaValueInt;
            int subTotalSprite = spritePrice * spriteValueInt;
            int subTotalCoke = cokePrice * cokeValueInt;
            int subTotalLimca = limcaPrice * limcaValueInt;

            // Adding All For Total---------------
            int allSubTotalProduct = subTotalMaza + subTotalSprite + subTotalCoke + subTotalLimca;
            System.out.println("All Sub Total Is "+ allSubTotalProduct);

            // converting All SubTotal Value in String again..
            String allSubTotalStr = Integer.toString(allSubTotalProduct);

            // Putting Tax Value On the items..-----------------------
            int taxOnMaza = mazaPrice * mazaValueInt * mazaTax / 100;
            int taxOnSprite = spritePrice * spriteValueInt * spriteTax / 100;
            int taxOnCoke = cokePrice * cokeValueInt * coketax / 100;
            int taxOnLimca = limcaPrice * limcaValueInt * limcaTax / 100;
            // Adding All The Tax To SHow-------------------
            int allTaxOnProduct = taxOnMaza + taxOnSprite + taxOnCoke + taxOnLimca;
            System.out.println("All tax on Product..."+ allTaxOnProduct);
            // Converting Thier Value To String
            String allTaxOnProductStr = Integer.toString(allTaxOnProduct);

            // Adding Total Values with Tax------------------------s
            int totalAmtMaza = mazaPrice * mazaTax / 100 + mazaPrice * mazaValueInt;
            int totalAmtSprite = spritePrice * spriteTax / 100 + spritePrice * spriteValueInt;
            int totalAmtCoke = cokePrice * coketax / 100 + cokePrice * cokeValueInt;
            int totalAmtLimca = limcaPrice * limcaTax / 100 + limcaPrice * limcaValueInt;
            // Adding All Value------------------------
            int totalAmtProductwithTax = totalAmtMaza + totalAmtSprite + totalAmtCoke + totalAmtLimca;
            System.out.println("Total Amount is "+totalAmtProductwithTax);
            System.out.println(totalAmtProductwithTax-allSubTotalProduct+" Total Tax Amount Substract with tax");
            // Converting TotalAMT with Tax to String-------------------
            String totalAmtProductwithTaxStr = Integer.toString(totalAmtProductwithTax);

            // Putting the String Value To The Result Text-Area---------------------------
            resultTextField.setText(" Rs. " + allSubTotalStr);
            resultTextFieldTax.setText(" Rs. " + allTaxOnProductStr);
            totalTextField.setText(" Rs. " + totalAmtProductwithTaxStr);
        });

        // Creating Lables for NavBar---------------------
        JLabel labelForNav = new JLabel();
        labelForNav.setText("Billing Software..");
        labelForNav.setFont(fontforNav);
        labelForNav.setForeground(Color.WHITE);
        labelForNav.setBounds(420, 12, 280, 22);

        // Creating Frame-----------------------
        JFrame frame = new JFrame();
        frame.setSize(1050, 650);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.add(navPanel);
        productPanel.add(lableForProductPanel);

        // productPanel.add(labelForQuantity);
        productPanel.add(labelForPrice);
        productPanel.add(labelForCoke);
        productPanel.add(labelForMaza);
        productPanel.add(labelForSprite);
        productPanel.add(labelForLimca);
        productPanel.add(fieldForMaza);
        productPanel.add(fieldForSprite);
        productPanel.add(fieldForCoke);
        productPanel.add(fieldForLimca);
        productPanel.add(buttonCalc);
        productPanel.add(resultLableTotal);
        productPanel.add(resultTextField);
        productPanel.add(resultLableTax);
        productPanel.add(resultTextFieldTax);
        productPanel.add(resultTotal);
        productPanel.add(totalTextField);
        centerPanel.add(productPanel);
        frame.add(centerPanel);
        navPanel.add(labelForNav);
        frame.setVisible(true);

    }
}
