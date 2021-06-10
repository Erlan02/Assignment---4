public class deepestLeavesSum {

    public static void main(String[] args) {
        public int Sum(TreeNode root) {
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            int answer = 0, len = 0;
            while (q.size() > 0) {
                len = q.size();
                ans = 0;
                for (int i = 0; i < len; i++) {
                    TreeNode curr = q.poll();
                    ans += curr.val;
                    if (curr.left != null) q.add(curr.left);
                    if (curr.right != null) q.add(curr.right);
                }
            }
            return answer;
        }
    }
}
