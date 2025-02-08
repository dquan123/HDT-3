import java.util.Arrays;

public class ordenamientos {

    public int[] insertion(int[] v){
        int n = v.length;
        for(int i = 1; i < n; i++){
            int aux = v[i];
            int j = i - 1;

            while(j >= 0 && v[j] > aux){
                v[j+1] = v[j];
                j--;
            }
            v[j+1] = aux;
        }
        return v;
    }


}