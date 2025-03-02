# Wonderland Project Guidelines

## Build Commands
```bash
export ANT_OPTS="-XX:MaxPermSize=900m -Xmx900m"  # Setup environment
ant build        # Build entire project
ant clean        # Clean build
ant package      # Package application
cd modules/[module-directory] && ant build  # Build specific module
```

## Run Commands
```bash
# Run the Wonderland server
ant run-server

# Debug the server
ant debug-server
```

## Test Commands
```bash
cd test && ant build               # Build tests
cd test/harness && ant run-master  # Run test master
cd test/harness && ant run-slave   # Run test slave
# Run single test with custom directory:
ant -Dwonderland.user.dir=/path/to/unique/directory run-slave
```

## Certificate Issues
If you see certificate errors during the build or runtime, there are two keystores that may need to be updated:

1. Main Wonderland keystore (for JAR signing):
```bash
# Generate a new self-signed certificate valid for 10 years
cd /root/WonderDir/Production/wonderland
keytool -genkey -alias wonderlandsig -keyalg RSA -validity 3650 -keystore build-tools/keystore/wonderlandKeystore.jks -storepass wonderland -keypass wonderland -dname "CN=Open Wonderland Foundation, OU=Open Wonderland Foundation, O=Open Wonderland Foundation, L=St. Paul, ST=Minnesota, C=US"
```

2. GlassFish server certificates (if you see "java_security.expired_certificate" warnings):
```bash
# The embedded GlassFish server contains certificates in its JAR file
cd /root/WonderDir/Production/wonderland

# Extract the certificates
mkdir -p temp_jar/config
$(dirname $(readlink -f $(which java)))/jar -xf web/lib/glassfish/glassfish-embedded-all-3.0-b74b.jar config/keystore.jks config/cacerts.jks
mv config/keystore.jks config/cacerts.jks temp_jar/config/
rmdir config

# Create new certificates
$(dirname $(readlink -f $(which java)))/keytool -delete -alias s1as -keystore temp_jar/config/keystore.jks -storepass changeit
$(dirname $(readlink -f $(which java)))/keytool -genkey -alias s1as -keyalg RSA -validity 3650 -keystore temp_jar/config/keystore.jks -storepass changeit -keypass changeit -dname "CN=localhost, OU=Open Wonderland, O=Open Wonderland Foundation, L=St. Paul, ST=Minnesota, C=US"
$(dirname $(readlink -f $(which java)))/keytool -genkey -alias cacert -keyalg RSA -validity 3650 -keystore temp_jar/config/cacerts.jks.new -storepass changeit -keypass changeit -dname "CN=localhost CA, OU=Open Wonderland, O=Open Wonderland Foundation, L=St. Paul, ST=Minnesota, C=US"
mv temp_jar/config/cacerts.jks.new temp_jar/config/cacerts.jks

# Update the GlassFish JAR with new certificates
$(dirname $(readlink -f $(which java)))/jar -uf web/lib/glassfish/glassfish-embedded-all-3.0-b74b.jar -C temp_jar .
rm -rf temp_jar
```

## Code Style Guidelines
- **Package Structure**: Use org.jdesktop.wonderland namespace
- **Imports**: No wildcards, ordered by package name
- **Naming**: Classes=PascalCase, methods/variables=camelCase, constants=UPPER_CASE
- **Formatting**: 4-space indentation, braces on same line
- **Javadoc**: Required for classes, methods, and fields
- **Error Handling**: Use specific exceptions with proper logging
- **Logging**: Use java.util.logging with appropriate levels
- **Null Handling**: Explicit null checks before operations