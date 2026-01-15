public class factorial
{
    public static void main(String[] args) {
        int n = 5;
        int fact = 1;
        for (int i = 1; i<=n; i++){
            fact= fact*i;

        }
        System.out.println("factorial is "+fact);
    }
}

//f(n) = 2 + n + 1
//f(n) = n + 3
//f(n) = n