public class ArrayInsertion{

    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        int indexpos = 2;
        int element = 100;

        int[] newArray = new int[arr.length+1];

        for(int i=0; i<indexpos; i++)
        {
            newArray[i] = arr[i];
        }

        //3
        newArray[indexpos] = element;
        
        //4
        for(int i=indexpos; i<arr.length; i++){
            newArray[i+1] = arr[i]
        }


        //traverse
        for(int no : newArray){
            System.out.print(no+ "");
        }
    }
}