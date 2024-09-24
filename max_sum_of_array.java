public static long calculateTotalRegion(List<Integer> heights) {
    // Write your code here
        long total=0;
        int n = heights.size();
        int[] left=new int[n];
        int[] right=new int[n];
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++) {
            while (!st.isEmpty() && heights.get(st.peek())<=heights.get(i)) st.pop();
            left[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        st.clear();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && heights.get(st.peek())<=heights.get(i)) st.pop();
            right[i]=st.isEmpty()?n:st.peek();
            st.push(i);
        }
        for(int i=0;i<n;i++){
            int rl=right[i]-left[i]-1;
            total+=rl;
        }
        return total;
    }
}
