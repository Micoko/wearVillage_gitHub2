package com.example.wearVillage.DAO.ProductBuyDAO;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ProductBuyForm {
    private Long tradeId;
    private String postId;
    private String buyerId;
    private String sellerId;
    private String price;
    private String rentDefaultPrice;
    private String rentDayPrice;
    private LocalDateTime tradeDate;
}