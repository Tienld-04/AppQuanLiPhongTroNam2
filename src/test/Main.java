package test;
import javax.swing.UIManager;

import view.DangNhapView;
public class Main {
   public static void main(String[] args) {
	   try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			 new DangNhapView();
		} catch (Exception e) {  
			e.printStackTrace();
		}
	    
}

}


