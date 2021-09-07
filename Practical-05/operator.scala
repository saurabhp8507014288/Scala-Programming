class Operation
{
	var result:Int=0
	var resultBool: Boolean=true
	
	def arithmetic(arg1:Int,arg2:Int)
	{
		println("ARITHMETIC OPERATORS:")
		result=arg1+arg2
		println("+ operator ---> result="+result)
		result=arg1-arg2
		println("- operator ---> result="+result)
		result=arg1*arg2
		println("* operator ---> result="+result)
		result=arg1/arg2
		println("/ operator ---> result="+result)
		result=arg1%arg2
		println("% operator ---> result="+result)
	}
	def relational(arg1:Int,arg2:Int)
	{
		println("\nRELATIONAL OPERATORS:")
		resultBool=(arg1>arg2)
		println("> operator ---> result="+resultBool)
		resultBool=(arg1>=arg2)
		println(">= operator ---> result="+resultBool)
		resultBool=(arg1<arg2)
		println("< operator ---> result="+resultBool)
		resultBool=(arg1<=arg2)
		println("<= operator ---> result="+resultBool)
		resultBool=(arg1==arg2)
		println("== operator ---> result="+resultBool)
		resultBool=(arg1!=arg2)
		println("!= operator ---> result="+resultBool)
	}
	def logical(arg1:Boolean,arg2:Boolean)
	{
		println("\nLOGICAL OPERATORS:")
		resultBool=(arg1 && arg2)
		println("&& operator ---> result="+resultBool)
		resultBool=(arg1 || arg2)
		println("|| operator ---> result="+resultBool)
		resultBool=(!arg1)
		println("! operator ---> result="+resultBool)
	}
	def bitwise(arg1:Int,arg2:Int)
	{
		println("\nBITWISE OPERATORS:")
		result=(arg1 & arg2)
		println("&& operator ---> result="+result)
		result=(arg1 | arg2)
		println("|| operator ---> result="+result)
		result=(arg1 ^ arg2)
		println("! operator ---> result="+result)
		result=(~arg2)
		result=arg1<<2
		result=arg1>>2
	}
	def assignment(arg1:Int,arg2:Int)
	{
		println("\nASSIGNMENT OPERATORS:")
		result=arg1+arg2
		println("= operator ---> result="+result)
		result+=arg1
		println("+= operator ---> result="+result)
		result-=arg1
		println("-= operator ---> result="+result)
		result*=arg1
		println("*= operator ---> result="+result)
		result/=arg1
		println("/= operator ---> result="+result)
		result<<=arg1
		println("<<= operator ---> result="+result)
		result>>=arg1
		println(">>= operator ---> result="+result)
		result&=arg1
		println("&= operator ---> result="+result)
		result^=arg1
		println("^= operator ---> result="+result)
		result|=arg1
		println("|= operator ---> result="+result)
	}
}
object operator
{
	def main(args:Array[String])
	{
		var obj1,obj2,obj3,obj4,obj5=new Operation()
		obj1.arithmetic(12,11)
		obj2.relational(20,26)
		obj3.logical(true,true)
		obj4.bitwise(8,9)
		obj5.assignment(23,51)
	}
}