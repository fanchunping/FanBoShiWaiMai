package cn.waimai.pojo;

import java.io.Serializable;

public class BuyerItem implements Serializable {
    private static final long serialVersionUID = 1L;

    //SKu对象
    private Sku sku;

    //是否有货
    private Boolean isHave = true;

    //购物的数量
    private Integer amount = 1;

    public Boolean getHave() {
        return isHave;
    }

    public void setHave(Boolean isHave) {
        isHave = isHave;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Sku getSku() {
        return sku;
    }

    public void setSku(Sku sku) {
        this.sku = sku;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((sku == null) ? 0 : sku.hashCode());
        return result;
    }
}
