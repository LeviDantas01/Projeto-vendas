package br.com.projeto.view;

import java.awt.Color;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import br.com.projeto.dao.FornecedoresDAO;
import br.com.projeto.dao.ProdutosDAO;
import br.com.projeto.model.Fornecedores;
import br.com.projeto.model.Produtos;
import br.com.projeto.utils.Utlis;

public class FrmProdutos extends javax.swing.JFrame {

        public void listar() {
                ProdutosDAO dao = new ProdutosDAO();
                List<Produtos> lista = dao.listaProdutos();
                DefaultTableModel dados = (DefaultTableModel) tabelaProdutos.getModel();
                dados.setNumRows(0);

                for (Produtos p : lista) {
                        dados.addRow(new Object[] {
                                        p.getId(),
                                        p.getDescricao(),
                                        p.getPreco(),
                                        p.getQtdEsoque(),
                                        p.getFornecedor().getNome()
                        });
                }
        }

        public FrmProdutos() {
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
                jLabel4 = new javax.swing.JLabel();
                btnbusca = new javax.swing.JButton();
                jLabel8 = new javax.swing.JLabel();
                txtcodigo = new javax.swing.JTextField();
                txtdescricao = new javax.swing.JTextField();
                txtpreco = new javax.swing.JTextField();
                jLabel2 = new javax.swing.JLabel();
                jLabel14 = new javax.swing.JLabel();
                cbfornecedor = new javax.swing.JComboBox();
                txtqtdestoque = new javax.swing.JTextField();
                jPanel4 = new javax.swing.JPanel();
                jScrollPane1 = new javax.swing.JScrollPane();
                tabelaProdutos = new javax.swing.JTable();
                jLabel16 = new javax.swing.JLabel();
                txtpesquisa = new javax.swing.JTextField();
                btnpesquisar = new javax.swing.JButton();
                btnnovo = new javax.swing.JButton();
                btnsalvar = new javax.swing.JButton();
                jButton3 = new javax.swing.JButton();
                jButton4 = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                setTitle("Cadastro de Produtos");
                addWindowListener(new java.awt.event.WindowAdapter() {
                        public void windowActivated(java.awt.event.WindowEvent evt) {
                                formWindowActivated(evt);
                        }
                });

                jPanel1.setBackground(new java.awt.Color(0, 102, 204));

                jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(255, 255, 255));
                jLabel1.setText("Cadastro de Produtos");

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
                jLabel3.setText("Descrição:");

                jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
                jLabel4.setText("Preço:");

                btnbusca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                btnbusca.setText("Pesquisar");
                btnbusca.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnbuscaActionPerformed(evt);
                        }
                });

                jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
                jLabel8.setText("Qtd. Estoque:");

                txtcodigo.setEditable(false);
                txtcodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

                txtdescricao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                txtdescricao.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtdescricaoActionPerformed(evt);
                        }
                });

                txtpreco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

                jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
                jLabel2.setText("Código:");

                jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
                jLabel14.setText("Fornecedor:");

                cbfornecedor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                cbfornecedor.addAncestorListener(new javax.swing.event.AncestorListener() {
                        public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                                cbfornecedorAncestorAdded(evt);
                        }

                        public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                        }

                        public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                        }
                });
                cbfornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                cbfornecedorMouseClicked(evt);
                        }
                });
                cbfornecedor.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                cbfornecedorActionPerformed(evt);
                        }
                });

                txtqtdestoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

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
                                                                                                .addGap(10, 10, 10)
                                                                                                .addComponent(jLabel2))
                                                                                .addGroup(painel_dadosLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(20, 20, 20)
                                                                                                .addGroup(painel_dadosLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addComponent(jLabel4)
                                                                                                                .addComponent(jLabel3))))
                                                                .addGap(9, 9, 9)
                                                                .addGroup(painel_dadosLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(txtcodigo,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                67,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                painel_dadosLayout
                                                                                                                .createSequentialGroup()
                                                                                                                .addGroup(painel_dadosLayout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                painel_dadosLayout
                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                .addComponent(txtpreco,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                110,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                                                .addComponent(jLabel8)
                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                                                .addComponent(txtqtdestoque,
                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                138,
                                                                                                                                                                                Short.MAX_VALUE))
                                                                                                                                .addComponent(txtdescricao))
                                                                                                                .addGap(47, 47, 47)
                                                                                                                .addComponent(btnbusca)))
                                                                .addGap(490, 490, 490))
                                                .addGroup(painel_dadosLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel14)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(cbfornecedor,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                214,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
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
                                                                .addGroup(painel_dadosLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(painel_dadosLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(17, 17, 17)
                                                                                                .addComponent(jLabel3))
                                                                                .addGroup(painel_dadosLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(11, 11, 11)
                                                                                                .addGroup(painel_dadosLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(txtdescricao,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(btnbusca))))
                                                                .addGap(19, 19, 19)
                                                                .addGroup(painel_dadosLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(txtpreco,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel4)
                                                                                .addComponent(jLabel8)
                                                                                .addComponent(txtqtdestoque,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(painel_dadosLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(cbfornecedor,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel14))
                                                                .addContainerGap(215, Short.MAX_VALUE)));

                painel_dadosLayout.linkSize(javax.swing.SwingConstants.VERTICAL,
                                new java.awt.Component[] { txtdescricao, txtpreco });

                jTabbedPane1.addTab("Dados do Produto", painel_dados);

                jPanel4.setBackground(new java.awt.Color(255, 255, 255));

                tabelaProdutos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][] {

                                },
                                new String[] {
                                                "Código", "Descrição", "Preço", "Qtd. Estoque", "Fornecedor"
                                }));
                tabelaProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                tabelaProdutosMouseClicked(evt);
                        }
                });
                jScrollPane1.setViewportView(tabelaProdutos);

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
                                                                .addComponent(jLabel16)
                                                                .addGap(9, 9, 9)
                                                                .addComponent(txtpesquisa,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                316,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btnpesquisar)
                                                                .addContainerGap(588, Short.MAX_VALUE))
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, 1066,
                                                                Short.MAX_VALUE));
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
                                                                .addGap(29, 29, 29)
                                                                .addComponent(jScrollPane1,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                243, Short.MAX_VALUE)
                                                                .addGap(38, 38, 38)));

                jTabbedPane1.addTab("Consulta de Produtos", jPanel4);

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
                                                                .addContainerGap(27, Short.MAX_VALUE)));

                pack();
                setLocationRelativeTo(null);
        }

        private void btnbuscaActionPerformed(java.awt.event.ActionEvent evt) {
                String nome = txtdescricao.getText();
                Produtos obj = new Produtos();
                ProdutosDAO dao = new ProdutosDAO();

                obj = dao.consultaPorNome(nome);
                cbfornecedor.removeAllItems();

                if (obj.getDescricao() != null) {
                        txtcodigo.setText(String.valueOf(obj.getId()));
                        txtdescricao.setText(obj.getDescricao());
                        txtpreco.setText(String.valueOf(obj.getPreco()));
                        txtqtdestoque.setText(String.valueOf(obj.getQtdEsoque()));

                        Fornecedores f = new Fornecedores();
                        FornecedoresDAO fdao = new FornecedoresDAO();

                        f = fdao.consultaPorNome(obj.getFornecedor().getNome());

                        cbfornecedor.getModel().setSelectedItem(f);
                } else {
                        JOptionPane.showMessageDialog(null, "Produto não encontrado");
                }

        }

        private void btnpesquisarActionPerformed(java.awt.event.ActionEvent evt) {
                String nome = "%" + txtpesquisa.getText() + "%";

                ProdutosDAO dao = new ProdutosDAO();
                List<Produtos> lista = dao.listarProdutosPorNome(nome);
                DefaultTableModel dados = (DefaultTableModel) tabelaProdutos.getModel();
                dados.setNumRows(0);

                for (Produtos p : lista) {
                        dados.addRow(new Object[] {
                                        p.getId(),
                                        p.getDescricao(),
                                        p.getPreco(),
                                        p.getQtdEsoque(),
                                        p.getFornecedor().getNome()
                        });
                }
        }

        private void txtdescricaoActionPerformed(java.awt.event.ActionEvent evt) {

        }

        private void btnsalvarActionPerformed(java.awt.event.ActionEvent evt) {
                Produtos obj = new Produtos();
                obj.setDescricao(txtdescricao.getText());
                obj.setPreco(Double.parseDouble(txtpreco.getText()));
                obj.setQtdEsoque(Integer.parseInt(txtqtdestoque.getText()));

                Fornecedores f = new Fornecedores();
                f = (Fornecedores) cbfornecedor.getSelectedItem();
                obj.setFornecedor(f);

                ProdutosDAO dao = new ProdutosDAO();
                dao.cadastrar(obj);
        }

        private void formWindowActivated(java.awt.event.WindowEvent evt) {
                listar();
        }

        private void tabelaProdutosMouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1.setSelectedIndex(0);

                txtcodigo.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 0).toString());
                txtdescricao.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 1).toString());
                txtpreco.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 2).toString());
                txtqtdestoque.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 3).toString());

                Fornecedores f = new Fornecedores();
                FornecedoresDAO dao = new FornecedoresDAO();
                f = dao.consultaPorNome(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 4).toString());

                cbfornecedor.removeAllItems();
                cbfornecedor.getModel().setSelectedItem(f);

        }

        private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
                Produtos obj = new Produtos();
                obj.setId(Integer.parseInt(txtcodigo.getText()));
                obj.setDescricao(txtdescricao.getText());
                obj.setPreco(Double.parseDouble(txtpreco.getText()));
                obj.setQtdEsoque(Integer.parseInt(txtqtdestoque.getText()));

                Fornecedores f = new Fornecedores();
                f = (Fornecedores) cbfornecedor.getSelectedItem();

                obj.setFornecedor(f);

                ProdutosDAO dao = new ProdutosDAO();
                dao.alterarProduto(obj);

                new Utlis().LimpaTela(painel_dados);
        }

        private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
                Produtos obj = new Produtos();
                obj.setId(Integer.parseInt(txtcodigo.getText()));

                ProdutosDAO dao = new ProdutosDAO();
                dao.excluirProduto(obj);

                new Utlis().LimpaTela(painel_dados);
        }

        private void txtpesquisaKeyPressed(java.awt.event.KeyEvent evt) {

                String nome = "%" + txtpesquisa.getText() + "%";

                ProdutosDAO dao = new ProdutosDAO();
                List<Produtos> lista = dao.listarProdutosPorNome(nome);
                DefaultTableModel dados = (DefaultTableModel) tabelaProdutos.getModel();
                dados.setNumRows(0);

                for (Produtos p : lista) {
                        dados.addRow(new Object[] {
                                        p.getId(),
                                        p.getDescricao(),
                                        p.getPreco(),
                                        p.getQtdEsoque(),
                                        p.getFornecedor().getNome()
                        });
                }
        }

        private void btnnovoActionPerformed(java.awt.event.ActionEvent evt) {

        }

        private void cbfornecedorAncestorAdded(javax.swing.event.AncestorEvent evt) {

                FornecedoresDAO dao = new FornecedoresDAO();

                List<Fornecedores> listaFornecedores = dao.listarFornecedor();
                cbfornecedor.removeAll();

                for (Fornecedores f : listaFornecedores) {
                        cbfornecedor.addItem(f);
                }

        }

        private void cbfornecedorActionPerformed(java.awt.event.ActionEvent evt) {

        }

        private void cbfornecedorMouseClicked(java.awt.event.MouseEvent evt) {
                FornecedoresDAO dao = new FornecedoresDAO();
                List<Fornecedores> listaFornecedores = dao.listarFornecedor();
                cbfornecedor.removeAllItems();

                for (Fornecedores f : listaFornecedores) {
                        cbfornecedor.addItem(f);
                }
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
                        java.util.logging.Logger.getLogger(FrmProdutos.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(FrmProdutos.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(FrmProdutos.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(FrmProdutos.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                }
                // </editor-fold>
                // </editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new FrmProdutos().setVisible(true);
                        }
                });
        }

        private javax.swing.JButton btnbusca;
        private javax.swing.JButton btnnovo;
        private javax.swing.JButton btnpesquisar;
        private javax.swing.JButton btnsalvar;
        private javax.swing.JComboBox cbfornecedor;
        private javax.swing.JButton jButton3;
        private javax.swing.JButton jButton4;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel14;
        private javax.swing.JLabel jLabel16;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel4;
        private javax.swing.JScrollPane jScrollPane1;
        public javax.swing.JTabbedPane jTabbedPane1;
        private javax.swing.JPanel painel_dados;
        private javax.swing.JTable tabelaProdutos;
        private javax.swing.JTextField txtcodigo;
        private javax.swing.JTextField txtdescricao;
        private javax.swing.JTextField txtpesquisa;
        private javax.swing.JTextField txtpreco;
        private javax.swing.JTextField txtqtdestoque;

}
