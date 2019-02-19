package promedios;
import java.util.Scanner;

public class Promedios {

    public static void main(String[] args) {
        float calificacion,creditos, acumpapaCREXCAL=0, acumpaCREXCAL=0, acumpapiCREXCAL=0, acumCRE=0, creditospapi, creditospa, acumCREpapi=0, acumCREpa=0;
        String NameMatter, decision, si="si", no="no";
        int asignaturas;
        int cont = 1;
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("Cuantas materias inscribio este semestre");
        asignaturas=teclado.nextInt();
        for(int i=1; i <=asignaturas;i++){
            
            System.out.println("nombre de la materia");
            NameMatter=teclado.nextLine();
            System.out.println("cuantos creditos tiene en la materia " + cont);
            creditos=teclado.nextInt();
            creditospapi=creditos;
            creditospa=creditos;
            
            
            System.out.println("Cual fue su nota final");
            calificacion=teclado.nextFloat();
            
            System.out.println("¿la cancelo despues de la segunda semana? (si/no)");
            decision=teclado.next();
            
            if(decision.equals(si)){
                System.out.println("mucha loca por no lucharla");
            }
            else{
                acumpapaCREXCAL=(creditos*calificacion)+acumpapaCREXCAL;
                acumCRE=acumCRE+creditos;
            }
            if(decision.equals(si)){
                System.out.println("");
                acumCREpapi=acumCREpapi+creditospapi;
                calificacion=0; 
                acumpapiCREXCAL=(creditospapi*calificacion)+acumpapiCREXCAL;
            }
            else{
                acumpapiCREXCAL=(creditospapi*calificacion)+acumpapiCREXCAL;
                acumCREpapi=acumCREpapi+creditospapi;
            }
            if(decision.equals(no)){
                if(calificacion>3){
                    acumpaCREXCAL=(creditospa*calificacion)+acumpaCREXCAL;
                    acumCREpa=acumCREpa+creditospa;
                }
                else{
                    
                }
                
            }
            else{
                
            }
            
            cont++;
           
        }
        float PAPA=acumpapaCREXCAL/acumCRE;        
        System.out.println("Su PAPA es de " +PAPA);
        System.out.println(acumpapaCREXCAL);
        System.out.println(acumCRE);
        if(PAPA<3){
            System.out.println("por marica quedo PFU");
        }
        else{
            System.out.println("sigue en la U un semestre mas");
        }
        float PAPI=acumpapiCREXCAL/acumCREpapi;        
        System.out.println("Su PAPI es de " +PAPI);
        System.out.println(acumpapiCREXCAL);
        System.out.println(acumCREpapi);
        float PA=acumpaCREXCAL/acumCREpa;        
        System.out.println("Su PA es de " +PA);
        System.out.println(acumpaCREXCAL);
        System.out.println(acumCREpa);
        
        


               
        
             
    }
    
}

