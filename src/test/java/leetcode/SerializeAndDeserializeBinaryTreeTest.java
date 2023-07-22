package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SerializeAndDeserializeBinaryTreeTest {
    private static SerializeAndDeserializeBinaryTree instance = new SerializeAndDeserializeBinaryTree();

    @Test
    void serialize() {
        String serialize1 = instance.serialize(new TreeNode(1, new TreeNode(2), new TreeNode(3, new TreeNode(4), new TreeNode(5))));
        TreeNode deserialize = instance.deserialize(serialize1);
        String serialize2 = instance.serialize(null);
        TreeNode deserialize2 = instance.deserialize(serialize2);
        System.out.println();
    }

    @Test
    void deserialize() {
    }
}