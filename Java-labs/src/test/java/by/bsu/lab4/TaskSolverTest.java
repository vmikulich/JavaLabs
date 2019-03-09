package by.bsu.lab4;

import by.bsu.lab4.entity.Product;
import by.bsu.lab4.util.TaskSolver;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.Assert.assertEquals;

public class TaskSolverTest {

    Product product1;
    Product product2;
    Product product3;
    Product product4;
    Product product5;
    Product[] products;

    @Before
    public void initialization() {
        product1 = new Product(1, "Milk", 56732712, "Milk World", 120, 3, 500);
        product2 = new Product(2, "Bread", 35467891, "Bread World", 90, 5, 1000);
        product3 = new Product(3, "Cheese", 94284921, "Cheese World", 250, 4, 1500);
        product4 = new Product(4, "Ham", 17403745, "Ham World", 340, 5, 1200);
        product5 = new Product(5, "Ham", 54673866, "Ham World", 400, 6, 800);
        products = new Product[]{product1, product2, product3, product4, product5};
    }

    @Test
    public void getProductsWithGivenName() {
        Product[] expected = new Product[]{product1};
        assertEquals(expected, TaskSolver.getProductsWithGivenName(products, "Milk"));
    }

    @Test
    public void getProductsUnderGivenPrice() {
        Product[] expected = new Product[]{product4};
        assertEquals(expected, TaskSolver.getProductsUnderGivenPrice(products, 350, "Ham"));
    }

    @Test
    public void getProductsAboveGivenShelfLife() {
        Product[] expected = new Product[]{product2, product4, product5};
        assertEquals(expected, TaskSolver.getProductsAboveGivenShelfLife(products, 4));
    }
}
