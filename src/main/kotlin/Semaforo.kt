enum class Semaforo(val segundos: Long) {

    VERMELHO(60_000) {
        override fun next(): Semaforo {
            Thread.sleep(this.segundos)
            return VERDE
        }
    },

    VERDE(60_000) {
        override fun next(): Semaforo {
            Thread.sleep(this.segundos)
            return AMARELO
        }
    },

    AMARELO(1_000) {
        override fun next(): Semaforo {
            Thread.sleep(this.segundos)
            return VERMELHO
        }
    };

    abstract fun next(): Semaforo
}