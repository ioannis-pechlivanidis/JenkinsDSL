job('Constructed Job') {
    steps {
    	println("Hello 1")
       	batchFile('echo Hello World!')
    }
}