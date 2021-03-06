//<<<<<<< HEAD:src/Administration.java
import javax.swing.JPanel;

import java.awt.Rectangle;

import javax.swing.JDesktopPane;

import java.awt.Color;
import java.awt.Component;
import java.awt.SystemColor;

import javax.swing.JTabbedPane;
/***
 * Admin tab, brings in all the managerial functionality tabs
 * Added comment to test github
 * @author Austin
 *
 */
//
//public class Administration extends JPanel {
//	private  JTabbedPane tabbedPane;
//	private   employeeGui empGui;
//	private  orderHistory orderHist;
//	private  employeeTimeTrackingGui empTimeTracking;
//	/**
//	 * Create the panel.
//	 */
//	public Administration(DbAction DBAction) {
//		setBounds(new Rectangle(5, 5, 1100, 550));
//		setLayout(null);
//		
//		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
//		tabbedPane.setBounds(0, 0, 1100, 550);
//		add(tabbedPane);
//		
//		empGui = new employeeGui(DBAction);
//		orderHist = new orderHistory(DBAction);
//		empTimeTracking = new employeeTimeTrackingGui(DBAction);
//		
//		
//		tabbedPane.addTab("Employee Management", empGui.getEmployeeGui());
//		tabbedPane.addTab("Order History", orderHist.getOrderHistory());
//		tabbedPane.addTab("Employee Time Tracking", empTimeTracking);
//		
//		//tabbedPane.addTab("Order History", panelOrderHistory);
//		
//
//	}
//	
//
//	
//	public JTabbedPane getAdminPanel(){
//		return tabbedPane;
//	}
//}
//=======
//import javax.swing.JPanel;
//
//import java.awt.Rectangle;
//
//import javax.swing.JDesktopPane;
//
//import java.awt.Color;
//import java.awt.Component;
//import java.awt.SystemColor;
//
//import javax.swing.JTabbedPane;
///***
// * Admin tab, brings in all the managerial functionality tabs
// * Added comment to test github
// * @author Austin
// *
// */

public class Administration extends JPanel {
	private  JTabbedPane tabbedPane;
	private   EmployeeGui empGui;
	private  OrderHistory orderHist;
	private  EmployeeTimeTrackingGui empTimeTracking;
	/**
	 * Create the panel.
	 */
	public Administration(DbAction DBAction) {
		setBounds(new Rectangle(5, 5, 1100, 550));
		setLayout(null);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 1100, 550);
		add(tabbedPane);
		
		empGui = new EmployeeGui(DBAction);
		orderHist = new OrderHistory(DBAction);
		empTimeTracking = new EmployeeTimeTrackingGui(DBAction);
		
		
		tabbedPane.addTab("Employee Management", empGui.getEmployeeGui());
		tabbedPane.addTab("Order History", orderHist.getOrderHistory());
		tabbedPane.addTab("Employee Time Tracking", empTimeTracking);
		
		//tabbedPane.addTab("Order History", panelOrderHistory);
		

	}
	

	
	public JTabbedPane getAdminPanel(){
		return tabbedPane;
	}
}
//>>>>>>> e0c8ed8f254d6698179f0a316fe946e1a38e17c8:src/Administration.java
