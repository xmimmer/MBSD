package dk.sdu.mmmi.mdsd.generator

class MathGenerator extends AbstractGenerator {

	static Map<String, Integer> variables = new HashMap();
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa,
				 IGeneratorContext context) {
		val math = resource.allContents.filter(MathExp).next
		val result = math.compute
		
		result.displayPanel
	}
	
	def static compute(MathExp math) {
		variables.put(math.name, math.exp.computeExp) 
		return variables
		}
	
	def static int computeExp(Expression exp) {
		switch exp {
			Plus: exp.left.computeExp+exp.right.computeExp
			Minus: exp.left.computeExp-exp.right.computeExp
			Multiply: exp.left.computeExp*exp.right.computeExp
			Divide: exp.left.computeExp/exp.right.computeExp
			default: throw new Error("Invalid Expression")
		}
		
	}
	
	def void displayPanel(Map<String, Integer> result) {
		var resultString = ""
		for (entry : result.entrySet()) {
         	resultString += "var " + entry.getKey() + " = " + entry.getValue() + "\n"
        }
		
		JOptionPane.showMessageDialog(null, resultString ,"Math Language",
 		JOptionPane.INFORMATION_MESSAGE)
	}

}
