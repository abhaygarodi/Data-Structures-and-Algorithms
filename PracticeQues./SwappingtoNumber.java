public class SwappingtoNumber
{
    public static void main(String[] args){
        int no1 = 10; 
        int no2 = 20;

        int temp = no1;
        no1 = no2;
        no2 = temp;

        System.out.println("no1"+no1);
        System.out.println("no2"+no2);

    }
}

//f(n) = 5(assignment) + 2(print) = 7
//f(n) = 7 units time
//f(n) = 1 for constant 