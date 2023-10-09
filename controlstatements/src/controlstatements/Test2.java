package controlstatements;

public class Test2 {
    public static float getTaxRate(String state) {
        float tax; 
        switch (state) {   
            default:   
                tax = 0.05f;
            case "PA":
                tax = 0.06f;
                break;
            case "NJ":
                tax = 0.07f;
                break;
        }
        return tax;    
    }
 
    public static void main(String[] args) {
        var price = 100;
        var tax_rate = getTaxRate("NH");  
        var tax = (int)(price * tax_rate); 
        switch (tax) {         
            case 5:
                System.out.println("Taxed at 5%");
                break;
            case 6:
                System.out.println("Taxed at 6%");
                break;
            case 7:
                System.out.println("Taxed at 7%");
                break;
            default:            
        }
    }
}
