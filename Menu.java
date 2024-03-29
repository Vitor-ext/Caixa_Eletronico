
package caixaeletronico;

import java.util.Scanner;

public class Menu {
    
    public void executarMenu(){
    
        System.out.println("ESCOLHA UMA OPÇÃO: ");
        System.out.println("1 - SALDO");
        System.out.println("2 - DEPÓSITO");
        System.out.println("3 - SAQUE");
        
        Scanner objScanner = new Scanner(System.in);
        Conta objConta = new Conta();
        
        int operacao = objScanner.nextInt();
        float valor = 0;
        
        if (operacao == 1){
            
            //System.out.println("ESCOLHEU A OPÇÃO DE SALDO");
            objConta.verificarSaldo();
            
        }else if (operacao == 2) {
            
            System.out.println("DIGITE UM VALOR DE DEPÓSITO");
            valor = objScanner.nextFloat();
            objConta.realizarDeposito(valor);
            objConta.verificarSaldo();
            
        }else if (operacao == 3) {
            
            System.out.println("DIGITE UM VALOR DE SAQUE");
            valor = objScanner.nextFloat();
            objConta.realizarSaque(valor);
            objConta.verificarSaldo();
            
        }else{
        
            System.out.println("OCORREU UM ERRO!!!");
        }
        
    }
    
}
