package dev.springBoot.demo.service;

import dev.springBoot.demo.entity.ProductEntity;
import dev.springBoot.demo.mapper.ProductMapper;
import dev.springBoot.demo.model.ProductDto;
import dev.springBoot.demo.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@SpringBootTest
class ProductServiceTest {
    @InjectMocks
    ProductService productService;

    @Mock
    ProductMapper productMapper;

    @Mock
    ProductRepository productRepository;

    @Test
    public void testGetAllProducts() {
        ProductEntity p1 = new ProductEntity();
        p1.id = 1L;
        p1.name = "Product 1";
        p1.price = 10.0;

        ProductEntity p2 = new ProductEntity();
        p2.id = 2L;
        p2.name = "Product 2";
        p2.price = 20.0;

        when(productRepository.findAll()).thenReturn(List.of(p1, p2));

        ProductDto dto1 = new ProductDto(p1.getId(), p1.getName(), p1.getPrice());
        ProductDto dto2 = new ProductDto(p2.getId(), p2.getName(), p2.getPrice());

        when(productMapper.toDto(any())).thenReturn(dto1).thenReturn(dto2);

        // Act
        List<ProductDto> result = productService.getAllProducts();

        // Assert
        assertEquals(2, result.size());
        assertEquals("Product 1", result.get(0).name());
        assertEquals("Product 2", result.get(1).name());
    }
}