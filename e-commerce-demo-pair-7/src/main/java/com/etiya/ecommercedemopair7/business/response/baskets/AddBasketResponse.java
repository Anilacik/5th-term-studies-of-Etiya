package com.etiya.ecommercedemopair7.business.response.baskets;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddBasketResponse {
    int customerId;
    double totalPrice;
    double shippingPrice;
}
