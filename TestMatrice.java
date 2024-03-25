package matrice;

public class TestMatrice {
    public static void main(String [] args) {
        int[][] m = {
                {1, 2, 3},
                {4, 5, 6}};
        System.out.println("La somma di tutti i parametri della matrice m è: "+Matrice.sommaMatrice(m));
        System.out.println("Verifichiamo se in m c'è almeno un nullo: "+Matrice.isNullo(m));
        System.out.println("Verifichiamo se m è crescente: "+Matrice.isCrescente(m));
        int[][] m1 = {
                {0, 0, 0},
                {0, 0, 0}};
        System.out.println("Verifichiamo se in m1 siano tutti nulli: "+Matrice.isTuttiNulli(m1));
        int[][] m2 = {
                {0, 0, 0, 0},
                {0, 5, 9, 0},
                {0, 5, 9, 0},
                {0, 0, 0, 0}};
        System.out.println("Verifichiamo la somma del cornicione di m2: "+Matrice.sommaCorniceMatrice(m2));
        System.out.println("Verifichiamo se la somma delle diagonali di m2 siano uguali: "+Matrice.isDiagonaleEquals(m2));
        System.out.println("Verifichiamo se m2 è crescente: "+Matrice.isCrescente(m2));
        int[][] m3 = {
                {0, 0, 0},
                {0, 0, 0}};
        System.out.println("Verifichiamo se in m3 siano tutti uguali: "+Matrice.isTuttiUguali(m3));
        System.out.println("Verifichiamo se m1 è uguale a m3: "+Matrice.isTuttiUgualiConDue(m1,m3));
        System.out.println("Verifichiamo la somma tra m e m2: "+Matrice.sommaConDue(m,m2));
    }
}
