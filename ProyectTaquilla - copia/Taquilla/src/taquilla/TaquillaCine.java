package taquilla;

/**
 *
 * @author Jannet
 */


    import java.awt.FlowLayout;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import javax.swing.JComboBox;
    import javax.swing.JFrame;
    import javax.swing.JTextField;
    import javax.swing.WindowConstants;
    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.*;
    import java.awt.Image;
    import javax.swing.ImageIcon;
    import java.util.Calendar; 
    import java.util.GregorianCalendar;

public class TaquillaCine extends JFrame implements ActionListener, ItemListener{
        JButton aceptar,imprimir,salir,cambio,limpiar,login2,cerrar;
        JLabel bienvenido,cartelera,horarios,sala,asiento,num2,fila1,num1,fila2,fila3,fila4,fila5,boleto1,boleto2,
                pago,cobro,previo,horap,recibo,A,N,E,TD,DH,BOL,Usuario,Clave,us;
        JTextField total,pel,sala1,numA,numN,numE,numD,numH,numeroN,filaA,filaN,filaE,filaD,filaH,filaA2,filaN2,filaE2,filaD2,filaH2,horaprev,
                 montoA,montoN,montoE,montoD,montoH,precioA,precioN,precioE,precioD,precioH,Tsin,Des,TDes,iva,cambio2,efectivo2,usuario,clave;
        JComboBox pelicula,horario;
        JTextArea ticket;
        JPanel cartel;
        JCheckBox adulto,niño,estudiante,digital,despues,Descuento,normal,A2x1,Jsg;
        ImageIcon spider,sing,encanto,gucci,legado,matrix,login;
       
    public static void main (String[] args){
       TaquillaCine marco2 = new TaquillaCine();
        marco2.setSize(400,200);
        marco2.crearGUI2();
        marco2.setVisible(true);}
    private String s2;
    private String canH2;
    private String mon6;
    private String canD2;
    private String mon5;
    private String canE2;
    private String mon4;
   
    public void crearGUI2(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana2 = getContentPane();
        ventana2.setLayout(null);
        this.setTitle("Iniciar Sesion");
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo2.png"));
        setIconImage(icon);
        setVisible(true);
        ventana2.setBackground(new Color(231, 240, 242));
               
        Usuario =new JLabel("Usuario");
        ventana2.add(Usuario);
        Usuario.setBounds(80, 30, 80, 20);
        Usuario.setFont(new java.awt.Font(" ", 0, 16));
        
        usuario=new JTextField();
        ventana2.add(usuario);
        usuario.setBounds(150, 30, 150, 20);
        
        Clave =new JLabel("Clave");
        ventana2.add(Clave);
        Clave.setBounds(90, 60, 80, 20);
        Clave.setFont(new java.awt.Font(" ", 0, 16));
        
        clave=new JTextField();
        ventana2.add(clave);
        clave.setBounds(150, 60, 150, 20);
        
        login2=new JButton("Login");
        ventana2.add(login2);
        login2.setBounds(150,90,100,30);
        login2.addActionListener(this);}
    
    public void crearGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(null);
        this.setTitle("CINEUTC");
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png"));
        setIconImage(icon);
        setVisible(true);
        ventana.setBackground(new Color(231, 240, 242));
           
        bienvenido = new JLabel("Bienvenido");
        ventana.add(bienvenido);
        bienvenido.setFont(new java.awt.Font("BankGothic Lt BT", 0, 36)); 
        bienvenido.setBounds(472, 0, 350, 50);
        
        cartelera = new JLabel("Peliculas");
        ventana.add(cartelera);
        cartelera.setBounds(10, 100, 100, 20);
        
                pelicula  = new JComboBox();
		pelicula.addItem("Spider-Man Sin Camino A Casa");
		pelicula.addItem("Sing 2:Ven Y Canta De Nuevo");
                pelicula.addItem("Encanto");
                pelicula.addItem("La Casa Gucci");
		pelicula.addItem("Ghostbusters:El Legado");
                pelicula.addItem("Matrix Resurecciones");
                pelicula.addActionListener(this);
                ventana.add(pelicula);
                pelicula.setBounds(65, 100, 140, 20);
                
               JLabel horarios = new JLabel("Horario");
               ventana.add(horarios);
               horarios.setBounds(230, 100, 100, 20);
                               
                horario  = new JComboBox();
        	horario.addItem("1:30 pm");
		horario.addItem("4:00 pm.");
		horario.addItem("6:00 pm.");
                horario.addItem("9:15 pm.");
                ventana.add(horario);
                horario.setBounds(280, 100,80, 20);
                horario.addActionListener(this);
        
        cartel=new JPanel();
        cartel.setPreferredSize(new Dimension(250,400));
        cartel.setBackground(Color.white);
        ventana.add(cartel);
        cartel.setBounds(380, 90, 330,450);
        spider=new ImageIcon("spider.jpg");
        sing=new ImageIcon("sing.jpg");
        encanto=new ImageIcon("encanto.jpg");
        gucci=new ImageIcon("gucci.jpg");
        legado=new ImageIcon("legado.jpg");
        matrix=new ImageIcon("matrix.jpg");
               
        recibo = new JLabel("Ticket");
        ventana.add(recibo);
        recibo.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); 
        recibo.setBounds(1065, 685, 100, 50);
        
        ticket = new JTextArea();
        JScrollPane panelDespl= new JScrollPane(ticket);
        panelDespl.setBounds(750, 90, 400, 600);
        add(panelDespl);
               
        JLabel Pr =new JLabel("Precio");
        ventana.add(Pr);
        Pr.setBounds(20, 150, 100, 20);
        
        A =new JLabel("$42");
        ventana.add(A);
        A.setBounds(20, 180, 100, 20);
        
        N =new JLabel("$42");
        ventana.add(N);
        N.setBounds(20, 210, 100, 20);

        E=new JLabel("$45");
        ventana.add(E);
        E.setBounds(20,230,100,20);
        
        TD=new JLabel("$80");
        ventana.add(TD);
        TD.setBounds(20,250,100,20);
        
        DH=new JLabel("$65");
        ventana.add(DH);
        DH.setBounds(20,270,100,20);
        
        boleto1 =new JLabel("Boleto");
        ventana.add(boleto1);
        boleto1.setBounds(80, 150, 100, 20);
       
        adulto = new JCheckBox("Adulto");
        ventana.add(adulto);
        adulto.setBounds(80, 180, 63, 20);
        adulto.addItemListener(this);
                
        niño = new JCheckBox("Niño");
        ventana.add(niño);
        niño.setBounds(80, 210, 60, 20);
        niño.addItemListener(this);
                 
        estudiante = new JCheckBox("Estudiante");
        ventana.add(estudiante);
        estudiante.setBounds(80, 230, 60, 20);
        estudiante.addItemListener(this);
        
        digital = new JCheckBox("Sala Digital 3D");
        ventana.add(digital);
        digital.setBounds(80, 260, 60, 20);
        digital.addItemListener(this);
        
        despues = new JCheckBox("Aumento de precio horario pasado de las 6 pm");
        ventana.add(despues);
        despues.setBounds(80, 280, 60, 20);
        despues.addItemListener(this);
        
        JLabel Cantidad =new JLabel("Cantidad");
        ventana.add(Cantidad);
        Cantidad.setBounds(175, 150, 100, 20);
        
        numA =new JTextField();
        ventana.add(numA);
        numA.setText("0");
        numA.setBounds(175, 180, 50, 20);
        
        numN =new JTextField(5);
        ventana.add(numN);
        numN.setText("0");
        numN.setBounds(175, 210, 50, 20);
        
        numE =new JTextField();
        ventana.add(numE);
        numE.setText("0");
        numE.setBounds(175, 230, 50, 20);
        
        numD =new JTextField();
        ventana.add(numD);
        numD.setText("0");
        numD.setBounds(175, 250, 50, 20);
        
        numH =new JTextField();
        ventana.add(numH);
        numH.setText("0");
        numH.setBounds(175, 270, 50, 20);
        
        A2x1 = new JCheckBox("2x1");
        ventana.add(A2x1);
        A2x1.setBounds(80, 240, 60, 20);
        A2x1.addItemListener(this);
        
        asiento =new JLabel("Asiento");
        ventana.add(asiento);
        asiento.setBounds(270, 150, 100, 20);
        
        fila1 =new JLabel("Fila");
        ventana.add(fila1);
        fila1.setBounds(270, 180, 50, 20);
        
        fila2 =new JLabel ("Fila");
        ventana.add(fila2);
        fila2.setBounds(270, 210, 50, 20 );
        
        fila3 =new JLabel ("Fila");
        ventana.add(fila3);
        fila3.setBounds(270, 210, 50, 20 );
        
        fila4 =new JLabel ("Fila");
        ventana.add(fila4);
        fila4.setBounds(270, 210, 50, 20 );
        
        fila5 =new JLabel ("Fila");
        ventana.add(fila5);
        fila5.setBounds(270, 210, 50, 20 );
        
        filaA =new JTextField();
        ventana.add(filaA);
        filaA.setBounds(293, 180, 20, 20);
        
        filaN =new JTextField(5);
        ventana.add(filaN);
        filaN.setBounds(293, 210, 20, 20);
        
        filaE =new JTextField(5);
        ventana.add(filaE);
        filaE.setBounds(293, 210, 20, 20);
        
        filaD =new JTextField(5);
        ventana.add(filaD);
        filaD.setBounds(293, 210, 20, 20);
        
        filaH =new JTextField(5);
        ventana.add(filaH);
        filaH.setBounds(293, 210, 20, 20);
        
        pago =new JLabel ("Forma de Pago");
        ventana.add(pago);
        pago.setBounds(10, 320, 100, 20 );
        
        normal = new JCheckBox("Normal");
        ventana.add(normal);
        normal.setBounds(100, 320, 70, 20 );
        normal.addItemListener(this);
        
        Descuento = new JCheckBox("Descuento con Tarjeta");
        ventana.add(Descuento);
        Descuento.setBounds(170, 320, 160, 20 );
        Descuento.addItemListener(this);
        
        cobro =new JLabel ("Realizar Operacion");
        ventana.add(cobro);
        cobro.setBounds(120, 280, 130, 20 );
        
        aceptar = new JButton("Aceptar");
        ventana.add(aceptar);
        aceptar.setBounds(235, 280, 87, 20 );
        aceptar.addActionListener(this);
        
        previo = new JLabel("Previo");
        ventana.add(previo);
        previo.setBounds(10, 390, 100, 20);
        
        JLabel pel2 = new JLabel("Pelicula");
        ventana.add(pel2);
        pel2.setBounds(10, 430, 100, 20);
                
        pel = new JTextField(12);
        ventana.add(pel);
        pel.setBounds(60, 430, 120, 20);
                
        sala = new JLabel("Sala");
        ventana.add(sala);
        sala.setBounds(185, 430, 100, 20);
        
        sala1 = new JTextField();
        ventana.add(sala1);
        sala1.setBounds(215, 430, 23, 20);
        
        horap = new JLabel("Hora");
        ventana.add(horap);
        horap.setBounds(245, 430, 100, 20);
        
        horaprev = new JTextField(12);
        ventana.add(horaprev);
        horaprev.setBounds(275, 430, 70, 20);
        
        BOL =new JLabel("Boletos:");
        ventana.add(BOL);
        BOL.setBounds(10, 470, 100, 20);
        
        JLabel ad=new JLabel("Adulto");
        ventana.add(ad);
        ad.setBounds(70, 470, 100, 20);
         
        montoA = new JTextField();
        ventana.add(montoA);
        montoA.setBounds(110, 470, 30, 20);
        
        JLabel cosA=new JLabel("Monto $");
        ventana.add(cosA);
        cosA.setBounds(150,470,50,20);
        
        precioA=new JTextField();
        ventana.add(precioA);
        precioA.setBounds(197,470,60,20);
        
        JLabel FA=new JLabel("Fila");
        ventana.add(FA);
        FA.setBounds(270,470,70,20);
        
        filaA2=new JTextField();
        ventana.add(filaA2);
        filaA2.setBounds(293,470,50,20);
        
        JLabel an=new JLabel("Niño");
        ventana.add(an);
        an.setBounds(70, 510, 100, 20);
         
        montoN = new JTextField(12);
        ventana.add(montoN);
        montoN.setBounds(110, 510, 30, 20);
        
        JLabel cosN=new JLabel("Monto $");
        ventana.add(cosN);
        cosN.setBounds(150,510,50,20);
        
        precioN=new JTextField();
        ventana.add(precioN);
        precioN.setBounds(197,510,60,20);
        
        JLabel FN=new JLabel("Fila");
        ventana.add(FN);
        FN.setBounds(270,510,70,20);
        
        filaN2=new JTextField();
        ventana.add(filaN2);
        filaN2.setBounds(293,510,50,20);
        
        JLabel es=new JLabel("Estudiante");
        ventana.add(es);
        es.setBounds(70, 470, 100, 20);
         
        montoE = new JTextField();
        ventana.add(montoE);
        montoE.setBounds(110, 470, 30, 20);
        
        JLabel cosE=new JLabel("Monto $");
        ventana.add(cosE);
        cosE.setBounds(150,470,50,20);
        
        precioE=new JTextField();
        ventana.add(precioE);
        precioE.setBounds(197,470,60,20);
        
        JLabel FE=new JLabel("Fila");
        ventana.add(FE);
        FE.setBounds(270,470,70,20);
        
        filaE2=new JTextField();
        ventana.add(filaE2);
        filaE2.setBounds(293,470,50,20);
        
        JLabel di=new JLabel("Sala Digital 3D");
        ventana.add(di);
        di.setBounds(70, 470, 100, 20);
         
        montoD = new JTextField();
        ventana.add(montoD);
        montoD.setBounds(110, 470, 30, 20);
        
        JLabel cosD=new JLabel("Monto $");
        ventana.add(cosD);
        cosD.setBounds(150,470,50,20);
        
        precioD=new JTextField();
        ventana.add(precioD);
        precioD.setBounds(197,470,60,20);
        
        JLabel FD=new JLabel("Fila");
        ventana.add(FD);
        FD.setBounds(270,470,70,20);
        
        filaD2=new JTextField();
        ventana.add(filaD2);
        filaD2.setBounds(293,470,50,20);
        
        JLabel ho=new JLabel("Precio Boleto Despues de las 6 PM");
        ventana.add(ho);
        ho.setBounds(70, 470, 100, 20);
         
        montoH = new JTextField();
        ventana.add(montoH);
        montoH.setBounds(110, 470, 30, 20);
        
        JLabel cosH=new JLabel("Monto $");
        ventana.add(cosH);
        cosH.setBounds(150,470,50,20);
        
        precioH=new JTextField();
        ventana.add(precioH);
        precioH.setBounds(197,470,60,20);
        
        JLabel FH=new JLabel("Fila");
        ventana.add(FH);
        FH.setBounds(270,470,70,20);
        
        filaH2=new JTextField();
        ventana.add(filaH2);
        filaH2.setBounds(293,470,50,20);
        
        JLabel sub=new JLabel("Subtotal");
        ventana.add(sub);
        sub.setBounds(200,560,70,20);
        
        Tsin=new JTextField();
        ventana.add(Tsin);
        Tsin.setBounds(255,560,90,20);
        
        JLabel des=new JLabel("Descuento");
        ventana.add(des);
        des.setBounds(190,590,70,20);
        
        Des=new JTextField();
        ventana.add(Des);
        Des.setBounds(255,590,90,20);
        
        JLabel tdes=new JLabel("Total con descuento");
        ventana.add(tdes);
        tdes.setBounds(135,620,130,20);
        
        TDes=new JTextField();
        ventana.add(TDes);
        TDes.setBounds(255,620,90,20);
        
        JLabel IVA=new JLabel("IVA");
        ventana.add(IVA);
        IVA.setBounds(230,650,50,20);
        
        iva=new JTextField();
        ventana.add(iva);
        iva.setBounds(255,650,90,20);
        
        JLabel total2=new JLabel("Total");
        ventana.add(total2);
        total2.setBounds(220,680,50,20);
        
        total=new JTextField();
        ventana.add(total);
        total.setBounds(255,680,90,20);
        
        JLabel efectivo=new JLabel("Efectivo Recibido");
        ventana.add(efectivo);
        efectivo.setBounds(520,560,150,20);
        
        efectivo2=new JTextField();
        ventana.add(efectivo2);
        efectivo2.setBounds(630,560,50,20);
        
        cambio=new JButton("Cambio");
        ventana.add(cambio);
        cambio.setBounds(540,590,78,20);
        cambio.addActionListener(this);
                       
        cambio2=new JTextField();
        ventana.add(cambio2);
        cambio2.setBounds(630,590,50,20);
        
        imprimir=new JButton("Imprimir Ticket");
        ventana.add(imprimir);
        imprimir.setBounds(540,660,140,20);
        imprimir.addActionListener(this);
        
        salir=new JButton("Salir");
        ventana.add(salir);
        salir.setBounds(10,720,60,20);
        salir.addActionListener(this);
        
        cerrar=new JButton("Cerrar Sesion");
        ventana.add(cerrar);
        cerrar.setBounds(80,720,150,20);
        cerrar.addActionListener(this);
        
        limpiar=new JButton("Limpiar");
        ventana.add(limpiar);
        limpiar.setBounds(600,700,80,20);
        limpiar.addActionListener(this);
        
        JLabel nomus = new JLabel("Usuario");
        ventana.add(nomus);
        nomus.setBounds(440,620,140,20);
        
        Jsg = new JCheckBox("Jannet");
        ventana.add(Jsg);
        Jsg.setBounds(490,620,60,20);
        Jsg.addItemListener(this);
        
    }
    
    public void actionPerformed(ActionEvent e){
                         
        if(e.getSource()==pelicula){
                    pel.setText((String)pelicula.getSelectedItem());
                    String salas;
                    salas = pel.getText();

               if(salas.equals(" ")){cartel.repaint(); }
               if(salas.equals("Spider-Man: Sin Camino A Casa ")){ 
                    Graphics papel = cartel.getGraphics();
                    Object origen =e.getSource();
                    spider.paintIcon(this, papel, 0, 0); sala1.setText("1");} 
               if(salas.equals("Sing 2:Ven Y Canta De Nuevo")){ 
                    Graphics papel = cartel.getGraphics();
                    Object origen =e.getSource();
                    sing.paintIcon(this, papel, 0, 0);sala1.setText("2"); } 
               if(salas.equals("Encanto")){  
                    Graphics papel = cartel.getGraphics();
                    Object origen =e.getSource();
                    encanto.paintIcon(this, papel, 0, 0);sala1.setText("5");  } 
               if(salas.equals("La Casa Gucci")){  
                    Graphics papel = cartel.getGraphics();
                    Object origen =e.getSource();
                    gucci.paintIcon(this, papel, 0, 0);sala1.setText("3");  } 
               if(salas.equals("Ghostbusters:El Legado")){  
                    Graphics papel = cartel.getGraphics();
                    Object origen =e.getSource();
                    legado.paintIcon(this, papel, 0, 0);sala1.setText("6"); } 
               if(salas.equals("Matrix Resurecciones")){  
                    Graphics papel = cartel.getGraphics();
                    Object origen =e.getSource();
                    matrix.paintIcon(this, papel, 0, 0);sala1.setText("4"); } }
       
        if(e.getSource()==salir){ this.dispose();}
        if(e.getSource()==horario){horaprev.setText((String)horario.getSelectedItem());}
        if(e.getSource()==login2){
                String U;
                String C;
                U = usuario.getText();
                C = clave.getText();                        
            
           if((U.equals("Jannet"))&&(C.equals("12345"))){
            TaquillaCine marco = new TaquillaCine();
            marco.setSize(1200,800);
            marco.crearGUI();
            marco.setVisible(true);
            this.dispose();}else{
       
           if((U.equals(""))&&(C.equals(""))){
            TaquillaCine marco = new TaquillaCine();
            marco.setSize(1200,800);
            marco.crearGUI();
            marco.setVisible(true);
            this.dispose();}else{
               
            if((U.equals("q"))&&(C.equals("q"))){
            TaquillaCine marco = new TaquillaCine();
            marco.setSize(1200,800);
            marco.crearGUI();
            marco.setVisible(true);
            this.dispose();
            }else{
           
           if((U.equals(""))&&(C.equals(""))){
            TaquillaCine marco = new TaquillaCine();
            marco.setSize(1200,800);
            marco.crearGUI();
            marco.setVisible(true);
            this.dispose();}
            else{ JOptionPane.showMessageDialog (null, "El Usuario/Clave es incorrecto");}} }}}
        
         if(e.getSource()==cerrar){
           this.dispose();
           TaquillaCine marco2 = new TaquillaCine();
           marco2.setSize(400,200);
           marco2.crearGUI2();
           marco2.setVisible(true);  }
         
         if(e.getSource()==aceptar){       
            double Ad=Double.parseDouble(numA.getText());
            double res=Ad*60;
            String mon=String.valueOf(res);
            precioA.setText(mon);
            
            int i = Integer.parseInt(numA.getText());
            String canA=String.valueOf(i);
            montoA.setText(canA);
            int i2 = i%2;
            
            double Nd=Double.parseDouble(numN.getText());
            double resN=Nd*55;
            String monN=String.valueOf(resN);
            precioN.setText(monN);
            
            int x = Integer.parseInt(numN.getText());
            String canN=String.valueOf(x);
            montoN.setText(canN);
            int x2 = x%2;
            
            double Ed=Double.parseDouble(numE.getText());
            double resE=Ed*55;
            String monE=String.valueOf(resE);
            precioE.setText(monE);
            int E = Integer.parseInt(numA.getText());
            String canE=String.valueOf(E);
            montoA.setText(canE);
            int E2 = E%2;
            
            double Dd=Double.parseDouble(numD.getText());
            double resD=Dd*55;
            String monD=String.valueOf(resD);
            precioD.setText(monD);
            int D = Integer.parseInt(numD.getText());
            String canD=String.valueOf(D);
            montoD.setText(canD);
            int D2 = D%2;
            
            
            double Hd=Double.parseDouble(numH.getText());
            double resH=Hd*55;
            String monH=String.valueOf(resH);
            precioH.setText(monH);
            int H = Integer.parseInt(numH.getText());
            String canH=String.valueOf(H);
            montoH.setText(canH);
            int H2 = H%2;
            
            
             String fa;
             fa = filaA.getText();
             filaA2.setText(fa);
            
             String fn;
             fn = filaN.getText();
             filaN2.setText(fn);
            
             String fe;
             fe = filaE.getText();
             filaE2.setText(fe);
             
             String fd;
             fd = filaD.getText();
             filaD2.setText(fd);
            
             String fh;
             fh = filaH.getText();
             filaH2.setText(fh);
            
            
             double pA=0; pA=Double.parseDouble(precioA.getText());
             double pN=0; pN=Double.parseDouble(precioN.getText());
             double pE=0; pE=Double.parseDouble(precioE.getText());
             double pD=0; pD=Double.parseDouble(precioD.getText());
             double pH=0; pH=Double.parseDouble(precioH.getText());
             
             if(A2x1.isSelected()){
                 if(i>1){ if(i2==1){ pA=((pA-60)/2)+60;} 
                    else{pA=pA/2;}}
                 if(x>1){ if(x2==1){ pN=((pN-55)/2)+55;}
                    else{pN=pN/2;}}
                    double p1=pA;
                    String p1A=String.valueOf(p1);
                    precioA.setText(p1A);
                    precioA.setBackground(new Color(251, 185, 177));
                    double p2=pN;
                    String p2N=String.valueOf(pN);
                    precioN.setText(p2N);
                    precioN.setBackground(new Color(251, 185, 177));
                    double sub=pA+pN;
                    String subtotal=String.valueOf(sub);
                    Tsin.setText(subtotal);}
             else{double sub=pA+pN+pE+pD+pH;
                    String subtotal=String.valueOf(sub);
                    precioA.setBackground(Color.white);
                    precioN.setBackground(Color.white);
                    precioE.setBackground(Color.white);
                    precioD.setBackground(Color.white);
                    precioH.setBackground(Color.white);
                    Tsin.setText(subtotal);}}
         
         if(e.getSource()==cambio){
            double efec=0; efec=Double.parseDouble(efectivo2.getText());
            double totalneto=0; totalneto=Double.parseDouble(total.getText());
            double cam=efec-totalneto;
            String cam2=String.valueOf(cam);
            cam2=cam2.substring(0,5);
            cambio2.setText(cam2);}
         
         if(e.getSource()==limpiar){
             Descuento.setSelected(false);
             normal.setSelected(false);
             A2x1.setSelected(false);
             adulto.setSelected(false);
             niño.setSelected(false);
             estudiante.setSelected(false);
             digital.setSelected(false);
             despues.setSelected(false);
             pelicula.setSelectedIndex(0);
             horario.setSelectedIndex(0);
             total.setText(" ");
             pel.setText(" ");
             sala1.setText(" ");
             numA.setText("0");
             numN.setText("0");
             filaA.setText(" ");
             filaN.setText(" ");
             filaE.setText(" ");
             filaD.setText(" ");
             filaH.setText(" ");
             filaA2.setText(" ");
             filaN2.setText(" ");
             montoA.setText(" ");
             montoN.setText(" ");
             montoE.setText(" ");
             montoD.setText(" ");
             montoH.setText(" ");
             precioA.setBackground(Color.white);
             precioN.setBackground(Color.white);
             precioA.setText(" ");
             precioN.setText(" ");
             precioE.setText(" ");
             precioD.setText(" ");
             precioH.setText(" ");
             Tsin.setText(" ");
             Des.setBackground(Color.white);
             Des.setText(" ");
             TDes.setText(" ");
             iva.setText(" ");
             cambio2.setText(" ");
             efectivo2.setText(" ");
             ticket.setText(" ");
             cartel.repaint();
             ticket.setBackground(Color.WHITE);}
         
         if(e.getSource()==imprimir){
            ticket.setText(" ");
            ticket.setBackground(new Color(111, 242, 181));
            ticket.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 16));
            ticket.setText("\n\n\n");
            ticket.append("                                      CINEUTC\n\n");
            ticket.append("                   Londres #72 Col.Juarez\n                           Mexico DF C.P. 06600\n\n"); 
            if(Jsg.isSelected()){ ticket.append("          Atendio: Jannet Sanchez Guerrero  "+"   Caja #1"+"\n");}
            Calendar fecha = new GregorianCalendar();
            int año = fecha.get(Calendar.YEAR);
            int mes = fecha.get(Calendar.MONTH);
            int dia = fecha.get(Calendar.DAY_OF_MONTH);
            int hora = fecha.get(Calendar.HOUR); 
            int minuto = fecha.get(Calendar.MINUTE);  
            int segundo = fecha.get(Calendar.SECOND); 
            int ampm = fecha.get(Calendar.AM_PM); 
            ticket.append("   Fecha: " + dia + "/" + (mes+1) + "/" + año+"             "+"Hora: "+hora+":"+minuto+":"+segundo+" "+(ampm==Calendar.AM?"am":"pm")+"\n\n\n");
            String salas1;
            salas1 = pel.getText();
            ticket.append("Pelicula:  "+salas1+"\n");
            String horaprev2;
            horaprev2 = horaprev.getText();
            ticket.append("Funcion: "+horaprev2+"\n");
            String sala2;
            sala2 = sala1.getText();
            ticket.append("Sala  "+sala2+"\n");
            if(A2x1.isSelected()){ticket.append("                                                                                 2x1\n\n");}
            else{ticket.append("\n\n");}
            if(adulto.isSelected()){
            int iA = Integer.parseInt(numA.getText());
            String canA2=String.valueOf(iA);
            double pA=0; pA=Double.parseDouble(precioA.getText());
            String mon2=String.valueOf(pA);
            
            String fa2;
            fa2 = filaA.getText();
            ticket.append(" "+canA2+"  Boleto Adulto  $"+mon2+"\n"+"    Asiento Fila "+fa2+"\n\n");}
            if(niño.isSelected()){
            int iN = Integer.parseInt(numN.getText());
            String canN2=String.valueOf(iN);
            double pN=0; pN=Double.parseDouble(precioN.getText());
            String mon3=String.valueOf(pN);
            String fa3;
            fa3 = filaN.getText();
            ticket.append(" "+canN2+"  Boleto Niño  $"+mon3+"\n"+"    Asiento Fila "+fa3+"\n\n\n");}
            double s=0; s=Double.parseDouble(Tsin.getText());
            String s2=String.valueOf(s);
            
            String fa4;
            fa4 = filaE.getText();
            ticket.append(" "+canE2+"  Boleto Estudiante  $"+mon4+"\n"+"    Asiento Fila "+fa4+"\n\n");}
            if(estudiante.isSelected()){
            int iE = Integer.parseInt(numE.getText());
            String canE2=String.valueOf(iE);
            double pE=0; pE=Double.parseDouble(precioE.getText());
            String mon4=String.valueOf(pE);
            
            String fa5;
            fa5 = filaD.getText();
            ticket.append(" "+canD2+"  Boleto Sla Digital 3D  $"+mon5+"\n"+"    Asiento Fila "+fa5+"\n\n");}
            if(digital.isSelected()){
            int iD = Integer.parseInt(numD.getText());
            String canN2=String.valueOf(iD);
            double pD=0; pD=Double.parseDouble(precioD.getText());
            String mon5=String.valueOf(pD);
            
            String fa6;
            fa6 = filaH.getText();
            ticket.append(" "+canH2+"  Boleto Horarios Despues de las 6PM  $"+mon6+"\n"+"    Asiento Fila "+fa6+"\n\n");}
            if(despues.isSelected()){
            int iH = Integer.parseInt(numH.getText());
            String canN2=String.valueOf(iH);
            double pH=0; pH=Double.parseDouble(precioH.getText());
            String mon6=String.valueOf(pH);
            
            
            
            ticket.append("     Subtotal ..................................... $  "+s2+"\n");
            double d=0; d=Double.parseDouble(Des.getText());
            String d2=String.valueOf(d);
            ticket.append("     Descuento .................................. $  "+d+"\n");
            double td=0; td=Double.parseDouble(TDes.getText());
            String td2=String.valueOf(td);
            ticket.append("     Subtotal con Descuento ......... $  "+td2+"\n");
            double iv=0; iv=Double.parseDouble(iva.getText());
            String iv2=String.valueOf(iv);
            ticket.append("     IVA ............................................... $  "+iv2+"\n");
            double t=0; t=Double.parseDouble(total.getText());
            String t2=String.valueOf(t);
            ticket.append("     Total a pagar ............................ $  "+t2+"\n\n");
            double ef=0; ef=Double.parseDouble(efectivo2.getText());
            String ef2=String.valueOf(ef);
            ticket.append("                                    Efectivo ............ $  "+ef2+"\n");
            double c=0; c=Double.parseDouble(cambio2.getText());
            String c2=String.valueOf(c);
            ticket.append("                                    Cambio  .............. $   "+c2+"\n\n\n");
            ticket.append("                   ¡Gracias por su eleccion!\n");
            ticket.append("                   www.cineplanet.com.mx\n\n\n");}
}
    public void itemStateChanged(ItemEvent event){   
     if(Descuento.isSelected()){
            double descuento=0; descuento=Double.parseDouble(Tsin.getText());
            double descuen=descuento*0.15;
            String descue=String.valueOf(descuen);;
            Des.setText(descue);
            Des.setBackground(new Color(225, 209, 245));
            
            double descuen1=descuento-descuen;
            String Tdescue=String.valueOf(descuen1);
            TDes.setText(Tdescue);
            
            double iv=descuen1*0.16;
            String IVA=String.valueOf(iv);
            iva.setText(IVA);
            
            double tot=descuen1+iv;
            String tota=String.valueOf(tot);
            total.setText(tota); }
     
     if(normal.isSelected()){
            double totalsin=0; totalsin=Double.parseDouble(Tsin.getText());
            double iv2=totalsin*0.16;
            String IVA2=String.valueOf(iv2);
            iva.setText(IVA2);
            
            double tot2=totalsin+iv2;
            String tota2=String.valueOf(tot2);
            total.setText(tota2);
            
            TDes.setText("0");
            Des.setBackground(Color.white);
            Des.setText("0"); }
 }
}



			

                 
        
          


        
        
      

