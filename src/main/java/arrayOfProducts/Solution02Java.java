package arrayOfProducts;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution02Java implements ArrayOfProductsSolver {
    @NotNull
    @Override
    public List<Integer> arrayOfProducts(@NotNull List<Integer> array) {
        ArrayList<Integer> products = new ArrayList<>(Collections.nCopies(array.size(), 1));
        ArrayList<Integer> leftProducts = new ArrayList<>(Collections.nCopies(array.size(), 1));
        ArrayList<Integer> rightProducts = new ArrayList<>(Collections.nCopies(array.size(), 1));

        int leftRunningProduct = 1;

        for (int i = 0; i < array.size(); i++) {
            leftProducts.set(i, leftRunningProduct);
            leftRunningProduct *= array.get(i);
        }

        int rightRunningProduct = 1;

        for (int i = array.size() - 1; i >= 0; i--) {
            rightProducts.set(i, rightRunningProduct);
            rightRunningProduct *= array.get(i);
        }

        for (int i = 0; i < array.size(); i++) {
            products.set(i, leftProducts.get(i) * rightProducts.get(i));
        }

        return products;
    }
}
