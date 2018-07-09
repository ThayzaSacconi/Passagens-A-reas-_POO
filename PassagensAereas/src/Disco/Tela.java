package softwarelp;

import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Thayza
 */
public class Tela extends javax.swing.JFrame {
    int posicao, num_conta;
    boolean logado, gerente;
    public static ArrayList<Cliente> clientes = new ArrayList<>(100);
    //Date dataatual = new Date();
    Timer timer = new Timer();
    
    
    public ArrayList<Cliente> getVoos() {
        return clientes;
    }
    
    /**
     * Creates new form Tela
     */
    public Tela() {
        initComponents();
        //Tela.clientes =  Arquivos.lerDoDisco();//inicia o arraylist com a lista lida do arquivo na classe Arquivos
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);        
        
        logado = false;
        posicao=0;
        num_conta =100000;
         //add algms clintes para teste
         clientes.add(new Cliente("Ana",".com","estudante", "123.4566.788-00", "(27)99000-0000","F","12/12/12","1" ,"1",0.00)); 
         clientes.add(new Cliente("Flavia",".com","estudante", "123.4566.788-00", "(27)99000-0000","F","12/12/12","45000" ,"083181",0.00)); 
         clientes.add(new Cliente("Nani",".com","estudante", "123.4566.788-00", "(27)99000-0000","F","12/12/12","15372" ,"131311",0.00)); 
         clientes.add(new Cliente("Thayza",".com","estudante", "123.4566.788-00", "(27)99000-0000","F","12/12/12","23100" ,"242255",0.00)); 
    }
    
    private String getDateTime() { 
	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
	Date date = new Date(); 
	return dateFormat.format(date); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonEscolhaSexo = new javax.swing.ButtonGroup();
        jPanelTotal = new javax.swing.JPanel();
        jPanelMenu = new javax.swing.JPanel();
        Titulo = new javax.swing.JPanel();
        jTitulo = new javax.swing.JLabel();
        jSubTitulo = new javax.swing.JLabel();
        jSeparator = new javax.swing.JSeparator();
        jSaldo = new javax.swing.JPanel();
        icon1 = new javax.swing.JLabel();
        jDepositar = new javax.swing.JPanel();
        icon3 = new javax.swing.JLabel();
        jSacar = new javax.swing.JPanel();
        icon2 = new javax.swing.JLabel();
        jConta = new javax.swing.JPanel();
        icon4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jExtrato = new javax.swing.JPanel();
        icon5 = new javax.swing.JLabel();
        jConta3 = new javax.swing.JPanel();
        icon8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanelTelas = new javax.swing.JPanel();
        jBoasVindas = new javax.swing.JPanel();
        jSair = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        iconBorboletas = new javax.swing.JLabel();
        Texto2 = new javax.swing.JLabel();
        Texto1 = new javax.swing.JLabel();
        jButtonCadastrar = new javax.swing.JButton();
        jPanelSaldo = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        DentroSaldo = new javax.swing.JPanel();
        SaldoDaConta = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        jPanelRetornar = new javax.swing.JPanel();
        voltarsaldo = new javax.swing.JLabel();
        jPanelSacar = new javax.swing.JPanel();
        textSacar = new javax.swing.JLabel();
        voltarsacar = new javax.swing.JLabel();
        jsaquetroca = new javax.swing.JPanel();
        DentroSacar = new javax.swing.JPanel();
        iconDinheiro = new javax.swing.JLabel();
        jLabelValorSacar = new javax.swing.JLabel();
        jTextoValorSacar = new javax.swing.JFormattedTextField();
        jButtonSacar = new javax.swing.JButton();
        jSeparator12 = new javax.swing.JSeparator();
        jInsiraSenha = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        SenhaSacar = new javax.swing.JPasswordField();
        jSaquerealizado = new javax.swing.JPanel();
        jmensagemsaque = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanelCadastro = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        TelaCadastro = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        TextoNome = new javax.swing.JTextField();
        jNome = new javax.swing.JLabel();
        jEmail = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        TextoEmail = new javax.swing.JTextField();
        jProfissao = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        TextoProfissao = new javax.swing.JTextField();
        jCpf = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jTelefone = new javax.swing.JLabel();
        jDataNasc = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jTelefone1 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jSexo = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        SexoFem = new javax.swing.JCheckBox();
        SexoMasc = new javax.swing.JCheckBox();
        jButtonSalvar = new javax.swing.JButton();
        jSenha = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jTextoSenha = new javax.swing.JPasswordField();
        TextoCpf = new javax.swing.JFormattedTextField();
        TextoTelefone = new javax.swing.JFormattedTextField();
        TextoDataNasc = new javax.swing.JFormattedTextField();
        voltacadastro = new javax.swing.JLabel();
        jPanelLogin = new javax.swing.JPanel();
        TelaLogin = new javax.swing.JPanel();
        iconUser = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jLabelUser = new javax.swing.JLabel();
        TextoUserLogin = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        TextoSenhaLogin = new javax.swing.JPasswordField();
        buttonEntrar = new javax.swing.JButton();
        TextoLogin = new javax.swing.JLabel();
        voltalogin = new javax.swing.JLabel();
        TelaLogado = new javax.swing.JPanel();
        jSair4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        iconBorboletas1 = new javax.swing.JLabel();
        Texto3 = new javax.swing.JLabel();
        Texto4 = new javax.swing.JLabel();
        pegaNome = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanelExtrato = new javax.swing.JPanel();
        voltaextrato = new javax.swing.JLabel();
        textSacar2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableExtrato = new javax.swing.JTable();
        jPanelDepositar = new javax.swing.JPanel();
        textSacar1 = new javax.swing.JLabel();
        voltadepositar = new javax.swing.JLabel();
        jdepositotroca = new javax.swing.JPanel();
        DentroDepositar = new javax.swing.JPanel();
        iconDinheiro2 = new javax.swing.JLabel();
        jLabelValorDepositar = new javax.swing.JLabel();
        jTextoValorDepositar = new javax.swing.JFormattedTextField();
        jButtondepositar = new javax.swing.JButton();
        jSeparator17 = new javax.swing.JSeparator();
        jInsiraSenha2 = new javax.swing.JLabel();
        jSeparator18 = new javax.swing.JSeparator();
        Senhadeposito = new javax.swing.JPasswordField();
        jDepositoRealizado = new javax.swing.JPanel();
        jmensagemsaque1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelTotal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelMenu.setBackground(new java.awt.Color(0, 255, 204));
        jPanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setBackground(new java.awt.Color(0, 255, 204));
        Titulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTitulo.setFont(new java.awt.Font("Broadway", 0, 24)); // NOI18N
        jTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/borboleta.png"))); // NOI18N
        jTitulo.setText("Metamorfose");
        Titulo.add(jTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 250, 50));

        jSubTitulo.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jSubTitulo.setText("Banco");
        Titulo.add(jSubTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 80, 40));

        jSeparator.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator.setForeground(new java.awt.Color(0, 0, 0));
        Titulo.add(jSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 270, 10));

        jPanelMenu.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 140));

        jSaldo.setBackground(new java.awt.Color(0, 255, 204));
        jSaldo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSaldoMouseClicked(evt);
            }
        });

        icon1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Saldo.png"))); // NOI18N
        icon1.setText("SALDO          ");
        icon1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jSaldoLayout = new javax.swing.GroupLayout(jSaldo);
        jSaldo.setLayout(jSaldoLayout);
        jSaldoLayout.setHorizontalGroup(
            jSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(jSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jSaldoLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(icon1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jSaldoLayout.setVerticalGroup(
            jSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(jSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(icon1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
        );

        jPanelMenu.add(jSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 290, 40));

        jDepositar.setBackground(new java.awt.Color(0, 255, 204));
        jDepositar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDepositarMouseClicked(evt);
            }
        });

        icon3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        icon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Novidades.png"))); // NOI18N
        icon3.setText("DEPOSITAR");

        javax.swing.GroupLayout jDepositarLayout = new javax.swing.GroupLayout(jDepositar);
        jDepositar.setLayout(jDepositarLayout);
        jDepositarLayout.setHorizontalGroup(
            jDepositarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDepositarLayout.createSequentialGroup()
                .addComponent(icon3, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDepositarLayout.setVerticalGroup(
            jDepositarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDepositarLayout.createSequentialGroup()
                .addComponent(icon3)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jPanelMenu.add(jDepositar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 290, 40));

        jSacar.setBackground(new java.awt.Color(0, 255, 204));
        jSacar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSacar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSacarMouseClicked(evt);
            }
        });

        icon2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        icon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/VendaPassagem.png"))); // NOI18N
        icon2.setText("SACAR         ");

        javax.swing.GroupLayout jSacarLayout = new javax.swing.GroupLayout(jSacar);
        jSacar.setLayout(jSacarLayout);
        jSacarLayout.setHorizontalGroup(
            jSacarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jSacarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon2, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
        jSacarLayout.setVerticalGroup(
            jSacarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanelMenu.add(jSacar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 290, 40));

        jConta.setBackground(new java.awt.Color(0, 255, 204));
        jConta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jContaMouseClicked(evt);
            }
        });

        icon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Conta.png"))); // NOI18N
        icon4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jConta.add(icon4);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel11.setText(" Login | Cliente");
        jConta.add(jLabel11);

        jPanelMenu.add(jConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 290, 40));

        jExtrato.setBackground(new java.awt.Color(0, 255, 204));
        jExtrato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jExtratoMouseClicked(evt);
            }
        });

        icon5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        icon5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Extrato.png"))); // NOI18N
        icon5.setText("EXTRATO     ");
        icon5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jExtratoLayout = new javax.swing.GroupLayout(jExtrato);
        jExtrato.setLayout(jExtratoLayout);
        jExtratoLayout.setHorizontalGroup(
            jExtratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jExtratoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon5, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addContainerGap())
        );
        jExtratoLayout.setVerticalGroup(
            jExtratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jExtratoLayout.createSequentialGroup()
                .addComponent(icon5, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelMenu.add(jExtrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 290, 40));

        jConta3.setBackground(new java.awt.Color(0, 255, 204));
        jConta3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jConta3MouseClicked(evt);
            }
        });

        icon8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Conta.png"))); // NOI18N
        icon8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jConta3.add(icon8);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel14.setText(" Login | Gerente");
        jConta3.add(jLabel14);

        jPanelMenu.add(jConta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 290, 40));

        jPanelTotal.add(jPanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 500));

        jPanelTelas.setBackground(new java.awt.Color(204, 204, 204));
        jPanelTelas.setLayout(new java.awt.CardLayout());

        jBoasVindas.setBackground(new java.awt.Color(255, 255, 255));
        jBoasVindas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSair.setBackground(new java.awt.Color(255, 255, 255));
        jSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSairMouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Exit.png"))); // NOI18N

        javax.swing.GroupLayout jSairLayout = new javax.swing.GroupLayout(jSair);
        jSair.setLayout(jSairLayout);
        jSairLayout.setHorizontalGroup(
            jSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
            .addGroup(jSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jSairLayout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addComponent(jLabel5)
                    .addContainerGap(12, Short.MAX_VALUE)))
        );
        jSairLayout.setVerticalGroup(
            jSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
            .addGroup(jSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jSairLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel5)
                    .addContainerGap(12, Short.MAX_VALUE)))
        );

        jBoasVindas.add(jSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 0, -1, -1));

        iconBorboletas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/borboleta2.jpg"))); // NOI18N
        jBoasVindas.add(iconBorboletas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 412, 190));

        Texto2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Texto2.setText("Cadastre-se para desfrutar dos nossos serviços.");
        jBoasVindas.add(Texto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, -1, -1));

        Texto1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Texto1.setText("Bem vindo ao Banco Metamorfose! ");
        jBoasVindas.add(Texto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 322, -1, -1));

        jButtonCadastrar.setBackground(new java.awt.Color(153, 255, 204));
        jButtonCadastrar.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });
        jBoasVindas.add(jButtonCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 440, 360, -1));

        jPanelTelas.add(jBoasVindas, "card3");

        jPanelSaldo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelSaldo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel16.setText("Saldo");
        jPanelSaldo.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        DentroSaldo.setBackground(new java.awt.Color(255, 204, 204));
        DentroSaldo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SaldoDaConta.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        SaldoDaConta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DentroSaldo.add(SaldoDaConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 140, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel18.setText("Saldo atual da conta: ");
        DentroSaldo.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jSeparator16.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator16.setForeground(new java.awt.Color(0, 0, 0));
        DentroSaldo.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 250, 10));

        jPanelRetornar.setBackground(new java.awt.Color(255, 204, 204));
        jPanelRetornar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelRetornarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelRetornarLayout = new javax.swing.GroupLayout(jPanelRetornar);
        jPanelRetornar.setLayout(jPanelRetornarLayout);
        jPanelRetornarLayout.setHorizontalGroup(
            jPanelRetornarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        jPanelRetornarLayout.setVerticalGroup(
            jPanelRetornarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        DentroSaldo.add(jPanelRetornar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, -1, -1));

        jPanelSaldo.add(DentroSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 320, 340));

        voltarsaldo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Desfazer.png"))); // NOI18N
        voltarsaldo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voltarsaldoMouseClicked(evt);
            }
        });
        jPanelSaldo.add(voltarsaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 30, 40));

        jPanelTelas.add(jPanelSaldo, "card7");

        jPanelSacar.setBackground(new java.awt.Color(255, 255, 255));
        jPanelSacar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textSacar.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        textSacar.setText("Sacar");
        jPanelSacar.add(textSacar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        voltarsacar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Desfazer.png"))); // NOI18N
        voltarsacar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voltarsacarMouseClicked(evt);
            }
        });
        jPanelSacar.add(voltarsacar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 30, -1));

        jsaquetroca.setLayout(new java.awt.CardLayout());

        DentroSacar.setBackground(new java.awt.Color(255, 204, 204));
        DentroSacar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconDinheiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Caixa.png"))); // NOI18N
        DentroSacar.add(iconDinheiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 60, 60));

        jLabelValorSacar.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabelValorSacar.setText("Valor a ser sacado");
        DentroSacar.add(jLabelValorSacar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jTextoValorSacar.setBackground(new java.awt.Color(255, 204, 204));
        jTextoValorSacar.setBorder(null);
        jTextoValorSacar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat(""))));
        DentroSacar.add(jTextoValorSacar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 250, 30));

        jButtonSacar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSacar.setText("SACAR");
        jButtonSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSacarActionPerformed(evt);
            }
        });
        DentroSacar.add(jButtonSacar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 100, 40));

        jSeparator12.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));
        DentroSacar.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 250, 10));

        jInsiraSenha.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jInsiraSenha.setText("Insira sua senha para prosseguir");
        DentroSacar.add(jInsiraSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jSeparator13.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator13.setForeground(new java.awt.Color(0, 0, 0));
        DentroSacar.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 250, 10));

        SenhaSacar.setBackground(new java.awt.Color(255, 204, 204));
        SenhaSacar.setBorder(null);
        DentroSacar.add(SenhaSacar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 240, 30));

        jsaquetroca.add(DentroSacar, "card2");

        jSaquerealizado.setBackground(new java.awt.Color(255, 255, 255));
        jSaquerealizado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jmensagemsaque.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jSaquerealizado.add(jmensagemsaque, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 290, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/retirada.gif"))); // NOI18N
        jSaquerealizado.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, 210));

        jsaquetroca.add(jSaquerealizado, "card3");

        jPanelSacar.add(jsaquetroca, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 290, 320));

        jPanelTelas.add(jPanelSacar, "card5");

        jPanelCadastro.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCadastro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setText("Tela Cadastro");
        jPanelCadastro.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        TelaCadastro.setBackground(new java.awt.Color(255, 255, 255));
        TelaCadastro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        TelaCadastro.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 419, 10));

        TextoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoNomeActionPerformed(evt);
            }
        });
        TelaCadastro.add(TextoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 420, 30));

        jNome.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jNome.setText("Nome completo");
        TelaCadastro.add(jNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jEmail.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jEmail.setText("E-mail");
        TelaCadastro.add(jEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));
        TelaCadastro.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 419, 10));
        TelaCadastro.add(TextoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 420, 30));

        jProfissao.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jProfissao.setText("Profissão");
        TelaCadastro.add(jProfissao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));
        TelaCadastro.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 419, 10));

        TextoProfissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoProfissaoActionPerformed(evt);
            }
        });
        TelaCadastro.add(TextoProfissao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 420, 30));

        jCpf.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jCpf.setText("CPF");
        TelaCadastro.add(jCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));
        TelaCadastro.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 210, 10));
        TelaCadastro.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 210, 10));

        jTelefone.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTelefone.setText("Telefone");
        TelaCadastro.add(jTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jDataNasc.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jDataNasc.setText("Data de nascimento");
        TelaCadastro.add(jDataNasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 160, -1));
        TelaCadastro.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 200, 10));

        jTelefone1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTelefone1.setText("Telefone");
        TelaCadastro.add(jTelefone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));
        TelaCadastro.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 210, 10));

        jSexo.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jSexo.setText("Sexo");
        TelaCadastro.add(jSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 160, -1));
        TelaCadastro.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 200, 10));

        SexoFem.setBackground(new java.awt.Color(153, 255, 204));
        buttonEscolhaSexo.add(SexoFem);
        SexoFem.setText("Feminino");
        SexoFem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SexoFemActionPerformed(evt);
            }
        });
        TelaCadastro.add(SexoFem, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 100, 30));

        SexoMasc.setBackground(new java.awt.Color(153, 255, 204));
        buttonEscolhaSexo.add(SexoMasc);
        SexoMasc.setText("Masculino");
        SexoMasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SexoMascActionPerformed(evt);
            }
        });
        TelaCadastro.add(SexoMasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 100, 30));

        jButtonSalvar.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        TelaCadastro.add(jButtonSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, -1, -1));

        jSenha.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jSenha.setText("Senha");
        TelaCadastro.add(jSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));
        TelaCadastro.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 210, 10));

        jTextoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextoSenhaActionPerformed(evt);
            }
        });
        TelaCadastro.add(jTextoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 210, 30));

        try {
            TextoCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TextoCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoCpfActionPerformed(evt);
            }
        });
        TelaCadastro.add(TextoCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 210, 30));

        try {
            TextoTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TextoTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoTelefoneActionPerformed(evt);
            }
        });
        TelaCadastro.add(TextoTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 210, 30));

        try {
            TextoDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TextoDataNasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoDataNascActionPerformed(evt);
            }
        });
        TelaCadastro.add(TextoDataNasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 200, 30));

        jPanelCadastro.add(TelaCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 61, 440, 430));

        voltacadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Desfazer.png"))); // NOI18N
        voltacadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voltacadastroMouseClicked(evt);
            }
        });
        jPanelCadastro.add(voltacadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 10, 30, -1));

        jPanelTelas.add(jPanelCadastro, "card3");

        jPanelLogin.setBackground(new java.awt.Color(255, 255, 255));
        jPanelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TelaLogin.setBackground(new java.awt.Color(255, 204, 204));
        TelaLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/userM.png"))); // NOI18N
        TelaLogin.add(iconUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jLabelSenha.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabelSenha.setText("Senha");
        TelaLogin.add(jLabelSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabelUser.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabelUser.setText("Usuário");
        TelaLogin.add(jLabelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        TextoUserLogin.setBackground(new java.awt.Color(255, 204, 204));
        TextoUserLogin.setBorder(null);
        TelaLogin.add(TextoUserLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 250, 40));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        TelaLogin.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 250, 20));

        jSeparator11.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));
        TelaLogin.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 250, 20));

        TextoSenhaLogin.setBackground(new java.awt.Color(255, 204, 204));
        TextoSenhaLogin.setBorder(null);
        TextoSenhaLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoSenhaLoginActionPerformed(evt);
            }
        });
        TelaLogin.add(TextoSenhaLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 250, 40));

        buttonEntrar.setBackground(new java.awt.Color(255, 255, 255));
        buttonEntrar.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        buttonEntrar.setText("Entrar");
        buttonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEntrarActionPerformed(evt);
            }
        });
        TelaLogin.add(buttonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 330, 250, -1));

        jPanelLogin.add(TelaLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 290, 380));

        TextoLogin.setDisplayedMnemonic('f');
        TextoLogin.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        TextoLogin.setText("Login");
        jPanelLogin.add(TextoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        voltalogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Desfazer.png"))); // NOI18N
        voltalogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voltaloginMouseClicked(evt);
            }
        });
        jPanelLogin.add(voltalogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 30, -1));

        jPanelTelas.add(jPanelLogin, "card4");

        TelaLogado.setBackground(new java.awt.Color(255, 255, 255));
        TelaLogado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSair4.setBackground(new java.awt.Color(255, 255, 255));
        jSair4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSair4MouseClicked(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Exit.png"))); // NOI18N

        javax.swing.GroupLayout jSair4Layout = new javax.swing.GroupLayout(jSair4);
        jSair4.setLayout(jSair4Layout);
        jSair4Layout.setHorizontalGroup(
            jSair4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
            .addGroup(jSair4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jSair4Layout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addComponent(jLabel9)
                    .addContainerGap(12, Short.MAX_VALUE)))
        );
        jSair4Layout.setVerticalGroup(
            jSair4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
            .addGroup(jSair4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jSair4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel9)
                    .addContainerGap(12, Short.MAX_VALUE)))
        );

        TelaLogado.add(jSair4, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 0, -1, -1));

        iconBorboletas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/borboleta2.jpg"))); // NOI18N
        TelaLogado.add(iconBorboletas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 132, 412, -1));

        Texto3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Texto3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Texto3.setText("Escolha uma ação no Menu.");
        TelaLogado.add(Texto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 460, -1));

        Texto4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Texto4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Texto4.setText("Bem vindo ao Banco Metamorfose,");
        TelaLogado.add(Texto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 322, 460, -1));

        pegaNome.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        pegaNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pegaNome.setText("pegaNome");
        TelaLogado.add(pegaNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 460, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel6.setText("Sair da conta");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        TelaLogado.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 470, -1, -1));

        jPanelTelas.add(TelaLogado, "card3");

        jPanelExtrato.setBackground(new java.awt.Color(255, 255, 255));

        voltaextrato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Desfazer.png"))); // NOI18N
        voltaextrato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voltaextratoMouseClicked(evt);
            }
        });

        textSacar2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        textSacar2.setText("Extrato");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jTableExtrato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data / Horario", "Valor", "Operação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableExtrato);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(236, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelExtratoLayout = new javax.swing.GroupLayout(jPanelExtrato);
        jPanelExtrato.setLayout(jPanelExtratoLayout);
        jPanelExtratoLayout.setHorizontalGroup(
            jPanelExtratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExtratoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanelExtratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelExtratoLayout.createSequentialGroup()
                        .addComponent(textSacar2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 319, Short.MAX_VALUE)
                        .addComponent(voltaextrato)))
                .addGap(23, 23, 23))
        );
        jPanelExtratoLayout.setVerticalGroup(
            jPanelExtratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExtratoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelExtratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textSacar2)
                    .addComponent(voltaextrato))
                .addGap(48, 48, 48)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanelTelas.add(jPanelExtrato, "card8");

        jPanelDepositar.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDepositar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textSacar1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        textSacar1.setText("Depositar");
        jPanelDepositar.add(textSacar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 30));

        voltadepositar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Desfazer.png"))); // NOI18N
        voltadepositar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voltadepositarMouseClicked(evt);
            }
        });
        jPanelDepositar.add(voltadepositar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 30, -1));

        jdepositotroca.setLayout(new java.awt.CardLayout());

        DentroDepositar.setBackground(new java.awt.Color(255, 204, 204));
        DentroDepositar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconDinheiro2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/VendaPassagem.png"))); // NOI18N
        DentroDepositar.add(iconDinheiro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 50, 50));

        jLabelValorDepositar.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabelValorDepositar.setText("Valor a ser depositado");
        DentroDepositar.add(jLabelValorDepositar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jTextoValorDepositar.setBackground(new java.awt.Color(255, 204, 204));
        jTextoValorDepositar.setBorder(null);
        jTextoValorDepositar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat(""))));
        DentroDepositar.add(jTextoValorDepositar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 250, 30));

        jButtondepositar.setBackground(new java.awt.Color(255, 255, 255));
        jButtondepositar.setText("DEPOSITAR");
        jButtondepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtondepositarActionPerformed(evt);
            }
        });
        DentroDepositar.add(jButtondepositar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 100, 40));

        jSeparator17.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator17.setForeground(new java.awt.Color(0, 0, 0));
        DentroDepositar.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 250, 10));

        jInsiraSenha2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jInsiraSenha2.setText("Insira sua senha para prosseguir");
        DentroDepositar.add(jInsiraSenha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jSeparator18.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator18.setForeground(new java.awt.Color(0, 0, 0));
        DentroDepositar.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 250, 10));

        Senhadeposito.setBackground(new java.awt.Color(255, 204, 204));
        Senhadeposito.setBorder(null);
        DentroDepositar.add(Senhadeposito, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 240, 30));

        jdepositotroca.add(DentroDepositar, "card2");

        jDepositoRealizado.setBackground(new java.awt.Color(255, 255, 255));
        jDepositoRealizado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jmensagemsaque1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jDepositoRealizado.add(jmensagemsaque1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 290, 30));

        jdepositotroca.add(jDepositoRealizado, "card3");

        jPanelDepositar.add(jdepositotroca, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 290, 320));

        jPanelTelas.add(jPanelDepositar, "card9");

        jPanelTotal.add(jPanelTelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 460, 500));

        getContentPane().add(jPanelTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoNomeActionPerformed

    private void TextoProfissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoProfissaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoProfissaoActionPerformed

    private void SexoMascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SexoMascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SexoMascActionPerformed

    private void SexoFemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SexoFemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SexoFemActionPerformed

    private void voltacadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltacadastroMouseClicked
            jPanelTelas.removeAll();
            jPanelTelas.repaint();
            jPanelTelas.revalidate();
            jPanelTelas.add(jBoasVindas);   
            jConta.setBackground(new Color(0,255,204));
            jDepositar.setBackground(new Color(0,255,204));
            jExtrato.setBackground(new Color(0,255,204));
            jSacar.setBackground(new Color(0,255,204));
            jSaldo.setBackground(new Color(0,255,204));
    }//GEN-LAST:event_voltacadastroMouseClicked

    private void jSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jSairMouseClicked

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
      /*  num_conta++;
        String sexo ="";
        Arquivos arq = new Arquivos();
        
        if(SexoFem.isSelected()){
                 sexo = "Masculino";
        }
        if(SexoMasc.isSelected()){
                 sexo = "Feminino";
        }        
        
        clientes.add(new Cliente(TextoNome.getText(), TextoEmail.getText(), TextoProfissao.getText(), TextoCpf.getText(),
                TextoTelefone.getText(), sexo , TextoDataNasc.getText(),jTextoSenha.getText(),String.valueOf(num_conta),0.0));
        
         Arquivos.salvarEmDisco(clientes);
        
        System.out.println(String.valueOf("Conta: " + num_conta) + " Senha:" +jTextoSenha.getText());
        
        jPanelTelas.removeAll();       
        jPanelTelas.repaint();
        jPanelTelas.revalidate();
        jPanelTelas.add(jBoasVindas);*/
        
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jTextoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextoSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextoSenhaActionPerformed

    private void TextoCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoCpfActionPerformed

    private void TextoTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoTelefoneActionPerformed

    private void TextoDataNascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoDataNascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoDataNascActionPerformed

    private void TextoSenhaLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoSenhaLoginActionPerformed
  
    }//GEN-LAST:event_TextoSenhaLoginActionPerformed

    private void buttonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEntrarActionPerformed
        for(int i = 0; i<clientes.size(); i++){
            if(clientes.get(i).getNumConta().equals(TextoUserLogin.getText()) && 
                    clientes.get(i).getSenha().equals(TextoSenhaLogin.getText())){
                        logado = true;
                        posicao = i;
                        jPanelTelas.removeAll();
                        jPanelTelas.repaint();
                        jPanelTelas.revalidate();
                        pegaNome.setText(clientes.get(i).getNome());
                        jPanelTelas.add(TelaLogado);
            }           
        }
         TextoSenhaLogin.setText("");
         TextoUserLogin.setText("");
    }//GEN-LAST:event_buttonEntrarActionPerformed

    private void jSaldoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSaldoMouseClicked
        if(logado==true) {
            jPanelTelas.removeAll();
            jPanelTelas.repaint();
            jPanelTelas.revalidate();
            jPanelTelas.add(jPanelSaldo);
            SaldoDaConta.setText(String.valueOf(clientes.get(posicao).getSaldoCliente()));
            jConta.setBackground(new Color(0,255,204));
            jDepositar.setBackground(new Color(0,255,204));
            jExtrato.setBackground(new Color(0,255,204));
            jSacar.setBackground(new Color(0,255,204));
            jSaldo.setBackground(new Color(255,204,204));
            
            
        }else{
            jPanelTelas.removeAll();
            jPanelTelas.repaint();
            jPanelTelas.revalidate();
            jPanelTelas.add(jBoasVindas);
            jConta.setBackground(new Color(0,255,204));
            jDepositar.setBackground(new Color(0,255,204));
            jExtrato.setBackground(new Color(0,255,204));
            jSacar.setBackground(new Color(0,255,204));
            jSaldo.setBackground(new Color(0,153,153));
        }      
    }//GEN-LAST:event_jSaldoMouseClicked

    private void jContaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jContaMouseClicked
        jPanelTelas.removeAll();
        jPanelTelas.repaint();
        jPanelTelas.revalidate();
        if(logado)    jPanelTelas.add(TelaLogado);           
        else{         
            jPanelTelas.add(jPanelLogin);       
        }
             jConta.setBackground(new Color(255,204,204));
            jDepositar.setBackground(new Color(0,255,204));
            jExtrato.setBackground(new Color(0,255,204));
            jSacar.setBackground(new Color(0,255,204));
            jSaldo.setBackground(new Color(0,255,204));
    }//GEN-LAST:event_jContaMouseClicked

    private void jExtratoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jExtratoMouseClicked
     DefaultTableModel tabela = (DefaultTableModel) jTableExtrato.getModel();// implementa metodos de uma tabela
     tabela.setNumRows(0);    //zera a tabela para noca pesquisa
     
     if(logado==true) {
            jPanelTelas.removeAll();
            jPanelTelas.repaint();
            jPanelTelas.revalidate();
            jPanelTelas.add(jPanelExtrato);
            jConta.setBackground(new Color(0,255,204));
            jDepositar.setBackground(new Color(0,255,204));
            jExtrato.setBackground(new Color(255,204,204));
            jSacar.setBackground(new Color(0,255,204));
            jSaldo.setBackground(new Color(0,255,204));
            for(int i=0; i< clientes.get(posicao).extrato.size(); i++){ 
                 tabela.addRow(new String[]{clientes.get(posicao).extrato.get(i).getData(),
                 String.valueOf(clientes.get(posicao).extrato.get(i).getValor()),
                 clientes.get(posicao).extrato.get(i).getTipooperacao()});     
            }            
        }else{
            jPanelTelas.removeAll();
            jPanelTelas.repaint();
            jPanelTelas.revalidate();
            jPanelTelas.add(jBoasVindas);
            jConta.setBackground(new Color(0,255,204));
            jDepositar.setBackground(new Color(0,255,204));
            jExtrato.setBackground(new Color(0,153,153));
            jSacar.setBackground(new Color(0,255,204));
            jSaldo.setBackground(new Color(0,255,204));
        } 
    }//GEN-LAST:event_jExtratoMouseClicked

    private void jSacarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSacarMouseClicked
        if(logado==true) {
            jPanelTelas.removeAll();
            jPanelTelas.repaint();
            jPanelTelas.revalidate();
            jPanelTelas.add(jPanelSacar);
            jConta.setBackground(new Color(0,255,204));
            jDepositar.setBackground(new Color(0,255,204));
            jExtrato.setBackground(new Color(0,255,204));
            jSacar.setBackground(new Color(255,204,204));
            jSaldo.setBackground(new Color(0,255,204));      
        }else{
            jPanelTelas.removeAll();
            jPanelTelas.repaint();
            jPanelTelas.revalidate();
            jPanelTelas.add(jBoasVindas);
            jConta.setBackground(new Color(0,255,204));
            jDepositar.setBackground(new Color(0,255,204));
            jExtrato.setBackground(new Color(0,255,204));
            jSacar.setBackground(new Color(0,153,153));
            jSaldo.setBackground(new Color(0,255,204));
        }
    }//GEN-LAST:event_jSacarMouseClicked

    private void jSair4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSair4MouseClicked
            System.exit(0);
            
            //pegaNome.get
    }//GEN-LAST:event_jSair4MouseClicked

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
            jPanelTelas.removeAll();
            jPanelTelas.repaint();
            jPanelTelas.revalidate();
            jPanelTelas.add(jPanelCadastro);
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void voltaloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltaloginMouseClicked
            jPanelTelas.removeAll();
            jPanelTelas.repaint();
            jPanelTelas.revalidate();
            jPanelTelas.add(jBoasVindas);   
            jConta.setBackground(new Color(0,255,204));
            jDepositar.setBackground(new Color(0,255,204));
            jExtrato.setBackground(new Color(0,255,204));
            jSacar.setBackground(new Color(0,255,204));
            jSaldo.setBackground(new Color(0,255,204));
    }//GEN-LAST:event_voltaloginMouseClicked

    private void voltarsacarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltarsacarMouseClicked
            jPanelTelas.removeAll();
            jPanelTelas.repaint();
            jPanelTelas.revalidate();
            jPanelTelas.add(TelaLogado);   
            jConta.setBackground(new Color(0,255,204));
            jDepositar.setBackground(new Color(0,255,204));
            jExtrato.setBackground(new Color(0,255,204));
            jSacar.setBackground(new Color(0,255,204));
            jSaldo.setBackground(new Color(0,255,204));
    }//GEN-LAST:event_voltarsacarMouseClicked

    private void jDepositarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDepositarMouseClicked
        if(logado==true) {
            jPanelTelas.removeAll();
            jPanelTelas.repaint();
            jPanelTelas.revalidate();
            jPanelTelas.add(jPanelDepositar);
            jConta.setBackground(new Color(0,255,204));
            jDepositar.setBackground(new Color(255,204,204));
            jExtrato.setBackground(new Color(0,255,204));
            jSacar.setBackground(new Color(0,255,204));
            jSaldo.setBackground(new Color(0,255,204));            
        }else{
            jPanelTelas.removeAll();
            jPanelTelas.repaint();
            jPanelTelas.revalidate();
            jPanelTelas.add(jBoasVindas);
            jConta.setBackground(new Color(0,255,204));
            jDepositar.setBackground(new Color(0,153,153));
            jExtrato.setBackground(new Color(0,255,204));
            jSacar.setBackground(new Color(0,255,204));
            jSaldo.setBackground(new Color(0,255,204));
        } 
    }//GEN-LAST:event_jDepositarMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
            logado = false;
            jPanelTelas.removeAll();
            jPanelTelas.repaint();
            jPanelTelas.revalidate();
            jPanelTelas.add(jBoasVindas);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jPanelRetornarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRetornarMouseClicked
        
    }//GEN-LAST:event_jPanelRetornarMouseClicked

    private void voltarsaldoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltarsaldoMouseClicked
             jPanelTelas.removeAll();
            jPanelTelas.repaint();
            jPanelTelas.revalidate();
            jPanelTelas.add(TelaLogado);   
            jConta.setBackground(new Color(0,255,204));
            jDepositar.setBackground(new Color(0,255,204));
            jExtrato.setBackground(new Color(0,255,204));
            jSacar.setBackground(new Color(0,255,204));
            jSaldo.setBackground(new Color(0,255,204));  
    }//GEN-LAST:event_voltarsaldoMouseClicked

    public void acaoretirada(){
            jsaquetroca.removeAll();
            jsaquetroca.repaint();
            jsaquetroca.revalidate();
            jsaquetroca.add(jSaquerealizado);
            jmensagemsaque.setText("R$"+jTextoValorSacar.getText()); 
    }
    
    TimerTask run = new TimerTask() {
        @Override
        public void run() {
            jsaquetroca.removeAll();
            jsaquetroca.repaint();
            jsaquetroca.revalidate();
            jsaquetroca.add(jSaquerealizado);
            jmensagemsaque.setText("R$"+jTextoValorSacar.getText());
        }
    };
       
    private void jButtonSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSacarActionPerformed
        if(clientes.get(posicao).getSenha().equals(SenhaSacar.getText())){
            clientes.get(posicao).sacar(Double.valueOf(jTextoValorSacar.getText()));
            clientes.get(posicao).extrato.add(new Extrato(Double.valueOf(jTextoValorSacar.getText()), getDateTime(),"Saque"));
            jsaquetroca.removeAll();
            jsaquetroca.repaint();
            jsaquetroca.revalidate();
            jsaquetroca.add(jSaquerealizado);
            jmensagemsaque.setText("R$"+jTextoValorSacar.getText());
            try{Thread.sleep(1500);}catch(Exception erro){} 
           // jsaquetroca.removeAll();
            jsaquetroca.add(DentroSacar);
            
           // acaoretirada();
            //try{Thread.sleep(15000);}catch(Exception erro){}
           /* jsaquetroca.removeAll();
            jsaquetroca.repaint();
            jsaquetroca.revalidate();
            jsaquetroca.add(jSaquerealizado);*/
            SenhaSacar.setText("");
            jTextoValorSacar.setText("");   
        }else{
            SenhaSacar.setText("");
        }
    }//GEN-LAST:event_jButtonSacarActionPerformed

    private void voltadepositarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltadepositarMouseClicked
            jPanelTelas.removeAll();
            jPanelTelas.repaint();
            jPanelTelas.revalidate();
            jPanelTelas.add(TelaLogado);   
            jConta.setBackground(new Color(0,255,204));
            jDepositar.setBackground(new Color(0,255,204));
            jExtrato.setBackground(new Color(0,255,204));
            jSacar.setBackground(new Color(0,255,204));
            jSaldo.setBackground(new Color(0,255,204));
    }//GEN-LAST:event_voltadepositarMouseClicked

    private void jButtondepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtondepositarActionPerformed
         if(clientes.get(posicao).getSenha().equals(Senhadeposito.getText())){
            clientes.get(posicao).depositar(Double.valueOf(jTextoValorDepositar.getText()));
            clientes.get(posicao).extrato.add(new Extrato(Double.valueOf(jTextoValorDepositar.getText()),   
                    getDateTime(),"Deposito"));
            jdepositotroca.removeAll();
            jdepositotroca.repaint();
            jdepositotroca.revalidate();
            jdepositotroca.add(jDepositoRealizado);
            jmensagemsaque1.setText("Saque realizado com sucesso na conta : " + clientes.get(posicao).getNumConta());
        }else{
            Senhadeposito.setText("");
        }
    }//GEN-LAST:event_jButtondepositarActionPerformed

    private void voltaextratoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltaextratoMouseClicked
                    jPanelTelas.removeAll();
            jPanelTelas.repaint();
            jPanelTelas.revalidate();
            jPanelTelas.add(TelaLogado);   
            jConta.setBackground(new Color(0,255,204));
            jDepositar.setBackground(new Color(0,255,204));
            jExtrato.setBackground(new Color(0,255,204));
            jSacar.setBackground(new Color(0,255,204));
            jSaldo.setBackground(new Color(0,255,204));
    }//GEN-LAST:event_voltaextratoMouseClicked

    private void jConta3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jConta3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jConta3MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DentroDepositar;
    private javax.swing.JPanel DentroSacar;
    private javax.swing.JPanel DentroSaldo;
    private javax.swing.JLabel SaldoDaConta;
    private javax.swing.JPasswordField SenhaSacar;
    private javax.swing.JPasswordField Senhadeposito;
    private javax.swing.JCheckBox SexoFem;
    private javax.swing.JCheckBox SexoMasc;
    private javax.swing.JPanel TelaCadastro;
    private javax.swing.JPanel TelaLogado;
    private javax.swing.JPanel TelaLogin;
    private javax.swing.JLabel Texto1;
    private javax.swing.JLabel Texto2;
    private javax.swing.JLabel Texto3;
    private javax.swing.JLabel Texto4;
    private javax.swing.JFormattedTextField TextoCpf;
    private javax.swing.JFormattedTextField TextoDataNasc;
    private javax.swing.JTextField TextoEmail;
    private javax.swing.JLabel TextoLogin;
    private javax.swing.JTextField TextoNome;
    private javax.swing.JTextField TextoProfissao;
    private javax.swing.JPasswordField TextoSenhaLogin;
    private javax.swing.JFormattedTextField TextoTelefone;
    private javax.swing.JTextField TextoUserLogin;
    private javax.swing.JPanel Titulo;
    private javax.swing.JButton buttonEntrar;
    private javax.swing.ButtonGroup buttonEscolhaSexo;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icon2;
    private javax.swing.JLabel icon3;
    private javax.swing.JLabel icon4;
    private javax.swing.JLabel icon5;
    private javax.swing.JLabel icon8;
    private javax.swing.JLabel iconBorboletas;
    private javax.swing.JLabel iconBorboletas1;
    private javax.swing.JLabel iconDinheiro;
    private javax.swing.JLabel iconDinheiro2;
    private javax.swing.JLabel iconUser;
    private javax.swing.JPanel jBoasVindas;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonSacar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtondepositar;
    private javax.swing.JPanel jConta;
    private javax.swing.JPanel jConta3;
    private javax.swing.JLabel jCpf;
    private javax.swing.JLabel jDataNasc;
    private javax.swing.JPanel jDepositar;
    private javax.swing.JPanel jDepositoRealizado;
    private javax.swing.JLabel jEmail;
    private javax.swing.JPanel jExtrato;
    private javax.swing.JLabel jInsiraSenha;
    private javax.swing.JLabel jInsiraSenha2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JLabel jLabelValorDepositar;
    private javax.swing.JLabel jLabelValorSacar;
    private javax.swing.JLabel jNome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelCadastro;
    private javax.swing.JPanel jPanelDepositar;
    private javax.swing.JPanel jPanelExtrato;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelRetornar;
    private javax.swing.JPanel jPanelSacar;
    private javax.swing.JPanel jPanelSaldo;
    private javax.swing.JPanel jPanelTelas;
    private javax.swing.JPanel jPanelTotal;
    private javax.swing.JLabel jProfissao;
    private javax.swing.JPanel jSacar;
    private javax.swing.JPanel jSair;
    private javax.swing.JPanel jSair4;
    private javax.swing.JPanel jSaldo;
    private javax.swing.JPanel jSaquerealizado;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jSenha;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel jSexo;
    private javax.swing.JLabel jSubTitulo;
    private javax.swing.JTable jTableExtrato;
    private javax.swing.JLabel jTelefone;
    private javax.swing.JLabel jTelefone1;
    private javax.swing.JPasswordField jTextoSenha;
    private javax.swing.JFormattedTextField jTextoValorDepositar;
    private javax.swing.JFormattedTextField jTextoValorSacar;
    private javax.swing.JLabel jTitulo;
    private javax.swing.JPanel jdepositotroca;
    private javax.swing.JLabel jmensagemsaque;
    private javax.swing.JLabel jmensagemsaque1;
    private javax.swing.JPanel jsaquetroca;
    private javax.swing.JLabel pegaNome;
    private javax.swing.JLabel textSacar;
    private javax.swing.JLabel textSacar1;
    private javax.swing.JLabel textSacar2;
    private javax.swing.JLabel voltacadastro;
    private javax.swing.JLabel voltadepositar;
    private javax.swing.JLabel voltaextrato;
    private javax.swing.JLabel voltalogin;
    private javax.swing.JLabel voltarsacar;
    private javax.swing.JLabel voltarsaldo;
    // End of variables declaration//GEN-END:variables
}
