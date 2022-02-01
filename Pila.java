import java.util.Vector;
import java.util.Scanner;
import java.lang.*;
public class Pila
{
        Vector v;
        int top;
        int n;
        boolean vuoto;
        boolean pieno;
    public Pila()
    {
        v = new Vector();
        this.pieno=false;
        this.vuoto= true;
        this.top=-1;
    }
    public Pila(int x)
    {
        v = new Vector(x);
        this.vuoto=true;
        this.pieno=false;
        this.top=-1;
        this.n=x;
    }
    public boolean full()
    {
        if (this.top==this.n-1)
            this.pieno=true;
        else
            this.pieno=false;
        return pieno;
    }
    public boolean empty()
    {
        if (this.top==-1)
        this.vuoto=true;
        else
            this.vuoto=false;
        return vuoto;
    }
    public void push(Object e)
    {
        
        if (!full())
        {top++;
        v.add(top,e);}
        else 
            System.out.println("Pila Piena !");
    }
    public void pop()
    {
        if (!empty())
        {
            v.remove(top);
            top--;
        }
        else
           System.out.println("\n Pila vutoa !");}
    public void stampa()
    {
        int k;
        for (k=0;k<v.size();k++)
        {
            System.out.println("Stampa elemento: " + v.get(k).toString());
            
        }
        System.out.println("\n");
    }
    public  static void main (String args[])
    {
        int scelta;
        int d=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Quanti elementi nello stack ?");
        try
        {d= s.nextInt();}
        catch (Exception e)
        {
            System.out.println("Valore errato riprova !");
            d=s.nextInt();
        }
        Pila Stack = new Pila(d);
        while (true)
        {
        System.out.println("Menu di scelta per la gestione di uno Stack o Pila:");
        System.out.println("1- Inserimento dati nello stack");
        System.out.println("2- Estrazione dati dallo stack");
        System.out.println("3- Stampa dati dallo Stack");
        System.out.println("4- Uscita dal programma");
        do 
        {
            System.out.println("Effettua la scelta 1..4");
            scelta=s.nextInt();
            if ((scelta<1) || (scelta >4))
                System.out.println("Scelta errata !");
        }
        while ((scelta<1) || (scelta >4));
    switch (scelta)
    {
     case 1: 
         {  System.out.println("Inserisci un valore intero");
             int v=s.nextInt();
             Object o= (Object)v;
             Stack.push(o);
             break;
    }
    case 2:
        {
            System.out.println("Estrazione di un elemento dallo stack");
            Stack.pop();
            break;
        }
    case 3:{
            Stack.stampa();
            break;}
    case 4: {
        System.out.println("Fine Esecuzione Arrivederci");
        System.exit(0);
        break;
        
    }
}}  
}   //chiusura main
}  //chisura classe
