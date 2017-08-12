job('WindowsBatchJob') {
    steps {
    	println("My debug message...")
       	batchFile('echo Hello World!')
    }
}