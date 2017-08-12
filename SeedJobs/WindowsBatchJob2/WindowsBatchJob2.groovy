job('WindowsBatchJob2') {
    steps {
    	println("My debug message...")
       	batchFile('echo Hello World! No2')
    }
}