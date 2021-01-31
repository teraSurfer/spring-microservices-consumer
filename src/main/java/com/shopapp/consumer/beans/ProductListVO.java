package com.shopapp.consumer.beans;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Setter
@Getter
public class ProductListVO implements Serializable {

    private static final long serialVersionUID = 828770495080351810L;

    private List<Long> productIds;
}
