/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.hospitalworkarea.patients;

import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Patient;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author Mayur
 */
public class HospitalViewPatient extends javax.swing.JPanel {

    /**
     * Creates new form SystemCreatePatient
     */
    
    PatientDirectory patientDirectory;
    PersonDirectory personDirectory;
    Person person;
    
    public HospitalViewPatient(PatientDirectory patientDirectory,PersonDirectory personDirectory) {
        initComponents();
        this.patientDirectory=patientDirectory;
        this.personDirectory=personDirectory;
        populateData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSearchPatient = new javax.swing.JLabel();
        txtSearchPatient = new javax.swing.JTextField();
        btnSearchPatient = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatientList = new javax.swing.JTable();

        setBackground(new java.awt.Color(153, 153, 255));

        lblSearchPatient.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblSearchPatient.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblSearchPatient.setText("Search Patient by Name:");

        txtSearchPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchPatientActionPerformed(evt);
            }
        });

        btnSearchPatient.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSearchPatient.setText("Search");
        btnSearchPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchPatientActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("View Patient");

        tblPatientList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient Id", "Name", "Mobile No", "EmailId", "Age", "Gender", "Height", "Weight"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPatientList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblSearchPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSearchPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearchPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblSearchPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearchPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearchPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchPatientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchPatientActionPerformed

    private void btnSearchPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchPatientActionPerformed
        // TODO add your handling code here:
        
        if(txtSearchPatient.getText().trim().isEmpty()|| txtSearchPatient.getText()==null)
        {
            JOptionPane.showMessageDialog(this,"Please Enter a valid Patient Name");
            return;
        }
        
        populateDataByPatientName();
    }//GEN-LAST:event_btnSearchPatientActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearchPatient;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSearchPatient;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblPatientList;
    private javax.swing.JTextField txtSearchPatient;
    // End of variables declaration//GEN-END:variables

    private void populateData() {
        try{
            var x = patientDirectory.getPatients();
            DefaultTableModel model = new DefaultTableModel(new Object[]{ "Patient Id", "Patient Name", "Contact Number", "Age","Height","Weight","Email", "Contact", "Address", "City", "Community"}, 0);
            if(x!=null && !x.isEmpty())
            {
                x.forEach(patient -> {
                
                String city = null;
                String community = null;              
                Map<String, String> communityMap = patient.getHouse().getCommunity().getCommunity();            
                for(Map.Entry m: communityMap.entrySet()){  
                    city = m.getKey().toString();
                    community = m.getValue().toString();
                }  
                    
                model.addRow(new Object[]
                {patient,patient.getName(), 
                    patient.getAge(),patient.getGender(),patient.getHeight(),patient.getWeight(), patient.getCellPhoneNumber(),patient.getEmailId(),patient.getHouse().getHouseNum()+" "+ patient.getHouse().getStreet(),
                    city,community});

            });
                
            tblPatientList.setModel(model);
            }
            else{
                tblPatientList.setModel(model);
            }
        }
        catch(Exception e){
            System.out.println("Exception occured in populating patients data");
        }
    }
    
     private void populateDataByPatientName() {
        try{
            var x = patientDirectory.getPatients();
            DefaultTableModel model = new DefaultTableModel(new Object[]{ "Patient Id", "Patient Name", "Contact Number", "Age","Height","Weight","Email", "Contact", "Address", "City", "Community"}, 0);
            if(x!=null && !x.isEmpty())
            {
                x.forEach(patient -> {
                String searchPatientName = txtSearchPatient.getText();
                if(patient.getName().toLowerCase().contains(searchPatientName.toLowerCase())){
                    
                    String city = null;
                    String community = null;              
                    Map<String, String> communityMap = patient.getHouse().getCommunity().getCommunity();            
                    for(Map.Entry m: communityMap.entrySet()){  
                        city = m.getKey().toString();
                        community = m.getValue().toString();
                    }  

                    model.addRow(new Object[]
                    {patient,patient.getName(), 
                        patient.getAge(),patient.getGender(),patient.getHeight(),patient.getWeight(), patient.getCellPhoneNumber(),patient.getEmailId(),patient.getHouse().getHouseNum()+" "+ patient.getHouse().getStreet(),
                        city,community});
                    
                }

            });
                
            tblPatientList.setModel(model);
            }
            else{
                tblPatientList.setModel(model);
            }
        }
        catch(Exception e){
            System.out.println("Exception occured in populating patients data");
        }
    }
}
