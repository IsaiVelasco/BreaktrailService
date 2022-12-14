package com.breaktrail.orderservice.dto;

import com.sun.istack.NotNull;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;

import java.util.List;


@Data
@ApiModel(description = "Class representing a order to be processed")
public class OrderRequest {


    @NotNull
    @ApiModelProperty(notes = "Account Id", example = "987162991271", required = true)
    private String accountId;

    @ApiModelProperty(notes = "Items included in the order", required = true)
    @NotNull
    private List<LineItem> items;


}
