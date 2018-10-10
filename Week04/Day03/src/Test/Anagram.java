public class Anagram {



        public static boolean areAnagram ( char[] str1, char[] str2)
        {

            int n1 = str1.length;
            int n2 = str2.length;

            if (n1 != n2)
                return false;


            quickSort(str1, 0, n1 - 1);
            quickSort(str2, 0, n2 - 1);


            for (int i = 0; i < n1; i++)
                if (str1[i] != str2[i])
                    return false;

            return true;
        }


        static void exchange ( char A[], int a, int b)
        {
            char temp;
            temp = A[a];
            A[a] = A[b];
            A[b] = temp;
        }

        static int partition ( char A[], int si, int ei)
        {
            char x = A[ei];
            int i = (si - 1);
            int j;

            for (j = si; j <= ei - 1; j++) {
                if (A[j] <= x) {
                    i++;
                    exchange(A, i, j);
                }
            }
            exchange(A, i + 1, ei);
            return (i + 1);
        }

        static void quickSort ( char sort[], int start, int end)
        {
            int pi;
            if (start < end) {
                pi = partition(sort, start, end);
                quickSort(sort, start, pi - 1);
                quickSort(sort, pi + 1, end);

        }
    }
}