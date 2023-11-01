
package br.com.projeto.view;

import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import br.com.projeto.dao.ProdutosDAO;
import br.com.projeto.model.Produtos;

public class FrmEstoque extends javax.swing.JFrame {

        int idProduto, qtdNova;

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

        public FrmEstoque() {
                initComponents();
        }

    
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jPanel3 = new javax.swing.JPanel();
                jLabel16 = new javax.swing.JLabel();
                txtpesquisa = new javax.swing.JTextField();
                btnpesquisar = new javax.swing.JButton();
                jLabel17 = new javax.swing.JLabel();
                txtestoque = new javax.swing.JTextField();
                txtqtd = new javax.swing.JTextField();
                jLabel18 = new javax.swing.JLabel();
                btnadd = new javax.swing.JButton();
                jPanel2 = new javax.swing.JPanel();
                jScrollPane1 = new javax.swing.JScrollPane();
                tabelaProdutos = new javax.swing.JTable();

                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                setTitle("Detalhe  da Venda");
                addWindowListener(new java.awt.event.WindowAdapter() {
                        public void windowActivated(java.awt.event.WindowEvent evt) {
                                formWindowActivated(evt);
                        }
                });

                jPanel1.setBackground(new java.awt.Color(0, 102, 204));

                jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(255, 255, 255));
                jLabel1.setText("Controle de Estoque de Produtos");

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                jPanel1Layout.createSequentialGroup()
                                                                                .addContainerGap(224, Short.MAX_VALUE)
                                                                                .addComponent(jLabel1)
                                                                                .addGap(201, 201, 201)));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(21, 21, 21)
                                                                .addComponent(jLabel1)
                                                                .addContainerGap(20, Short.MAX_VALUE)));

                jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Consulta de Produtos"));

                jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
                jLabel16.setText("Descrição:");

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

                jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
                jLabel17.setText("Estoque Atual:");

                txtestoque.setEditable(false);
                txtestoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                txtestoque.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyPressed(java.awt.event.KeyEvent evt) {
                                txtestoqueKeyPressed(evt);
                        }
                });

                txtqtd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                txtqtd.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyPressed(java.awt.event.KeyEvent evt) {
                                txtqtdKeyPressed(evt);
                        }
                });

                jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
                jLabel18.setText("Qtd:");

                btnadd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
                btnadd.setText("Adicionar");
                btnadd.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnaddActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
                jPanel3.setLayout(jPanel3Layout);
                jPanel3Layout.setHorizontalGroup(
                                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(jPanel3Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel17)
                                                                                .addComponent(jLabel16))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel3Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(txtpesquisa,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                308,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(jPanel3Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(txtestoque,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                125,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(jLabel18)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(txtqtd,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                96,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(jPanel3Layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                false)
                                                                                .addComponent(btnpesquisar,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(btnadd,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                jPanel3Layout.setVerticalGroup(
                                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout
                                                                .createSequentialGroup()
                                                                .addGap(9, 9, 9)
                                                                .addGroup(jPanel3Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel16)
                                                                                .addComponent(txtpesquisa,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(btnpesquisar))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel3Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel3Layout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(jLabel18)
                                                                                                .addComponent(txtqtd,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(btnadd))
                                                                                .addGroup(jPanel3Layout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(jLabel17)
                                                                                                .addComponent(txtestoque,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap(21, Short.MAX_VALUE)));

                jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Produtos"));

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

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                .addContainerGap()
                                                                                .addComponent(jScrollPane1,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                742,
                                                                                                Short.MAX_VALUE)
                                                                                .addContainerGap())));
                jPanel2Layout.setVerticalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 265, Short.MAX_VALUE)
                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                .addGap(10, 10, 10)
                                                                                .addComponent(jScrollPane1,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                244,
                                                                                                Short.MAX_VALUE)
                                                                                .addContainerGap())));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jPanel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jPanel3,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jPanel2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));

                pack();
                setLocationRelativeTo(null);
        }

        private void txtpesquisaKeyPressed(java.awt.event.KeyEvent evt) {

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

        private void txtestoqueKeyPressed(java.awt.event.KeyEvent evt) {

        }

        private void txtqtdKeyPressed(java.awt.event.KeyEvent evt) {

        }

        private void tabelaProdutosMouseClicked(java.awt.event.MouseEvent evt) {
                txtpesquisa.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 1).toString());
                idProduto = Integer.parseInt(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 0).toString());
                txtestoque.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 3).toString());
        }

        private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {
                try {
                        int qtdEstoue, qtd;
                        qtdEstoue = Integer.parseInt(txtestoque.getText());
                        qtd = Integer.parseInt(txtqtd.getText());
                        qtdNova = qtdEstoue + qtd;

                        ProdutosDAO dao = new ProdutosDAO();
                        dao.addEstoque(idProduto, qtdNova);

                        JOptionPane.showMessageDialog(null, "Estoque atualizado");

                } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Selecione o produto ou a nova quantidade " + e);

                }
        }

        private void formWindowActivated(java.awt.event.WindowEvent evt) {
                listar();
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
                        java.util.logging.Logger.getLogger(FrmEstoque.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(FrmEstoque.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(FrmEstoque.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {

                }

                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new FrmEstoque().setVisible(true);
                        }
                });
        }

        private javax.swing.JButton btnadd;
        private javax.swing.JButton btnpesquisar;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel16;
        private javax.swing.JLabel jLabel17;
        private javax.swing.JLabel jLabel18;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JPanel jPanel3;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTable tabelaProdutos;
        private javax.swing.JTextField txtestoque;
        private javax.swing.JTextField txtpesquisa;
        private javax.swing.JTextField txtqtd;
}
