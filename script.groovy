def buildApp() {
    echo 'building the application for arvind...'
} 

def testApp() {
    echo 'testing the application for arvind...'
} 

def deployApp() {
    echo 'deplying the application for arvind...'
    echo "deploying version ${params.VERSION}"
} 

return this
