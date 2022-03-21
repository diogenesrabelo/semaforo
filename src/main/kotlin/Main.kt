fun main() {
    var semaforo = Semaforo.VERDE
    while(true) {
        println(semaforo.name)
        semaforo = semaforo.next()
    }
}