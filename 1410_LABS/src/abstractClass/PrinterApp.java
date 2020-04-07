package abstractClass;

public class PrinterApp {

	public static void main(String[] args) {
		Printer[] printers = new Printer[2];
		printers[0] = new InkjetPrinter("Canon TS202");
		printers[1] = new LaserPrinter("Samsung Xpress");

		for (Printer p : printers) {
			System.out.println(p);
			for (int i = 0; i < 11; i++) {
				p.print();
			}
			System.out.println();
		}
		((LaserPrinter) printers[1]).refillToner();
		((InkjetPrinter) printers[0]).refillCartridge();

		for (int i = 0; i < printers.length; i++) {
			if (printers[i] instanceof LaserPrinter) {
				System.out.println(
						"Remaining toner after refilling: " + ((LaserPrinter) printers[i]).getRemainingToner() + "%");
			} else
				System.out.println("Remaining cartridge after refilling: "
						+ ((InkjetPrinter) printers[i]).getRemainingCartridge() + "%");
		}
	}

}
