package com.izooki.foodcatalogue.mapper;

import com.izooki.foodcatalogue.dto.FoodItemDTO;
import com.izooki.foodcatalogue.entity.FoodItem;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-15T01:16:41-0400",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 19.0.1 (Oracle Corporation)"
)
public class FoodItemMapperImpl implements FoodItemMapper {

    @Override
    public FoodItem mapFoodItemDTOToFoodItem(FoodItemDTO foodItemDTO) {
        if ( foodItemDTO == null ) {
            return null;
        }

        FoodItem foodItem = new FoodItem();

        foodItem.setId( foodItemDTO.getId() );
        foodItem.setItemName( foodItemDTO.getItemName() );
        foodItem.setItemDescription( foodItemDTO.getItemDescription() );
        foodItem.setVeg( foodItemDTO.isVeg() );
        foodItem.setPrice( foodItemDTO.getPrice() );
        foodItem.setRestaurantId( foodItemDTO.getRestaurantId() );
        foodItem.setQuantity( foodItemDTO.getQuantity() );

        return foodItem;
    }

    @Override
    public FoodItemDTO mapFoodItemToFoodItemDto(FoodItem foodItem) {
        if ( foodItem == null ) {
            return null;
        }

        FoodItemDTO foodItemDTO = new FoodItemDTO();

        foodItemDTO.setId( foodItem.getId() );
        foodItemDTO.setItemName( foodItem.getItemName() );
        foodItemDTO.setItemDescription( foodItem.getItemDescription() );
        foodItemDTO.setVeg( foodItem.isVeg() );
        foodItemDTO.setPrice( foodItem.getPrice() );
        foodItemDTO.setRestaurantId( foodItem.getRestaurantId() );
        foodItemDTO.setQuantity( foodItem.getQuantity() );

        return foodItemDTO;
    }
}
