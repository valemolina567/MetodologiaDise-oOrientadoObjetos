# Sistema de Figuras Geométricas

## Descripción

Este proyecto implementa un sistema de modelado de figuras geométricas aplicando los principios fundamentales de la Programación Orientada a Objetos (POO) en Java.

El sistema permite representar diferentes figuras geométricas, asignarles valores por defecto y calcular automáticamente su perímetro y área.

Las figuras implementadas son:

* Cuadrado
* Círculo
* Rectángulo
* Triángulo

---

## Salida Esperada

```text
=== Sistema de Figuras Geométricas ===

=============================
Figura : Cuadrado (lado=4)
Perímetro : 16
Área      : 16
=============================

=============================
Figura : Círculo (radio=5)
Perímetro : 31
Área      : 79
=============================

=============================
Figura : Rectángulo (base=6, altura=3)
Perímetro : 18
Área      : 18
=============================

=============================
Figura : Triángulo (lados=4,4,4, altura=3)
Perímetro : 12
Área      : 6
=============================
```

---

## Extensibilidad del Sistema

Para agregar una nueva figura geométrica:

1. Crear una nueva clase
2. Extender de `Figura`
3. Implementar los métodos obligatorios
4. Agregar el nombre de la clase en la lista de `Main`

No es necesario modificar la lógica existente.

Esto cumple con el principio:

**Open/Closed Principle (OCP)**

---
