package arrayOfProducts;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution01Java implements ArrayOfProductsSolver {
    @NotNull
    @Override
    public List<Integer> arrayOfProducts(@NotNull List<Integer> array) {
        ArrayList<Integer> products = new ArrayList<>(Collections.nCopies(array.size(), 1));

        for (int i = 0; i < array.size(); i++) {
            int runningProduct = 1;

            for (int j = 0; j < array.size(); j++) {
                if (i != j) {
                    runningProduct *= array.get(j);
                }
            }

            products.set(i, runningProduct);
        }

        return products;
    }
}
