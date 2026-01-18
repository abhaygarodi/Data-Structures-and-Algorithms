public class SearchArray
{
public static void main(String[] args)
{
int[] arr = {10,20,30,40};
int element = 70;
boolean found = false;
for(int i=0; i<arr.length; i++)
{
    if(arr[i] == element){
        System.out.println("Element found at" +i+ "index position");
        found = true;
        break;
    }
}
if(found == false)
{
    System.out.println("Element not found");
}
}
}
