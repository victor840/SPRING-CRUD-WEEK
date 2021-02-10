package Weather.API.Victor.API.controller;

import Weather.API.Victor.API.model.Address;
import Weather.API.Victor.API.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping("/address/{id}")
    public ResponseEntity <Address > getAddressById(@PathVariable long id){
        return ResponseEntity.ok().body(addressService.getAddressByID(id));
    }

    @PostMapping("/address")
    public ResponseEntity < Address > createAddress(@RequestBody Address address){
        return ResponseEntity.ok().body(this.addressService.createAddress(address));
    }

    @PutMapping("/address/{id}")
    public ResponseEntity < Address > updateAddress(@PathVariable long id, @RequestBody Address address){
        address.setId(id);
        return ResponseEntity.ok().body(this.addressService.updateAddress(address));
    }

    @DeleteMapping("/address/{id}")
    public HttpStatus deleteAddress(@PathVariable long id){
        this.addressService.deleteAddress(id);
        return HttpStatus.OK;
    }
}
