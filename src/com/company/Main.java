package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Produto[] produtos = new Produto [6];
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < produtos.length - 1; i++) {
            Produto aux = new Produto();
            System.out.println("Digite o nome do produto");
            aux.setNome(entrada.next());
            System.out.println("Digite o preço");
            aux.setPreco(entrada.nextDouble());
            aux.setCodigoDeBarras((i + 10) * 10);
            System.out.println("Codigo De Barras:  ");
            System.out.println(aux.getCodigoDeBarras());
            produtos[i] = aux;
        }

        System.out.println("Digite O codigo de Barras");
        int elemento = entrada.nextInt();
        int resultado = pesquisaBinaria(produtos, elemento);

        if (resultado < 0){
            System.out.println("Não encontrado!" + resultado);
        } else {
            System.out.println("Elemento Encontrado!");
            System.out.println("Numero de Buscas:  " + resultado);

        }
    }
    public static int pesquisaBinaria( Produto[] listaDeProdutos, int codDeBarras ){
        return buscaRecursiva(listaDeProdutos, codDeBarras, 0, listaDeProdutos.length - 1, 1);
    }

    public static int buscaRecursiva( Produto[] listaDeProdutos, int codDeBarras, int menor, int maior, int repeticoes){


        int media = (menor + maior) / 2;

        if (menor > maior){

            return -1;
        }
        if (listaDeProdutos[media].getCodigoDeBarras() == codDeBarras){
            System.out.println("Produto: " + listaDeProdutos[media].getNome());
            System.out.println("Preço: "  + listaDeProdutos[media].getPreco());
            return repeticoes;
        }
        else if(listaDeProdutos[media].getCodigoDeBarras() < codDeBarras){

           return buscaRecursiva(listaDeProdutos, codDeBarras, media + 1, maior, repeticoes + 1);
        } else {

            return buscaRecursiva(listaDeProdutos, codDeBarras, menor, media - 1, repeticoes + 1);
        }
    }

}
