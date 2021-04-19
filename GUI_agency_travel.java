import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUI_agency_travel {

	public static JFrame frame;
	public static JRadioButton rdbtnNewRadioButton;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	public double total = 0;
	public static JComboBox comboBox_1;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_agency_travel window = new GUI_agency_travel();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI_agency_travel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		//Creare frame 
		frame = new JFrame();
		frame.setBounds(100, 100, 1200, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//Creare panel
		JPanel panel = new JPanel();
		panel.setBackground(new Color(32, 178, 170));
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel.setBounds(25, 11, 1138, 90);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 128, 128));
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_1.setBounds(25, 112, 1138, 540);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_2.setBounds(21, 11, 416, 507);
		panel_1.add(panel_2);
		panel_2.setLayout(null); 
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_3.setBounds(447, 11, 670, 507);
		panel_1.add(panel_3);
		panel_3.setLayout(null); 
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_4.setBounds(227, 21, 433, 411);
		panel_3.add(panel_4);
		panel_4.setLayout(null);
		
		//Creare label-uri
		
		JLabel lblNewLabel = new JLabel("TRAVEL & EXPLORE AGENCY");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 34));
		lblNewLabel.setBounds(58, 11, 529, 56);
		panel.add(lblNewLabel);
		
		JLabel lblAllYouNeed = new JLabel("All you need is a ticket!");
		lblAllYouNeed.setHorizontalAlignment(SwingConstants.CENTER);
		lblAllYouNeed.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblAllYouNeed.setBackground(Color.BLACK);
		lblAllYouNeed.setBounds(649, 48, 466, 37);
		panel.add(lblAllYouNeed);
		
		JLabel lblNewLabel_1_2 = new JLabel("ADRESA");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_2.setBounds(290, 50, 57, 27);
		panel_2.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("PRENUME");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(153, 50, 57, 27);
		panel_2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("NUME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(20, 50, 52, 27);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("TELEFON");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_3.setBounds(20, 104, 100, 27);
		panel_2.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("COD POSTAL");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_2_1.setBounds(153, 104, 100, 27);
		panel_2.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("E-MAIL");
		lblNewLabel_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_2_1_1.setBounds(290, 104, 100, 27);
		panel_2.add(lblNewLabel_1_2_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("PUNCT DE PLECARE");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(20, 157, 137, 14);
		panel_2.add(lblNewLabel_2); 
		
		JLabel lblNewLabel_2_1 = new JLabel("DESTINATIE");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_1.setBounds(20, 222, 137, 14);
		panel_2.add(lblNewLabel_2_1); 
		
		JLabel lblNewLabel_1_1_1 = new JLabel("DATE PERSONALE ");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_1_1.setBounds(150, 12, 151, 27);
		panel_2.add(lblNewLabel_1_1_1); 
		
		JLabel lblNewLabel_2_2_1 = new JLabel("NR PERSOANE");
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_2_1.setBounds(20, 285, 137, 14);
		panel_2.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("TIP CALATORIE");
		lblNewLabel_2_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_2_1_1.setBounds(20, 350, 137, 14);
		panel_2.add(lblNewLabel_2_2_1_1); 
		
		JLabel lblNewLabel_2_2_1_1_1 = new JLabel("TIP CALATOR");
		lblNewLabel_2_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_2_1_1_1.setBounds(20, 411, 137, 14);
		panel_2.add(lblNewLabel_2_2_1_1_1); 
		
		JLabel lblNewLabel_3 = new JLabel("____________________________________________");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(24, 31, 366, 14);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Vacanta?");
		lblNewLabel_1_1_2_1.setBounds(20, 474, 57, 27);
		panel_2.add(lblNewLabel_1_1_2_1);
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13)); 
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("PLATA");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_1_1_1.setBounds(105, 21, 151, 14);
		panel_3.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("____________________________________________");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_1.setBounds(22, 34, 180, 14);
		panel_3.add(lblNewLabel_3_1); 
		
		JLabel lblNewLabel_1_1_2 = new JLabel("SubTotal");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_1_2.setBounds(22, 161, 57, 27);
		panel_3.add(lblNewLabel_1_1_2);  
		
		JLabel lblNewLabel_1_2_1_2 = new JLabel("ORA PLECARE");
		lblNewLabel_1_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_2_1_2.setBounds(22, 108, 109, 27);
		panel_3.add(lblNewLabel_1_2_1_2);
		
		 
		
		JLabel lblNewLabel_1_2_1_3 = new JLabel("DATA PLECARE");
		lblNewLabel_1_2_1_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_2_1_3.setBounds(18, 54, 100, 27);
		panel_3.add(lblNewLabel_1_2_1_3);
		
		
		
		
		 
		 
		//Creare casete text
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(20, 72, 96, 20);
		panel_2.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(153, 72, 96, 20);
		panel_2.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(290, 72, 96, 20);
		panel_2.add(textField_2);
		
		 
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(290, 126, 96, 20);
		panel_2.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(153, 126, 96, 20);
		panel_2.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(20, 126, 96, 20);
		panel_2.add(textField_5); 
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(22, 183, 180, 20);
		panel_3.add(textField_6); 
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(22, 130, 96, 20);
		panel_3.add(textField_7); 
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(18, 76, 96, 20);
		panel_3.add(textField_8);
		
		 
		// Creare casete pt punctul de plecare  
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"None", "Craiova", "Bucuresti", "Sibiu", "Timisoara"}));
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox.setBounds(20, 184, 366, 27);
		panel_2.add(comboBox);
		
		// Creare casete pt destinatie
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"None", "Paris(Franta)", "Londra(Uk)", "Ottawa(Canada)", "Toronto(Canada)", "Norvegia(Oslo)"}));
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox_1.setBounds(20, 247, 366, 27);
		panel_2.add(comboBox_1);
		
		//Creare caseta pt nr de persoane
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"None", "1", "2", "3", "4"}));
		comboBox_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox_1_1.setBounds(20, 309, 366, 27);
		panel_2.add(comboBox_1_1);
		
			 		
		// Creare caseta pt tipul clasei
		JComboBox comboBox_1_1_1 = new JComboBox();
		comboBox_1_1_1.setModel(new DefaultComboBoxModel(new String[] {"None", "Clasa1", "Clasa2", "Cuseta", "Dormitor"}));
		comboBox_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox_1_1_1.setBounds(20, 375, 366, 27);
		panel_2.add(comboBox_1_1_1);
		
		// Creare caseta pt tipul calatorului
		 		
		JComboBox comboBox_1_1_2 = new JComboBox();
		comboBox_1_1_2.setModel(new DefaultComboBoxModel(new String[] {"None", "Adult", "Copil", "Elev", "Student", "Pensionar"}));
		comboBox_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox_1_1_2.setBounds(20, 436, 366, 27);
		panel_2.add(comboBox_1_1_2);
		
		
		//BUTONU DE LEGATURA INTRE CELE DOUA TAB-URI
		 rdbtnNewRadioButton = new JRadioButton("DA");
		 
		rdbtnNewRadioButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
// fct apelata pt pt redirectionarea utilizatorului pe pagina cu detaliile destinatiei (hoteluri , restaurante, atractii)
				new Entertainment().frame.setVisible(true);
				GUI_agency_travel.frame.setVisible(false);
				
				
			}
		});
		
		rdbtnNewRadioButton.setBounds(89, 477, 111, 23);
		panel_2.add(rdbtnNewRadioButton);
		
		
		 
		
		// Creare buton pt calculul sumei totale in functie de detaliile oferite 
		
		JButton btnCalculeaza = new JButton("Calculeaza");
		btnCalculeaza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double pret=0,pret_dist=0,pret_cls=0; // variabile pt stocare pret
				
				//CALCULAM PRETUL IN FUNCTIE DE TIPUL CALATORULUI
				if(comboBox_1_1_2.getSelectedItem().equals("Adult")){
					
					pret = 15.5;
				}
				if(comboBox_1_1_2.getSelectedItem().equals("Copil")) {
					
					pret = 5.0;
					
				}
				if(comboBox_1_1_2.getSelectedItem().equals("Student") || comboBox_1_1_2.getSelectedItem().equals("Pensionar")) {
					
					pret = 0;
				}
				if(comboBox_1_1_2.getSelectedItem().equals("Elev")) {
					
					pret = 7.0;
				}
				
				//ACTUALIZAM PRETUL IN FUNCTIE DE NR PERSOANELOR
				double pret_pers = 0;
				if(comboBox_1_1.getSelectedItem().equals("2")) {
					
					pret_pers = 2*pret;
					
										
						
				}
				if(comboBox_1_1.getSelectedItem().equals("3")) {
					
					pret_pers = 3*pret;
				}
				if(comboBox_1_1.getSelectedItem().equals("4")){
					
					pret_pers = 4*pret;
								
				}
				
			
			
			//CALCULAM PRETUL PT DISTANTA INTRE PUNCT PLECARE-SOSIRE 
				
				//CAZ 1 CRAIOVA - ....
			if(comboBox.getSelectedItem().equals("Craiova") && comboBox_1.getSelectedItem().equals("Paris(Franta")) {
					
					pret_dist = 50;
										
					
			}if(comboBox.getSelectedItem().equals("Craiova") && comboBox_1.getSelectedItem().equals("Londra(Uk)")) {
				
				pret_dist = 80;
			} if(comboBox.getSelectedItem().equals("Craiova") && comboBox_1.getSelectedItem().equals("Ottawa(Canada)")){
				
				pret_dist = 75;
			} if(comboBox.getSelectedItem().equals("Craiova") && comboBox_1.getSelectedItem().equals("Toronto(Canada)")){
				
				pret_dist = 60;
			} if(comboBox.getSelectedItem().equals("Craiova") && comboBox_1.getSelectedItem().equals("Norvegia(Oslo))")){
				
				pret_dist = 45;
			}    
			 
			
			// Caz 2 BUCURESTI-.....
			if(comboBox.getSelectedItem().equals("Bucuresti") && comboBox_1.getSelectedItem().equals("Paris(Franta")) {
				
				pret_dist = 25.5;
									
					
			}
			if(comboBox.getSelectedItem().equals("Bucuresti") && comboBox_1.getSelectedItem().equals("Londra(Uk)")) {
				
				pret_dist = 340;
			}
			if(comboBox.getSelectedItem().equals("Bucuresti") && comboBox_1.getSelectedItem().equals("Ottawa(Canada)")){
				
				pret_dist = 75.3;
			}
			if(comboBox.getSelectedItem().equals("Bucuresti") && comboBox_1.getSelectedItem().equals("Toronto(Canada)")){
				
				pret_dist = 60.01;
			}
			if(comboBox.getSelectedItem().equals("Bucuresti") && comboBox_1.getSelectedItem().equals("Norvegia(Oslo))")){
				
				pret_dist = 48.34;
			}    
			    
			//CAZ 3 Sibiu - ...
			if(comboBox.getSelectedItem().equals("Sibiu") && comboBox_1.getSelectedItem().equals("Paris(Franta")) {
				
				pret_dist = 21.5;
									
					
			}
			if(comboBox.getSelectedItem().equals("Sibiu") && comboBox_1.getSelectedItem().equals("Londra(Uk)")) {
				
				pret_dist = 960;
			}
			if(comboBox.getSelectedItem().equals("Sibiu") && comboBox_1.getSelectedItem().equals("Ottawa(Canada)")){
				
				pret_dist = 750;
			}
			if(comboBox.getSelectedItem().equals("Sibiu") && comboBox_1.getSelectedItem().equals("Toronto(Canada)")){
				
				pret_dist = 600;
			}
			if(comboBox.getSelectedItem().equals("Sibiu") && comboBox_1.getSelectedItem().equals("Norvegia(Oslo))")){
				
				pret_dist = 480;
			}    
				
			//Caz4 Timisoara- ....
			
			if(comboBox.getSelectedItem().equals("Timisoara") && comboBox_1.getSelectedItem().equals("Paris(Franta")) {
				
				pret_dist = 200.01;
									
					
			}
			if(comboBox.getSelectedItem().equals("Timisoara") && comboBox_1.getSelectedItem().equals("Londra(Uk)")) {
				
				pret_dist = 478.09;
			}
			if(comboBox.getSelectedItem().equals("Timisoara") && comboBox_1.getSelectedItem().equals("Ottawa(Canada)")){
				
				pret_dist = 12.77;
			}
			if(comboBox.getSelectedItem().equals("Timisoara") && comboBox_1.getSelectedItem().equals("Toronto(Canada)")){
				
				pret_dist = 60.24;
			}
			if(comboBox.getSelectedItem().equals("Timisoara") && comboBox_1.getSelectedItem().equals("Norvegia(Oslo))")){
				
				pret_dist = 41.11;
			}   
			
			
			
			
			//ACTUALIZAM PRETUL IN FUNCTIE DE CLASA ALEASA(1,2 CUSETA SAU DORMITOR)
			 
			 
			if(comboBox_1_1_1.getSelectedItem().equals("Clasa1")) {
				
				pret_cls = pret + (30/100)*pret;
								
					
			}
			if(comboBox_1_1_1.getSelectedItem().equals("Clasa2")) {
				
				
				
				pret_cls =  ((15*pret)/100 + pret);
				
			}
			if(comboBox_1_1_1.getSelectedItem().equals("Cuseta")){
				
				pret_cls = pret + (40/100)*pret;
				 
			}
			if(comboBox_1_1_1.getSelectedItem().equals("Dormitor")){
				
				pret_cls = pret + (45/100)*pret;
				 
			}	
			 
			
			
			//CALCULAM TOTALUL
			 
			total = pret + pret_dist + pret_pers + pret_cls;
			 
			String total_0 = Double.toString(total);	
			total_0 = String.format("%.2f lei",total);
			textField_6.setText(total_0);
				
				
				
			}
		});
		btnCalculeaza.setBounds(22, 461, 109, 35);
		panel_3.add(btnCalculeaza);
		
		// Creare buton reset
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(141, 461, 87, 35);
		panel_3.add(btnReset);
		
		//Creare buton Exit
		JButton btnNewButton = new JButton("Exit");
		btnNewButton.setBounds(565, 462, 95, 33);
		panel_3.add(btnNewButton);
		
		// Creare obiect de tipul textarea pt afisarea chitantei 
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 11, 413, 389);
		panel_4.add(textArea);
		
		//Creare buton Factura  si functia apelata de el
		
		JButton btnNewButton_1 = new JButton("Factura");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Generam o referinta
				int refs = 1325 + (int) (Math.random()* 4238);
				int refs_tren = 1390 + (int) (Math.random()* 4238);
				
				// PRELUAM INFORMATIILE DE LA CASETELE TEXT 
				String nume =       String.format(textField.getText());
				String prenume =    String.format(textField_1.getText());
				String adresa =    String.format(textField_2.getText());
				String telefon =    String.format(textField_5.getText());
				String codpostal =  String.format(textField_4.getText());
				String email =      String.format(textField_3.getText());
				String data_plecare =  String.format(textField_8.getText());
				String ora_plecare =   String.format(textField_7.getText());
				
				
				// Se genereaza ora  si data cand se emite aceasta factura
				Calendar timer = Calendar.getInstance();
				timer.getTime();
				
				SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
				tTime.format(timer.getTime());
				SimpleDateFormat Tdate  = new SimpleDateFormat("dd-MM-yyyy");
				Tdate.format(timer.getTime());
				
				// Afisarea pe obiectul de tip textArea a informatiilor 
				textArea.setText("\t\tTRAVEL&EXPLORER AGENCY \n\n"+"www.travelandexplorer.ro"+ "\t\t\t  0256923564"+"\n\n\t" + 
				"\nReferinta: \t" + refs +
				 
				"\n  NUME:            " + nume +
				"\n  PRENUME:         "+ prenume +
				"\n  COD POSTAL         " + codpostal +
				"\n  TELEFON:           "+ telefon +
				"\n  EMAIL           " + email +
				"\n  NR TREN: IR" + refs +
				"\n  Data plecare:  " + data_plecare +
				"\n  Ora plecare:  " + ora_plecare +
				
				
				"\n  TOTAL plata:  " + total +
				
				"\n  ====================================================\t" +
				"\n  LOCATIE: Str. Zambilelor nr.14"+
				"\n  Bucuresti,ILFOV"+
				"\n\nDate : " + Tdate.format(timer.getTime()) + 
				"\t\t  Time: " + tTime.format(timer.getTime()) + 
				"\n\n\t\t  Multumim,\n" + "\t\t\ttravel&explorer" );
				
				
				
				
				
				
				
				
				
				
			}
		});
		btnNewButton_1.setBounds(239, 461, 89, 35);
		panel_3.add(btnNewButton_1);
		
		 // Creare buton pt print si functia apelata de el
		JButton btnNewButton_2 = new JButton("Print");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					// se genereaza o fereastra pt printarea facturii
					
					textArea.print();
					
				}catch(Exception b1) {
				
				}
			}
		});
		
		btnNewButton_2.setBounds(338, 461, 89, 35);
		panel_3.add(btnNewButton_2);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// fct apelata atunci cand utilizatorul doreste sa paraseasca aplicatia 
				// apare o fereastra de tipul : yes or no ?
				if(JOptionPane.showConfirmDialog(frame, "Doriti sa inchideti fereastra? ", "Travel&Explore",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
			
			System.exit(0);
				}
				
			}
				
			
		});
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//fct apelata pt stergerea continutului casetelor text
				
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_8.setText("");
				textField_7.setText("");
				
				comboBox.setSelectedItem("None");
				comboBox_1.setSelectedItem("None");
				comboBox_1_1.setSelectedItem("None");
				comboBox_1_1_1.setSelectedItem("None");
				comboBox_1_1_2.setSelectedItem("None");
				rdbtnNewRadioButton.setSelected(false);
				textArea.setText("");
				
			}
		});
	}
}
