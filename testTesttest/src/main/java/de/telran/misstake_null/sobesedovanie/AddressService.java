package de.telran.misstake_null.sobesedovanie;


public class AddressService {
    public String getFullAddress(Address address) {
        if (address == null){
            System.out.println("Very bad");
            return " kkk";
        }
        if (address.getStreet() == null || address.getCity() == null || address.getZipCode() == null){
            System.out.println("Incorrect Infos");
            return "iii";
        }




        return "Улица: " + address.getStreet() + ", Город: " + address.getCity() + ", Почтовый индекс: "
                + address.getZipCode();


    }

    public static void main(String[] args) {
        Address address1 = new Address("Ленина", "Москва", "101000");
        Address address2 = new Address("Невского", null, "190000");
        Address address3 = null;

        AddressService addressService = new AddressService();
        System.out.println(addressService.getFullAddress(address1)); // Ожидаемый вывод: Улица: Ленина, Город: Москва,
        // Почтовый индекс: 101000
        System.out.println(addressService.getFullAddress(address2)); // Ожидаемый вывод: Информация о адресе неполная.
        System.out.println(addressService.getFullAddress(address3)); // Ожидаемый вывод: Адрес не найден.
    }
}
