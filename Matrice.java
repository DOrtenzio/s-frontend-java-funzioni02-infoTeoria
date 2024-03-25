package matrice;
public class Matrice{
    public static int sommaMatrice( int [][] matrice ){
        int somma=0;
        for (int i=0;i<matrice.length;i++){
            for (int p=0;p<matrice[i].length;p++){
                somma+=matrice[i][p];
            }
        }
        return somma;
    }
    public static boolean isNullo ( int [][] matrice ){
        boolean isNullo=false;
        for (int i=0;i<matrice.length;i++){
            for (int p=0;p<matrice[i].length;p++){
                if (matrice[i][p]==0){
                    isNullo=true;
                    break;
                }
            }
        }
        return isNullo;
    }
    public static boolean isTuttiNulli ( int [][] matrice ){
        boolean isNullo=true;
        for (int i=0;i<matrice.length;i++){
            for (int p=0;p<matrice[i].length;p++){
                if (matrice[i][p]!=0){
                    isNullo=false;
                    break;
                }
            }
        }
        return isNullo;
    }
    public static int sommaCorniceMatrice ( int [][] matrice ){
        int somma=0;
        for (int i=0;i<matrice[0].length;i++){
            for (int p=0;p<matrice.length;p++){
                if (i==0 || i==(matrice[0].length-1))
                    somma+=matrice[p][i];
                else {
                    if (p==0 || p==(matrice.length-1))
                        somma+=matrice[p][i];
                }
            }
        }
        return somma;
    }
    public static boolean isDiagonaleEquals ( int [][] matrice ){
        int somma1=0,somma2=0;
        for (int i=0;i<matrice.length;i++){
            somma1+=matrice[i][i];
            somma2+=matrice[matrice.length-i-1][i];
        }
        return somma1==somma2;
    }
    public static boolean isTuttiUguali ( int [][] matrice ){
        boolean isEquals=true;
        for (int i=0;i<matrice.length;i++){
            for (int p=0;p<matrice[i].length;p++){
                if (matrice[i][p]!=matrice[0][0]){
                    isEquals=false;
                    break;
                }
            }
        }
        return isEquals;
    }
    public static boolean isCrescente ( int [][] matrice ){
        boolean isCrescente=true;
        int ultima=matrice[0][0];
        for (int i=0;i<matrice.length;i++){ //i==riga
            for (int p=0;p<matrice[0].length-1;p++) { //p==colonna
                if (p == 0 && ultima > matrice[i][p]){
                    isCrescente = false;
                    break;
                } else {
                    if (matrice[i][p] > matrice[i][p+1]) {
                        isCrescente = false;
                        break;
                    }
                }
            }
            ultima=matrice[i][matrice[0].length-1]; //riga prima + ultima colonna
        }
        return isCrescente;
    }
    public static boolean isTuttiUgualiConDue ( int [][] matrice1,int [][] matrice2 ){
        boolean isEquals=true;
        for (int i=0;i<matrice1.length;i++){
            for (int p=0;p<matrice1[i].length;p++){
                if (matrice1[i][p]!=matrice2[i][p]){
                    isEquals=false;
                    break;
                }
            }
        }
        return isEquals;
    }
    public static int sommaConDue ( int [][] matrice1,int [][] matrice2 ){
        int somma=0;
        somma=sommaMatrice(matrice1)+sommaMatrice(matrice2);
        return somma;
    }
}