def buildapp(){
    echo "Building the application ${params.BRANCH_VERSION}"

}
def testapp(){
    echo "Running tests ${params.BRANCH_VERSION}"
}
def deployapp(){
    echo "Deploying Branch ${params.BRANCH_VERSION}"

}
return this