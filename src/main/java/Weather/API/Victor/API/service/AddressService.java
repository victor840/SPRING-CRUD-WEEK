package Weather.API.Victor.API.service;

import Weather.API.Victor.API.model.Address;

import java.util.List;

public interface AddressService {

    Address createAddress(Address address);

    Address updateAddress(Address address);

    Address getAddressByID(long addressId);

    void deleteAddress(long id);

}
