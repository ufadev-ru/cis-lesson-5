FROM jenkins/jenkins
USER jenkins
RUN ssh-keyscan github.com >> /etc/ssh/known_hosts