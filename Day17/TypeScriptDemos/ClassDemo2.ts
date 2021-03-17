class Person{
    firstName:string;
    lastName:string;
    // constructor(){
    //     this.firstName="Sujata";
    //     this.lastName="Batra";
    // }
    constructor(firstName:string,lastName:string){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    getFullName():string{
        return this.firstName+" "+this.lastName;
    }
}

var pOb=new Person("Sujata","Batra");
console.log(pOb.getFullName());