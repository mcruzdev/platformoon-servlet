FROM airhacks/glassfish
COPY ./target/platformoon-servlet.war ${DEPLOYMENT_DIR}
