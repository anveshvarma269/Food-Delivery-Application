/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.order.FinalOrder;
import Business.order.Order;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anveshvarma
 */
public class CustomerProfile extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Customer c;
    EcoSystem ecosystem;
    RestaurantDirectory rd;
    CustomerDirectory cd;
    public CustomerProfile(JPanel userProcessContainer,Customer c,EcoSystem ecosystem) {
        this.c = c;
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
               
        initComponents();
        populateTable();
        nameLabel.setText(c.getCustomerName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listOrdersReview = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        textReview = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        btnUpdateReview = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        reviewItem = new javax.swing.JTextField();
        reviewResto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ordersList = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        listOrdersReview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listOrdersReviewActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(textReview);

        jLabel5.setText("Review:");

        btnUpdateReview.setText("update review");
        btnUpdateReview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateReviewActionPerformed(evt);
            }
        });

        jLabel7.setText("Item:");

        jLabel8.setText("Restaurant:");

        reviewItem.setEditable(false);

        reviewResto.setEditable(false);

        jLabel1.setText("Username:");

        ordersList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Restaurant", "Item", "Order date", "OrderId", "Status", "Delivery", "Review"
            }
        ));
        jScrollPane1.setViewportView(ordersList);

        jLabel2.setText("Orders:");

        nameLabel.setText("userName");

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel6.setText("Review");

        jLabel4.setText("Select OrderId:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 616, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(1, 1, 1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(backButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(84, 84, 84)
                                        .addComponent(nameLabel))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnUpdateReview)
                                            .addComponent(jScrollPane2)
                                            .addComponent(listOrdersReview, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(reviewItem)
                                            .addComponent(reviewResto))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(219, 219, 219)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(2, 2, 2)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 603, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(4, 4, 4)
                    .addComponent(backButton)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(nameLabel))
                    .addGap(34, 34, 34)
                    .addComponent(jLabel2)
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(35, 35, 35)
                    .addComponent(jLabel6)
                    .addGap(32, 32, 32)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(listOrdersReview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(reviewItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(24, 24, 24)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(reviewResto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnUpdateReview)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void listOrdersReviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listOrdersReviewActionPerformed
        // TODO add your handling code here:
        String orderId =(String) listOrdersReview.getSelectedItem();
        rd = ecosystem.getRestaurantDirectory();
        FinalOrder f = rd.getOrder(orderId);
        reviewItem.setText(f.getItem());
        reviewResto.setText(f.getRestaurant());

    }//GEN-LAST:event_listOrdersReviewActionPerformed

    private void btnUpdateReviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateReviewActionPerformed
        // TODO add your handling code here:
        String orderId =(String) listOrdersReview.getSelectedItem();
        rd = ecosystem.getRestaurantDirectory();
        FinalOrder f = rd.getOrder(orderId);
        f.setReview(textReview.getText());
        populateTable();
        textReview.setText("");
        reviewItem.setText("");
        reviewResto.setText("");
    }//GEN-LAST:event_btnUpdateReviewActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
        crdLyt.show(userProcessContainer,"Customer");
    }//GEN-LAST:event_backButtonActionPerformed
private void populateTable() {
        
        nameLabel.setText(c.getCustomerName());
        ArrayList<Order> orders = c.getPreviousOrders();
        rd = ecosystem.getRestaurantDirectory();
        ArrayList<Restaurant> restos = rd.getRestaurantList();
        ArrayList<FinalOrder> finalOrders;
        DefaultTableModel df = (DefaultTableModel) ordersList.getModel();
        DefaultComboBoxModel dl = new DefaultComboBoxModel();
        df.setRowCount(0);
        for(Restaurant r: restos)
        {
            finalOrders = r.getAcceptedOrders();
            for(FinalOrder f: finalOrders)
            {
                if(f.getCustomer().equals(c.getCustomerName()))
                {
                    String[] row = {f.getRestaurant(),f.getItem(),f.getDate(),f.getOrderId(),f.getStatus(),f.getDeliveryMan(),f.getReview()};
                    df.addRow(row);
                    dl.addElement(f.getOrderId());
                }
            }
        }
        ordersList.setModel(df);
        listOrdersReview.setModel(dl);
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton btnUpdateReview;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> listOrdersReview;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTable ordersList;
    private javax.swing.JTextField reviewItem;
    private javax.swing.JTextField reviewResto;
    private javax.swing.JTextPane textReview;
    // End of variables declaration//GEN-END:variables
}
