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

class Person{
    
    constructor(private firstName:string,private lastName:string){
        
    }
    getFirstName():string{
        return this.firstName;
    }
    getLastName():string{
        return this.lastName;
    }
}

var pOb=new Person("Sujata","Batra");
console.log(pOb.getFirstName()+" "+pOb.getLastName());