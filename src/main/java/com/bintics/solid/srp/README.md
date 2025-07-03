# 🧪 Taller SOLID - Ejercicio "Diseño de software"

¡Bienvenido al taller práctico de principios SOLID!  
Este repositorio contiene un código base que **funciona correctamente**, pero **viola principios de diseño** (como SRP) de forma sutil.

## 🎯 Objetivo
Detectar y corregir violaciones de responsabilidad única y otros principios SOLID mediante análisis y refactorización colaborativa.

---

## 📂 Estructura del Proyecto

- /src
    - OrderService.java *(Clase principal con múltiples responsabilidades)*
    - Clases auxiliares *(Simulación de dependencias simples)*


---

## 👣 Pasos para participar (desde GitHub Web)

1. **Haz un fork de este repositorio** (usa el botón en la parte superior derecha).
2. **Clona el repo o trabaja directamente en GitHub Web**.

    - Para trabajar directamente desde el navegador:
        - Presiona `.` (punto) en la vista del repo para abrir el editor web.
        - O haz click en `Code > Open with Codespaces` si tienes acceso.

3. **Crea una rama nueva** desde `develop`:
   - refactor/srp-**tu_nombre_o_equipo**


4. **Edita el código**:
- Identifica las distintas responsabilidades mezcladas.
- Extrae clases que las encapsulen (ej. `OrderValidator`, `TaxService`, `Notifier`, etc.).
- Deja un orquestador limpio que simplemente coordine.

5. **Haz commit de tus cambios** en tu rama.

6. **Abre un Pull Request** hacia tu propio `main` o (si es colaborativo) hacia el repo original.

---

## ✅ Qué evaluar

- ¿Identificaste claramente responsabilidades separadas?
- ¿El código resultante es más fácil de leer, testear y mantener?
- ¿El flujo quedó orquestado en un solo lugar?
- ¿Hay contratos o dependencias explícitas en vez de implícitas?

---

## 📢 Presentación

Cada equipo podrá explicar:
- ¿Qué detectaron?
- ¿Qué extrajeron y por qué?
- ¿Qué desafíos encontraron?
- ¿Qué harían distinto si esto fuera un sistema real?

¡Éxito y que gane el mejor diseño! 🧠💪

---

**Autor del taller**: [Fede - Líder Técnico]  
**Tema**: Principio de Responsabilidad Única (SRP) + Acoplamientos Implícitos
