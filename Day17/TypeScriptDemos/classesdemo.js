var Person = /** @class */ (function () {
    function Person() {
    }
    Person.prototype.getFullName = function () {
        return this.firstName + " " + this.lastName;
    };
    return Person;
}());
var pOb = new Person();
pOb.firstName = "Sujata";
pOb.lastName = "Batra";
console.log(pOb.getFullName());
