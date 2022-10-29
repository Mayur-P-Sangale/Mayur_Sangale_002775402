/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.systemworkarea.hospital;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Community;
import model.Hospital;
import model.HospitalDirectory;

/**
 *
 * @author Mayur
 */
public class SystemViewHospital extends javax.swing.JPanel {

    /**
     * Creates new form SystemViewHospital
     */
    HospitalDirectory hospitalDirectory;
    public SystemViewHospital(HospitalDirectory hospitalDirectory) {
        initComponents();
        this.hospitalDirectory = hospitalDirectory;
        PopulateData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblSearchHospital = new javax.swing.JLabel();
        txtSearchHospital = new javax.swing.JTextField();
        btnSearchHospital = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHospitalList = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 255));

        lblTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("View Hospital");

        lblSearchHospital.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblSearchHospital.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblSearchHospital.setText("Search Hospital by Name:");

        txtSearchHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchHospitalActionPerformed(evt);
            }
        });

        btnSearchHospital.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSearchHospital.setText("Search");
        btnSearchHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchHospitalActionPerformed(evt);
            }
        });

        tblHospitalList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "HospitalId", "Hospital Name", "Hospital Address", "Contact No", "City", "Community"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblHospitalList);

        btnDelete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblSearchHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSearchHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 376, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtSearchHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelete)
                        .addGap(44, 44, 44))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblSearchHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearchHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearchHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchHospitalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchHospitalActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:

                int selectedRowIndex = tblHospitalList.getSelectedRow();
        
                if(selectedRowIndex<0){
                        JOptionPane.showMessageDialog(this, "Please select a row to delete");
                        return;
                    }
        
                DefaultTableModel model = (DefaultTableModel) tblHospitalList.getModel();
                Hospital selectedHospital = (Hospital) model.getValueAt(selectedRowIndex,0 );
                hospitalDirectory.deleteHospital(selectedHospital);
        
                JOptionPane.showMessageDialog(this, "Hospital deleted successfully!");
        
                PopulateData();

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSearchHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchHospitalActionPerformed
        // TODO add your handling code here:
        
        if(txtSearchHospital.getText().trim().isEmpty()|| txtSearchHospital.getText()==null)
        {
            JOptionPane.showMessageDialog(this,"Please Enter a valid Hospital Name");
            return;
        }
        
        populateDataByHospitalName();
    }//GEN-LAST:event_btnSearchHospitalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearchHospital;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSearchHospital;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblHospitalList;
    private javax.swing.JTextField txtSearchHospital;
    // End of variables declaration//GEN-END:variables

    private void PopulateData() {
       try{
            Set<Hospital> hospitals = hospitalDirectory.getHospitals();
            DefaultTableModel model = new DefaultTableModel(new Object[]{ "Hospital Id", "Hospital Name", "Hospital Address", "City","Community"}, 0);
            if(hospitals!= null && !hospitals.isEmpty()){
              
                for(Hospital h: hospitals){           
                    
                    String hospName = h.getHospitalName();
                    String hospAddress = h.getHospitalAddress();
                    Community community = h.getCommunity();
                    String city = null;
                    String communityName = null;
                    
                    Map<String,String> communityMap = community.getCommunity();
                    
                    for(Map.Entry m: communityMap.entrySet()){  
                        city = m.getKey().toString();
                        communityName = m.getValue().toString();
                    }  
                    
                    model.addRow(new Object[]
                        {h,hospName,hospAddress,city,communityName});       
                }
            }
            tblHospitalList.setModel(model);
            
       }
       catch(Exception e)
       {
           System.out.println(e);
       }    
    }
    
    private void populateDataByHospitalName(){
        try{
            Set<Hospital> hospitals = hospitalDirectory.getHospitals();
            DefaultTableModel model = new DefaultTableModel(new Object[]{ "Hospital Id", "Hospital Name", "Hospital Address", "City","Community"}, 0);
            if(hospitals!= null && !hospitals.isEmpty()){
              
                for(Hospital h: hospitals){           
                    
                    String searchHosp = txtSearchHospital.getText();
                    
                    if(h.getHospitalName().toLowerCase().contains(searchHosp.toLowerCase())){
                    
                        int hospitalId = h.getHospitalID();
                        String hospName = h.getHospitalName();
                        String hospAddress = h.getHospitalAddress();
                        Community community = h.getCommunity();
                        String city = null;
                        String communityName = null;

                        Map<String,String> communityMap = community.getCommunity();

                        for(Map.Entry m: communityMap.entrySet()){  
                            city = m.getKey().toString();
                            communityName = m.getValue().toString();
                        }  

                        model.addRow(new Object[]
                            {hospitalId,hospName,hospAddress,city,communityName}); 

                    }
                          
                }
            }
            tblHospitalList.setModel(model);
            
       }
       catch(Exception e)
       {
           System.out.println(e);
       } 
    
    
    }
}