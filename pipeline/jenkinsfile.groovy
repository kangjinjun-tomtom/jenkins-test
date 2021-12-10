pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                test('kangjin kangjin');
                echo 'Hello World'
            }
        }
    }
}
