public class Pr_11_PrimeNumbers {
    public static void primeNumbers(int n){
        for(int i = 2; i<=n; i++){
            int count = 0;
            for(int j = 1; j<=i; j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.print(i+" ");
            }

        }
    }
    public static void main(String[] args){
        primeNumbers(150);
    }
}
