package cn.waimai.pojo;

public class Cart {
    private double total;
    private CartItem[] cartItems;

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public CartItem[] getCartItems() {
        return cartItems;
    }

    public void setCartItems(CartItem[] cartItems) {
        this.cartItems = cartItems;
    }

    public void clearCart() {
    }
}
