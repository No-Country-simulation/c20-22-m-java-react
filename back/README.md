## 🛠️ Configuración Inicial

----

### 📌 Levantar back en CLI
>Posicionarse en la carpeta `back/`

>Abrir CMD y ejecutar el siguiente comando `./gradlew bootRun`

### 📌 Levantar back (Desde IDE)
>Hacer click en ▶️ 👉: `./gradlew bootRun`

### 📌 Finalizar ejecucion
> Presionar teclas: `Ctrl` + `C`

## 🔗 URL para consumir

---

### ✅ Publicacion
>**GET:** `http://localhost:3000/api/v1/publications/all`

>**GET:** `http://localhost:3000/api/v1/publications/findById/{id}`

>**GET:** `http://localhost:3000/api/v1/publications/allOwnerPublishes`
 
>**GET:** `http://localhost:3000/api/v1/publications/allOwnerNonPublishes`

>**GET:** `http://localhost:3000/api/v1/publications/allRescuedPets`

>**POST:** `http://localhost:3000/api/v1/publications/save`

>**PUT:** `http://localhost:3000/api/v1/publications/update/{id}`

>**DELETE:** `http://localhost:3000/api/v1/publications/delete/{id}`