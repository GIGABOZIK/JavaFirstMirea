package ru.mirea.task5.opt3;

public class FurnitureTest {
    public static void main(String[] args) {
        Table table = new Table(300, "wood", 80, 50, 1, 4);
        table.setPrice(1290);
        Wardrobe wardrobe = new Wardrobe();
        wardrobe.setPrice(4990);
        wardrobe.setLength(250);
        wardrobe.setWidth(170);
        wardrobe.setHeight(350);
        wardrobe.setShelves(5);
        //System.out.println(table);
        //System.out.println(wardrobe);
        Wardrobe ward2 = new Wardrobe();
        Wardrobe ward3 = new Wardrobe();
        Table tabl2 = new Table();
        Wardrobe ward4 = new Wardrobe();
        //
        System.out.println("Test Shop:\r\n\r\n");
        FurnitureShop shop = new FurnitureShop("Housity", 1000);
        shop.addProduct(table);
        shop.addProduct(wardrobe);
        shop.addProduct(ward2);
        shop.addProduct(ward3);
        shop.addProduct(tabl2);
        shop.addProduct(ward4);
        System.out.println(shop);
        shop.sellProduct(wardrobe.getId());
        System.out.println(shop);
        shop.sellProduct(wardrobe.getId());
        System.out.println(shop);
        shop.sellProduct(table.getId());
        System.out.println(shop);
        shop.sellProduct(tabl2.getId());
        System.out.println(shop);
        shop.sellProduct(ward3.getId());
        System.out.println(shop);
    }
}
