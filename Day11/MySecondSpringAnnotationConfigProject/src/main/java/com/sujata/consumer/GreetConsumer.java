package com.sujata.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.producer.Greet;

/*IOC : Inversion of Control : Separating the dependency logic from the actual business logic
 * how we achieve IOC with the help of Dependency Injection which can be either Setter Injection or Constructor Injection
 */
public class GreetConsumer 
{
    public static void main( String[] args )
    {
    	/*Responsible for running the life cycle of all the beans mentioned with <bean> tag in greet.xml file
    	* Life Cycle : Instantiate->setter
    	*/
        ApplicationContext springContainer=new ClassPathXmlApplicationContext("mygreet.xml");
        
        //Greet g1=new GoodMorning(); ====> (NO)
        
        Greet g1=(Greet)springContainer.getBean("eve");
        
        g1.wish();
    }
}
