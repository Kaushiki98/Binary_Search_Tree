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
}