package agendaelectronica.igu;

public class Principal extends javax.swing.JFrame {
	String dni [] = new String [20];
	String nom [] = new String [20];
	String ape [] = new String [20];
	String dir [] = new String [20];
	String tel [] = new String [20];
	String fn [] = new String [20];

	public Principal() {
		initComponents();
	}
	
	@SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jScrollPane2 = new javax.swing.JScrollPane();
      jTextArea2 = new javax.swing.JTextArea();
      jScrollPane1 = new javax.swing.JScrollPane();
      jTextArea1 = new javax.swing.JTextArea();
      jTextField1 = new javax.swing.JTextField();
      jLabel2 = new javax.swing.JLabel();
      jLabel3 = new javax.swing.JLabel();
      jLabel4 = new javax.swing.JLabel();
      jTextField3 = new javax.swing.JTextField();
      jTextField2 = new javax.swing.JTextField();
      jPanel2 = new javax.swing.JPanel();
      jScrollBar1 = new javax.swing.JScrollBar();
      jPanel1 = new javax.swing.JPanel();
      jLabel1 = new javax.swing.JLabel();
      jSeparator1 = new javax.swing.JSeparator();
      jPanel3 = new javax.swing.JPanel();
      jLabel5 = new javax.swing.JLabel();
      jLabel6 = new javax.swing.JLabel();
      jLabel7 = new javax.swing.JLabel();
      jLabel8 = new javax.swing.JLabel();
      jLabel9 = new javax.swing.JLabel();
      jLabel10 = new javax.swing.JLabel();
      txtNom = new javax.swing.JTextField();
      txtDni = new javax.swing.JTextField();
      txtDir = new javax.swing.JTextField();
      txtTel = new javax.swing.JTextField();
      txtFna = new javax.swing.JTextField();
      txtApe = new javax.swing.JTextField();
      jSeparator2 = new javax.swing.JSeparator();
      btnAg = new javax.swing.JButton();
      btnAtr = new javax.swing.JButton();
      btnAde = new javax.swing.JButton();
      jLabel11 = new javax.swing.JLabel();
      txtInd = new javax.swing.JTextField();

      jTextArea2.setColumns(20);
      jTextArea2.setRows(5);
      jScrollPane2.setViewportView(jTextArea2);

      jTextArea1.setColumns(20);
      jTextArea1.setRows(5);
      jScrollPane1.setViewportView(jTextArea1);

      jLabel2.setText("DNI:");

      jLabel3.setText("NOMBRE:");

      jLabel4.setText("APELLIDO:");

      javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
      jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 493, Short.MAX_VALUE)
      );
      jPanel2Layout.setVerticalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 185, Short.MAX_VALUE)
      );

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

      jPanel1.setBackground(new java.awt.Color(255, 204, 255));

      jLabel1.setBackground(new java.awt.Color(255, 0, 204));
      jLabel1.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
      jLabel1.setForeground(new java.awt.Color(102, 0, 204));
      jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      jLabel1.setText("Agenda Electrónica");

      jPanel3.setBackground(new java.awt.Color(255, 204, 255));

      jLabel5.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
      jLabel5.setForeground(new java.awt.Color(204, 51, 255));
      jLabel5.setText("DNI:");

      jLabel6.setBackground(new java.awt.Color(255, 51, 153));
      jLabel6.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
      jLabel6.setForeground(new java.awt.Color(204, 51, 255));
      jLabel6.setText("NOMBRE:");

      jLabel7.setBackground(new java.awt.Color(255, 153, 204));
      jLabel7.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
      jLabel7.setForeground(new java.awt.Color(204, 51, 255));
      jLabel7.setText("APELLIDO:");

      jLabel8.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
      jLabel8.setForeground(new java.awt.Color(204, 51, 255));
      jLabel8.setText("DIRECCION: ");

      jLabel9.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
      jLabel9.setForeground(new java.awt.Color(204, 51, 255));
      jLabel9.setText("TELEFONO: ");

      jLabel10.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
      jLabel10.setForeground(new java.awt.Color(204, 51, 255));
      jLabel10.setText("F. NAC:");

      txtNom.setBackground(new java.awt.Color(255, 153, 255));
      txtNom.setFont(new java.awt.Font("Gabriola", 2, 18)); // NOI18N
      txtNom.setForeground(new java.awt.Color(0, 0, 0));

      txtDni.setBackground(new java.awt.Color(255, 153, 255));
      txtDni.setFont(new java.awt.Font("Gabriola", 2, 18)); // NOI18N
      txtDni.setForeground(new java.awt.Color(0, 0, 0));

      txtDir.setBackground(new java.awt.Color(255, 153, 255));
      txtDir.setFont(new java.awt.Font("Gabriola", 2, 18)); // NOI18N
      txtDir.setForeground(new java.awt.Color(0, 0, 0));

      txtTel.setBackground(new java.awt.Color(255, 153, 255));
      txtTel.setFont(new java.awt.Font("Gabriola", 2, 18)); // NOI18N
      txtTel.setForeground(new java.awt.Color(0, 0, 0));

      txtFna.setBackground(new java.awt.Color(255, 153, 255));
      txtFna.setFont(new java.awt.Font("Gabriola", 2, 18)); // NOI18N
      txtFna.setForeground(new java.awt.Color(0, 0, 0));

      txtApe.setBackground(new java.awt.Color(255, 153, 255));
      txtApe.setFont(new java.awt.Font("Gabriola", 2, 18)); // NOI18N
      txtApe.setForeground(new java.awt.Color(0, 0, 0));

      btnAg.setBackground(new java.awt.Color(204, 51, 255));
      btnAg.setFont(new java.awt.Font("Gabriola", 1, 14)); // NOI18N
      btnAg.setForeground(new java.awt.Color(0, 0, 0));
      btnAg.setText("AGENDAR");
      btnAg.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnAgActionPerformed(evt);
         }
      });

      btnAtr.setBackground(new java.awt.Color(204, 51, 255));
      btnAtr.setForeground(new java.awt.Color(0, 0, 0));
      btnAtr.setText("<<");
      btnAtr.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnAtrActionPerformed(evt);
         }
      });

      btnAde.setBackground(new java.awt.Color(204, 51, 255));
      btnAde.setForeground(new java.awt.Color(0, 0, 0));
      btnAde.setText(">>");
      btnAde.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnAdeActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
      jPanel3.setLayout(jPanel3Layout);
      jPanel3Layout.setHorizontalGroup(
         jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
               .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(txtApe, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                  .addComponent(jLabel10)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(txtFna, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                  .addComponent(jLabel8)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(txtDir, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                  .addComponent(jLabel9)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(106, 106, 106))
         .addGroup(jPanel3Layout.createSequentialGroup()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel3Layout.createSequentialGroup()
                  .addGap(196, 196, 196)
                  .addComponent(btnAtr)
                  .addGap(48, 48, 48)
                  .addComponent(btnAg)
                  .addGap(69, 69, 69)
                  .addComponent(btnAde))
               .addGroup(jPanel3Layout.createSequentialGroup()
                  .addContainerGap()
                  .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      jPanel3Layout.setVerticalGroup(
         jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel3Layout.createSequentialGroup()
            .addGap(15, 15, 15)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel8)
               .addComponent(txtDir, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(6, 6, 6)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jLabel9)
                  .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jLabel10)
                  .addComponent(txtFna, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(txtApe, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(18, 18, 18)
            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(btnAg, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(btnAtr)
               .addComponent(btnAde))
            .addContainerGap())
      );

      jLabel11.setBackground(new java.awt.Color(255, 102, 255));
      jLabel11.setFont(new java.awt.Font("Gabriola", 2, 18)); // NOI18N
      jLabel11.setForeground(new java.awt.Color(0, 0, 0));
      jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      jLabel11.setText("INDICE:");
      jLabel11.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 51, 255)));

      txtInd.setEditable(false);
      txtInd.setBackground(new java.awt.Color(255, 0, 255));
      txtInd.setFont(new java.awt.Font("Gabriola", 2, 36)); // NOI18N
      txtInd.setForeground(new java.awt.Color(0, 0, 0));
      txtInd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
      txtInd.setText("0");

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addContainerGap()
                  .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGap(184, 184, 184)
                  .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGap(240, 240, 240)
                  .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(txtInd, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(4, 4, 4)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
               .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(txtInd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(22, 22, 22))
      );

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void btnAdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdeActionPerformed
		int ind = 0;
		String indice = txtInd.getText();// trae el texto guardado en txtInd y lo guarda en indice
//		if (ind <9) {para que llegue a nueve}
		ind = Integer.parseInt(indice);//transforma el String en un entero
		ind = ind + 1;//
		indice = String.valueOf(ind);// se pasa devuelta a string
		
		txtInd.setText(indice);//incrementa el indice 
		
		txtDni.setText(dni[ind]);//se vuelve o cambia de datos 
		 txtNom.setText(nom[ind]);
		 txtApe.setText(ape[ ind]);
		 txtDir.setText(dir [ind]);
		txtTel.setText(tel [ind]);
		 txtFna.setText(fn[ind]);
   }//GEN-LAST:event_btnAdeActionPerformed

   private void btnAtrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrActionPerformed
		int ind = 0;
		String indice = txtInd.getText();
		ind = Integer.parseInt(indice);

		if (ind > 0) {  //si es mayor a 0 va a ir restando de 1 en 1 hasta llegar 0
			ind = ind - 1;
			indice = String.valueOf(ind);
			txtInd.setText(indice);
			
			
		txtDni.setText(dni[ind]);//se vuelve o cambia de datos 
		 txtNom.setText(nom[ind]);
		 txtApe.setText(ape[ ind]);
		 txtDir.setText(dir [ind]);
		txtTel.setText(tel [ind]);
		 txtFna.setText(fn[ind]);
			
		}
   }//GEN-LAST:event_btnAtrActionPerformed

   private void btnAgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgActionPerformed
		int ind = 0;
		String indice = txtInd.getText();
		ind = Integer.parseInt(indice);
		dni[ind] = txtDni.getText();
		nom[ind] = txtNom.getText();
		ape[ ind] = txtApe.getText();
		dir [ind] = txtDir.getText();
		tel [ind] = txtTel.getText();
		fn[ind] = txtFna.getText();
		
		
		
		
		
   }//GEN-LAST:event_btnAgActionPerformed


   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton btnAde;
   private javax.swing.JButton btnAg;
   private javax.swing.JButton btnAtr;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel10;
   private javax.swing.JLabel jLabel11;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JLabel jLabel6;
   private javax.swing.JLabel jLabel7;
   private javax.swing.JLabel jLabel8;
   private javax.swing.JLabel jLabel9;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JPanel jPanel2;
   private javax.swing.JPanel jPanel3;
   private javax.swing.JScrollBar jScrollBar1;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JScrollPane jScrollPane2;
   private javax.swing.JSeparator jSeparator1;
   private javax.swing.JSeparator jSeparator2;
   private javax.swing.JTextArea jTextArea1;
   private javax.swing.JTextArea jTextArea2;
   private javax.swing.JTextField jTextField1;
   private javax.swing.JTextField jTextField2;
   private javax.swing.JTextField jTextField3;
   private javax.swing.JTextField txtApe;
   private javax.swing.JTextField txtDir;
   private javax.swing.JTextField txtDni;
   private javax.swing.JTextField txtFna;
   private javax.swing.JTextField txtInd;
   private javax.swing.JTextField txtNom;
   private javax.swing.JTextField txtTel;
   // End of variables declaration//GEN-END:variables
}
