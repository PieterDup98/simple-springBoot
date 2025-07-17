package dev.springBoot.demo.mapper;


import dev.springBoot.demo.entity.ProductEntity;
import dev.springBoot.demo.model.ProductDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ProductMapper {


    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    ProductDto toDto(ProductEntity entity);

    ProductEntity toEntity(ProductDto dto);
}
