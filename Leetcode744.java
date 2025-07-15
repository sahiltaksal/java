public class Leetcode744 {
    public static void main(String[] args) {

        char[] letters = { 'c', 'f', 'j' };

        System.out.println(nextGreatestLetter(letters, 'd'));

    }

    public static char nextGreatestLetter(char[] letters, char target) {

        int low = 0;
        int high = (letters.length - 1);
        while (low <= high) {

            int mid = (low + (high - low) / 2);

            if (letters[mid] == target) {
                low = mid + 1;
        //        return letters[low];
            } 
             if (letters[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
               

            }
            
        }
        return letters[low%letters.length];

    }

}