// class Person{
//     private firstName:string;
//     private lastName:string;
//     constructor(firstName:string,lastName:string){
//         this.firstName=firstName;
//         this.lastName=lastName;
//     }
//     getFirstName():string{
//         return this.firstName;
//     }
//     getLastName():string{
//         return this.lastName;
//     }
// }
var Person = /** @class */ (function () {
    function Person(firstName, lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    Person.prototype.getFirstName = function () {
        return this.firstName;
    };
    Person.prototype.getLastName = function () {
        return this.lastName;
    };
    return Person;
}());
var pOb = new Person("Sujata", "Batra");
console.log(pOb.getFirstName() + " " + pOb.getLastName());
