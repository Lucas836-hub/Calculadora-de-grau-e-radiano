package Funcoes;

/**
 * 
 * @author LG
 */
public class Retornos {
    public float graui;
    public float g_puro;
    public float numerador;
    public float denominador;
    
    //transformaçao
        public String qp(){
        String qpr = null;
        float qua = graui;
        if (qua > 0 && qua < 90){
            qpr = " 1º quadrante";
        }
        if (qua == 90){
            qpr = "Entre o 1º eo 2º quadrante";
    }
        if (qua > 90 && qua < 180){
        qpr = "2º quadrante";
    }
        if (qua == 180){
        qpr = "Entre o 2º eo 3º quadrante";
    }
        if (qua > 180 && qua < 270){
        qpr = "3º quadrante";
    }
        if (qua == 270){
        qpr ="Entre o 3º eo 4º quadrante";
    }
        if (qua > 270 && qua < 360){
        qpr ="4º quadrante";
    }
        if (qua == 0){
        qpr = "Nulo";
    }

    if (qua == 360){
       qpr= "Deu uma volta completa";
    }
        return qpr;
    }
    
    
    
    public String graurad(){
        //  variaveis
        String respradt= null;
        float ol = 0;
        float respgr = graui;
        float gr= graui;
        float g=0;
        float gf =180f;
         
        // INICIO DO TESTE
        
        if (gr <= 180 ){
            if(gr == 0){
                respradt="Nulo";          
                return respradt;
            }
            if(gr == 180){
                respradt=" &PI ";          
                return respradt;
            }else {
            //OK
                if(180 % gr == 0){
                    g = 180 / gr;
                    respradt="<sup> &PI</sup>/<sub>"+g+"</sub>";
                    ol=180/g;     
                    return respradt;
                
                        }
            //   TRALHANDO!!!
            else{
                //180  r
                //gr   X
                if (gr % 10 == 0){
                    float gr2 = gr;
                    gr/=10;
                    //gr == grau fixo = 180
                    gf /= 10;
                    while(ol != gr2){
                        if(gr%9 == 0 && gf%9 ==0 ){
                            gr /= 9;
                            gf/=9;
                            ol = (gr*180)/gf;
                                    }
                        if (gr % 5 == 0 && gf % 5 == 0){
                            gr /= 5;
                            gf /= 5;
                            ol = (gr * 180) / gf;
                                    }
                        if (gr % 3 == 0 && gf % 3 == 0){
                            gr /= 3;
                            gf /= 3;
                            ol = (gr * 180) / gf;
                                    }
                        if (gr % 2 == 0 && gf % 2 == 0){
                            gr /= 2;
                            gf /= 2;
                            ol = (gr * 180) / gf;
                                    }
                        else{
                            ol = (gr * 180) / gf;
                        ol = (gr * 180) / gf;
                                    }
                                    }
                        }
                    }
            }
            
            //2 parte
            
        }
        else{ 
            float gr2 = gr;
                gr/=10;
                 //gr == grau fixo = 180
                gf /= 10;
                while(ol != gr2){
                    if(gr%9 == 0 && gf%9 ==0 ){
                    gr /= 9;
                    gf/=9;
                    ol = (gr*180)/gf;
                    }
                    if (gr % 5 == 0 && gf % 5 == 0){
                    gr /= 5;
                    gf /= 5;
                    ol = (gr * 180) / gf;
                                    }
                    if (gr % 3 == 0 && gf % 3 == 0){
                    gr /= 3;
                    gf /= 3;
                    ol = (gr * 180) / gf;
                                    }
                    if (gr % 2 == 0 && gf % 2 == 0){
                    gr /= 2;
                    gf /= 2;
                    ol = (gr * 180) / gf;
                                    }
                    else{
                    ol = (gr * 180) / gf;
                    ol = (gr * 180) / gf;
                                    }
                                    }
                        }
        respradt ="<sup>&PI</sup>/<sub>"+gf+"</sub>";                 
        return respradt;
    }
    
    public float radgrau(){
    float grap =0;
    float n = numerador;
    float d = denominador;
        System.out.println("n e d recebidos "+n+"  "+d);
    
    if (d == 0 && n == 0){
        grap = 180;
        System.out.println("zerada");
        return grap;
    }
    if (d == 0 ){
        grap=180*n;
        System.out.println("denominador 0");
        return grap;
    }
    if ( n == 0){
        grap = 180 / d;
        System.out.println("n 0");
        return grap;
                }
    else {
        grap = (180 * n) / d;
        System.out.println("vai ter conta");
        return grap;
            }
            }
    
    public float voltas(){
    float rest=0;
    int a=0;
    float n = numerador;
    float d = denominador;
    while (d < n){
        a += d;
        if (a > n){
            break;
                    }
            }
    a -= d;
    rest = (a % 2);
    if (rest != 0){
        while (rest != 0){
            a -= d;
            rest = (a % 2);
        }
                    }
    rest = n - (rest * 2);
    return rest;
    //rest * 2 - n = rv resto das voltas
        }
    
    public float voltas_grau(){
        System.out.println("iniciei");
    float rest=0;
    int a=1;
    float r =g_puro;
        System.out.println("r "+r+"a "+a);
        
    while (r >= a*360 ){
        a ++;
        System.out.println("a +1");
       }
    rest = a-1;
        System.out.println("rest vale "+rest);
    return rest;
    //rest * 2 - n = rv resto das voltas
        }
                 
/*

*/
                        
    
}
