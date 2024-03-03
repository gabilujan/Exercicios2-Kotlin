import kotlin.math.*

fun areaRetangulo(base: Double, altura: Double): Double {
    return base * altura
}

fun areaTriangulo(base: Double, altura: Double): Double {
    return (base * altura) / 2
}

fun areaTrianguloEquilatero(lado: Double): Double {
    return (sqrt(3.0) / 4) * lado * lado
}

fun areaTrianguloIsosceles(base: Double, altura: Double): Double {
    return (base * altura) / 2
}

fun areaTrianguloEscaleno(lado1: Double, lado2: Double, lado3: Double): Double {
    val semiPerimetro = (lado1 + lado2 + lado3) / 2
    return sqrt(semiPerimetro * (semiPerimetro - lado1) * (semiPerimetro - lado2) * (semiPerimetro - lado3))
}

fun areaCircunferencia(raio: Double): Double {
    return PI * raio * raio
}

fun areaLosango(diagonalMaior: Double, diagonalMenor: Double): Double {
    return (diagonalMaior * diagonalMenor) / 2
}

fun areaTrapezio(baseMaior: Double, baseMenor: Double, altura: Double): Double {
    return ((baseMaior + baseMenor) * altura) / 2
}

fun main() {
    println("Área do Retângulo: " + areaRetangulo(5.0, 3.0))
    println("Área do Triângulo: " + areaTriangulo(4.0, 6.0))
    println("Área do Triângulo Equilátero: " + areaTrianguloEquilatero(4.0))
    println("Área do Triângulo Isósceles: " + areaTrianguloIsosceles(4.0, 6.0))
    println("Área do Triângulo Escaleno: " + areaTrianguloEscaleno(3.0, 4.0, 5.0))
    println("Área da Circunferência: " + areaCircunferencia(3.0))
    println("Área do Losango: " + areaLosango(4.0, 6.0))
    println("Área do Trapézio: " + areaTrapezio(6.0, 4.0, 5.0))
}
