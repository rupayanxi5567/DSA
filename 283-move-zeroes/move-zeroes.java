class Solution {
    public void moveZeroes(int[] a) {
        int l = 0, r = 0, n = a.length;

        while (r < n) {
            // ১. l যদি non-zero কোনো জায়গায় থাকে, তবে l-কে সামনে বাড়াও
            if (a[l] != 0) {
                l++;
                r = Math.max(r, l); // r যেন সবসময় l-এর সমান বা সামনে থাকে
            } 
            // ২. r যদি 0 ধরে রাখে, তবে non-zero খোঁজার জন্য r-কে সামনে বাড়াও
            else if (a[r] == 0) {
                r++;
            } 
            // ৩. যখন a[l] == 0 এবং a[r] != 0 পাবে, তখন Swap করো
            else {
                int temp = a[l];
                a[l] = a[r];
                a[r] = temp;
                l++;
                r++;
            }
        }
    }
}