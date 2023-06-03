package io.github.MatheusFSantos.view;

import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import io.github.MatheusFSantos.controller.AccountController;
import io.github.MatheusFSantos.controller.BankStatementController;
import io.github.MatheusFSantos.controller.PaymentController;
import io.github.MatheusFSantos.model.domain.Account;
import io.github.MatheusFSantos.model.domain.Payment;
import io.github.MatheusFSantos.model.manager.DocumentManager;

public class VCX_App extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	
	/* PDF Manager */
	private DocumentManager documentManager;
	private List<String> pdfContent;
	
	private AccountController accountController;
	private PaymentController paymentController;
	private BankStatementController bankStatementController;
	
    public VCX_App() {
        initComponents();
        
        this.documentManager = new DocumentManager("/home/matheus/Eclipse/VC-X-Teste/src/main/resources/documento.pdf");
        this.pdfContent = documentManager.getDocument().getPdfContent();
        
        this.accountController = new AccountController();
        this.paymentController = new PaymentController();
        this.bankStatementController = new BankStatementController();
    }

    private void initComponents() {

        background = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        div = new javax.swing.JPanel();
        accountSubtitle = new javax.swing.JLabel();
        accountButton = new javax.swing.JButton();
        paymentSubtitle = new javax.swing.JLabel();
        paymentButton = new javax.swing.JButton();
        bankStatementSubtitle = new javax.swing.JLabel();
        bankStatementButton = new javax.swing.JButton();
        operationDateSubtitle = new javax.swing.JLabel();
        operationDateButton = new javax.swing.JButton();
        allInformationSubtitle = new javax.swing.JLabel();
        allInformationButton = new javax.swing.JButton();
        authorName = new javax.swing.JLabel();
        authorEmail = new javax.swing.JLabel();
        closeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VC-X Solutions");
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));

        title.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("VC-X Solutions Test");
        title.setToolTipText("");
        title.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        div.setBackground(new java.awt.Color(255, 255, 255));
        div.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        accountSubtitle.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        accountSubtitle.setText("Account Informations:");

        accountButton.setText("Click Here");
        accountButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountButtonMouseClicked(evt);
            }
        });

        paymentSubtitle.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        paymentSubtitle.setText("Payment Informations:");

        paymentButton.setText("Click Here");
        paymentButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paymentButtonMouseClicked(evt);
            }
        });

        bankStatementSubtitle.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        bankStatementSubtitle.setText("Bank Statement Id:");

        bankStatementButton.setText("Click Here");
        bankStatementButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bankStatementButtonMouseClicked(evt);
            }
        });

        operationDateSubtitle.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        operationDateSubtitle.setText("Operation Date:");

        operationDateButton.setText("Click Here");
        operationDateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                operationDateButtonMouseClicked(evt);
            }
        });

        allInformationSubtitle.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        allInformationSubtitle.setText("All Informations:");

        allInformationButton.setText("Click Here");
        allInformationButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                allInformationButtonMouseClicked(evt);
            }
        });

        authorName.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        authorName.setText("Matheus Ferreira Santos");

        authorEmail.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        authorEmail.setText("matheus.fs.contato@gmail.com");

        javax.swing.GroupLayout divLayout = new javax.swing.GroupLayout(div);
        div.setLayout(divLayout);
        divLayout.setHorizontalGroup(
            divLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, divLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(divLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(authorEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(authorName, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(divLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(divLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(divLayout.createSequentialGroup()
                        .addComponent(allInformationSubtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(allInformationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(divLayout.createSequentialGroup()
                        .addComponent(operationDateSubtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(operationDateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(divLayout.createSequentialGroup()
                        .addComponent(bankStatementSubtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bankStatementButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(divLayout.createSequentialGroup()
                        .addComponent(paymentSubtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(paymentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(divLayout.createSequentialGroup()
                        .addComponent(accountSubtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(accountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(357, Short.MAX_VALUE))
        );
        divLayout.setVerticalGroup(
            divLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(divLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(divLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountSubtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountButton))
                .addGap(18, 18, 18)
                .addGroup(divLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paymentSubtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paymentButton))
                .addGap(18, 18, 18)
                .addGroup(divLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bankStatementSubtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bankStatementButton))
                .addGap(18, 18, 18)
                .addGroup(divLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(operationDateSubtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(operationDateButton))
                .addGap(18, 18, 18)
                .addGroup(divLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(allInformationSubtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(allInformationButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(authorName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(authorEmail)
                .addContainerGap())
        );

        closeButton.setText("Close");
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(div, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(closeButton)
                        .addGap(18, 18, 18)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(div, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closeButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {
        JOptionPane.showMessageDialog(this, "See You Later!!!", "Bye bye", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    private void accountButtonMouseClicked(java.awt.event.MouseEvent evt) {
    	Account account = this.accountController.getAccountData(this.pdfContent);
    	
    	JOptionPane.showMessageDialog(this, "Informações da Conta Bancária:\n\nNome do titular: " + account.getName() + "\nAgencia: " + account.getAgency() + "\nConta: " + account.getAccountNumber(), "VC-X Solutions", JOptionPane.INFORMATION_MESSAGE);
    }

    private void paymentButtonMouseClicked(java.awt.event.MouseEvent evt) {
    	Payment payment = this.paymentController.getPaymentData(this.pdfContent);
    	
    	JOptionPane.showMessageDialog(this, "Informações de Pagamento:\n\nCodigo de barras: " + payment.getBarCode() + "\nPreço: R$" + payment.getPrice() + "\nInformações do pagador: " + payment.getPayerInformations(), "VC-X Solutions", JOptionPane.INFORMATION_MESSAGE);
    }

    private void bankStatementButtonMouseClicked(java.awt.event.MouseEvent evt) {
        String bankStatementIdentification = this.bankStatementController.getStatementIdentificationData(this.pdfContent);
     
    	JOptionPane.showMessageDialog(this, "Identificacao do extrato:\n\n" + bankStatementIdentification, "VC-X Solutions", JOptionPane.INFORMATION_MESSAGE);
    }

    private void operationDateButtonMouseClicked(java.awt.event.MouseEvent evt) {
    	Date date = this.paymentController.getPaymentDate(this.pdfContent);
    	
    	JOptionPane.showMessageDialog(this, "Operação realizada em:\n\n" + date, "VC-X Solutions", JOptionPane.INFORMATION_MESSAGE);
    }

    private void allInformationButtonMouseClicked(java.awt.event.MouseEvent evt) {
    	Account account = this.accountController.getAccountData(this.pdfContent);
    	Payment payment = this.paymentController.getPaymentData(this.pdfContent);
    	String bankStatementIdentification = this.bankStatementController.getStatementIdentificationData(this.pdfContent);
    	Date date = this.paymentController.getPaymentDate(this.pdfContent);
    	
    	JOptionPane.showMessageDialog(this, "--------------------------------------------- Extrato Bancário --------------------------------------------------\n\n> Data da operação: " + date + 
    										"\n\n> Dados bancários\nNome: " + account.getName() + "\nAgência: " + account.getAgency() + "\nConta: " + account.getAccountNumber() +
    										"\n\n> Dados do pagamento\nCodigo de barras: " + payment.getBarCode() + "\nPreço: R$" + payment.getPrice() + "\nInformações do pagador: " + payment.getPayerInformations() +
    										"\n\n> Identificação do extrato: " + bankStatementIdentification, "VC-X Solutions", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VCX_App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VCX_App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VCX_App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VCX_App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VCX_App().setVisible(true);
            }
        });
    }

    private javax.swing.JButton accountButton;
    private javax.swing.JLabel accountSubtitle;
    private javax.swing.JButton allInformationButton;
    private javax.swing.JLabel allInformationSubtitle;
    private javax.swing.JLabel authorEmail;
    private javax.swing.JLabel authorName;
    private javax.swing.JPanel background;
    private javax.swing.JButton bankStatementButton;
    private javax.swing.JLabel bankStatementSubtitle;
    private javax.swing.JButton closeButton;
    private javax.swing.JPanel div;
    private javax.swing.JButton operationDateButton;
    private javax.swing.JLabel operationDateSubtitle;
    private javax.swing.JButton paymentButton;
    private javax.swing.JLabel paymentSubtitle;
    private javax.swing.JLabel title;

}
