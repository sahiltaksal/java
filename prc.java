public class prc {

    public static void main(String[] args) {
      int arr[] = { 0, 0, 0,1,1,2,2,3,3,4 };
      int count=0;

        //int val = 3;
       //   int num [] = null;
        for(int i=0;i<arr.length;i++){

            if (i<arr.length-1 && arr[i]==arr[i+1]) {
                continue;
                
            }

            System.out.println(arr[i]);
        }


    }
}