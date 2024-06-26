package com.gm2.pdv.dto;

import com.gm2.pdv.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SaleDTO {

    private long userid;

    List<ProductDTO> items;
}
