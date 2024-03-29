package TwoCards;

/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *<pre>
 * Class        Person.java
 * Project      Project3--CardGame
 * Description  Person class that is a parent class of the Player class
 *              (exhibiting inheritance, “is-a” relationship). Represents the GUI 
 *              and is used in maintaining the player database. 
 * File         CardGameGUI.java
 * Platform     jdk 1.8.0_214; NetBeans IDE 11.3; Windows 10
 * Date         1/8/2024 
 *
 * @author	<i>Leanne Vu</i>
 * @version 	%1% %2%
 * @see         java.util.Objects;
 *</pre>
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
public abstract class Person {
    protected String name;
    protected int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
     /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>
     * Method       getName()
     * Description  Get method to return variable name
     * @author      <i>Leanne Vu</i>
     * @return      name String
     * Date         1/8/2024
     *</pre>   
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public String getName() {
        return name;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>
     * Method       setname()
     * Description  Set method to set instance variable name
     * @author      <i>Leanne Vu</i>
     * @param       name String
     * Date         1/8/2024
     *</pre>   
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void setName(String name) {
        this.name = name;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>
     * Method       getAge()
     * Description  Get method to return variable Player
     * @author      <i>Leanne Vu</i>
     * @return      age Integer
     * Date         1/8/2024
     *</pre>   
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public Integer getAge() {
        return age;
    }
    
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>
     * Method       setAge()
     * Description  Set method to set instance variable for Player
     * @author      <i>Leanne Vu</i>
     * @param       age Integer
     * Date         1/8/2024
     *</pre>   
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public void setAge(Integer age) {
        this.age = age;
    }
}
