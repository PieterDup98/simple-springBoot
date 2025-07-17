package dev.springBoot.demo.service;


import dev.springBoot.demo.entity.ProductEntity;
import dev.springBoot.demo.mapper.ProductMapper;
import dev.springBoot.demo.model.ProductDto;
import dev.springBoot.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    private ProductMapper productMapper;

    public List<ProductDto> getAllProducts() {
        return productRepository.findAll().stream()
                .map(entity -> productMapper.toDto(entity))
                .toList();
    }

    public ProductDto createProduct(ProductDto p) {
        ProductEntity newEntity = productMapper.toEntity(p);
        newEntity.setId(null);

        productRepository.save(newEntity);

        return productMapper.toDto(newEntity);
    }

    public boolean deleteProduct(Long id) {
        productRepository.deleteById(id);
        return true;
    }
}
