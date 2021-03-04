import org.junit.Assert;
import org.junit.Test;

public class BinaryTreeTest {
    @Test
    public void givenThreeNumbersWhenAddedToBinaryTreeShouldReturnSizeThree() {
        BinaryTree<Integer> bt = new BinaryTree<>();
        bt.add(56);
        bt.add(30);
        bt.add(70);
        int size = bt.getSize();
        Assert.assertEquals(3, size);
    }
    @Test
    public void givenANumberIfPresentInBinaryTreeShouldReturnTrue() {
        BinaryTree<Integer> bt = new BinaryTree<>();
        bt.add(56);
        bt.add(30);
        bt.add(70);
        bt.add(22);
        bt.add(40);
        bt.add(61);
        bt.add(94);
        bt.add(10);
        bt.add(64);
        bt.add(3);
        bt.add(16);
        bt.add(63);
        bt.add(67);

        boolean result = bt.search(63);
        Assert.assertEquals(true, result);
    }
}