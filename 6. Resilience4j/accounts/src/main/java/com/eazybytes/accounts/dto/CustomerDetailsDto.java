package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Schema(
        name = "CustomerDetails",
        description = "Schema to hold customer, account, cards and loans information"
)
@Data
public class CustomerDetailsDto {
    @Schema(
            description = "Name of the customer", example = "Shubh Jain"
    )
    @NotEmpty(message = "Name cannot be null or empty")
    @Size(min = 5, max = 30, message = "Name should of length between 5 and 30")
    private String name;

    @Schema(
            description = "Email address of the customer", example = "shubh@gmail.com"
    )
    @NotEmpty(message = "Email cannot be null or empty")
    @Email(message = "Email address should be a valid value")
    private String email;

    @Schema(
            description = "Mobile number of the customer", example = "9626528692"
    )
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    private String mobileNumber;

    @Schema(
            description = "Account details of the customer"
    )
    private AccountsDto accountsDto;

    @Schema(
            description = "Loan details of the customer"
    )
    private LoansDto loansDto;

    @Schema(
            description = "Card details of the customer"
    )
    private CardsDto cardsDto;
}
