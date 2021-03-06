package thangok.icommerce.productmanager.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class ProductDTO implements Serializable {

    private Long id;

    private String productName;
    private String description;

    private String brandCode;
    private String categoryCode;
    private String colorCode;

    private BigDecimal price;

}
