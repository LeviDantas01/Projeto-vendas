package br.com.projeto.view;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import br.com.projeto.dao.ItemVendaDAO;
import br.com.projeto.dao.ProdutosDAO;
import br.com.projeto.dao.VendasDAO;
import br.com.projeto.model.Clientes;
import br.com.projeto.model.ItemVenda;
import br.com.projeto.model.Produtos;
import br.com.projeto.model.Vendas;

public class FrmPagamentos extends javax.swing.JFrame {

        Clientes cliente = new Clientes();
        DefaultTableModel carrinho;

        public FrmPagamentos() {
                initComponents();
                txtcartao.setText("0");
                txtcheque.setText("0");
                txtdinheiro.setText("0");
                txttroco.setText("0");

        }

        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                txtdinheiro = new javax.swing.JTextField();
                jLabel3 = new javax.swing.JLabel();
                txtcartao = new javax.swing.JTextField();
                jLabel4 = new javax.swing.JLabel();
                txtcheque = new javax.swing.JTextField();
                jLabel5 = new javax.swing.JLabel();
                txttroco = new javax.swing.JTextField();
                jLabel6 = new javax.swing.JLabel();
                txttotal = new javax.swing.JTextField();
                btnfinalizar = new javax.swing.JButton();
                jLabel7 = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                txtobs = new javax.swing.JTextArea();

                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                setTitle("Tela de Pagamentos");

                jPanel1.setBackground(new java.awt.Color(0, 102, 204));

                jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(255, 255, 255));
                jLabel1.setText("Pagamentos");

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(130, 130, 130)
                                                                .addComponent(jLabel1)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(21, 21, 21)
                                                                .addComponent(jLabel1)
                                                                .addContainerGap(20, Short.MAX_VALUE)));

                jLabel2.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
                jLabel2.setText("Obs.:");

                txtdinheiro.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N

                jLabel3.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
                jLabel3.setText("CARTÃO:");

                txtcartao.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N

                jLabel4.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
                jLabel4.setText("CHEQUE:");

                txtcheque.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N

                jLabel5.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
                jLabel5.setText("TROCO:");

                txttroco.setEditable(false);
                txttroco.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N

                jLabel6.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
                jLabel6.setText("TOTAL:");

                txttotal.setEditable(false);
                txttotal.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N

                btnfinalizar.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
                btnfinalizar.setText("Finalizar Venda");
                btnfinalizar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnfinalizarActionPerformed(evt);
                        }
                });

                jLabel7.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
                jLabel7.setText("DINHEIRO:");

                txtobs.setColumns(20);
                txtobs.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
                txtobs.setRows(5);
                jScrollPane1.setViewportView(txtobs);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(24, 24, 24)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jLabel3)
                                                                                                                .addComponent(jLabel4)
                                                                                                                .addComponent(jLabel5)
                                                                                                                .addComponent(jLabel6))
                                                                                                .addGap(33, 33, 33)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(txtcheque,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                194,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(txttroco,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                194,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(txttotal,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                194,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addComponent(txtcartao,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                194,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                                                .addComponent(txtdinheiro,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                194,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                                                .addComponent(jLabel2)))
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                .addComponent(jScrollPane1,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                287,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(64, 64, 64)
                                                                                                .addComponent(btnfinalizar,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                279,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap(20, Short.MAX_VALUE))
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(34, 34, 34)
                                                                                .addComponent(jLabel7)
                                                                                .addContainerGap(590,
                                                                                                Short.MAX_VALUE))));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jPanel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(39, 39, 39)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(jLabel2)
                                                                                                                .addComponent(txtdinheiro,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGap(18, 18, 18)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(jLabel3)
                                                                                                                .addComponent(txtcartao,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                .addComponent(jScrollPane1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel4)
                                                                                .addComponent(txtcheque,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel5)
                                                                                .addComponent(txttroco,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel6)
                                                                                .addComponent(txttotal,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                16,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(btnfinalizar,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                51,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(27, 27, 27))
                                                .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                                .addGap(122, 122, 122)
                                                                                .addComponent(jLabel7)
                                                                                .addContainerGap(323,
                                                                                                Short.MAX_VALUE))));

                pack();
                setLocationRelativeTo(null);
        }

        private void btnfinalizarActionPerformed(java.awt.event.ActionEvent evt) {

                double pCartao, pCheque, pDinheiro, totalPago, totalVenda, troco;

                pCartao = Double.parseDouble(txtcartao.getText());
                pCheque = Double.parseDouble(txtcheque.getText());
                pDinheiro = Double.parseDouble(txtdinheiro.getText());

                totalVenda = Double.parseDouble(txttotal.getText());
                totalPago = pCartao + pCheque + pDinheiro;
                troco = totalPago - totalVenda;
                txttroco.setText(String.valueOf(troco));

                Vendas vendas = new Vendas();
                vendas.setCliente(cliente);

                Date now = new Date();
                SimpleDateFormat dataUs = new SimpleDateFormat("yyyy-MM-dd");
                String d = dataUs.format(now);
                vendas.setDataVenda(d);

                vendas.setTatalVenda(totalVenda);
                vendas.setObs(txtobs.getText());

                VendasDAO vendasDAO = new VendasDAO();
                vendasDAO.cadastrarVenda(vendas);
                vendas.setId(vendasDAO.retornaUltimaVenda());

                for (int i = 0; i < carrinho.getRowCount(); i++) {
                        int qtdEstoque, qtdComprada, qtdAtualizada;
                        Produtos produtos = new Produtos();
                        ProdutosDAO pdao = new ProdutosDAO();
                        ItemVenda itemVenda = new ItemVenda();

                        itemVenda.setVendas(vendas);
                        produtos.setId(Integer.parseInt(carrinho.getValueAt(i, 0).toString()));
                        itemVenda.setProdutos(produtos);
                        itemVenda.setQtd(Integer.parseInt(carrinho.getValueAt(i, 2).toString()));
                        itemVenda.setSubTotal(Double.parseDouble(carrinho.getValueAt(i, 4).toString()));

                        qtdEstoque = pdao.retornaEstoqueAtual(produtos.getId());
                        qtdComprada = Integer.parseInt(carrinho.getValueAt(i, 2).toString());
                        qtdAtualizada = qtdEstoque - qtdComprada;
                        pdao.baixaEstoque(produtos.getId(), qtdAtualizada);

                        ItemVendaDAO itemVendaDAO = new ItemVendaDAO();
                        itemVendaDAO.cadastraItem(itemVenda);
                }
                JOptionPane.showMessageDialog(null, "Venda registrada");

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
                        java.util.logging.Logger.getLogger(FrmPagamentos.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(FrmPagamentos.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(FrmPagamentos.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(FrmPagamentos.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                }

                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new FrmPagamentos().setVisible(true);
                        }
                });
        }

        private javax.swing.JButton btnfinalizar;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTextField txtcartao;
        private javax.swing.JTextField txtcheque;
        private javax.swing.JTextField txtdinheiro;
        private javax.swing.JTextArea txtobs;
        public javax.swing.JTextField txttotal;
        private javax.swing.JTextField txttroco;

}
