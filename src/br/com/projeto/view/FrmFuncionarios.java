
package br.com.projeto.view;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import br.com.projeto.dao.ClientesDAO;
import br.com.projeto.dao.FuncionariosDAO;
import br.com.projeto.model.Clientes;
import br.com.projeto.model.Funcionario;
import br.com.projeto.utils.Utlis;

public class FrmFuncionarios extends javax.swing.JFrame {

        public void listar() {
                FuncionariosDAO dao = new FuncionariosDAO();
                List<Funcionario> lista = dao.listarFuncionarios();
                DefaultTableModel dados = (DefaultTableModel) tabelaFuncionarios.getModel();
                dados.setNumRows(0);

                for (Funcionario f : lista) {
                        dados.addRow(new Object[] {
                                        f.getId(),
                                        f.getNome(),
                                        f.getRg(),
                                        f.getCpf(),
                                        f.getEmail(),
                                        f.getSenha(),
                                        f.getCargo(),
                                        f.getNivelAcesso(),
                                        f.getTelefone(),
                                        f.getCelular(),
                                        f.getCep(),
                                        f.getEndereco(),
                                        f.getNumero(),
                                        f.getComplemento(),
                                        f.getBairro(),
                                        f.getCidade(),
                                        f.getEstado()
                        });
                }
        }

        public FrmFuncionarios() {
                initComponents();
                this.getContentPane().setBackground(Color.WHITE);

        }

        @SuppressWarnings("unchecked")

        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jTabbedPane1 = new javax.swing.JTabbedPane();
                painel_dados = new javax.swing.JPanel();
                jLabel3 = new javax.swing.JLabel();
                txtcpf = new javax.swing.JFormattedTextField();
                jLabel4 = new javax.swing.JLabel();
                txtcel = new javax.swing.JFormattedTextField();
                jLabel5 = new javax.swing.JLabel();
                txtfixo = new javax.swing.JFormattedTextField();
                jLabel6 = new javax.swing.JLabel();
                txtrg = new javax.swing.JFormattedTextField();
                jLabel7 = new javax.swing.JLabel();
                btnbusca = new javax.swing.JButton();
                jLabel8 = new javax.swing.JLabel();
                txtcodigo = new javax.swing.JTextField();
                txtnome = new javax.swing.JTextField();
                txtemail = new javax.swing.JTextField();
                jLabel2 = new javax.swing.JLabel();
                txtend = new javax.swing.JTextField();
                txtcomplemento = new javax.swing.JTextField();
                txtbairro = new javax.swing.JFormattedTextField();
                jLabel9 = new javax.swing.JLabel();
                txtcidade = new javax.swing.JFormattedTextField();
                jLabel10 = new javax.swing.JLabel();
                jLabel11 = new javax.swing.JLabel();
                jLabel12 = new javax.swing.JLabel();
                txtnumero = new javax.swing.JFormattedTextField();
                jLabel13 = new javax.swing.JLabel();
                txtcep = new javax.swing.JFormattedTextField();
                jLabel14 = new javax.swing.JLabel();
                cbuf = new javax.swing.JComboBox<>();
                jLabel15 = new javax.swing.JLabel();
                jLabel17 = new javax.swing.JLabel();
                txtsenha = new javax.swing.JPasswordField();
                jLabel18 = new javax.swing.JLabel();
                txtcargo = new javax.swing.JTextField();
                cbnivel = new javax.swing.JComboBox<>();
                jLabel19 = new javax.swing.JLabel();
                jPanel4 = new javax.swing.JPanel();
                jScrollPane1 = new javax.swing.JScrollPane();
                tabelaFuncionarios = new javax.swing.JTable();
                jLabel16 = new javax.swing.JLabel();
                txtpesquisa = new javax.swing.JTextField();
                btnpesquisar = new javax.swing.JButton();
                btnnovo = new javax.swing.JButton();
                btnsalvar = new javax.swing.JButton();
                jButton3 = new javax.swing.JButton();
                jButton4 = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                setTitle("Cadastro de Funcionários");
                addWindowListener(new java.awt.event.WindowAdapter() {
                        public void windowActivated(java.awt.event.WindowEvent evt) {
                                formWindowActivated(evt);
                        }
                });

                jPanel1.setBackground(new java.awt.Color(0, 102, 204));

                jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(255, 255, 255));
                jLabel1.setText("Cadastro de Funcionários");

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(23, 23, 23)
                                                                .addComponent(jLabel1)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(21, 21, 21)
                                                                .addComponent(jLabel1)
                                                                .addContainerGap(20, Short.MAX_VALUE)));

                jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

                painel_dados.setBackground(new java.awt.Color(255, 255, 255));
                painel_dados.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

                jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
                jLabel3.setText("Nome:");

                try {
                        txtcpf.setFormatterFactory(
                                        new javax.swing.text.DefaultFormatterFactory(
                                                        new javax.swing.text.MaskFormatter("###.###.###-##")));
                } catch (java.text.ParseException ex) {
                        ex.printStackTrace();
                }
                txtcpf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

                jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
                jLabel4.setText("E-mail:");

                try {
                        txtcel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(
                                        new javax.swing.text.MaskFormatter("(##) #### - ####")));
                } catch (java.text.ParseException ex) {
                        ex.printStackTrace();
                }
                txtcel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

                jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
                jLabel5.setText("CPF:");

                try {
                        txtfixo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(
                                        new javax.swing.text.MaskFormatter("(##) #### - ####")));
                } catch (java.text.ParseException ex) {
                        ex.printStackTrace();
                }
                txtfixo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

                jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
                jLabel6.setText("RG:");

                try {
                        txtrg.setFormatterFactory(
                                        new javax.swing.text.DefaultFormatterFactory(
                                                        new javax.swing.text.MaskFormatter("##.###.###-##")));
                } catch (java.text.ParseException ex) {
                        ex.printStackTrace();
                }
                txtrg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

                jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
                jLabel7.setText("Telefone (fixo):");

                btnbusca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                btnbusca.setText("Pesquisar");
                btnbusca.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnbuscaActionPerformed(evt);
                        }
                });

                jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
                jLabel8.setText("Celular:");

                txtcodigo.setEditable(false);
                txtcodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

                txtnome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                txtnome.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtnomeActionPerformed(evt);
                        }
                });

                txtemail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

                jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
                jLabel2.setText("Código:");

                txtend.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

                txtcomplemento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

                txtbairro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

                jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
                jLabel9.setText("CEP:");

                txtcidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                txtcidade.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtcidadeActionPerformed(evt);
                        }
                });

                jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
                jLabel10.setText("Endereço:");

                jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
                jLabel11.setText("Complemento:");

                jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
                jLabel12.setText("Bairro:");

                txtnumero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

                jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
                jLabel13.setText("Nº:");

                try {
                        txtcep.setFormatterFactory(
                                        new javax.swing.text.DefaultFormatterFactory(
                                                        new javax.swing.text.MaskFormatter("#####-###")));
                } catch (java.text.ParseException ex) {
                        ex.printStackTrace();
                }
                txtcep.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                txtcep.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyPressed(java.awt.event.KeyEvent evt) {
                                txtcepKeyPressed(evt);
                        }
                });

                jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
                jLabel14.setText("UF:");

                cbuf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                cbuf.setModel(new javax.swing.DefaultComboBoxModel<>(
                                new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS",
                                                "MG", "PA", "PB",
                                                "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE",
                                                "TO" }));

                jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
                jLabel15.setText("Cidade:");

                jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
                jLabel17.setText("Senha:");

                txtsenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

                jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
                jLabel18.setText("Cargo:");

                txtcargo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

                cbnivel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                cbnivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuário", "Administrador" }));

                jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
                jLabel19.setText("Nível de Acesso:");

                javax.swing.GroupLayout painel_dadosLayout = new javax.swing.GroupLayout(painel_dados);
                painel_dados.setLayout(painel_dadosLayout);
                painel_dadosLayout.setHorizontalGroup(
                                painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(painel_dadosLayout.createSequentialGroup()
                                                                .addGroup(painel_dadosLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(painel_dadosLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(painel_dadosLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(painel_dadosLayout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGap(10, 10, 10)
                                                                                                                                .addComponent(jLabel2)
                                                                                                                                .addGap(10, 10, 10))
                                                                                                                .addGroup(painel_dadosLayout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                .addGroup(painel_dadosLayout
                                                                                                                                                .createSequentialGroup()
                                                                                                                                                .addGap(20, 20, 20)
                                                                                                                                                .addGroup(painel_dadosLayout
                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                .addComponent(jLabel3)
                                                                                                                                                                .addComponent(jLabel4))
                                                                                                                                                .addGap(9, 9, 9))
                                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                painel_dadosLayout
                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                .addContainerGap()
                                                                                                                                                                .addComponent(jLabel9)
                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                                                                                                .addGroup(painel_dadosLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(txtnome,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                316,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(txtcodigo,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                67,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGroup(painel_dadosLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(painel_dadosLayout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGap(5, 5, 5)
                                                                                                                                .addComponent(btnbusca))
                                                                                                                .addGroup(painel_dadosLayout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGap(27, 27, 27)
                                                                                                                                .addComponent(jLabel8)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                .addComponent(txtcel,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                141,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                .addComponent(jLabel7)
                                                                                                                                .addGap(10, 10, 10)
                                                                                                                                .addComponent(txtfixo,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                153,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                                .addGroup(painel_dadosLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(65, 65, 65)
                                                                                                .addComponent(txtcep,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                141,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(jLabel10)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(txtend,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                316,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(jLabel13)
                                                                                                .addGap(10, 10, 10)
                                                                                                .addComponent(txtnumero,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                63,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(112, 112, 112))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_dadosLayout
                                                                .createSequentialGroup()
                                                                .addContainerGap(25, Short.MAX_VALUE)
                                                                .addGroup(painel_dadosLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                painel_dadosLayout
                                                                                                                .createSequentialGroup()
                                                                                                                .addComponent(txtemail,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                316,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGap(596, 596,
                                                                                                                                596))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                painel_dadosLayout
                                                                                                                .createSequentialGroup()
                                                                                                                .addGroup(painel_dadosLayout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                .addGroup(painel_dadosLayout
                                                                                                                                                .createSequentialGroup()
                                                                                                                                                .addComponent(jLabel12)
                                                                                                                                                .addPreferredGap(
                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                .addComponent(txtbairro,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                172,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                .addGroup(painel_dadosLayout
                                                                                                                                                .createSequentialGroup()
                                                                                                                                                .addGroup(painel_dadosLayout
                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                                                .addComponent(jLabel6)
                                                                                                                                                                .addComponent(jLabel17))
                                                                                                                                                .addPreferredGap(
                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                                .addGroup(painel_dadosLayout
                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                                                false)
                                                                                                                                                                .addComponent(txtrg,
                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                169,
                                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                                .addComponent(txtsenha))))
                                                                                                                .addGroup(painel_dadosLayout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                false)
                                                                                                                                .addGroup(painel_dadosLayout
                                                                                                                                                .createSequentialGroup()
                                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                                .addComponent(jLabel15)
                                                                                                                                                .addGap(12, 12, 12)
                                                                                                                                                .addComponent(txtcidade,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                141,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                                .addComponent(jLabel11)
                                                                                                                                                .addGap(4, 4, 4)
                                                                                                                                                .addComponent(txtcomplemento,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                191,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                painel_dadosLayout
                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                .addGap(38, 38, 38)
                                                                                                                                                                .addGroup(painel_dadosLayout
                                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                                .addGroup(painel_dadosLayout
                                                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                                                .addComponent(jLabel19)
                                                                                                                                                                                                .addGap(10, 10, 10)
                                                                                                                                                                                                .addComponent(cbnivel,
                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                87,
                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                                                                .addGroup(painel_dadosLayout
                                                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                                                .addComponent(jLabel5)
                                                                                                                                                                                                .addGap(10, 10, 10)
                                                                                                                                                                                                .addComponent(txtcpf,
                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                153,
                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                                                                .addComponent(jLabel18)
                                                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                                                                                .addComponent(txtcargo,
                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                191,
                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                                                                                .addGap(10, 10, 10)
                                                                                                                .addComponent(jLabel14)
                                                                                                                .addGap(10, 10, 10)
                                                                                                                .addComponent(cbuf,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                87,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGap(100, 100,
                                                                                                                                100)))));

                painel_dadosLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL,
                                new java.awt.Component[] { txtemail, txtnome });

                painel_dadosLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL,
                                new java.awt.Component[] { txtbairro, txtrg });

                painel_dadosLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL,
                                new java.awt.Component[] { txtcidade, txtcpf });

                painel_dadosLayout.setVerticalGroup(
                                painel_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(painel_dadosLayout.createSequentialGroup()
                                                                .addGap(11, 11, 11)
                                                                .addGroup(painel_dadosLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel2)
                                                                                .addComponent(txtcodigo,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(11, 11, 11)
                                                                .addGroup(painel_dadosLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(painel_dadosLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(6, 6, 6)
                                                                                                .addComponent(jLabel3))
                                                                                .addGroup(painel_dadosLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(1, 1, 1)
                                                                                                .addComponent(txtnome,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addComponent(btnbusca))
                                                                .addGroup(painel_dadosLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(painel_dadosLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(18, 18, 18)
                                                                                                .addGroup(painel_dadosLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(txtemail,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jLabel4)))
                                                                                .addGroup(painel_dadosLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(18, 18, 18)
                                                                                                .addGroup(painel_dadosLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(txtcel,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jLabel8)))
                                                                                .addGroup(painel_dadosLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(23, 23, 23)
                                                                                                .addComponent(jLabel7))
                                                                                .addGroup(painel_dadosLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(txtfixo,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(painel_dadosLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(painel_dadosLayout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(txtcep,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(jLabel9)
                                                                                                .addComponent(jLabel10)
                                                                                                .addComponent(txtend,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addComponent(txtnumero,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(painel_dadosLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(5, 5, 5)
                                                                                                .addComponent(jLabel13)))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(painel_dadosLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(painel_dadosLayout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(txtbairro,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(jLabel12))
                                                                                .addComponent(txtcidade,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(txtcomplemento,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(cbuf,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(painel_dadosLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(5, 5, 5)
                                                                                                .addGroup(painel_dadosLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jLabel15)
                                                                                                                .addComponent(jLabel11)
                                                                                                                .addComponent(jLabel14))))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(painel_dadosLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(painel_dadosLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(painel_dadosLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(painel_dadosLayout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                                .addComponent(txtrg,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addComponent(jLabel6))
                                                                                                                .addComponent(txtcpf,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGroup(painel_dadosLayout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGap(5, 5, 5)
                                                                                                                                .addComponent(jLabel5)))
                                                                                                .addGap(18, 18, 18)
                                                                                                .addGroup(painel_dadosLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(cbnivel,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGroup(painel_dadosLayout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGap(5, 5, 5)
                                                                                                                                .addComponent(jLabel19))
                                                                                                                .addGroup(painel_dadosLayout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                                .addComponent(jLabel17)
                                                                                                                                .addComponent(txtsenha,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                                .addGroup(painel_dadosLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(5, 5, 5)
                                                                                                .addGroup(painel_dadosLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(jLabel18)
                                                                                                                .addComponent(txtcargo,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                .addContainerGap(122, Short.MAX_VALUE)));

                painel_dadosLayout.linkSize(javax.swing.SwingConstants.VERTICAL,
                                new java.awt.Component[] { txtemail, txtnome });

                jTabbedPane1.addTab("Dados Pessoais", painel_dados);

                jPanel4.setBackground(new java.awt.Color(255, 255, 255));

                tabelaFuncionarios.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                tabelaFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][] {

                                },
                                new String[] {
                                                "Código", "Nome", "RG", "CPF", "E-mail", "Senha", "Cargo",
                                                "Nível Acesso", "Telefone",
                                                "Celular", "Cep", "Endereço", "Nº", "Comp", "Bairro", "Cidade", "UF"
                                }));
                tabelaFuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                tabelaFuncionariosMouseClicked(evt);
                        }
                });
                jScrollPane1.setViewportView(tabelaFuncionarios);

                jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
                jLabel16.setText("Nome:");

                txtpesquisa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                txtpesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyPressed(java.awt.event.KeyEvent evt) {
                                txtpesquisaKeyPressed(evt);
                        }
                });

                btnpesquisar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                btnpesquisar.setText("Pesquisar");
                btnpesquisar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnpesquisarActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
                jPanel4.setLayout(jPanel4Layout);
                jPanel4Layout.setHorizontalGroup(
                                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel4Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(jPanel4Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jScrollPane1,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                968,
                                                                                                Short.MAX_VALUE)
                                                                                .addGroup(jPanel4Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel16)
                                                                                                .addGap(9, 9, 9)
                                                                                                .addComponent(txtpesquisa,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                316,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(btnpesquisar)
                                                                                                .addGap(0, 0, Short.MAX_VALUE)))
                                                                .addContainerGap()));
                jPanel4Layout.setVerticalGroup(
                                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel4Layout.createSequentialGroup()
                                                                .addGap(35, 35, 35)
                                                                .addGroup(jPanel4Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel4Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(5, 5, 5)
                                                                                                .addComponent(jLabel16))
                                                                                .addGroup(jPanel4Layout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(txtpesquisa,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(btnpesquisar)))
                                                                .addGap(32, 32, 32)
                                                                .addComponent(jScrollPane1,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                272, Short.MAX_VALUE)
                                                                .addGap(35, 35, 35)));

                jTabbedPane1.addTab("Consulta de funcionários", jPanel4);

                btnnovo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                btnnovo.setText("+ Novo");
                btnnovo.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnnovoActionPerformed(evt);
                        }
                });

                btnsalvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                btnsalvar.setText("Salvar");
                btnsalvar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnsalvarActionPerformed(evt);
                        }
                });

                jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                jButton3.setText("Editar");
                jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton3ActionPerformed(evt);
                        }
                });

                jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                jButton4.setText("Excluir");
                jButton4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton4ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jTabbedPane1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap())
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(271, 271, 271)
                                                                .addComponent(btnnovo,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                108,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(6, 6, 6)
                                                                .addComponent(btnsalvar,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                108,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(10, 10, 10)
                                                                .addComponent(jButton3,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                108,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(10, 10, 10)
                                                                .addComponent(jButton4,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                108,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jPanel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jTabbedPane1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(41, 41, 41)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(btnnovo,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                42,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(btnsalvar,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                42,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jButton3,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                42,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jButton4,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                42,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

        private void txtcidadeActionPerformed(java.awt.event.ActionEvent evt) {

        }

        private void btnbuscaActionPerformed(java.awt.event.ActionEvent evt) {

                String nome = txtnome.getText();
                Funcionario obj = new Funcionario();
                FuncionariosDAO dao = new FuncionariosDAO();

                obj = dao.consultaPorNome(nome);

                if (obj.getNome() != null) {
                        txtcodigo.setText(String.valueOf(obj.getId()));
                        txtnome.setText(obj.getNome());
                        txtrg.setText(obj.getRg());
                        txtcpf.setText(obj.getCpf());
                        txtemail.setText(obj.getEmail());
                        txtsenha.setText(obj.getSenha());
                        txtcargo.setText(obj.getCargo());
                        cbnivel.setSelectedItem(obj.getNivelAcesso());
                        txtfixo.setText(obj.getTelefone());
                        txtcel.setText(obj.getCelular());
                        txtcep.setText(obj.getCep());
                        txtend.setText(obj.getEndereco());
                        txtnumero.setText(String.valueOf(obj.getNumero()));
                        txtcomplemento.setText(obj.getComplemento());
                        txtbairro.setText(obj.getBairro());
                        txtcidade.setText(obj.getCidade());
                        cbuf.setSelectedItem(obj.getEstado());
                } else {
                        JOptionPane.showMessageDialog(null, "Funcionario não encontrado");
                        new Utlis().LimpaTela(painel_dados);
                }
        }

        private void txtcepKeyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                        Clientes obj = new Clientes();
                        ClientesDAO dao = new ClientesDAO();
                        obj = dao.buscaCep(txtcep.getText());

                        txtend.setText(obj.getEndereco());
                        txtbairro.setText(obj.getBairro());
                        txtcidade.setText(obj.getCidade());
                        cbuf.setSelectedItem(obj.getEstado());
                }
        }

        private void btnpesquisarActionPerformed(java.awt.event.ActionEvent evt) {
                String nome = "%" + txtpesquisa.getText() + "%";

                FuncionariosDAO dao = new FuncionariosDAO();
                List<Funcionario> lista = dao.listaFuncionarioPorNome(nome);
                DefaultTableModel dados = (DefaultTableModel) tabelaFuncionarios.getModel();
                dados.setNumRows(0);

                for (Funcionario f : lista) {
                        dados.addRow(new Object[] {
                                        f.getId(),
                                        f.getNome(),
                                        f.getRg(),
                                        f.getCpf(),
                                        f.getEmail(),
                                        f.getSenha(),
                                        f.getCargo(),
                                        f.getNivelAcesso(),
                                        f.getTelefone(),
                                        f.getCelular(),
                                        f.getCep(),
                                        f.getEndereco(),
                                        f.getNumero(),
                                        f.getComplemento(),
                                        f.getBairro(),
                                        f.getCidade(),
                                        f.getEstado()
                        });
                }
        }

        private void txtnomeActionPerformed(java.awt.event.ActionEvent evt) {

        }

        private void btnsalvarActionPerformed(java.awt.event.ActionEvent evt) {
                Funcionario obj = new Funcionario();

                obj.setNome(txtnome.getText());
                obj.setRg(txtrg.getText());
                obj.setCpf(txtcep.getText());
                obj.setEmail(txtemail.getText());
                obj.setSenha(txtsenha.getText());
                obj.setCargo(txtcargo.getText());
                obj.setNivelAcesso(cbnivel.getSelectedItem().toString());
                obj.setTelefone(txtfixo.getText());
                obj.setCelular(txtcel.getText());
                obj.setCep(txtcep.getText());
                obj.setEndereco(txtend.getText());
                obj.setNumero(Integer.parseInt(txtnumero.getText()));
                obj.setComplemento(txtcomplemento.getText());
                obj.setBairro(txtbairro.getText());
                obj.setCidade(txtcidade.getText());
                obj.setEstado(cbuf.getSelectedItem().toString());

                FuncionariosDAO dao = new FuncionariosDAO();
                dao.cadastrarFuncionarios(obj);

                new Utlis().LimpaTela(painel_dados);
        }

        private void formWindowActivated(java.awt.event.WindowEvent evt) {
                listar();
        }

        private void tabelaFuncionariosMouseClicked(java.awt.event.MouseEvent evt) {

                jTabbedPane1.setSelectedIndex(0);
                txtcodigo.setText(tabelaFuncionarios.getValueAt(tabelaFuncionarios.getSelectedRow(), 0).toString());
                txtnome.setText(tabelaFuncionarios.getValueAt(tabelaFuncionarios.getSelectedRow(), 1).toString());
                txtrg.setText(tabelaFuncionarios.getValueAt(tabelaFuncionarios.getSelectedRow(), 2).toString());
                txtcpf.setText(tabelaFuncionarios.getValueAt(tabelaFuncionarios.getSelectedRow(), 3).toString());
                txtemail.setText(tabelaFuncionarios.getValueAt(tabelaFuncionarios.getSelectedRow(), 4).toString());
                txtsenha.setText(tabelaFuncionarios.getValueAt(tabelaFuncionarios.getSelectedRow(), 5).toString());
                txtcargo.setText(tabelaFuncionarios.getValueAt(tabelaFuncionarios.getSelectedRow(), 6).toString());
                cbnivel.setSelectedItem(
                                tabelaFuncionarios.getValueAt(tabelaFuncionarios.getSelectedRow(), 7).toString());
                txtfixo.setText(tabelaFuncionarios.getValueAt(tabelaFuncionarios.getSelectedRow(), 8).toString());
                txtcel.setText(tabelaFuncionarios.getValueAt(tabelaFuncionarios.getSelectedRow(), 9).toString());
                txtcep.setText(tabelaFuncionarios.getValueAt(tabelaFuncionarios.getSelectedRow(), 10).toString());
                txtend.setText(tabelaFuncionarios.getValueAt(tabelaFuncionarios.getSelectedRow(), 11).toString());
                txtnumero.setText(tabelaFuncionarios.getValueAt(tabelaFuncionarios.getSelectedRow(), 12).toString());
                txtcomplemento.setText(
                                tabelaFuncionarios.getValueAt(tabelaFuncionarios.getSelectedRow(), 13).toString());
                txtbairro.setText(tabelaFuncionarios.getValueAt(tabelaFuncionarios.getSelectedRow(), 14).toString());
                txtcidade.setText(tabelaFuncionarios.getValueAt(tabelaFuncionarios.getSelectedRow(), 15).toString());
                cbuf.setSelectedItem(tabelaFuncionarios.getValueAt(tabelaFuncionarios.getSelectedRow(), 16).toString());
        }

        private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {

                Funcionario obj = new Funcionario();
                obj.setNome(txtnome.getText());
                obj.setRg(txtrg.getText());
                obj.setCpf(txtcpf.getText());
                obj.setEmail(txtemail.getText());
                obj.setSenha(txtsenha.getText());
                obj.setCargo(txtcargo.getText());
                obj.setNivelAcesso(cbnivel.getSelectedItem().toString());
                obj.setTelefone(txtfixo.getText());
                obj.setCelular(txtcel.getText());
                obj.setCep(txtcep.getText());
                obj.setEndereco(txtend.getText());
                obj.setNumero(Integer.parseInt(txtnumero.getText()));
                obj.setComplemento(txtcomplemento.getText());
                obj.setBairro(txtbairro.getText());
                obj.setCidade(txtcidade.getText());
                obj.setEstado(cbuf.getSelectedItem().toString());

                obj.setId(Integer.parseInt(txtcodigo.getText()));

                FuncionariosDAO dao = new FuncionariosDAO();
                dao.alterarFuncionario(obj);

                new Utlis().LimpaTela(painel_dados);

        }

        private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {

        }

        private void txtpesquisaKeyPressed(java.awt.event.KeyEvent evt) {
                String nome = "%" + txtpesquisa.getText() + "%";

                FuncionariosDAO dao = new FuncionariosDAO();
                List<Funcionario> lista = dao.listaFuncionarioPorNome(nome);
                DefaultTableModel dados = (DefaultTableModel) tabelaFuncionarios.getModel();
                dados.setNumRows(0);

                for (Funcionario f : lista) {
                        dados.addRow(new Object[] {
                                        f.getId(),
                                        f.getNome(),
                                        f.getRg(),
                                        f.getCpf(),
                                        f.getEmail(),
                                        f.getSenha(),
                                        f.getCargo(),
                                        f.getNivelAcesso(),
                                        f.getTelefone(),
                                        f.getCelular(),
                                        f.getCep(),
                                        f.getEndereco(),
                                        f.getNumero(),
                                        f.getComplemento(),
                                        f.getBairro(),
                                        f.getCidade(),
                                        f.getEstado()
                        });
                }
        }

        private void btnnovoActionPerformed(java.awt.event.ActionEvent evt) {

        }

        public static void main(String args[]) {

                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Windows".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(FrmFuncionarios.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(FrmFuncionarios.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(FrmFuncionarios.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(FrmFuncionarios.class.getName()).log(
                                        java.util.logging.Level.SEVERE,
                                        null, ex);
                }
                // </editor-fold>
                // </editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new FrmFuncionarios().setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnbusca;
        private javax.swing.JButton btnnovo;
        private javax.swing.JButton btnpesquisar;
        private javax.swing.JButton btnsalvar;
        private javax.swing.JComboBox<String> cbnivel;
        private javax.swing.JComboBox<String> cbuf;
        private javax.swing.JButton jButton3;
        private javax.swing.JButton jButton4;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel10;
        private javax.swing.JLabel jLabel11;
        private javax.swing.JLabel jLabel12;
        private javax.swing.JLabel jLabel13;
        private javax.swing.JLabel jLabel14;
        private javax.swing.JLabel jLabel15;
        private javax.swing.JLabel jLabel16;
        private javax.swing.JLabel jLabel17;
        private javax.swing.JLabel jLabel18;
        private javax.swing.JLabel jLabel19;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel4;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTabbedPane jTabbedPane1;
        private javax.swing.JPanel painel_dados;
        private javax.swing.JTable tabelaFuncionarios;
        private javax.swing.JFormattedTextField txtbairro;
        private javax.swing.JTextField txtcargo;
        private javax.swing.JFormattedTextField txtcel;
        private javax.swing.JFormattedTextField txtcep;
        private javax.swing.JFormattedTextField txtcidade;
        private javax.swing.JTextField txtcodigo;
        private javax.swing.JTextField txtcomplemento;
        private javax.swing.JFormattedTextField txtcpf;
        private javax.swing.JTextField txtemail;
        private javax.swing.JTextField txtend;
        private javax.swing.JFormattedTextField txtfixo;
        private javax.swing.JTextField txtnome;
        private javax.swing.JFormattedTextField txtnumero;
        private javax.swing.JTextField txtpesquisa;
        private javax.swing.JFormattedTextField txtrg;
        private javax.swing.JPasswordField txtsenha;
        // End of variables declaration//GEN-END:variables
}
