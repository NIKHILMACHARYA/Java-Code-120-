*1. Maximum Depth of Binary Tree*

```java
public int maxDepth(TreeNode root) {
    if (root == null) return 0;
    int left = maxDepth(root.left);
    int right = maxDepth(root.right);
    int depth = 1 + Math.max(left, right);
    System.out.println("Node: " + root.val + " | Depth: " + depth);
    return depth;
}
``
---

*2. Symmetric Tree*

```java
public boolean isSymmetric(TreeNode root) {
    boolean result = isMirror(root, root);
    System.out.println("Tree is symmetric: " + result);
    return result;
}

private boolean isMirror(TreeNode t1, TreeNode t2) {
    if (t1 == null && t2 == null) return true;
    if (t1 == null || t2 == null) return false;
    System.out.println("Comparing: " + t1.val + " and " + t2.val);
    return (t1.val == t2.val) &&
           isMirror(t1.left, t2.right) &&
           isMirror(t1.right, t2.left);
}
```
---

*3. Binary Tree Level Order Traversal*

```java
public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    if (root == null) return result;

    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);

    while (!queue.isEmpty()) {
[5/29, 9:30 PM] ChatGPT: int size = queue.size();
        List<Integer> level = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            TreeNode node = queue.poll();
            System.out.print(node.val + " ");
            level.add(node.val);
            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
        }
        System.out.println(); // New line for each level
        result.add(level);
    }
    return result;
}
```
---

*4. Number of Islands*

```java
public int numIslands(char[][] grid) {
    int count = 0;
    for (int i = 0; i < grid.length; i++) {
        for (int j = 0; j < grid[0].length; j++) {
            if (grid[i][j] == '1') {
                System.out.println("Island found at: (" + i + "," + j + ")");
                dfs(grid, i, j);
                count++;
            }
        }
    }
    System.out.println("Total islands: " + count);
    return count;
}

private void dfs(char[][] grid, int i, int j) {
    if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != '1') return;
    grid[i][j] = '0';
    System.out.println("Marking visited at: (" + i + "," + j + ")");
    dfs(grid, i + 1, j);
    dfs(grid, i - 1, j);
    dfs(grid, i, j + 1);
    dfs(grid, i, j - 1);
}
```
