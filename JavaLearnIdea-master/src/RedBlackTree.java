import java.io.InputStreamReader;
import java.io.StringBufferInputStream;
import java.text.DecimalFormat;
import java.util.Random;

/**
 * @projectName: JavaLearnIdea
 * @package: PACKAGE_NAME
 * @className: NodePad
 * @author: Kchenx
 * @description: TODO
 * @date: 2023/1/11 14:26
 * @version: 1.0
 */
public class RedBlackTree<T extends Comparable<T>> {

    private Node<T> root;

    private static final boolean RED = true;
    private static final boolean BLACK = false;

    private static class Node<T> {
        T value;
        Node<T> left;
        Node<T> right;
        boolean color;

        Node(T value) {
            this.value = value;
            this.color = RED;
        }
    }

    // 红黑树的插入操作
    public void insert(T value) {
        root = insert(root, value);
        root.color = BLACK;
    }

    private Node<T> insert(Node<T> node, T value) {
        if (node == null) {
            return new Node<>(value);
        }

        if (value.compareTo(node.value) < 0) {
            node.left = insert(node.left, value);
        } else if (value.compareTo(node.value) > 0) {
            node.right = insert(node.right, value);
        } else {
            // 如果值相等，不进行任何操作
            return node;
        }

        // 左旋转
        if (isRed(node.right) && !isRed(node.left)) {
            node = rotateLeft(node);
        }
        // 右旋转
        if (isRed(node.left) && isRed(node.left.left)) {
            node = rotateRight(node);
        }
        // 颜色翻转
        if (isRed(node.left) && isRed(node.right)) {
            flipColors(node);
        }

        return node;
    }

    // 左旋转
    private Node<T> rotateLeft(Node<T> node) {
        Node<T> right = node.right;
        node.right = right.left;
        right.left = node;
        right.color = node.color;
        node.color = RED;
        return right;
    }

    // 右旋转
    private Node<T> rotateRight(Node<T> node) {
        Node<T> left = node.left;
        node.left = left.right;
        left.right = node;
        left.color = node.color;
        node.color = RED;
        return left;
    }

    // 颜色翻转
    private void flipColors(Node<T> node) {
        node.color = RED;
        node.left.color = BLACK;
        node.right.color = BLACK;
    }

    private boolean isRed(Node<T> node) {
        if (node == null) {
            return false;
        }
        return node.color == RED;
    }

    // 红黑树的查找操作
    public boolean contains(T value) {
        Node<T> node = root;
        while (node != null) {
            if (value.compareTo(node.value) < 0) {
                node = node.left;
            } else if (value.compareTo(node.value) > 0) {
                node = node.right;
            } else {
                return true;
            }
        }
        return false;
    }
}
