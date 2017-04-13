package it.tecnosphera.preventivi;
 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class App {
   
    private static final int ESCI = 0;
    private static final int NUOVO_CLIENTE = 1;
    private static final int VEDI_CLIENTI = 2;
   
    private List<Customer> listaClienti;
 
    public App() {
    	
    		listaClienti = new ArrayList<>();
    		listaClienti.add(new Customer("Matteo", "Avanzini"));
    	
        Scanner sc = new Scanner(System.in);
 
        int input = -1;
        while (input != App.ESCI) {
            System.out.println("Scegli cosa fare:");
            System.out.println("\t 1) Inserisci nuovo cliente");
            System.out.println("\t 2) Vedi  tutti clienti");
            System.out.println("\t 0) Esci");
 
            String str = sc.nextLine();
 
            if (isNumeric(str)) {
                input = Integer.parseInt(str);
            } else {
                System.out.println("La stringa inserita non è un numero.");
                continue;
            }
 
            switch (input) {
                case App.ESCI:
                    break;
                case App.NUOVO_CLIENTE:
                    Customer customer = inserisciNuovoCliente();
                    listaClienti.add(customer);
                    break;
                case App.VEDI_CLIENTI:
                    vediTuttiClienti();
                    break;
                default:
                    System.out.println("Scegli fra le opzioni date");
            }
 
        }
        System.out.println("Ciao");
    }
   
    private Customer inserisciNuovoCliente() {
    		Customer customer = new Customer();
    		//customer.setName(name);
    		//customer.setSurname(surname);
    		return customer;
    }
    
    private void vediTuttiClienti() {
    		for (int i=0; i<listaClienti.size(); i++) {
    			Customer c = listaClienti.get(i);
    			System.out.println(c.getName() + " " + c.getSurname());
    		}
    }
   
 
    private boolean isNumeric(String str) {
        return true;
 
    }
 
    public static void main(String[] args) {
        new App();
    }
}