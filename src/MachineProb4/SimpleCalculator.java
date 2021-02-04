package MachineProb4;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.math.*;
import java.util.logging.*;

public class SimpleCalculator extends JFrame {

    // instantiate JFrame objects
    private final JPanel mainPanel = new JPanel();
    private final JLabel firstNo = new JLabel();
    private final JTextField firstNoField = new JTextField();
    private final JLabel secondNo = new JLabel();
    private final JLabel resultNo = new JLabel();
    private final JTextField resultNoField = new JTextField();
    private final JTextField secondNoField = new JTextField();
    private final JButton addBtn = new JButton();
    private final JButton subtractBtn = new JButton();
    private final JButton multiplyBtn = new JButton();
    private final JButton divideBtn = new JButton();
    private final JButton resetBtn = new JButton();
    private final JButton quitBtn = new JButton();

    public SimpleCalculator(){
        calcProperties();
    }

    // Calculator Properties
    private void calcProperties() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simple Calculator");

        // main panel window
        mainPanel.setBackground(new Color(209, 184, 187));
        mainPanel.setBorder(new LineBorder(new Color(202, 177, 173), 5, true));
        mainPanel.setName("");

        // First Number Label
        firstNo.setFont(new Font("Dialog", Font.BOLD, 14));
        firstNo.setForeground(new Color(103, 72, 77));
        firstNo.setText("First Number:");
        firstNo.setToolTipText("");

        // First Number Input Field
        firstNoField.setBackground(new Color(210, 231, 214));
        firstNoField.setFont(new Font("Dialog", Font.PLAIN, 14));
        firstNoField.setForeground(new Color(126, 95, 101));
        firstNoField.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(195, 155, 166)),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));

        // Second Number Label
        secondNo.setFont(new Font("Dialog", Font.BOLD, 14));
        secondNo.setForeground(new Color(103, 72, 77));
        secondNo.setText("Second Number:");
        secondNo.setToolTipText("");

        // Second Number Input Field
        secondNoField.setBackground(new Color(210, 231, 214));
        secondNoField.setFont(new Font("Dialog", Font.PLAIN, 14));
        secondNoField.setForeground(new Color(126, 95, 101));
        secondNoField.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(195, 155, 166)),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));

        // Result Number Label
        resultNo.setFont(new Font("Dialog", Font.BOLD, 14));
        resultNo.setForeground(new Color(103, 72, 77));
        resultNo.setText("RESULT:");
        resultNo.setToolTipText("");

        // Calculator Results Output
        resultNoField.setEditable(false);
        resultNoField.setBackground(new Color(209, 184, 187));
        resultNoField.setFont(new Font("Dialog", Font.PLAIN, 15));
        resultNoField.setForeground(new Color(0, 0, 0));
        resultNoField.setBorder(null);

        // *** CALCULATOR BUTTONS ***

        // ADDITION
        addBtn.setBackground(new Color(189, 150, 155));
        addBtn.setFont(new Font("Dialog", Font.BOLD, 15));
        addBtn.setForeground(new Color(130, 97, 104));
        addBtn.setMnemonic('a');
        addBtn.setText("ADD");
        addBtn.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        addBtn.setBorderPainted(false);
        addBtn.setFocusPainted(false);
        addBtn.addActionListener((ActionEvent evt) -> {
            addBtnActionPerformed(evt);
        });

        // SUBTRACTION
        subtractBtn.setBackground(new Color(189, 150, 155));
        subtractBtn.setFont(new Font("Dialog", Font.BOLD, 15));
        subtractBtn.setForeground(new Color(130, 97, 104));
        subtractBtn.setMnemonic('s');
        subtractBtn.setText("SUBTRACT");
        subtractBtn.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        subtractBtn.setBorderPainted(false);
        subtractBtn.setFocusPainted(false);
        subtractBtn.addActionListener((ActionEvent evt) -> {
            subtractBtnActionPerformed(evt);
        });

        // MULTIPLICATION
        multiplyBtn.setBackground(new Color(189, 150, 155));
        multiplyBtn.setFont(new Font("Dialog", Font.BOLD, 15));
        multiplyBtn.setForeground(new Color(130, 97, 104));
        multiplyBtn.setMnemonic('m');
        multiplyBtn.setText("MULTIPLY");
        multiplyBtn.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        multiplyBtn.setBorderPainted(false);
        multiplyBtn.setFocusPainted(false);
        multiplyBtn.addActionListener((ActionEvent evt) -> {
            multiplyBtnActionPerformed(evt);
        });

        // DIVISION
        divideBtn.setBackground(new Color(189, 150, 155));
        divideBtn.setFont(new Font("Dialog", Font.BOLD, 15));
        divideBtn.setForeground(new Color(130, 97, 104));
        divideBtn.setMnemonic('d');
        divideBtn.setText("DIVIDE");
        divideBtn.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        divideBtn.setBorderPainted(false);
        divideBtn.setFocusPainted(false);
        divideBtn.addActionListener((ActionEvent evt) -> {
            divideBtnActionPerformed(evt);
        });

        // RESET/CLEAR INPUT
        resetBtn.setBackground(new Color(189, 150, 155));
        resetBtn.setFont(new Font("Dialog", Font.BOLD, 15));
        resetBtn.setForeground(new Color(130, 97, 104));
        resetBtn.setMnemonic('r');
        resetBtn.setText("RESET");
        resetBtn.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        resetBtn.setBorderPainted(false);
        resetBtn.setFocusPainted(false);
        resetBtn.addActionListener((ActionEvent evt) -> {
            resetBtnActionPerformed(evt);
        });

        // QUIT/EXIT CALCULATOR
        quitBtn.setBackground(new Color(189, 150, 155));
        quitBtn.setFont(new Font("Dialog", Font.BOLD, 15));
        quitBtn.setForeground(new Color(130, 97, 104));
        quitBtn.setMnemonic('q');
        quitBtn.setText("QUIT");
        quitBtn.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        quitBtn.setBorderPainted(false);
        quitBtn.setFocusPainted(false);
        quitBtn.addActionListener((ActionEvent evt) -> {
            quitBtnActionPerformed(evt);
        });

        GroupLayout mainPanelLayout = new GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
                mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addComponent(resetBtn, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(quitBtn, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addComponent(multiplyBtn, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(divideBtn, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addComponent(addBtn, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(subtractBtn, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                                .addComponent(firstNo)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(firstNoField, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addComponent(secondNo)
                                                .addGap(24, 24, 24)
                                                .addComponent(secondNoField, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addComponent(resultNo)
                                                .addGap(18, 18, 18)
                                                .addComponent(resultNoField, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(50, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
                mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(firstNo)
                                        .addComponent(firstNoField, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(secondNoField, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(secondNo))
                                .addGap(18, 18, 18)
                                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(resultNo, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(resultNoField, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(addBtn, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(subtractBtn, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(multiplyBtn, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(divideBtn, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(resetBtn, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(quitBtn, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(58, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(mainPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(mainPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }

    // *** CALCULATOR OPERATIONS ***

    private void addBtnActionPerformed(ActionEvent evt) { // ADDITION
        float num1, num2;
        BigDecimal result;
        num1 = Float.parseFloat(firstNoField.getText());
        num2 = Float.parseFloat(secondNoField.getText());
        result = BigDecimal.valueOf(num1 + num2).setScale(6, RoundingMode.DOWN).stripTrailingZeros();;
        resultNoField.setText(result.toPlainString());
    }

    private void subtractBtnActionPerformed(ActionEvent evt) { // SUBTRACTION
        float num1, num2;
        BigDecimal result;
        num1 = Float.parseFloat(firstNoField.getText());
        num2 = Float.parseFloat(secondNoField.getText());
        result = BigDecimal.valueOf(num1 - num2).setScale(6, RoundingMode.DOWN).stripTrailingZeros();;
        resultNoField.setText(result.toPlainString());
    }

    private void multiplyBtnActionPerformed(ActionEvent evt) { // MULTIPLICATION
        float num1, num2;
        BigDecimal result;
        num1 = Float.parseFloat(firstNoField.getText());
        num2 = Float.parseFloat(secondNoField.getText());
        result = BigDecimal.valueOf(num1 * num2).setScale(6, RoundingMode.DOWN).stripTrailingZeros();;
        resultNoField.setText(result.toPlainString());
    }

    private void divideBtnActionPerformed(ActionEvent evt) { // DIVISION
        float num1, num2;
        BigDecimal result;
        num1 = Float.parseFloat(firstNoField.getText());
        num2 = Float.parseFloat(secondNoField.getText());
        result = BigDecimal.valueOf(num1 / num2).setScale(6,RoundingMode.DOWN).stripTrailingZeros();;
        resultNoField.setText(result.toPlainString());
    }

    private void resetBtnActionPerformed(ActionEvent evt) { // RESET
        firstNoField.setText("");
        secondNoField.setText("");
        resultNoField.setText("");
    }

    private void quitBtnActionPerformed(ActionEvent evt) { // QUIT/EXIT
        String exitMsg = "This will terminate the program!";
        JOptionPane.showMessageDialog(null,exitMsg);
        System.exit(0);
    }

    public static void main(String args[]) {

        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(SimpleCalculator.class.getName()).log(Level.SEVERE, null, ex);
        }

        EventQueue.invokeLater(() -> {
            new SimpleCalculator().setVisible(true);
        });
    }
}