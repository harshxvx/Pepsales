# Pepsales


This repository contains a **scalable notification system** designed to handle email, SMS, and push notifications efficiently. The system prioritizes messages using **Apache Kafka** for event streaming, **Redis** for caching, and integrates with third-party providers such as **SendGrid** for email and **Twilio** for SMS.

## Features

- **Notification API**: Allows creating and managing notifications across multiple channels.
- **Multi-Channel Support**: Email, SMS, and Push Notifications, with the flexibility to add more.
- **Priority-Based Queuing**: Dynamically processes notifications based on priority levels (Transactional, Informational, Promotional).
- **User Preferences**: 
  - Opt-in/out of specific channels or categories (e.g., disable promotional SMS).
  - Set quiet hours for each channel.
- **Duplicate Prevention**: Ensures no duplicate notifications are sent using a `UNIQUE` DB constraint and a `message_hash` for consistency.
- **Templating**: Supports placeholders like `{name}` and `{otp}` for dynamic message personalization.
- **Rate Limiting**: Handles API rate limits for third-party vendors efficiently.
- **Scalability**: Designed for high-throughput systems with asynchronous processing to avoid blocking users.

- 
### 4. Push Notifications

Push notifications currently return a mock response. The logic is implemented in the `PushNService` class. You can extend this to integrate with an external push notification provider.

 Database Configuration

This project uses **MySQL** running on `localhost` as the database. To set up the database:

1. Create a new SQL database for the project as per the schema design.
2. You can take help from the Sql Commands file.
