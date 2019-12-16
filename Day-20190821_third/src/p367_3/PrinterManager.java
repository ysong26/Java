package p367_3;

import java.util.ArrayList;

public class PrinterManager {
	public int counter;
	private ArrayList<Printer> managedPrinters=new ArrayList<Printer>();
	private static PrinterManager mgr=null;

	public PrinterManager() {
		managedPrinters.add(new Printer());
		managedPrinters.add(new Printer());
		managedPrinters.add(new Printer());
	}
	
	public static synchronized PrinterManager getPrinterManager() {
		if(mgr==null) {
			mgr=new PrinterManager();
		}
		return mgr;
	}
	
	public synchronized Printer getPrinter() {
		while(true) {
			for(Printer printer:managedPrinters) {
				if(printer.isAvailable()) {
					printer.setAvailable(false);
					return printer;
				}
				
			}
		}
		
	}
}