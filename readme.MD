# 🎮 VALORANT Manager System - Java OOP Project

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Status](https://img.shields.io/badge/Status-Development-green?style=for-the-badge)

Sistema de gestión técnica basado en el universo de **VALORANT**, desarrollado como proyecto integral para la asignatura de Programación. El sistema gestiona agentes, habilidades personalizadas, un arsenal detallado con estadísticas de daño y una tienda funcional.

## 🚀 Características del Proyecto

Este proyecto implementa los pilares de la Programación Orientada a Objetos (POO) y estructuras de control avanzadas:

- **Arquitectura Multicapa:** Organización en paquetes (`agentes` y `arsenal`).
- **Jerarquía de Herencia:** Clases base para Agentes y Armas con especializaciones funcionales.
- **Gestión de Datos:** Uso intensivo de `ArrayList` para inventarios y `HashMap` para búsquedas rápidas por clave.
- **Lógica de Negocio:** Validación de estadísticas, filtrado de elementos y gestión de economía.

---

## 🛠️ Estructura del Sistema

### 📂 Paquete: `com.valorant.agentes`
* **Agente (Padre):** Atributos base como vida, país y estado.
* **Duelista / Centinela:** Clases hijas que implementan el sistema de 4 habilidades (C, Q, E, X).
* **Habilidad:** Clase auxiliar que define costes, tipos de efecto y nombres.
* **EquipoAgentes:** Gestor de listas y mapas para el control de la plantilla de personajes.

### 📂 Paquete: `com.valorant.arsenal`
* **Arma (Padre):** Define precios, categorías y cadencia.
* **Rifle / Francotirador:** Especializaciones con cálculo de daño localizado (Cabeza, Pecho, Piernas).
* **Skin:** Sistema de cosméticos y colecciones.
* **Tienda:** Lógica de inventario, descuentos y búsqueda de armamento.

---

## 📋 Requisitos Técnicos Cumplidos

| Requisito | Implementación |
| :--- | :--- |
| **Clases** | 10 clases con constructores completos/vacíos, getters, setters y `toString`. |
| **Herencia** | 2 Clases padre y 4 clases hijas especializadas. |
| **Colecciones** | 4 `ArrayList` y 2 `HashMap` con métodos CRUD (Añadir, Buscar, Borrar). |
| **Tipos de Datos** | Uso de `String`, `int`, `double`, `boolean` y `Enums`. |
| **Estructuras** | Bucles `for/while`, condicionales `if/else` y `switch`. |
| **Persistencia** | Sobrescritura de `equals` y `hashCode` en todas las entidades. |

---

## 💻 Ejemplo de Ejecución (Main)

El sistema inicializa un entorno completo con:
1.  **Agentes:** Instancias de duelistas como *Jett* y centinelas como *Sage*, cada uno con sus 4 habilidades asignadas.
2.  **Arsenal:** Configuración de armas icónicas (*Vandal*, *Operator*) con sus respectivos daños por zona.
3.  **Gestión:** Reclutamiento de agentes en el equipo y aplicación de descuentos en la tienda mediante lógica de mapas.

---

## ⚙️ Instalación

1. Clona el repositorio:
   ```bash
   git clone [https://github.com/tu-usuario/valorant-java-project.git](https://github.com/tu-usuario/valorant-java-project.git)