package com.xiedaimala.shopping_cart.order.model;

public class Order {
    // 订单id
    private String id;
    // 商品id
    private String productId;
    // 用户id
    private String userId;
    // 商品数量
    private Integer productCount;
    // 订单状态
    private Boolean orderStatus;

    public Order() {
    }

    public Order(String id, String productId, String userId, Integer productCount, Boolean orderStatus) {
        this.id = id;
        this.productId = productId;
        this.userId = userId;
        this.productCount = productCount;
        this.orderStatus = orderStatus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    public Boolean getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Boolean orderStatus) {
        this.orderStatus = orderStatus;
    }
}
