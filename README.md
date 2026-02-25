# 📧 N8N GMAIL - Automatización de Citas Médicas

Proyecto de automatización n8n para gestión de citas médicas vía Gmail desarrollado por **Isaac Esteban Haro Torres**.

---

## 📝 Descripción

Flujo de n8n que lee correos entrantes de Gmail con asunto "Cita médica", extrae los datos del paciente (nombre, fecha, hora, tipo de consulta) y los guarda en Google Sheets. Opcionalmente envía confirmación al paciente por Telegram.

---

## ✨ Características

- Trigger de correos entrantes en Gmail
- Filtrado por asunto "Cita médica"
- Extracción automática de datos del correo
- Guardado en Google Sheets
- Notificación opcional por Telegram
- Completamente dockerizado

---

## 🛠️ Stack Tecnológico

- n8n (última versión)
- Docker
- Google Sheets API
- Gmail API
- Telegram Bot API

---

## 🚀 Uso

### 1. Configurar credenciales

Crear archivo `.env` con las siguientes variables:

```env
# Credenciales n8n
N8N_USER=admin
N8N_PASSWORD=tu_password_seguro
N8N_HOST=localhost
WEBHOOK_URL=http://localhost:5678

# Google Sheets - Crear en Google Cloud Console
GOOGLE_SHEETS_CLIENT_ID=tu_client_id
GOOGLE_SHEETS_CLIENT_SECRET=tu_client_secret
GOOGLE_SHEETS_REDIRECT_URI=http://localhost:5678/oauth2/callback

# Telegram - Obtener de @BotFather
TELEGRAM_BOT_TOKEN=tu_bot_token
```

### 2. Levantar contenedor

```bash
docker-compose up -d
```

### 3. Acceder a n8n

- URL: http://localhost:5678
- Usuario: admin (o el que configures)
- Contraseña: la que configures en .env

### 4. Importar flujo

1. En la UI de n8n, hacer clic en "Import from File"
2. Seleccionar el archivo `workflow.json`
3. Configurar las credenciales en n8n (Credentials)

### 5. Configurar credenciales en n8n

- **Gmail**: Ir a Credentials → New → Gmail OAuth2 → Autenticar con cuenta Google
- **Google Sheets**: Ir a Credentials → New → Google Sheets OAuth2 → Autenticar
- **Telegram**: Ir a Credentials → New → Telegram API → Ingresar Bot Token

---

## 📋 Formato esperado del correo

```
Asunto: Cita médica

Paciente: Juan Pérez
Fecha: 25/02/2026
Hora: 10:00
Tipo de consulta: Revisión general
```

---

## 🔧 Configuración avanzada

### Cambiar intervalo de verificación

En el nodo "Trigger Gmail", modificar el campo "Interval" según necesidad (default: cada 5 minutos).

### Cambiar Sheet ID

En el nodo "Guardar en Sheets", actualizar el campo "Sheet ID" con tu Google Sheet.

---

## 📁 Estructura del proyecto

```
N8N GMAIL/
├── workflow.json      # Flujo de n8n
├── docker-compose.yml # Configuración Docker
├── .env.example       # Ejemplo de variables de entorno
└── README.md          # Este archivo
```

---

## 👨‍💻 Desarrollado por Isaac Esteban Haro Torres

**Ingeniero en Sistemas · Full Stack · Automatización · Data**

- 📧 Email: zackharo1@gmail.com
- 📱 WhatsApp: 098805517
- 💻 GitHub: https://github.com/ieharo1
- 🌐 Portafolio: https://ieharo1.github.io/portafolio-isaac.haro/

---

© 2026 Isaac Esteban Haro Torres - Todos los derechos reservados.
