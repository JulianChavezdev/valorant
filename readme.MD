# 🎮 Valorant Core Engine | Simulation Backend

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Versión-1.0_Estable-green?style=for-the-badge)
![UD3](https://img.shields.io/badge/Evaluación-UD3_Estructuras_Control-blue?style=for-the-badge)

Este proyecto es un simulador táctico de backend basado en el universo de **Valorant**. La aplicación gestiona de forma integral la lógica de combate, la jerarquía de personajes y el cálculo de daño balístico dinámico, cumpliendo estrictamente con los requisitos de programación orientada a objetos y gestión de colecciones.

---

## 🏗️ Arquitectura del Sistema

El proyecto está organizado en dos paquetes estratégicos para garantizar el desacoplamiento:

### 1. `com.valorant.core` (Entidades de Juego)
Contiene la definición de los objetos del dominio. Se utiliza **Herencia** para especializar comportamientos.

* **Jerarquía de Agentes:**
    * `Agente` (Padre): Base con lógica de comparación `equals/hashCode`.
    * `Duelista`, `Centinela`, `Controlador` (Hijas): Implementan atributos únicos como multiplicadores de velocidad o gestión de trampas.
* **Jerarquía de Armas:**
    * `Arma` (Padre): Atributos de capacidad y daño base.
    * `Fusil`, `Francotirador`, `Subfusil` (Hijas): Implementan el **Damage Falloff** (caída de daño por distancia) y modos de disparo específicos.

### 2. `com.valorant.engine` (Lógica y Gestión)
Donde reside la inteligencia del simulador y el manejo de datos complejos.

* **`Arsenal`:** Sistema CRUD gestionado por un `HashMap<String, Arma>`.
* **`Squad`:** Control de escuadrones mediante `ArrayList<Agente>` y logs de historial.
* **`CombateLog`:** Motor de cálculo de impactos con lógica de `HashMap<Agente, Integer>`.
* **`Partida`:** Orquestador principal que utiliza `HashSet<String>` para el control de jugadores vivos en tiempo real.

---

## 🛠️ Especificaciones Técnicas (UD3)

Para garantizar la máxima nota, el proyecto implementa las siguientes estructuras de control y datos:

### 📊 Gestión de Colecciones
| Estructura | Implementación | Propósito |
| :--- | :--- | :--- |
| **HashMap** | `catalogoArmas` | Acceso $O(1)$ a las armas por nombre. |
| **HashMap** | `danoRecibido` | Registro acumulativo de daño por Agente. |
| **HashSet** | `jugadoresVivos` | Gestión eficiente de estados de eliminación. |
| **ArrayList** | `miembros`, `historial` | Gestión secuencial de equipo y eventos. |

### ⚙️ Lógica de Control
* **Cálculo Dinámico:** El daño se procesa mediante condicionales anidados en `CombateLog`.
  $$D_{final} = (D_{base} \cdot M_{distancia}) \cdot M_{zona}$$
* **Bucle de Simulación:** Un ciclo `while` en `Partida` controla el flujo de las 13 rondas reglamentarias.
* **Filtrado Eficiente:** Uso de bucles `for-each` para búsqueda de armas por umbral de daño y aplicación de daño global por explosión.

---

## 📋 Requisitos de Implementación

Cada clase en este proyecto incluye de forma obligatoria:
1.  **Atributos:** Mínimo 4 atributos por clase (incluyendo Tipos Primitivos, String y Enums).
2.  **Encapsulamiento:** Getters, Setters y Constructores (Vacío y Completo).
3.  **Métodos Object:** Sobrescritura de `toString`, `equals` y `hashCode`.
4.  **Enums:** Uso de enumerados para `TipoAgente` y `ZonaCuerpo`.

---

## 🚀 Ejecución

La clase `Main` (en la raíz) instancia el ecosistema completo, simulando:
1.  La creación de un **Arsenal** completo.
2.  La formación de un **Squad** (con validación de composición táctica).
3.  Una secuencia de combate con registro de logs y resumen final de bajas.

---
> **Nota Académica:** Este proyecto ha sido diseñado para demostrar habilidades avanzadas en el manejo de herencia, polimorfismo y estructuras de datos dinámicas en Java.
