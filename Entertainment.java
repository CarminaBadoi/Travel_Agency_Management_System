import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;

public class Entertainment {

	public static JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// se afiseaza panoul principal
					Entertainment window = new Entertainment();
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
	public Entertainment() {
		initialize();
		 
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		// Creare frame
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 128, 128));
		frame.setBounds(100, 100, 1000, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//Creare panel - uri 
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel.setBounds(10, 11, 358, 672);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_1.setBounds(378, 11, 588, 672);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_2.setBounds(25, 99, 542, 162);
		panel_1.add(panel_2);
		panel_2.setLayout(null); 
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_2_1.setBounds(25, 302, 542, 162);
		panel_1.add(panel_2_1); 
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_2_1_1.setBounds(25, 505, 542, 156);
		panel_1.add(panel_2_1_1);
		
		
		// Creare label-uri 
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBackground(new Color(0, 0, 0));
		
		// Label-ul acesta preia numele destinatiei alese din GUI_agency_travel
		lblNewLabel.setText((String) GUI_agency_travel.comboBox_1.getSelectedItem());
				
			
		lblNewLabel.setBounds(198, 11, 150, 24);
		panel.add(lblNewLabel);
		
		JLabel lblDestinatiaDvs = new JLabel("Destinatia dvs :");
		lblDestinatiaDvs.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblDestinatiaDvs.setBackground(Color.BLACK);
		lblDestinatiaDvs.setBounds(45, 11, 126, 24);
		panel.add(lblDestinatiaDvs);
		
		JLabel lblNewLabel_1 = new JLabel("Ce va rezerva destinatia aleasa de dvs :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 105, 275, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblDestinatiaDvs_1_1 = new JLabel("_____________________");
		lblDestinatiaDvs_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblDestinatiaDvs_1_1.setBackground(Color.BLACK);
		lblDestinatiaDvs_1_1.setBounds(198, 30, 202, 24);
		panel_1.add(lblDestinatiaDvs_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(25, 67, 137, 21);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setVisible(false); 
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(25, 272, 187, 19);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4_1.setBounds(25, 475, 299, 19);
		panel_1.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(231, 30, 154, 14);
		panel_1.add(lblNewLabel_3);
		
		
		//Creare obiecte de tip textArea pt afisarea informatiilor legate de hoteluri , restaurante,atractii
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 11, 522, 141);
		panel_2.add(textArea);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(10, 11, 522, 141);
		panel_2.add(textArea_2);
		
		JTextArea textArea_5 = new JTextArea();
		textArea_5.setBounds(10, 11, 522, 141);
		panel_2.add(textArea_5);
		
			
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(10, 11, 522, 141);
		panel_2_1.add(textArea_1);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBounds(10, 11, 522, 141);
		panel_2_1.add(textArea_3);
		
		JTextArea textArea_6 = new JTextArea();
		textArea_6.setBounds(10, 11, 522, 141);
		panel_2_1.add(textArea_6);
		
				
		JTextArea textArea_1_1 = new JTextArea();
		textArea_1_1.setBounds(10, 11, 522, 134);
		panel_2_1_1.add(textArea_1_1);
		
		JTextArea textArea_4 = new JTextArea();
		textArea_4.setBounds(10, 11, 522, 134);
		panel_2_1_1.add(textArea_4);
		
		JTextArea textArea_7 = new JTextArea();
		textArea_7.setBounds(10, 11, 522, 134);
		panel_2_1_1.add(textArea_7);
		
		// Crearea primului buton pt rezervare primului hotel de pe lista 		
		JButton btnNewButton_1 = new JButton("Rezerva");
		btnNewButton_1.setBounds(478, 67, 89, 24);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Rezerva");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String locatie = lblNewLabel.getText() ; // citim destinatia aleasa de utilizator si o stocam intr-o variabila
				
				if(locatie == "Londra(Uk)"  ) { // Caz1 "Londra"
				
					try {
					String myurl = "https://www.booking.com/hotel/gb/cleveland-square.ro.html?aid=319856&label=london-St5FbDwtG3iw0dXShfDvKwS513181327662%3Apl%3Ata%3Ap13060%3Ap2%3Aac%3Aap%3Aneg%3Afi%3Atikwd-14520357607%3Alp21275%3Ali%3Adec%3Adm%3Appccp%3DUmFuZG9tSVYkc2RlIyh9YURcq_26dhSxQ4lAWSVBlCA&sid=bf39f5892f9698d4cff8bd83efad420b&all_sr_blocks=3574908_95326990_0_0_0&checkin=2021-04-21&checkout=2021-04-22&dest_id=-2601889&dest_type=city&dist=0&group_adults=2&group_children=0&hapos=2&highlighted_blocks=3574908_95326990_0_0_0&hpos=2&no_rooms=1&room1=A%2CA&sb_price_type=total&sr_order=popularity&sr_pri_blocks=3574908_95326990_0_0_0__5928&srepoch=1618482489&srpvid=1879499c766702a0&type=total&ucfs=1&activeTab=main";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(myurl)); // foloseste browserul de pe computerul utilizatorului pt a deschide pagina web
					
					}catch(Exception e1) {
						
						e1.printStackTrace();
						
					}
						
				}else if(locatie == "Paris(Franta)"  ) {// Caz2 "Franta"
				
					try {
					String myurl = "https://www.booking.com/hotel/fr/radisson-blu-hotel-lyon.ro.html?aid=319856;label=fr-fiCD%2A64t%2AOX650ENr%2AhxswS152454951741%3Apl%3Ata%3Ap1%3Ap2%3Aac%3Aap%3Aneg%3Afi%3Atikwd-4348838222%3Alp21275%3Ali%3Adec%3Adm%3Appccp%3DUmFuZG9tSVYkc2RlIyh9YURcq_26dhSxQ4lAWSVBlCA;sid=bf39f5892f9698d4cff8bd83efad420b;all_sr_blocks=5086126_255463715_2_2_0;checkin=2021-04-21;checkout=2021-04-22;dest_id=73;dest_type=country;dist=0;group_adults=2;group_children=0;hapos=5;highlighted_blocks=5086126_255463715_2_2_0;hpos=5;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;sr_pri_blocks=5086126_255463715_2_2_0__14809;srepoch=1618494661;srpvid=d1066162a71400b0;type=total;ucfs=1&#hotelTmpl";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(myurl));
					
					}catch(Exception e1) {
						
						e1.printStackTrace();
						
					}
						
				}
				else if(locatie == "Ottawa(Canada)"  ) {//Caz3 Ottawa
					
					try {
					String myurl = "https://www.booking.com/hotel/ca/downtown-ottawa.ro.html?aid=1250365;label=huno.1%3ACj0KCQjwyN-DBhCDARIsAFOELTnGvyjSjDgupuXxp1wmsQAgxLubMrxEimG6-oaCYX8zojf0bDECjdIaAiaREALw_wcB;sid=bf39f5892f9698d4cff8bd83efad420b;all_sr_blocks=7652918_91823895_2_0_0;checkin=2021-04-22;checkout=2021-04-23;dest_id=-570760;dest_type=city;dist=0;group_adults=2;group_children=0;hapos=4;highlighted_blocks=7652918_91823895_2_0_0;hpos=4;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;sr_pri_blocks=7652918_91823895_2_0_0__8890;srepoch=1618499863;srpvid=27c06b8b1f8a0031;type=total;ucfs=1&#hotelTmpl";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(myurl));
					
					}catch(Exception e1) {
						
						e1.printStackTrace();
						
					}
						
				}
				
				
				
				
				
			}
		});
		btnNewButton_2.setBounds(478, 275, 89, 23);
		panel_1.add(btnNewButton_2);
		
		//Creare butonului nr2 pt rezervarea hotelului nr2
		JButton btnNewButton_3 = new JButton("Rezerva");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String locatie = lblNewLabel.getText() ; // citim destinatia aleasa de utilizator si o stocam intr-o variabila
				
				if(locatie == "Londra(Uk)"  ) {//Caz1 Londra
				
					try { // fct getDesktop foloseste browserul de pe desktopul utilizatorului pt a deschide linkul urmator 
					String myurl = "https://www.booking.com/hotel/gb/the-savoy.ro.html?aid=319856;label=london-St5FbDwtG3iw0dXShfDvKwS513181327662%3Apl%3Ata%3Ap13060%3Ap2%3Aac%3Aap%3Aneg%3Afi%3Atikwd-14520357607%3Alp21275%3Ali%3Adec%3Adm%3Appccp%3DUmFuZG9tSVYkc2RlIyh9YURcq_26dhSxQ4lAWSVBlCA;sid=bf39f5892f9698d4cff8bd83efad420b;all_sr_blocks=28014901_266278137_2_2_0;checkin=2021-04-21;checkout=2021-04-22;dest_id=-2601889;dest_type=city;dist=0;group_adults=2;group_children=0;hapos=3;highlighted_blocks=28014901_266278137_2_2_0;hpos=3;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;sr_pri_blocks=28014901_266278137_2_2_0__46399;srepoch=1618482489;srpvid=1879499c766702a0;type=total;ucfs=1&#hotelTmpl";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(myurl));
					
					}catch(Exception e1) {
						
						e1.printStackTrace();
						
					}
						
				}else if(locatie == "Paris(Franta)"  ) {//Caz2 Franta
				
					try {
					String myurl = "https://www.booking.com/hotel/fr/oceaniasaintmalo.ro.html?aid=319856;label=fr-fiCD%2A64t%2AOX650ENr%2AhxswS152454951741%3Apl%3Ata%3Ap1%3Ap2%3Aac%3Aap%3Aneg%3Afi%3Atikwd-4348838222%3Alp21275%3Ali%3Adec%3Adm%3Appccp%3DUmFuZG9tSVYkc2RlIyh9YURcq_26dhSxQ4lAWSVBlCA;sid=bf39f5892f9698d4cff8bd83efad420b;all_sr_blocks=5318801_276219076_0_2_0;checkin=2021-04-21;checkout=2021-04-22;dest_id=73;dest_type=country;dist=0;group_adults=2;group_children=0;hapos=12;highlighted_blocks=5318801_276219076_0_2_0;hpos=12;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;sr_pri_blocks=5318801_276219076_0_2_0__13410;srepoch=1618494662;srpvid=d1066162a71400b0;type=total;ucfs=1&#hotelTmpl";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(myurl));
					
					}catch(Exception e1) {
						
						e1.printStackTrace();
						
					}
						
				}else if(locatie == "Ottawa(Canada)"  ) {//Caz3 Ottawa
				
					try {
					String myurl = "https://www.booking.com/hotel/ca/les-suites.ro.html?aid=1250365;label=huno.1%3ACj0KCQjwyN-DBhCDARIsAFOELTnGvyjSjDgupuXxp1wmsQAgxLubMrxEimG6-oaCYX8zojf0bDECjdIaAiaREALw_wcB;sid=bf39f5892f9698d4cff8bd83efad420b;all_sr_blocks=7635511_255288926_4_42_0;checkin=2021-04-22;checkout=2021-04-23;dest_id=-570760;dest_type=city;dist=0;group_adults=2;group_children=0;hapos=5;highlighted_blocks=7635511_255288926_4_42_0;hpos=5;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;sr_pri_blocks=7635511_255288926_4_42_0__15336;srepoch=1618499863;srpvid=27c06b8b1f8a0031;type=total;ucfs=1&#hotelTmpl";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(myurl));
					
					}catch(Exception e1) {
						
						e1.printStackTrace();
						
					}
						
				}		
				
				
				
				
				
				
				
			}
		});
		btnNewButton_3.setBounds(478, 478, 89, 23);
		panel_1.add(btnNewButton_3);
		
		// Creare buton pt rezervarea primului restaurant de pe lista 
		JButton btnNewButton_4 = new JButton("Rezerva");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String locatie = lblNewLabel.getText() ;
				
				if(locatie == "Londra(Uk)"  ) { // Caz1 Destinatie:"Londra"
				
					try {
					String myurl = "https://www.opentable.co.uk/restref/client/?rid=98247&restref=98247&partysize=2&datetime=2021-04-15T19%3A00&lang=en-GB&r3uid=H0KC5shtS&corrid=7f973179-7761-4ce3-a326-929fe9f5baa5";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(myurl));
					
					}catch(Exception e1) {
						
						e1.printStackTrace();
						
					}
						
				}else if(locatie == "Paris(Franta)"  ) {// Caz2 Destinatie:Franta
				
					try {
					String myurl = "https://www.guysavoy.com/";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(myurl));
					
					}catch(Exception e1) {
						
						e1.printStackTrace();
						
					}
						
				}else if(locatie == "Ottawa(Canada)"  ) { // Caz3 Destinatie:Ottawa
				
					try {
					String myurl = "http://www.caravelaottawa.com/#menu-3-section";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(myurl));
					
					}catch(Exception e1) {
						
						e1.printStackTrace();
						
					}
						
				}
				
				
				
			}
		});
		btnNewButton_4.setBounds(378, 65, 89, 23);
		panel_1.add(btnNewButton_4);
		
		//Creare buton pt rezervare/comanda la restaurantul nr 2 de pe lista
		JButton btnNewButton_5 = new JButton("Comanda");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String locatie = lblNewLabel.getText() ;
				
				if(locatie == "Londra(Uk)"  ) {
				
					try {
					String myurl = "https://www.garfunkels.co.uk/";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(myurl));
					
					}catch(Exception e1) {
						
						e1.printStackTrace();
						
					}
						
				}
				if(locatie == "Paris(Franta)"  ) {
					
					try {
					String myurl = "https://www.dorchestercollection.com/en/paris/le-meurice/restaurants-bars/restaurant-le-meurice-alain-ducasse/";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(myurl));
					
					}catch(Exception e1) {
						
						e1.printStackTrace();
						
					}
						
				}
				if(locatie == "Ottawa(Canada)"  ) {
					
					try {
					String myurl = "https://gezelligdining.sitebenefits.com/Menus/tabid/109117/Default.aspx";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(myurl));
					
					}catch(Exception e1) {
						
						e1.printStackTrace();
						
					}
						
				}
				
				
				
				
				
				
			}
		});
		btnNewButton_5.setBounds(379, 275, 89, 23);
		panel_1.add(btnNewButton_5);
		
		// Creare buton pt rezervare/ comanda la restaurantul nr 3 de pe lista 
		JButton btnNewButton_6 = new JButton("Comanda");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String locatie = lblNewLabel.getText() ;
				
				if(locatie == "Londra(Uk)"  ) {
				
					try {
					String myurl = "https://menus.preoday.com/Shake-Shack?isMobile=true#/main/choose-branch";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(myurl));
					
					}catch(Exception e1) {
						
						e1.printStackTrace();
						
					}
						
				}
				if(locatie == "Paris(Franta)"  ) {
					
					try {
					String myurl = "https://www.yannick-alleno.com/en/restaurants-reservation/restaurant-3-etoiles-paris.html";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(myurl));
					
					}catch(Exception e1) {
						
						e1.printStackTrace();
						
					}
						
				}
				if(locatie == "Ottawa(Canada)"  ) {
					
					try {
					String myurl = "https://www.labottega.ca/";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(myurl));
					
					}catch(Exception e1) {
						
						e1.printStackTrace();
						
					}
						
				}
				
				
			}
		});
		btnNewButton_6.setBounds(379, 478, 89, 23);
		panel_1.add(btnNewButton_6);
		
		JButton btnNewButton_8 = new JButton("Detalii");
		btnNewButton_8.setVisible(false);
		
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
String locatie = lblNewLabel.getText() ;
				
				if(locatie == "Londra(Uk)"  ) { // Caz1 Destinatie:"Londra"
				
					try {
					String myurl = "https://ro.wikipedia.org/wiki/British_Museum";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(myurl));
					
					}catch(Exception e1) {
						
						e1.printStackTrace();
						
					}
						
				}else if(locatie == "Paris(Franta)"  ) {// Caz2 Destinatie:Franta
				
					try {
					String myurl = "https://ro.wikipedia.org/wiki/Turnul_Eiffel";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(myurl));
					
					}catch(Exception e1) {
						
						e1.printStackTrace();
						
					}
						
				}else if(locatie == "Ottawa(Canada)"  ) { // Caz3 Destinatie:Ottawa
				
					try {
					String myurl = "https://en.wikipedia.org/wiki/Rideau_Canal";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(myurl));
					
					}catch(Exception e1) {
						
						e1.printStackTrace();
						
					}
						
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
		});
		btnNewButton_8.setBounds(277, 65, 89, 23);
		panel_1.add(btnNewButton_8);
		
		JButton btnNewButton_8_1 = new JButton("Detalii");
		btnNewButton_8_1.setVisible(false);
		btnNewButton_8_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String locatie = lblNewLabel.getText() ;
				
				if(locatie == "Londra(Uk)"  ) {
				
					try {
					String myurl = "https://ro.wikipedia.org/wiki/Turnul_Londrei";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(myurl));
					
					}catch(Exception e1) {
						
						e1.printStackTrace();
						
					}
						
				}
				if(locatie == "Paris(Franta)"  ) {
					
					try {
					String myurl = "https://ro.wikipedia.org/wiki/Gr%C4%83dina_Luxemburg";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(myurl));
					
					}catch(Exception e1) {
						
						e1.printStackTrace();
						
					}
						
				}
				if(locatie == "Ottawa(Canada)"  ) {
					
					try {
					String myurl = "https://en.wikipedia.org/wiki/Parliament_Hill";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(myurl));
					
					}catch(Exception e1) {
						
						e1.printStackTrace();
						
					}
						
				}
				
				
				
				
				
				
				
			}
		});
		btnNewButton_8_1.setBounds(280, 275, 89, 23);
		panel_1.add(btnNewButton_8_1);
		
		JButton btnNewButton_8_2 = new JButton("Detalii");
		btnNewButton_8_2.setVisible(false);
		btnNewButton_8_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String locatie = lblNewLabel.getText() ;
				
				if(locatie == "Londra(Uk)"  ) {
					
					try {
					String myurl = "https://ro.wikipedia.org/wiki/Roata_din_Londra";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(myurl));
					
					}catch(Exception e1) {
						
						e1.printStackTrace();
						
					}
						
				}
				if(locatie == "Paris(Franta)"  ) {
					
					try {
					String myurl = "https://ro.wikipedia.org/wiki/Arcul_de_Triumf_din_Paris";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(myurl));
					
					}catch(Exception e1) {
						
						e1.printStackTrace();
						
					}
						
				}
				if(locatie == "Ottawa(Canada)"  ) {
					
					try {
					String myurl = "https://en.wikipedia.org/wiki/National_Gallery_of_Canada";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(myurl));
					
					}catch(Exception e1) {
						
						e1.printStackTrace();
						
					}
						
				}
				
				
				
				
				
				
				
				
			}
		});
		btnNewButton_8_2.setBounds(280, 478, 89, 23);
		panel_1.add(btnNewButton_8_2);
		
		 
		btnNewButton_1.setVisible(false);
		// Creare buton pt rezervarea hotelului nr 3 de pe lista
		btnNewButton_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
			String locatie = lblNewLabel.getText() ;
				
			if(locatie == "Londra(Uk)"  ) {
			
				try {
				String myurl = "https://www.booking.com/hotel/gb/st-george-39-s-wembley.ro.html?aid=319855;label=st-george-NyuyajpRIBskjSuJmG4Z5AS393398206025%3Apl%3Ata%3Ap1%3Ap2%3Aac%3Aap%3Aneg%3Afi%3Atikwd-1851286828%3Alp21275%3Ali%3Adec%3Adm%3Appccp%3DUmFuZG9tSVYkc2RlIyh9YTiRJUvwM0AZLe42zm-29mc;sid=bf39f5892f9698d4cff8bd83efad420b;all_sr_blocks=130783308_91858854_0_0_0;checkin=2021-04-21;checkout=2021-04-22;dest_id=-2601889;dest_type=city;dist=0;group_adults=2;group_children=0;hapos=4;highlighted_blocks=130783308_91858854_0_0_0;hpos=4;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;sr_pri_blocks=130783308_91858854_0_0_0__5500;srepoch=1618486003;srpvid=d57b5079b35f01a8;type=total;ucfs=1&#hotelTmpl";
				java.awt.Desktop.getDesktop().browse(java.net.URI.create(myurl));
				
				}catch(Exception e1) {
					
					e1.printStackTrace();
					
				}
					
			}else if(locatie == "Paris(Franta)"  ) {
			
				try {
				String myurl = "https://www.booking.com/hotel/fr/elyseesunion.ro.html?aid=319856;label=fr-fiCD%2A64t%2AOX650ENr%2AhxswS152454951741%3Apl%3Ata%3Ap1%3Ap2%3Aac%3Aap%3Aneg%3Afi%3Atikwd-4348838222%3Alp21275%3Ali%3Adec%3Adm%3Appccp%3DUmFuZG9tSVYkc2RlIyh9YURcq_26dhSxQ4lAWSVBlCA;sid=bf39f5892f9698d4cff8bd83efad420b;all_sr_blocks=5002602_240193774_0_2_0;checkin=2021-04-21;checkout=2021-04-22;dest_id=73;dest_type=country;dist=0;group_adults=2;group_children=0;hapos=3;highlighted_blocks=5002602_240193774_0_2_0;hpos=3;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;sr_pri_blocks=5002602_240193774_0_2_0__8058;srepoch=1618494661;srpvid=d1066162a71400b0;type=total;ucfs=1&#hotelTmpl";
				java.awt.Desktop.getDesktop().browse(java.net.URI.create(myurl));
				
				}catch(Exception e1) {
					
					e1.printStackTrace();
					
				}
					
			}
			else if(locatie == "Ottawa(Canada)"  ) {
				
				try {
				String myurl = "https://www.booking.com/hotel/ca/w-ottawa.ro.html?aid=1250365;label=huno.1%3ACj0KCQjwyN-DBhCDARIsAFOELTnGvyjSjDgupuXxp1wmsQAgxLubMrxEimG6-oaCYX8zojf0bDECjdIaAiaREALw_wcB;sid=bf39f5892f9698d4cff8bd83efad420b;all_sr_blocks=7638819_94108797_0_0_0;checkin=2021-04-22;checkout=2021-04-23;dest_id=-570760;dest_type=city;dist=0;group_adults=2;group_children=0;hapos=1;highlighted_blocks=7638819_94108797_0_0_0;hpos=1;no_rooms=1;room1=A%2CA;sb_price_type=total;sr_order=popularity;sr_pri_blocks=7638819_94108797_0_0_0__21723;srepoch=1618502695;srpvid=c856711332fa01ae;type=total;ucfs=1&#hotelTmpl";
				java.awt.Desktop.getDesktop().browse(java.net.URI.create(myurl));
				
				}catch(Exception e1) {
					
					e1.printStackTrace();
					
				}
					
			}

			
			}
		});
		
		// Ascundem anumite butoane
		btnNewButton_1.setVisible(false);
		btnNewButton_2.setVisible(false); 
		btnNewButton_3.setVisible(false);
		btnNewButton_4.setVisible(false);
		btnNewButton_5.setVisible(false); 
		btnNewButton_6.setVisible(false);
		
		// Creare buton "Hoteluri"
		JButton btnNewButton = new JButton("HOTELURI");
		lblDestinatiaDvs_1_1.setVisible(false);
		//Fct apelata de acest buton cand este apasat
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Activam anumite butoane si label-uri
				lblDestinatiaDvs_1_1.setVisible(true);
				lblNewLabel_3.setText("HOTELURI");
				btnNewButton_1.setVisible(true);
				btnNewButton_2.setVisible(true); 
				btnNewButton_3.setVisible(true); 
				btnNewButton_4.setVisible(false);
				btnNewButton_5.setVisible(false); 
				btnNewButton_6.setVisible(false);
				btnNewButton_8.setVisible(false);
				btnNewButton_8_1.setVisible(false);
				btnNewButton_8_2.setVisible(false);
				lblNewLabel_2.setVisible(true);
				
				String locatie = lblNewLabel.getText() ; // Extragem destinatia aleasa si o stocam intr-o variabila
				
				if(locatie == "Londra(Uk)"  ) {//Caz1 Destinatie: Londra
				
				// Setam label-ul sa afiseze numele hotelului urmator	
				lblNewLabel_2.setText("St George's Hotel");	
				//Afisam informatiile despre hotel pe obiectul de tip TextArea
				textArea.setText("Descriere:\n" + 
							" George's Hotel - Wembley are o receptie cu program nonstop si un bar.\n"
							+ " Printre alte facilitati, proprietatea include sali de conferinte, un serviciu de bilete "+ 
							"\n si un birou de turism.\n" 
							+ " La un cost suplimentar, puteti sa savurati in fiecare dimineata un mic dejun continental\n" +
														
							
							"Stele:4"
							);
				// Setam label-ul sa afiseze numele hotelului urmator		
				lblNewLabel_4.setText("The Cleveland");			
				//Afisam informatiile despre hotel pe obiectul de tip TextArea
				textArea_1.setText("Descriere:\n" + 
							"  The Cleveland Square links modern design with Victorian period features.\n " +
				 "  Each air-conditioned unit features a flat-screen TV, a seating area and luxury private bathroom.\n"+
							"Friendly, multilingual staff are on hand 24-hours a day.\n"+
				 "  There are 4 major London Underground stations within a 10-minute walk of The Cleveland.\n "+
							" The West End, Westminster and the South Bank are all within 15 minutes on the Underground.\n"+
							"Stele:4"
							);
				
				lblNewLabel_4_1.setText("The Savoy");
				textArea_1_1.setText("Descriere:\n" + 
							" Cele 195 de camere si 73 de suite ale Hotelului Savoy sunt decorate în stil Edwardian\n"+
							" îmbinând confortul si eleganta cu dotarile tehnice discrete. Numaroase camere ofera vedere superba\n"+

							" La Hotelul Savoy veti gasi unele dintre cele mai cunoscute restaurante si baruri din Londra,\n"+
							" cum ar fi Kaspar’s Seafood Bar and Grill, Gordon Ramsay’s Savoy Grill sau institutia britanica Simpson's-In-The-Strand. \n"+
							" Puteti savura ceaiul de dupa-amiaza la Thames Foyer, apoi puteti vizita American Bar \n"+
							" (considerat a fi unul dintre cele mai bune baruri de hotel din lume)\n"+
							"Stele:5"
							);
			
				}				
				
				else if(locatie == "Paris(Franta)" ) {//Caz 2 Destinatie: Paris
					lblNewLabel_2.setText("Elysees Union");	
					
					//Clear celor trei obiecte de tip textArea pe care s-au afisat informatiile despre hotelurile din Londra
					textArea.setText("");
					textArea_1.setText("");
					textArea_1_1.setText("");
					
					///!!!!!!! OBS : S-au create alte 3 obiecte de tip textArea pt ca cele de dinainte nu mai pot fi refolosite
					//In total (pana acum) avem 3 obiecte txtArea pt afisarea infos din Londra si cu 3 obiecte de txtArea pt afisare infos din Paris = 6
					
					
					//Afisare informatii(despre hotelurile din Paris) pe obiectele de tip TextArea
					textArea_2.setText("Descriere:\n" + 
							" Elysees Union este situat intr-o cladire din secolul al XIX-lea din Paris\n"
							+ " si are o gradina interioara si camere si apartamente cu aer conditionat.\n"
							+ "Hotelul se afla la doar 12 minute pe jos de Turnul Eiffel.\n"

							+" Toate camerele si apartamentele sunt izolate fonic si echipate cu TV prin satelit. \n"
							+ " Camerele sunt decorate în stil clasic si dotate cu baie privata cu uscator de par.\n"+
														
							
							"Stele:3"
							);
							
				lblNewLabel_4.setText("Radisson Blu Hotel");							
				textArea_3.setText("Descriere:\n" + 
						" Situat la 300 de metri de gara Part-Dieu,\n "
						+ "acest hotel are un bar-restaurant cu vedere panoramica la Lyon de la etajul 32\n"
						+ " al turnului emblematic Part Dieu. Ofera un centru de fitness si WiFi gratuit"
						+ " Hotelul asigura parcare privata, la un cost suplimentar.\n"+
						
							
							
							"Stele:4"
							);
				lblNewLabel_4_1.setText("Oceania Saint Malo");			
				textArea_4.setText("Descriere:\n" + 
						" The Oceania Saint Malo hotel faces the sea and is located on Chaussée du Sillon,\n"
						+"opposite Sillon Beach and 450 metres from Saint-Malo Marina.\n"
						+ "It offers luxurious rooms and guests have free access to spa area and swimming pool.\n"
						+ "They include flat-screen TV, free WiFi and a spacious bathroom.\n"
						
						+ " The terrace has a panoramic sea view. The open-air hot tub is located on the patio. \n"+
						 

						
							"Stele:5"
							);
			
					
					
				}
				else if(locatie == "Ottawa(Canada)" ) {//Caz3 Destinatie: Ottawa
					lblNewLabel_2.setText("The Westin Ottawa");	
					// Stergem continutul obiectelor txtArea de dinainte
					textArea.setText("");
					textArea_1.setText("");
					textArea_1_1.setText("");
					
					// !!!! OBS: AM MAI CREAT INCA 3 OBIECTE  TXTAREA pt afisarea informatiilor despre Ottawa
					// In total : 6 de dinainte si cu 3 = 9 obiecte de tip txtArea;
					// Ele sunt suprapuse unele peste altele ca sa para un singur obiect 
					
					
					//Afisare informatii pe obiectul de tip txtArea
					textArea_5.setText("Descriere:\n" + 
							"Galeria de Arta din Ottawa este la 5 minute de mers pe jos de hotelul Westin Ottawa.\n"
							+ " Universitatea din Ottawa se afla la 15 minute de mers pe jos de hotel, iar Dealul Parlamentului\n"
							+ "este la cativa pasi.\n"+

							"Acesta este locul preferat de turistii din Ottawa, conform comentariilor independente."+
							
							"\nStele:3"
							);
							
				lblNewLabel_4.setText("Days Inn");							
				textArea_6.setText("Descriere:\n" + 
						"Days Inn Downtown Ottawa se afla la cativa pasi de cladirile Parlamentului si\n "
						+ "Galeriei Nationale de Arta. La doar 2 strszi de hotel, oaspetii pot face cumparaturi\n"
						+ " la piata Byward sau la centrul comercial Rideau.\n"
						+ " Puteti ajunge in doar cateva minute la Universitatea din Ottawa si Casino du Lac Leamy.\n"+
						
							
							
							"Stele:4"
							);
				lblNewLabel_4_1.setText("Les Suites Hotel");			
				textArea_7.setText("Descriere:\n" + 
						"Les Suites Hotel features one and two-bedroom suites with fully equipped kitchens\n"
						+ " as well as washers and tumble dryers. The pet-friendly suites also boast comforts\n"
						+ "such as free wireless high-speed internet access and free local calls.\n"
						+"After working out in the 24-hour fitness centre, guests at the Les Suites\n"
						+ " can go for a swim in the indoor pool. \n"+
						 

						
							"Stele:5"
							);
			
					
					
				}
							
							
			 
				
				
				
			}
		});
		
		btnNewButton.setBounds(10, 140, 97, 23);
		panel.add(btnNewButton);
		
		// Creare buton "Restaurante" si fct apelata de acesta
		JButton btnRestaurante = new JButton("RESTAURANTE");
		btnRestaurante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Ascundem anumite butoane cand btn "Restaurante" este apasat
				
				btnNewButton_1.setVisible(false);
				btnNewButton_2.setVisible(false); 
				btnNewButton_3.setVisible(false);
				btnNewButton_8.setVisible(false);
				btnNewButton_8_1.setVisible(false);
				btnNewButton_8_2.setVisible(false);
				
				btnNewButton_4.setVisible(true);
				btnNewButton_5.setVisible(true); 
				btnNewButton_6.setVisible(true); 
				lblNewLabel_2.setVisible(true);
				
				// Setam acest label sa afiseze " Restaurante"
				lblNewLabel_3.setText("RESTAURANTE");
				
				String locatie = lblNewLabel.getText() ; // Extragem destinatia aleasa
				
				if(locatie == "Londra(Uk)"  ) {//Caz1 Destinatie : Londra
				
					//Afisare informatii pe obiectele de tip Txt Area
				lblNewLabel_2.setText("ELECTRIC DINER");	
				textArea.setText("Descriere:\n" + 
							"Electric Diner serves a French-American menu,\n"+ 
						"including shaved rib of beef sandwich, Diner hot dog, double cheeseburger,\n"+
							"and honey-fried chicken with chilli."
														
							);
							
				lblNewLabel_4.setText("Garfunkels");							
				textArea_1.setText("Descriere:\n" + 
						"Garfunkel's is a small chain of restaurants in London. \n"+
						"It was founded in 1979 by Phillip Kaye, and is now part of the Restaurant Group.\n"+
						"We're the original British restaurant offering something for everyone at breakfast, "
						+ "lunch & dinner around some of London's most famous landmarks."
							);
				
				lblNewLabel_4_1.setText("Shake Shack la Piccadilly’s Circus");
				textArea_1_1.setText("Descriere:\n" + 
						"Located a stone’s throw away from London’s vibrant Leicester Square\n "
						+ "and Piccadilly Circus, our flagship Shack serves up delicious burgers,\n"
						+ " hot dogs, dense & rich frozen custard, hand-spun shakes, beer, wine and more.\n"
							
							);
			
				}
				
				if(locatie == "Paris(Franta)"  ) {//Caz2 Destinatie:Paris
					
					//Afisare informatii pe obiectele de tip txtArea
					lblNewLabel_2.setText("Guy Savoy");	
					textArea_2.setText("Descriere:\n" + 
							"Desemnat doi ani la rând drept “cel mai bun restaurant din lume”,\n"
							+ " Guy Savoy este renumit nu numai pentru mancare, dar si pentru serviciile impecabile.\n"
							+ "Personalul din acest restaurant, premiat cu trei stele Michelin,\n"
							+ " este intotdeauna prietenos si zambitor.\n "
							+ "Supa de anghinare de la Guy Savoy este un preparat renumit de pe meniul lor.\n"
															
								);
								
					lblNewLabel_4.setText(" Le Meurice");							
					textArea_3.setText("Descriere:\n" + 

                     "Le Meurice este unul dintre cele mai elegante hoteluri din lume,\n"
                     + "decorat în stilul opulent al secolului al XVIII-lea.\n"
                     + " Restaurantul din cadrul hotelului este întruchiparea luxului: podeaua de mozaic,\n"
                     + " candelabrele de cristal, draperiile grele de damasc de la ferestrele cu vedere\n"
                     + " la gradinile Tuileries te fac sa te simti ca un adevarat aristocrat.\n"
								);
					
					lblNewLabel_4_1.setText("Pavillon Ledoyen");
					textArea_4.setText("Descriere:\n" + 
						"Alleno din Pavillon Ledoyen este unul dintre cele mai vechi restaurante din Paris.\n"
						+ " Pavillon Ledoyen si-a deschis portile în 1972 si era unul dintre \n"
						+ "cele mai apreciate si frecventate localuri din Belle Epoque.\n"
						+ " Incarcat de istorie, restaurantul Alleno are trei stele Michelin\n"
						+ "si piesa sa de rezistenta o reprezinta preparatele culinare exceptionale.\n"
								
								);
				
					}
				if(locatie == "Ottawa(Canada)"  ) {//Caz3 Destinatie:Ottawa
						
					//Afisare informatii pe obiectele de tip txtArea
						lblNewLabel_2.setText("Caravela");	
						textArea_5.setText("Descriere:\n" + 
								" Caravela opened in December 2016 and is located in Orleans near Landmark Theater.\n"
								+ " Since then, Fernando Diniz has been serving both quality interpretations\n"
								+ "of classic dishes and daring\n"
								+ " new ventures into the uncharted territories of food.\n"
								
								+ "Caravela's interior, designed by the award-winning Richard Bergeron,"
								+ " reflects the hip \n"
								+ "sensibilities of the surrounding area while also paying tribute\n"
								+ "to Portugal's storied past.\n"
																
									);
									
						lblNewLabel_4.setText(" Gezelling");							
						textArea_6.setText("Descriere:\n" + 

                        "  Our modern menu encompasses broad inspirations from around the world,\n"
                        + " presented in both comfortable and inspiring ways, designed for our neighbourhood clientele.\n"
                        + " Chef Shane Brown believes very strongly in local and sustainable food being sourced directly \n"
                        + "from the farmer or producer, and we try hard to integrate these special \n"
                        + "products on our menu as often and fully as possible.\n"
									);
						
						lblNewLabel_4_1.setText("La Bottega");
						textArea_7.setText("Descriere:\n" + 
								"La Bottega has become a local favourite. The store caters to gourmets and Italian nonnas from\n "
								+ "all over the city of Ottawa and beyond. Chefs from the city's finest restaurants and hotels \n"
								+ "can always be found shopping at La Bottega. Our Nicastro brand products\n"
								+ " have become a true success.\n"
									
									);
					
						}
				
					
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
		});
		btnRestaurante.setBounds(10, 182, 126, 23);
		panel.add(btnRestaurante);
		
		//Creare buton "Atractii turistice" si fct apelata de acesta
		JButton btnAtractiiTuristice = new JButton("ATRACTII TURISTICE");
		btnAtractiiTuristice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Se dezactiveaza anumite butoane
				
				lblNewLabel_3.setText("ATRACTII TURISTICE");
				btnNewButton_1.setVisible(false);
				btnNewButton_2.setVisible(false); 
				btnNewButton_3.setVisible(false); 
				btnNewButton_4.setVisible(false);
				btnNewButton_5.setVisible(false); 
				btnNewButton_6.setVisible(false);
				btnNewButton_8.setVisible(true);
				btnNewButton_8_1.setVisible(true);
				btnNewButton_8_2.setVisible(true);
				lblNewLabel_2.setVisible(true);
				
				String locatie = lblNewLabel.getText() ; // Extragem destinatia aleasa
				
				if(locatie == "Londra(Uk)"  ) { // Caz1 Destinatie:Londra
				
					
					//Afisare informatii
				lblNewLabel_2.setText("British Museum");	
				textArea.setText("Descriere:\n" + 
						"Fondat în 1753, British Museum este unul dintre cele mai vechi\n "
						+ "si mai impozante muzee din lume, cu exponate variind de la mumii egiptene la comori romane. \n"
						+ "British Museum a fost fondat în anul 1753, fiind primul muzeu national public din lume.\n "
						+ "Inca de la început admitea intrarea libera pentru 'toate persoanele studioase si curioase'\n"+
										
							
							"\nStele : 4.7"
							);
							
				lblNewLabel_4.setText("Turnul Londrei");							
				textArea_1.setText(" Descriere:\n" + 
					"Palatul Regal si Cetatea Majestatii Sale, denumit si Turnul Londrei,\n "
					+ "este un castel istoric aflat pe malul nordic al Tamisei în centrul Londrei.\n"
					+ " El se afla in burgul londonez Tower Hamlets, separat de marginea \n"
					+ "estica a City of London de un spatiu deschis denumit Dealul Turnului.\n"+
							
							"\nStele:4.6"
							);
				
				lblNewLabel_4_1.setText("Roata din Londra");
				textArea_1_1.setText("Descriere:\n" + 
						" Roata din Londra, cunoscuta sub numele de ''Ochiul Londrei'' reprezinta o roata giganta\n"
						+ " de observatie din Londra aflata in Gradinile Jubilee de pe malul sudic al raului Tamisa\n."
						+ " Structura are o inaltime de 135 m si a fost construita ca parte a celebrarii noului mileniu \n"+
						" London Eye - Millenium\n"+
							
							"\n Stele:4.5"
							);
			
				}
				
				if(locatie == "Paris(Franta)"  ) {//Caz2 Destinatie:Paris
					
					
					//Afisare informatii
					
					lblNewLabel_2.setText("Turnul Eiffel");	
					textArea_2.setText(" Descriere:\n" + 
							"Turnul Eiffel este o constructie faimoasa pe schelet de otel din Paris \n"
							+ "ce masoara 324 m inaltime. Turnul a devenit simbolul Frantei cel mai raspandit\n"
							+ "la nivel mondial. A fost conceput de catre Emile Nouguier, Maurice Koechlin si Stephen Sauvestre,\n"
							+ " angajati la Eiffel si Co. Gustave Eiffel, initial reticent cu privire la proiect,\n"
							+ " a devenit ulterior un mare sustinator al sau si a cumparat brevetul.\n"+
											
								
								"\nStele:4.6"
								);
								
					lblNewLabel_4.setText("Gradina Luxemburg");							
					textArea_3.setText("Descriere:\n" + 
							"Gradina Luxemburgului este o gradina privata deschisa publicului,\n"
							+ " situata în arondismentul VI din Paris. A fost creata în 1612 la cererea Mariei\n"
							+ "de Medici. Sub Primul Imperiu, restaurarea gradinii a fost condusa de catre arhitectul\n"
							+ " Jean-Fransois-Therese Chalgrin. Gradina se întinde pe 23 de hectare, \n"
							+ "fiind insufletita de randurile de flori si de sculpturi."+
								
								"\nStele:4.6"
								);
					
					lblNewLabel_4_1.setText("Arcul de Triumf");
					textArea_4.setText("Descriere:\n" + 
						"Arcul de Triumf este un monument situat în Paris, în Place de l'Etoile,\n"
						+ " la extremitatea vestica a bulevardului Champs-Elysees. Se afla pe o esplanada\n"
						+ " circulara cu un diametru de 120 m, la intersectia a douazeci de bulevarde,\n"
						+ " cum ar fi Kleber, Grande Armee, Wagram si Champs-Elysees."+
								
								"\n Stele:4.5"
								);
				
					}
				if(locatie == "Ottawa(Canada)"  ) {//Caz3 Destinatie:Ottawa
					
					//Afisare informatii
					
					lblNewLabel_2.setText("Rideau Canal");	
					textArea_5.setText("Descriere:\n" + 
						"The Rideau Canal, also known unofficially as the Rideau Waterway,\n"
						+ " connects Canada's capital city of Ottawa,\n"
						+ " Ontario, to Lake Ontario and the Saint Lawrence River at Kingston, Ontario.\n"
						+ " It is 202 kilometres long.\n"
						+ " The name Rideau, French for 'curtain', is derived from the curtain-like appearance\n"
						+ "of the Rideau River's\n"
						+ "twin waterfalls where they join the Ottawa River\n"
											
								
							
								);
								
					lblNewLabel_4.setText("Parliament Hill");							
					textArea_6.setText("Descriere:\n" + 
							"Parliament Hill (French: Colline du Parlement), colloquially known as The Hill,\n"
							+ "is an area of Crown land on the southern banks of the Ottawa River in downtown Ottawa,\n"
							+ " Ontario, Canada. Its Gothic revival suite of buildings is the home of the Parliament\n"
							+ "of Canada and has architectural elements of national symbolic importance.\n"
							+ " Parliament Hill attracts approximately 3 million visitors each year. \n"
								
								);
					
					lblNewLabel_4_1.setText("National Gallery of Canada");
					textArea_7.setText("Descriere:\n" + 
					"The National Gallery of Canada (French: Musée des beaux-arts du Canada), located\n"
					+ "in the capital city of Ottawa,\n"
					+ " Ontario, is Canada's national art museum.[7] The museum's building takes up\n"
					+ " 46,621 square metres (501,820 sq ft),\n"
					+ " with 12,400 square metres (133,000 sq ft) of space used for exhibiting art;\n"
					+ " making the museum one of the largest art museums in North America by exhibition space.\n"
						
								
								);
				
					}
				
				
				
				
				
				
				
				
				
				
				
				
			}
		});
		btnAtractiiTuristice.setBounds(10, 230, 161, 23);
		panel.add(btnAtractiiTuristice);
		
		//Creare buton pt redirectionrea utilizatorului pe pagina principala
		JButton btnNewButton_7 = new JButton("<-----");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Se face vizibila pagina principala 
				GUI_agency_travel.frame.setVisible(true);
				Entertainment.frame.setVisible(false);
				GUI_agency_travel.rdbtnNewRadioButton.setSelected(false);
			}
		});
		btnNewButton_7.setBounds(10, 638, 89, 23);
		panel.add(btnNewButton_7);
		
		
		 
			
		}
	}

