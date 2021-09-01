import java.util.Scanner;

public class tomato {
    static int tomato(int box[][]){
        //int[][] box = new int[M][N];
        int L=0;
        return L;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int M = in.nextInt();
        int N = in.nextInt();
        int[][] box = new int[N][M];
        for(int i=0; i<N; i++){ //6행4열인 것 주의
            for(int j=0; j<M; j++){
                box[i][j] = in.nextInt();
            }
        }

//        for(int i=0; i<N; i++){
//            for(int j=0; j<M; j++){
//                System.out.print(box[i][j]+" ");
//            }
//            System.out.println("");
//        }

        System.out.println(tomato(box));
        return ;
    }
}