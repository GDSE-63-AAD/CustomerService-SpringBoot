package lk.ijse.gdse.aad.CustomerService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customer implements Serializable {
    private String customerId;
    private String customerName;
    private String customerCity;
    private String customerEmail;
}
