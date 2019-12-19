

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Pedro Mendoza
 */
public class PrimaV5 {

    /**
     * @param args the command line arguments
     */
    public static double FactorEdad(int edad){
        if(edad<25 && edad>=18){
            return 2.8;
        }
        else if(edad>=25 && edad<35){
            return 1.8;
        }
        else if(edad>=35 && edad<45){
            return 1.0;
        }
        else if(edad>=45 && edad<65){
            return 0.8;
        }
        else if(edad>=65 && edad<=90){
            return 1.5;
        }
        else{
            return 0;
        }
        
        
    }
    
    public static int CalculoRCS(int edad,int ptos){
        
        if(edad<25 && ptos>=29){
            return 50;
        }
        else if(edad>=25 && edad<35 && ptos>=27){
            return 50;
        }
        else if(edad>=35 && edad<45 && ptos>=25){
            return 100;
        }
        else if(edad>=45 && edad<65 && ptos>=23){
            return 150;
        }
        else if(edad>=65 && ptos>=25){
            return 200;
        }
        else{
            return 0;
        }
    }
    
    public static void CalculoPrima(int edad,int ptos){
        
        if(((edad<18 && edad>0) || edad>90) && (ptos>0 && ptos<=30) ){
            System.out.println("No esta dentro del rango de edad");
            
        }
        else if(edad<0 && (ptos>0 && ptos<=30)){
            System.out.println("ERROR");
            
        }
        
        else if((ptos>30 || ptos<0)){
            System.out.println("ERROR");
            
        }
        else if(ptos==0){
            System.out.println("No tiene licencia valida");
        }
        else{
        double prima=(500*FactorEdad(edad))-CalculoRCS(edad,ptos);
        System.out.println(prima);
        
        }
    }
    
    public static boolean isNumeric(String cadena){
        try {
                Integer.parseInt(cadena);
                return true;
        } catch (NumberFormatException nfe){
                return false;
        }
    }
       
    

}