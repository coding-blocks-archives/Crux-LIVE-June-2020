package info.company.Lec7;

public class MergeSorted {

        public static void main(String[] args) {
            int arr1[] = { 3, 5, 7, 9,56,79,80 };
            int arr2[] = { 1, 2,3, 11, 13, 15 };
            int[] ans = mergetwosarray(arr1, arr2);
            for(int i=0; i<ans.length; i++) {
                System.out.print(ans[i]+" ");
            }

        }

        public static int[] mergetwosarray(int arr1[], int arr2[]) {
            int ans[] = new int[arr1.length + arr2.length];
            int i = 0;
            int j = 0;
            int k = 0;
            while (i < arr1.length && j < arr2.length) {
                if (arr1[i] < arr2[j]) {
                    ans[k] = arr1[i];
                    k++;
                    i++;
                } else if (arr1[i] > arr2[j]) {
                    ans[k] = arr2[j];
                    k++;
                    j++;
                } else {
                    ans[k] = arr1[i];
                    k++;
                    i++;
                    ans[k] = arr2[j];
                    j++;
                    k++;

                }

            }
            if (i == arr1.length) {
                while (j < arr2.length) {
                    ans[k] = arr2[j];
                    j++;
                    k++;
                }
            }
            if (j == arr2.length) {
                while (i < arr1.length) {
                    ans[k] = arr1[i];
                    i++;
                    k++;
                }
            }
            return ans;
        }

    }

