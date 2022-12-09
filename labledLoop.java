public class labledLoop {
    public static void main(String[] args){
        outer:
            for(int i=1; i<5; i++){
                System.out.println(i+":-");
                for(int j= 1; j<3; j++){
                    System.out.print(j+" ");
                    if(i==j){
                        System.out.println();
                        continue outer;
                    }
                }
            }



    }
}
