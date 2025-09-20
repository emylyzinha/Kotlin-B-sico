# Kotlin-Básico 

// Instalar JDK
sudo apt-get update
sudo apt-get install openjdk-17-jdk


// Instalar o Kotlin
curl -s https://get.sdkman.io | bash
source "$HOME/.sdkman/bin/sdkman-init.sh"
sdk install kotlin

// Compilar o código
kotlinc Main.kt -include-runtime -d Main.jar
java -jar Main.jar