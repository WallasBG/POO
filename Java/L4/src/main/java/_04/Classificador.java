package _04;

public class Classificador {

    private void troca(Classificavel[] a, int i, int j){
        Classificavel temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    //insertion sort
     public void ordena(Classificavel[] a){
         int n = a.length;

         for(int i=1; i<n; i++){
             for(int j=i; j>0; j--){
                 if(a[j].menorElemento(a[j-1])) troca(a, j, j-1);
                 else break;
             }
         }
     }
}
