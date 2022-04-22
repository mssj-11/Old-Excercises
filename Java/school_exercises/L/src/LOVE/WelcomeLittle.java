
import java.awt.Image;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ivan Luis Jimenez
 */
public class WelcomeLittle extends javax.swing.JFrame {

    /**
     * Creates new form WelcomeLittle
     */
    JLabel Imagenes = new JLabel();
    String cadena[] = new String[27];

    public WelcomeLittle() throws UnknownHostException {
        initComponents();
        setSize(335, 450);
        this.setLocationRelativeTo(null);
        Imagenes.setBounds(250, 105, 440, 255);
        this.add(Imagenes);
        
        setTitle("Bienvenid@ " + nombre());
        String contra = JOptionPane.showInputDialog(null, "Escriba la contraseña", "Bienvenid@ " + nombre(), 2);

        aplicar_gif();
        Saludo.setText(obtener_momento());
        llenar_arreglo();
        mostrar_texto(contra);

        cambiar_fsor("/imagenes2/" + obt_numfoto() + ".jpg");

    }

    public String nombre() throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        return localHost.getHostName().toString();
    }

    public int obtener_numero() {
        Random rnd = null;

        rnd = new Random();
        int nrand = rnd.nextInt(19) + 1;

        return nrand;
    }

    public int generar_num() {
        Random rnd = new Random();
        String men;
        Scanner lo = new Scanner(System.in);

        return (int) (rnd.nextDouble() * 9 + 0);
    }

    public int generar_num2() {
        Random rnd = new Random();
        String men;
        Scanner lo = new Scanner(System.in);

        return (int) (rnd.nextDouble() * 27 + 0);
    }

    public int obt_numfoto() {
        Random rnd = null;

        rnd = new Random();
        int nrand = rnd.nextInt(11) + 1;

        return nrand;
    }

    public void cambiar_fondo(String rut) {
        String path2 = rut;

        URL url2 = this.getClass().getResource(path2);
        ImageIcon imagen = new ImageIcon(url2);
        Image imagenn = imagen.getImage();

        Icon icono = new ImageIcon(imagenn.getScaledInstance(Fondo.getWidth(), Fondo.getHeight(), Image.SCALE_DEFAULT));
        Fondo.setIcon(icono);
        repaint();
        Fondo.setVisible(true);

        repaint();
    }

    public void cambiar_fsor(String rut) {
        String path2 = rut;

        URL url2 = this.getClass().getResource(path2);
        ImageIcon imagen = new ImageIcon(url2);
        Image imagenn = imagen.getImage();

        Icon icono = new ImageIcon(imagenn.getScaledInstance(Foto.getWidth(), Foto.getHeight(), Image.SCALE_DEFAULT));
        Foto.setIcon(icono);
        repaint();

    }

    public void llenar_arreglo() {
        cadena[0] = "TEAMO, sin pensarlo, sin medidas, sin cordura, sin preguntas, sin lógica, sin cuidado. Así te quiero, así tan simple como lo escribo. Tan simple como lo siento...";
        cadena[1] = "Me dejas sin palabras, no te basta con eso y me robas el aliento.";
        cadena[2] = "La sonrisa es mía, pero el motivo eres tú...";
        cadena[3] = "De tanto que sueño contigo, no sé si te tengo en mi mente, en mi vida o en mi corazón...";
        cadena[4] = "Quédate en silencio. Quédate conmigo. Aunque te vayas...";
        cadena[5] = "██ I like you baby, I love you so much, you are my angel in the night, I want future with you... do not forget little girl.";
        cadena[6] = "Mostrarte celos es confesarte que me importas de verdad.";
        cadena[7] = "No me interesa saber si en el mundo existe alguien más bella que tú, me basta con saber que tengo tu amor y para mí siempre serás la más hermosa de todo el planeta";
        cadena[8] = "Me enamoré de ti …, eres la única que entró en mi corazón ,pensamientos y contigo estoy dispuesto a pasar el resto de mis días…";
        cadena[9] = "No es necesario que tenga que explicar porque te amo, me bastas solo tú para que trasmitas ese sentimiento que me llena de alegría porque soy correspondido en mis sentimientos";
        cadena[10] = "TE AMO así porque una vez me viste temblar y en vez de taparme, te desnudaste conmigo.";
        cadena[11] = "Con una dulce mirada y unas tiernas palabras puedes hacer que el día más difícil de mi vida se convierta en el más maravilloso. Te amo mucho mi linda monita.";
        cadena[12] = "(¯`v´¯) No olvides que  tú ocupas un lugar muy especial   en mi Pum Pum.  (¸.·´ (¸.·´ (¸.·¨¯`♥ T.A.M.O Mi Monis";
        cadena[13] = "Anoche te soñe y amanecí mojado jajajaja. Ya pues no te rias te vas a empachar";
        cadena[14] = "TE AMO demaciado mi Monita Hermosa, mi sandillita, mi pasita.  aaaaa y recuerda que este hombre te ama";
        cadena[15] = "Te iba a dar mi corazón, pero ya me lo robaste. Bailo doña berta :-)";
        cadena[16] = "Sólo con ver tu nombre me haces suspirar, imagínate cuando te veo, me aceleras... el... corazón    ;-) jejeje";
        cadena[17] = "En mi mundo sólo existimos tú, yo y el gran amor que nos une, ammm y también extraterrestres";
        cadena[18] = "En las noches tengo mucho miedo de soñar contigo, porque puedo amanecer tirado en el piso jajajaja";
        cadena[19] = "Tengo celos, me enojo, me preocupo y todo es sólo porque me importas. Obi...";
        cadena[20] = "Cuidado cuando me vuelves a besar bien picosito, podría terminar encima de ti. Obi...";
        cadena[21] = "Tu amor me inspira, tu ternura me conmueve y tus besos me enloquecen. ;-)";
        cadena[22] = "Te extraño mucho, quiero verte, quiero besarte así bien rico, quiero abrazarte bien fuerte y muchas otras cositas...";
        cadena[23] = "La lógica de este programa fue inspirado y pensando en ti. TE AMO MI MONITA CHIKITA Y GRANDOTA jijijiji";
        cadena[24] = "Mi ordenador ya no ordena, lo haz desiquilibrado, mi chikita se puso celosa";
        cadena[25] = "Quisiera ser cátete venoso central para llegar a tu corazon";
        cadena[26] = "Estas como para hacerte el café por las mañanas, caricias por la tarde y el amor por las noches. Obi...";
        
    }

    public void mostrar_texto(String cont) {
        
        if (cont.equals("chk*")) {
            M_texto.setText(cadena[generar_num2()]);
            
        } else {
            M_texto.setText(cadena[generar_num()]);
            
        }
    }

    public void aplicar_gif() {
        String path2 = "/imagenes/" + obtener_numero() + ".gif";

        URL url2 = this.getClass().getResource(path2);
        ImageIcon imagen = new ImageIcon(url2);
        Image imagenn = imagen.getImage();

        Icon icono = new ImageIcon(imagenn.getScaledInstance(bar.getWidth(), bar.getHeight(), Image.SCALE_DEFAULT));
        bar.setIcon(icono);
        repaint();
        Imagenes.setVisible(true);

        repaint();

    }

    public String obtener_momento() {
        String mensaje = "";
        Calendar calendario = new GregorianCalendar();
        int hora = calendario.get(Calendar.HOUR_OF_DAY);

        if ((hora >= 24) && (hora < 6)) {
            mensaje = "Ya duerme Amor, ya es noche";
            cambiar_fondo("/imagenes/fondo5.jpg");
        }
        if ((hora >= 6) && (hora < 12)) {
            mensaje = "Buenos días Amor";
            cambiar_fondo("/imagenes/fondo3.jpg");
        }
        if ((hora >= 12) && (hora < 19)) {
            mensaje = "Buenas tardes Amor";
            cambiar_fondo("/imagenes/fondo1.jpg");
        }
        if ((hora >= 19) && (hora < 24)) {
            mensaje = "Buenas noches Amor";
            cambiar_fondo("/imagenes/fondo1.jpg");
        }
        return mensaje;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Saludo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Foto = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        M_texto = new javax.swing.JTextArea();
        bar = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Saludo.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        getContentPane().add(Saludo);
        Saludo.setBounds(10, 100, 210, 16);

        jLabel1.setFont(new java.awt.Font("Eras Medium ITC", 1, 10)); // NOI18N
        jLabel1.setText("Created by Ivanovich CopyRight - All Rights Reserved");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 400, 300, 12);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FotoMonis:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB", 1, 12))); // NOI18N
        jPanel1.setLayout(null);

        Foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes2/1.jpg"))); // NOI18N
        jPanel1.add(Foto);
        Foto.setBounds(10, 20, 290, 150);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 220, 310, 180);

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Quiero decirte que:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB", 1, 12))); // NOI18N

        M_texto.setColumns(20);
        M_texto.setLineWrap(true);
        M_texto.setRows(4);
        M_texto.setTabSize(5);
        jScrollPane2.setViewportView(M_texto);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 120, 310, 100);

        bar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/13.gif"))); // NOI18N
        getContentPane().add(bar);
        bar.setBounds(10, 10, 310, 70);

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo2.jpg"))); // NOI18N
        getContentPane().add(Fondo);
        Fondo.setBounds(0, 0, 330, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(WelcomeLittle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomeLittle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomeLittle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomeLittle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new WelcomeLittle().setVisible(true);
                } catch (UnknownHostException ex) {
                    Logger.getLogger(WelcomeLittle.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Foto;
    private javax.swing.JTextArea M_texto;
    private javax.swing.JLabel Saludo;
    private javax.swing.JLabel bar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
