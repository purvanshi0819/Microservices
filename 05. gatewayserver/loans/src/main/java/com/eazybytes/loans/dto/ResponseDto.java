package com.eazybytes.loans.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
@Schema(
        name = "Response",
        description = "Schema to hold Response Information"
)
@Data @AllArgsConstructor
public class ResponseDto {

    @Schema(
            name = "Status code in the response"
    )
    private String statusCode;

    @Schema(
            name = "Status message in the response"
    )
    private String statusMsg;
}
