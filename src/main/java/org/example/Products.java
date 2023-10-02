package org.example;
import java.util.Arrays;

public class Products {

    public static void main(String[] args) {
        // 1. Crear un array de cadenas
        String[] Product = new String[20];

        // 2. Inicializar el array
        Product[0] = "Arroz ";
        Product[1] = "Huevos ";
        Product[2] = "Leche ";
        Product[3] = "Frijoles ";
        Product[4] = "Pan ";
        Product[5] = "Lentejas";
        Product[6] = "Manzanas";
        Product[7] = "Aguacate";
        Product[8] = "Cebolla";
        Product[9] = "Garbanzo";
        Product[10] = "Pasta";
        Product[11] = "Calabaza";
        Product[12] = "Tomate ";
        Product[13] = "Mora";
        Product[14] = "Lulo";
        Product[15] = "Queso";
        Product[16] = "Yogurt";
        Product[17] = "Cerveza";
        Product[18] = "Carne";
        Product[19] = "Pollo";

        // 3. Imprimir los elementos del array.
        System.out.print("Nombres: ");
        for (String name : Product) {
            System.out.print(name + " ");
        }
        System.out.println();

        // 4. Imprimir los nombres que empiezan con la letra "A".
        System.out.print("Nombres que empiezan con 'A': ");
        for (String name : Product) {
            if (name.startsWith("A")) {
                System.out.print(name + " ");
            }
        }
        System.out.println();

        // 5. Ordenar e imprimir los nombres en orden alfabético.
        Arrays.sort(Product);
        System.out.print("Nombres ordenados alfabéticamente: ");
        for (String name : Product) {
            System.out.print(name + " ");
        }
        System.out.println();
    }


}