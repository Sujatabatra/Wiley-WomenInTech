var Person = /** @class */ (function () {
    // constructor(){
    //     this.firstName="Sujata";
    //     this.lastName="Batra";
    // }
    function Person(firstName, lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    Person.prototype.getFullName = function () {
        return this.firstName + " " + this.lastName;
    };
    return Person;
}());
var pOb = new Person("Sujata", "Batra");
console.log(pOb.getFullName());
