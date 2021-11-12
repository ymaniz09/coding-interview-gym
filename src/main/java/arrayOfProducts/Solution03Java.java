package arrayOfProducts;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution03Java implements ArrayOfProductsSolver {
    @NotNull
    @Override
    public List<Integer> arrayOfProducts(@NotNull List<Integer> array) {
        ArrayList<Integer> products = new ArrayList<>(Collections.nCopies(array.size(), 1));

        int leftRunningProduct = 1;

        for (int i = 0; i < array.size(); i++) {
            products.set(i, leftRunningProduct);
            leftRunningProduct *= array.get(i);
        }

        int rightRunningProduct = 1;

        for (int i = array.size() - 1; i >= 0; i--) {
            products.set(i, products.get(i) * rightRunningProduct);
            rightRunningProduct *= array.get(i);
        }

        return products;
    }
}
