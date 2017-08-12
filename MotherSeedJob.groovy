job('WindowsBatchJob_Constructor') {
    steps {
        dsl {
            text(readFileFromWorkspace('SeedJobs\\WindowsBatchJob\\WindowsBatchJob.groovy'))
        }
      	if (!jenkins.model.Jenkins.instance.getItemByFullName('WindowsBatchJob_Constructor')) {
    		queue('WindowsBatchJob_Constructor')
		}
        
    }
}

job('WindowsBatchJob_Constructor2') {
    steps {
        dsl {
            text(readFileFromWorkspace('SeedJobs\\WindowsBatchJob2\\WindowsBatchJob2.groovy'))
        }
      	if (!jenkins.model.Jenkins.instance.getItemByFullName('WindowsBatchJob_Constructor2')) {
    		queue('WindowsBatchJob_Constructor2')
		}
    }
}