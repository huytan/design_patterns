	Suppose that you are designing a Customer class as part of a large application. A generic representation of a customer in its simplest form can be designed
as diagram below.
	
	---------------------
	|	Customer		|
	---------------------
	|firstName:String	|
	|lastName:String	|
	|active:boolean		|
	|adress:String		|
	---------------------

Applying the Accessor Method pattern, the set of accessor methods listed in table below can be defined corresponding to each of the instance variable
---------------------------------------------------------------------------------------------------
|	Variable		|						|				Purpose								  |
---------------------------------------------------------------------------------------------------
|firstName			|getFirstName			|To read the value of the firstName instance variable |
---------------------------------------------------------------------------------------------------
|					|setFirstName			|To alter the value of the firstName instance variable|
---------------------------------------------------------------------------------------------------
|lastName			|getLastName			|To read the value of the lastName instance variable  |
---------------------------------------------------------------------------------------------------
|					|setLastName			|To alter the value of the lastName instance variable |
---------------------------------------------------------------------------------------------------
|address			|getAddress				|To read the value of the address instance variable   |
---------------------------------------------------------------------------------------------------
|					|setAddress				|To alter the value of the address instance variable  |
---------------------------------------------------------------------------------------------------
|active				|getActive				|To read the value of the active instance variable    |
---------------------------------------------------------------------------------------------------
|					|setActive				|To alter the value of the active instance variable   |
---------------------------------------------------------------------------------------------------

Different client objects can access the object state variables using the accessor methods listed in table on. The Customer object itself can access its state
variable directly, but using the accessor methods will greatly improve the maintainability of the Customer class code. This in turn contributes to the overall application maintainability.

Shows the resulting class structure.

	---------------------------------
	|		Customer				|
	---------------------------------
	|firstName:String				|
	|lastName:String				|
	|active:boolean					|
	|adress:String					|
	---------------------------------
	|getFirstName():String			|
	|getLastName():String			|
	|getAddress():String			|
	|isActive():boolean				|
	|setFirstName(newValue:String)	|
	|setLastName(newValue:String)	|
	|setAddress(newValue:String)	|
	|setActive(newValue:boolean)	|
	---------------------------------

