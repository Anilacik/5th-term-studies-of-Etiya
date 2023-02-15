package intro;

public class Main {
			
	public static void main(String[] args) {
			// değişken isimlendirmeleri
		//	System.out.println("selam");
		
		String ortaMetin = "ilgili";
				String altMetin = "vade süresi";
				
			//	System.out.println(ortaMetin + altMetin);
				
			// integer
				int vade = 12;
				
				double dolarDun = 18.14;
				double dolarBugun = 18.14;
				
				boolean dolarDustuMu = false;
				
				String okYonu = "";
				
				if (dolarBugun<dolarDun) {
					okYonu = "down.svg";
					System.out.println(okYonu);
					
				}	
				
				else if (dolarBugun>dolarDun) {
					okYonu = "up.svg";
					System.out.println(okYonu);  
					
					
				}
				else {
					okYonu = "equal.svg";
					//System.out.println(okYonu);
				}
				
				//array
				
				String[] krediler = {"a","b","c"};
				//System.out.println(krediler[0]);
				//System.out.println(krediler[1]);
				//System.out.println(krediler[2]);
				
				for (int i = 0; i < krediler.length; i++) {
					System.out.println(krediler[i]);
				}
				
				
				
	}

}
