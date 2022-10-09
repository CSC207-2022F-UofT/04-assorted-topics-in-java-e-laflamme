/* TODO: Create a subclass of Trader named DrivableTrader
 * This class should be identical to Trader, except that it takes
 * only Drivable objects in its inventory, wishlist, etc.
 *
 * The sellingPrice returned should also be overridden. The selling price
 * should be equal to the:
 *     Object's price + Object's max speed
 * If the object is Tradable (and Tradable.MISSING_PRICE otherwise.)
 *
 * Look at DomesticatableTrader.java for an example.
 */

import java.util.List;

class DrivableTrader extends Trader<Drivable>{

    /**
     * Constructs a DrivableTrader with the given inventory, wishlist, and money.
     * @param inventory all Objects in this Trader's inventory
     * @param wishlist all Objects in this Trader's wishlist
     * @param money the Trader's money
     */
    public DrivableTrader(List<Drivable> inventory, List<Drivable> wishlist, int money){
        super(inventory, wishlist, money);
    }

    /**
     * Constructs a DrivableTrader with the given money and an empty inventory and wishlist.
     * @param money the Trader's money
     */
    public DrivableTrader(int money){
        super(money);
    }



    @Override
    public int getSellingPrice(Drivable item) {
        if (item instanceof Tradable) {
            return super.getSellingPrice(item) + item.getMaxSpeed();
        }
        return Tradable.MISSING_PRICE;
    }
}