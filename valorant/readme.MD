# 🎮 VALORANT Manager System - Java OOP Project

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
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
