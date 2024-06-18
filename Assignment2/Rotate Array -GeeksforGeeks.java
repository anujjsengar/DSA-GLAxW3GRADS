class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d, int n) {
        d=d%n;
        rotate(arr,0,arr.length-1);
        rotate(arr,0,d);
        rotate(arr,d+1,arr.length-1);
    }
    static void rotate(int arr[],int left,int right){
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
}
}
