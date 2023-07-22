package leetcode;

public class SerializeAndDeserializeBinaryTree {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder result = new StringBuilder();
        traverse(root, result);
        return result.toString();
    }

    private void traverse(TreeNode root, StringBuilder builder) {
        if (!builder.isEmpty()) {
            builder.append(",");
        }
        if (root == null) {
            builder.append("n");
            return;
        }
        builder.append(root.val);
        traverse(root.left, builder);
        traverse(root.right, builder);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] split = data.split(",");
        TreeNode root = getByString(split[0]);
        if (root != null) {
            populate(root, 0, split);
        }
        return root;
    }

    private int populate(TreeNode current, int index, String[] data) {
        if (current == null) {
            return 0;
        }
        String left = data[++index];
        if (!"n".equals(left)) {
            current.left = getByString(left);
            index = populate(current.left, index, data);
        }
        String right = data[++index];
        if (!"n".equals(right)) {
            current.right = getByString(right);
            index = populate(current.right, index, data);
        }
        return index;
    }

    private TreeNode getByString(String s) {
        if ("n".equals(s)) {
            return null;
        } else {
            return new TreeNode(Integer.parseInt(s));
        }
    }
}
