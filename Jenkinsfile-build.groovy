pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
               echo "===== Build image frontend-core ====="
               sh """
               docker build -t $REGISTRY/$OCP_NAMESPACE/$OCP_APP_NAME-frontend-core:$APP_VERSION \
                            --no-cache \
                            --target final \
                            --build-arg NODEJS__BASE_IMAGE=$RH_REGISTRY/ubi8/nodejs-18:latest \
                            --build-arg NGINX__BASE_IMAGE=$RH_REGISTRY/ubi8/nginx-122:latest \
                            --build-arg FRONTEND__NPM_EXTERNAL_DSO=$REPO_NODEJS \
                            --build-arg APP_VERSION=$APP_VERSION \
                            -f $DOCKERFILE_PATH \
                            .
               """

               echo "===== push image frontend-core ====="
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                // Команды для тестирования
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
                // Команды для развертывания
            }
        }
    }
}