#!/usr/bin/env groovy
pipeline {

    options {
        buildDiscarder(logRotator(numToKeepStr: '5'))
        timeout(time: 20, unit: 'MINUTES')
    }

    stages {
        stage('checkout') {
            steps {
                print "dlfkajdlakj"
            }
        }
    }
}