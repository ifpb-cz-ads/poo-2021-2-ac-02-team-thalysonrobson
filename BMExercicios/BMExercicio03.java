public class BMExercicio03{
    
    public static void main(String[] args){
        float item1 = 2.95f;
        float item2 = 3.50f;
        float custoTotal = 0;
        float taxaBase = 8.25f;
        float taxaCalculada = 0;
        
        System.out.println("O item1 custa: "+ item1 +" e o item2 custa: " + item2);
        
        custoTotal = item1+item2;
        
        System.out.println("O valor total dos itens é: "+ custoTotal);
        
        taxaCalculada = (taxaBase*custoTotal)/100;
        taxaCalculada = taxaCalculada+custoTotal;
        
        System.out.println("O valor dos itens juntamente com a taxa de "+taxaBase+"% ficou por: "+taxaCalculada);
        
        item1+= taxaCalculada;
        item2+= taxaCalculada;
        float novoCusto = item1+item2;
        int i = 0;
        boolean muitoCaro;
        
        for(novoCusto = novoCusto; novoCusto>10; novoCusto++){    
            muitoCaro = true;
            System.out.println("O valor obtido foi maior que 10, logo a variável muitoCaro é: " +muitoCaro);;
            break;

        }
        
        for(novoCusto = novoCusto; novoCusto<10; novoCusto++){    
            muitoCaro = false;
            System.out.println("O valor obtido foi menor que 10, logo a variável muitoCaro é: " +muitoCaro);
            break;

        }
    
    }
} 