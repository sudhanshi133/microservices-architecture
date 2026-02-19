package dto;

import java.math.BigDecimal;

public record OrderRequest(Long id, String orderNumber, String skuCode,
                           BigDecimal prie, Integer quantity) {
}
