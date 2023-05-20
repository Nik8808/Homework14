package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class ShopRepositoryTest {

    @Test
    public void testToRemoveAnonExistentElement() {
        ShopRepository ShopRepository = new ShopRepository();
        Product item1 = new Product(1, "хлеб", 10);
        Product item2 = new Product(2, "булка", 15);
        Product item3 = new Product(3, "картошка", 5);
        ShopRepository.add(item1);
        ShopRepository.add(item2);
        ShopRepository.add(item3);

        Assertions.assertThrows(NotFoundException.class, () -> {
            ShopRepository.remove(-1);
        });
    }

    @Test
    public void removalTest() {
        ShopRepository Product = new ShopRepository();
        Product item1 = new Product(1, "хлеб", 10);
        Product item2 = new Product(2, "булка", 15);
        Product item3 = new Product(3, "картошка", 5);
        Product.add(item1);
        Product.add(item2);
        Product.add(item3);
        Product.remove(3);
        Product[] expected = {item1, item2};
        Product[] actual = ShopRepository.getProducts();
        Assertions.assertArrayEquals(expected, actual);
    }
}
