function validPhoneNumber(phoneNumber){
    let regX= /^[(]([0-9]{3})[)][ ]([0-9]{3})[-]([0-9]{4})$/g
    return regX.test(phoneNumber)
}