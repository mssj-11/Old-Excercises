/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoF;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import php.Herramienta;


/**
 *
 * @author Daniel
 */
public class BDMK extends javax.swing.JFrame {
Connection conexion = null;
    /**
     * Creates new form BDMK
     */
public void circuitos(String valor){
 DefaultTableModel modelo= new DefaultTableModel();
    modelo.addColumn("Nombre");
    modelo.addColumn("Num de vueltas");
    modelo.addColumn("Copa");
    
    Tcircuitos.setModel(modelo);
    String sql="";
    if(valor.equals(""))
    {
        sql="SELECT * FROM circuitos";
    }
    else{
        sql="SELECT * FROM circuitos WHERE CO_nombre ='"+valor+"'";
    }
 
    String []datos = new String [3];
        try {
             java.sql.Connection co = getconec();
            Statement st = co.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                modelo.addRow(datos);
            }
            Tcircuitos.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Herramienta.class.getName()).log(Level.SEVERE, null, ex);
        }}

public void Players (String valor){
 DefaultTableModel modelo= new DefaultTableModel();
    modelo.addColumn("Nombre");
    modelo.addColumn("NuJugador");
    modelo.addColumn("Edad");
    
    TAJU.setModel(modelo);
    String sql="";
    if(valor.equals(""))
    {
        sql="SELECT * FROM players";
    }
    else{
        sql="SELECT * FROM players WHERE PL_nombre ='"+valor+"'";
    }
 
    String []datos = new String [3];
        try {
             java.sql.Connection co = getconec();
            Statement st = co.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                modelo.addRow(datos);
            }
            TAJU.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Herramienta.class.getName()).log(Level.SEVERE, null, ex);
        }}

public void Equipo (String valor){
 DefaultTableModel modelo= new DefaultTableModel();
 modelo.addColumn("Num de equipo");
    modelo.addColumn("Piloto");
    modelo.addColumn("Copiloto");
    modelo.addColumn("Carro");
    
    TAEQ.setModel(modelo);
    String sql="";
    if(valor.equals(""))
    {
        sql="SELECT *FROM equipos";
    }
    else{
        sql="SELECT * FROM equipos WHERE P_nombre ='"+valor+"'";
    }
 
    String []datos = new String [4];
        try {
             java.sql.Connection co = getconec();
            Statement st = co.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                 datos[3]=rs.getString(4);
                modelo.addRow(datos);
            }
            TAEQ.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Herramienta.class.getName()).log(Level.SEVERE, null, ex);
        }}


public void piloto (String valor){
 DefaultTableModel modelo= new DefaultTableModel();
    modelo.addColumn("Nombre");
    modelo.addColumn("Sexo");
    modelo.addColumn("Poder");
    modelo.addColumn("Player");
    
    TAPE.setModel(modelo);
    String sql="";
    if(valor.equals(""))
    {
        sql="SELECT * FROM P_piloto";
    }
    else{
        sql="SELECT * FROM P_piloto WHERE P_nombre ='"+valor+"'";
    }
 
    String []datos = new String [4];
        try {
             java.sql.Connection co = getconec();
            Statement st = co.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                
                modelo.addRow(datos);
            }
           TAPE.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Herramienta.class.getName()).log(Level.SEVERE, null, ex);
        }}

public void copiloto (String valor){
 DefaultTableModel modelo= new DefaultTableModel();
    modelo.addColumn("Nombre");
    modelo.addColumn("Sexo");
    modelo.addColumn("Poder");
     modelo.addColumn("Player");
    
    TAPE.setModel(modelo);
    String sql="";
    if(valor.equals(""))
    {
        sql="SELECT * FROM p_copiloto";
    }
    else{
        sql="SELECT * FROM P_copiloto WHERE C_nombre ='"+valor+"'";
    }
 
    String []datos = new String [4];
        try {
             java.sql.Connection co = getconec();
            Statement st = co.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                
                modelo.addRow(datos);
            }
           TAPE.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Herramienta.class.getName()).log(Level.SEVERE, null, ex);
        }}



public void carros (String valor){
 DefaultTableModel modelo= new DefaultTableModel();
    modelo.addColumn("Nombre");
    modelo.addColumn("Propietario");
    modelo.addColumn("V");
    modelo.addColumn("A");
    modelo.addColumn("Tipo");
    
    TACA.setModel(modelo);
    String sql="";
    if(valor.equals(""))
    {
        sql="SELECT * FROM carros";
    }
    else{
        sql="SELECT * FROM carros WHERE CA_propietario ='"+valor+"'";
    }
 
    String []datos = new String [5];
        try {
             java.sql.Connection co = getconec();
            Statement st = co.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                 datos[4]=rs.getString(5);
                
                modelo.addRow(datos);
            }
           TACA.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Herramienta.class.getName()).log(Level.SEVERE, null, ex);
        }}



public void copa(String valor, String valor2 ) throws SQLException{
 DefaultTableModel modelo= new DefaultTableModel();
    modelo.addColumn("Nombre");
    modelo.addColumn("Num de circuitos");
    modelo.addColumn("Player");
    
    COPAS.setModel(modelo);
    String sql="";
    if(valor.equals(""))
    {
        sql="SELECT * FROM copa";
    }
    else{
      //  sql="UPDATE copa SET Player ="+valor+" WHERE CO_nombre = '"+valor2+"';";
    try {     
            Connection co = getconec();
           
            PreparedStatement ps = co.prepareStatement("UPDATE copa SET Player = ? WHERE CO_nombre = ?;");
          ps.setString(1, valor);
            ps.setString(2, valor2);
            int n = ps.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "datos Actualizados");
                

            } else {
                JOptionPane.showMessageDialog(null, "datos no ");
                
            }

    } catch (Exception ex) {      
        }
    }
 
    String []datos = new String [3];
        try {
             java.sql.Connection co = getconec();
            Statement st = co.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                modelo.addRow(datos);
            }
            COPAS.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Herramienta.class.getName()).log(Level.SEVERE, null, ex);
        }}

    public BDMK()  {
        initComponents();
        getconec();
        circuitos("");
        Equipo("");
        Players("");
        
        
      
    }
public Connection getconec(){
         Connection conexion = null;
   try {
            conexion= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto", "root", "daniel01");
            if(conexion != null){
                System.out.println("la conexion se ha establecido con exito"); return conexion;}
        } catch (Exception e) {
            System.out.println("error en la conexion"); 
        }
        return null;
   }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tcircuitos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        COPAS = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        NPlayer = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        SelectC = new javax.swing.JComboBox<>();
        Registro = new javax.swing.JToggleButton();
        BC = new javax.swing.JComboBox<>();
        Buscador = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TAPE = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        TACA = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TAJU = new javax.swing.JTable();
        SPERSONAJES = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        NomJugador = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        TAEQ = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        edad = new javax.swing.JTextField();
        pilo = new javax.swing.JTextField();
        copi = new javax.swing.JTextField();
        car = new javax.swing.JTextField();
        REGISju = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        carrr = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        verrrrr = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setBackground(new java.awt.Color(255, 102, 102));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 51));
        jLabel2.setText("MARIO KART DOUBLE DASH");

        Tcircuitos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(Tcircuitos);

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("CIRCUITOS");

        COPAS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(COPAS);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("COPAS");

        jLabel4.setText("AGREGA TU NUMERO");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 0));
        jLabel5.setText("INSCRIBETE A ALGFUNA COPA QUE QUIERAS PARTICIPAR ");

        jLabel6.setText("SELECCIONA LA COPA");

        SelectC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CHAMPIÑON", "FLOR", "ESTRELLA", "ESPECIAL" }));

        Registro.setText("REGISTRAR");
        Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SelectC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel5)))
                .addGap(62, 62, 62))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(Registro))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(26, 26, 26)
                .addComponent(Registro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(SelectC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        BC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Copa Champiñon", "Copa Flor", "Copa Estrella", "Copa Especial", "Todas" }));

        Buscador.setText("Buscar");
        Buscador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscadorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(198, 198, 198))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(BC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(Buscador)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Buscador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        TAPE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(TAPE);

        TACA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(TACA);

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("PERSONAJES");

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 102));
        jLabel8.setText("CARROS");

        TAJU.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(TAJU);

        SPERSONAJES.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PILOTO", "COPILOTO" }));
        SPERSONAJES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SPERSONAJESMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 102));
        jLabel9.setText("JUGADORES");

        NomJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomJugadorActionPerformed(evt);
            }
        });

        TAEQ.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(TAEQ);

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 102));
        jLabel10.setText("EQUIPOS");

        jLabel11.setText("NOMBRE DE JUGADOR");

        jLabel12.setText("EDAD");

        REGISju.setText("Registrar");
        REGISju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGISjuActionPerformed(evt);
            }
        });

        jLabel13.setText("PILOTO");

        jLabel14.setText("COPILOTO");

        jLabel15.setText("CARRO");

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Registrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        carrr.setText("lista");
        carrr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carrrActionPerformed(evt);
            }
        });

        jButton6.setText("ver");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        verrrrr.setText("ver");
        verrrrr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verrrrrActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(35, 35, 35)
                                            .addComponent(carrr, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(30, 30, 30)
                                            .addComponent(SPERSONAJES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(29, 29, 29)
                                            .addComponent(jButton6)))
                                    .addGap(77, 77, 77))
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(verrrrr))
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(car, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(pilo, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(copi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)))
                                        .addGap(71, 71, 71)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))))
                                .addGap(0, 46, Short.MAX_VALUE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(46, 46, 46)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(NomJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(REGISju, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7)
                    .addComponent(SPERSONAJES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6)
                    .addComponent(verrrrr))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(carrr))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(pilo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(NomJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(copi, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(car, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(REGISju, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscadorMouseClicked
        // TODO add your handling code here:
        if(BC.getSelectedItem() == "Copa Champiñon"){
            circuitos("Copa Champiñon");
        }
        if(BC.getSelectedItem() == "Copa Flor"){
            circuitos("Copa Flor");
        }
        if(BC.getSelectedItem() == "Copa Estrella"){
            circuitos("Copa Estrella");
        }
        if(BC.getSelectedItem() == "Copa Especial"){
            circuitos("Copa Especial");
        }
        if(BC.getSelectedItem() == "Todas"){
            circuitos("");
        }
        
        
    }//GEN-LAST:event_BuscadorMouseClicked

    private void RegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroActionPerformed
        // TODO add your handling code here:
          if(SelectC.getSelectedItem() == "CHAMPIÑON"){
              try {
                  copa(NPlayer.getText() ,"Copa Champiñon");
              } catch (SQLException ex) {
                  Logger.getLogger(BDMK.class.getName()).log(Level.SEVERE, null, ex);
              }
        }
        if(SelectC.getSelectedItem() == "FLOR"){
              try {
                  copa(NPlayer.getText() ,"Copa Flor");
              } catch (SQLException ex) {
                  Logger.getLogger(BDMK.class.getName()).log(Level.SEVERE, null, ex);
              }
        }
        if(SelectC.getSelectedItem() == "ESTRELLA"){
              try {
                  copa(NPlayer.getText() ,"Copa Estrella");
              } catch (SQLException ex) {
                  Logger.getLogger(BDMK.class.getName()).log(Level.SEVERE, null, ex);
              }
        }
        if(SelectC.getSelectedItem() == "ESPECIAL"){
              try {
                  copa(NPlayer.getText() ,"Copa Especial");
              } catch (SQLException ex) {
                  Logger.getLogger(BDMK.class.getName()).log(Level.SEVERE, null, ex);
              }
        }
    try {
        copa("","");
    } catch (SQLException ex) {
        Logger.getLogger(BDMK.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_RegistroActionPerformed

    private void NomJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomJugadorActionPerformed

    private void SPERSONAJESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SPERSONAJESMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_SPERSONAJESMouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        if(SPERSONAJES.getSelectedItem() == "PILOTO"){
            piloto("");
        }
        if(SPERSONAJES.getSelectedItem() == "COPILOTO"){
            copiloto("");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void carrrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carrrActionPerformed
        // TODO add your handling code here:
        carros("");
    }//GEN-LAST:event_carrrActionPerformed

    private void REGISjuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGISjuActionPerformed
        // TODO add your handling code here:
        Players("");
        if(NomJugador.getText() != ""){
        try {     
            Connection co = getconec();
           
            PreparedStatement ps = co.prepareStatement("INSERT INTO Players (PL_nombre,	PL_edad )VALUES(?,?);");
            ps.setString(1, NomJugador.getText());
            ps.setString(2, edad.getText());
           
            int n = ps.executeUpdate();
            if (n > 0) {
            } else {   
            }
        } catch (Exception ex) {      
        }
                        } 
        Players("");
        

        
        
        
    }//GEN-LAST:event_REGISjuActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         Equipo("");
         if(car.getText() != ""){
        try {     
            Connection co = getconec();
           
            PreparedStatement ps = co.prepareStatement("INSERT INTO equipos (P_nombre,C_nombre,CA_nombre )VALUES(?,?,?);");
            ps.setString(1, pilo.getText());
            ps.setString(2, copi.getText());
            ps.setString(3, car.getText());
           
            int n = ps.executeUpdate();
            if (n > 0) {
            } else {   
            }
        } catch (Exception ex) {      
        }
                        }
         Equipo("");
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void verrrrrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verrrrrActionPerformed
        // TODO add your handling code here:
        Players("");
    }//GEN-LAST:event_verrrrrActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Equipo(pilo.getText());
        Players(NomJugador.getText());
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(BDMK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BDMK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BDMK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BDMK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BDMK().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BC;
    private javax.swing.JButton Buscador;
    private javax.swing.JTable COPAS;
    private javax.swing.JTextField NPlayer;
    private javax.swing.JTextField NomJugador;
    private javax.swing.JButton REGISju;
    private javax.swing.JToggleButton Registro;
    private javax.swing.JComboBox<String> SPERSONAJES;
    private javax.swing.JComboBox<String> SelectC;
    private javax.swing.JTable TACA;
    private javax.swing.JTable TAEQ;
    private javax.swing.JTable TAJU;
    private javax.swing.JTable TAPE;
    private javax.swing.JTable Tcircuitos;
    private javax.swing.JTextField car;
    private javax.swing.JButton carrr;
    private javax.swing.JTextField copi;
    private javax.swing.JTextField edad;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextField pilo;
    private javax.swing.JButton verrrrr;
    // End of variables declaration//GEN-END:variables
}
