
public class vetor{
    public static void main(String[] args) {
        int vetor1[] = new int[5];
        int vetor2 [] = new int[5];
        int vetor3[] = new int[5];

        vetor1[0] = 0;
        vetor1[1] = 1;
        vetor1[2] = 1;
        vetor1[3] = 1;

        vetor2[0] = 1;
        vetor2[1] = 0;
        vetor2[2] = 1;
        vetor2[3] = 0;



        for (int i = 0; i < vetor1.length; i++ ) {
            System.out.print(vetor1[i]);
           
           
        }

        System.err.println("");
        for (int i = 0; i < vetor2.length; i++ ) {
            System.out.print(vetor2[i]);
           
           
        }

        for (int i = 0; i < vetor1.length; i++) {
            int k1 = vetor1[i] +vetor2[i];
            
            if(k1 == 2 ) {
                return;
            }else {
                vetor3[i] = k1;
            }

            System.err.println(vetor3[i]);
        }


    

        


     }

}