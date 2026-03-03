# 🎮 VALORANT Manager System - Java OOP Project

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
<<<<<<< HEAD
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
* **valorantAgentes.Agente (Padre):** Atributos base como vida, país y estado.
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
=======
![Status](https://img.shields.io/badge/Status-Complete-brightgreen?style=for-the-badge)

A comprehensive technical management system based on the **VALORANT** universe. This project was developed as an integral application for Object-Oriented Programming (OOP), managing agents, unique ability kits, an advanced arsenal with hit-zone damage stats, and a functional store.

## 🚀 Project Overview

This system implements the core pillars of OOP and advanced control structures:

- **Multi-layer Architecture:** Organized into specific packages (`agentes` and `arsenal`).
- **Inheritance Hierarchy:** Base classes for Agents and Weapons with specialized subclasses.
- **Data Management:** Extensive use of `ArrayList` for inventories and `HashMap` for high-performance key-value lookups.
- **Business Logic:** Stat validation, hit-zone damage calculation, and economic management.

---

## 🛠️ System Structure

### 📂 Package: `com.valorant.agentes`
* **Agente (Parent):** Base attributes such as health, country of origin, and status.
* **Duelista / Centinela (Children):** Specialized classes implementing the 4-ability system (C, Q, E, X).
* **Habilidad (Auxiliary):** Defines ability costs, effect types, and charges.
* **EquipoAgentes (Manager):** Handles lists and maps to control the active roster of characters.

### 📂 Package: `com.valorant.arsenal`
* **Arma (Parent):** Defines pricing, categories, and firing rates.
* **Rifle / Francotirador (Children):** Specialized classes featuring localized damage stats (Head, Body, Legs).
* **Skin (Auxiliary):** Manages cosmetic items and collections.
* **Tienda (Manager):** Logic for inventory management, active discounts, and weapon queries.

---

## 📋 Technical Requirements Met

| Requirement | Implementation |
| :--- | :--- |
| **Classes** | 10 distinct classes with full/empty constructors, getters, setters, and custom `toString`. |
| **Inheritance** | 2 Parent classes and 4 specialized child classes. |
| **Collections** | 4 `ArrayList` and 2 `HashMap` structures with CRUD methods (Add, Search, Delete). |
| **Data Types** | Robust use of `String`, `int`, `double`, `boolean`, and custom `Enums`. |
| **Logic** | Implementation of `for/while` loops, `if/else` conditionals, and `switch` statements. |
| **Data Integrity** | Overridden `equals` and `hashCode` in all entities for correct collection behavior. |

---

## 💻 Execution Example (Main)

The `Main` class initializes a full environment including:
1.  **Agents:** Instantiating Duelists (e.g., Jett) and Sentinels (e.g., Sage) with their full ability kits.
2.  **Arsenal:** Configuration of iconic weapons (Vandal, Operator) with specific damage-per-hitbox values.
3.  **Operations:** Recruiting agents into a team and managing store inventory via Map logic.

---

## ⚙️ Installation & Usage

1. Clone the repository:
   ```bash
   git clone [https://github.com/your-username/valorant-java-project.git](https://github.com/your-username/valorant-java-project.git)
>>>>>>> 59ce618914e4e5402e01cccd3bbc0afd07f32eef
