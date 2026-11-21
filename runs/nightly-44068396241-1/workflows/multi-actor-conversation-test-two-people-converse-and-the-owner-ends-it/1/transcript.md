# Transcript: Two people exchange messages; an outsider is kept out; closing stops the thread

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.MultiActorConversationTest#twoPeopleConverseAndTheOwnerEndsIt` |
| Features | FEAT-CONV-01, FEAT-CONV-02, FEAT-CONV-03, FEAT-AUTHZ-01, FEAT-REGION-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 33 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 343 | `qa-a122b737-6b2b-4ead-83c2-a127dbf0cce8` |
| 2 | `POST /v1/accounts` | 201 | 45 | `qa-2a86dec3-3182-42d1-b647-0ef66616fd23` |
| 3 | `POST /v1/accounts` | 201 | 30 | `qa-0e781545-eff4-49a5-a72a-d21bb462101f` |
| 4 | `POST /v1/auth/token` | 200 | 27 | `qa-56cc1cef-fd16-45e7-8a76-5e6998e3e88f` |
| 5 | `POST /v1/conversations` | 201 | 53 | `qa-2450e49a-9bef-40e8-bf8b-6bfcb4df73d6` |
| 6 | `POST /v1/auth/token` | 200 | 25 | `qa-1f8091c3-c048-4724-8c6b-006d15dcdc6c` |
| 7 | `GET /v1/conversations` | 200 | 7 | `qa-9c59cf2a-da11-4f63-963f-220d1681aca4` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 11 | `qa-678bd812-802e-4047-ab8b-a795ec0e0d03` |
| 9 | `POST /v1/conversations/{id}/read` | 200 | 11 | `qa-9819d3fe-6fb3-496c-8e9d-3760020c84a4` |
| 10 | `GET /v1/conversations/{id}` | 200 | 6 | `qa-38285bd6-cf7b-4925-8c9c-ebcf3bad0489` |
| 11 | `POST /v1/conversations/{id}/messages` | 201 | 10 | `qa-c53b677e-1dde-412f-85e8-6bfaa2410acc` |
| 12 | `POST /v1/conversations/{id}/messages` | 201 | 10 | `qa-00a564c8-e32e-42bb-8aeb-33718700a6a0` |
| 13 | `GET /v1/conversations/{id}` | 200 | 8 | `qa-d9272fd5-beaa-463b-8d5e-fd2d7c4b603a` |
| 14 | `GET /v1/conversations/{id}/messages` | 200 | 7 | `qa-c3f69a03-c354-4978-9c46-feecaf998481` |
| 15 | `GET /v1/credits/balance` | 200 | 11 | `qa-f6d0b9b3-039c-411f-9be0-e7fadb93b450` |
| 16 | `GET /v1/credits/balance` | 200 | 11 | `qa-d0585a82-b27b-407b-8332-b79d5b27f491` |
| 17 | `POST /v1/auth/token` | 200 | 17 | `qa-cec1b056-31c2-42fe-9b2a-be09201bce3c` |
| 18 | `GET /v1/conversations/{id}` | 403 | 3 | `qa-f0ec0bc3-f0cd-4500-9732-859c8bcb6ed8` |
| 19 | `GET /v1/conversations/{id}/messages` | 403 | 10 | `qa-49b5e702-19bf-4171-a026-e639f371336c` |
| 20 | `POST /v1/conversations/{id}/messages` | 403 | 8 | `qa-ee1ef6ef-ef9e-4081-b8e9-2a175b5a2009` |
| 21 | `GET /v1/conversations` | 200 | 6 | `qa-a7ecece5-daeb-4bb3-bd98-f86ea9e53fa0` |
| 22 | `GET /v1/credits/balance` | 200 | 3 | `qa-7b99fecc-9d7f-4ded-8d7c-79b0aebc4723` |
| 23 | `POST /v1/conversations/{id}/close` | 200 | 6 | `qa-52254a0b-49ff-48ac-90a8-7066405f1555` |
| 24 | `POST /v1/conversations/{id}/close` | 200 | 4 | `qa-c257c2dd-c4fd-4de9-a2df-edbf95ba09ae` |
| 25 | `GET /v1/conversations/{id}/messages` | 200 | 4 | `qa-5da744d7-3f95-4adc-abc8-c6b98a1d15e7` |
| 26 | `POST /v1/conversations/{id}/messages` | 409 | 4 | `qa-08e4f745-77bc-438e-9e4e-003300a80e7d` |
| 27 | `GET /v1/credits/balance` | 200 | 5 | `qa-a22b88b2-23ae-4909-a781-e0a89817d1d1` |
| 28 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-2c5f04ec-22bc-4b6f-8654-b3058fbf389f` |
| 29 | `POST /v1/auth/token` | 401 | 3 | `qa-ebc3da05-ce77-4c98-a92d-cf3747d64453` |
| 30 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-5471fef3-ade3-48d5-b9bf-930460d16131` |
| 31 | `POST /v1/auth/token` | 401 | 3 | `qa-95cfecbc-b1d8-41a2-97f0-94b190523d77` |
| 32 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-cdad099b-4b60-4ad2-8df6-f32519be1b5b` |
| 33 | `POST /v1/auth/token` | 401 | 3 | `qa-2fd0c5c0-ae8e-428e-aacc-34b994f01d01` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a122b737-6b2b-4ead-83c2-a127dbf0cce8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a122b737-6b2b-4ead-83c2-a127dbf0cce8
Content-Type: application/json

--- request body ---
{"handle":"qa-8ca871d45382","displayName":"QA 8ca871d45382","password":"****","region":"eu"}

--- response: 201 in 343 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-a122b737-6b2b-4ead-83c2-a127dbf0cce8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-8ca871d45382
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8a796766-44c0-463b-8931-8fd3b8431922","handle":"qa-8ca871d45382","displayName":"QA 8ca871d45382","region":"eu","role":"user","createdAt":"2026-11-17T10:50:08.127546641Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2a86dec3-3182-42d1-b647-0ef66616fd23

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a86dec3-3182-42d1-b647-0ef66616fd23
Content-Type: application/json

--- request body ---
{"handle":"qa-2b8b1b2bdf55","displayName":"QA 2b8b1b2bdf55","password":"****","region":"us"}

--- response: 201 in 45 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-2a86dec3-3182-42d1-b647-0ef66616fd23
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Location: /v1/accounts/qa-2b8b1b2bdf55
X-Served-Region: us
Content-Length: 181

{"id":"acc_f7d5f72e-6b49-4418-ad05-920819126e34","handle":"qa-2b8b1b2bdf55","displayName":"QA 2b8b1b2bdf55","region":"us","role":"user","createdAt":"2026-11-17T10:50:08.450253865Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-0e781545-eff4-49a5-a72a-d21bb462101f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e781545-eff4-49a5-a72a-d21bb462101f
Content-Type: application/json

--- request body ---
{"handle":"qa-7d3256613d85","displayName":"QA 7d3256613d85","password":"****","region":"in"}

--- response: 201 in 30 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e781545-eff4-49a5-a72a-d21bb462101f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 10
Location: /v1/accounts/qa-7d3256613d85
X-Served-Region: in
Content-Length: 181

{"id":"acc_a99b63d2-c1e5-4047-b276-2d5942a55646","handle":"qa-7d3256613d85","displayName":"QA 7d3256613d85","region":"in","role":"user","createdAt":"2026-11-17T10:50:08.503306772Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-56cc1cef-fd16-45e7-8a76-5e6998e3e88f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56cc1cef-fd16-45e7-8a76-5e6998e3e88f
Content-Type: application/json

--- request body ---
{"handle":"qa-8ca871d45382","password":"****"}

--- response: 200 in 27 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-56cc1cef-fd16-45e7-8a76-5e6998e3e88f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8a796766-44c0-463b-8931-8fd3b8431922"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-2450e49a-9bef-40e8-bf8b-6bfcb4df73d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2450e49a-9bef-40e8-bf8b-6bfcb4df73d6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2b8b1b2bdf55","subject":"Project kickoff","message":"Hi Ben, got a minute?"}

--- response: 201 in 53 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-2450e49a-9bef-40e8-bf8b-6bfcb4df73d6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/conversations/cnv_3bdbe640-35fe-4a1c-9d24-0ba39f760558
X-Data-Region: us
Content-Length: 238

{"id":"cnv_3bdbe640-35fe-4a1c-9d24-0ba39f760558","subject":"Project kickoff","status":"open","region":"us","participants":["qa-8ca871d45382","qa-2b8b1b2bdf55"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:08.588065877Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-1f8091c3-c048-4724-8c6b-006d15dcdc6c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f8091c3-c048-4724-8c6b-006d15dcdc6c
Content-Type: application/json

--- request body ---
{"handle":"qa-2b8b1b2bdf55","password":"****"}

--- response: 200 in 25 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-1f8091c3-c048-4724-8c6b-006d15dcdc6c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f7d5f72e-6b49-4418-ad05-920819126e34"}
```

## 7. GET /v1/conversations

```text
#7 GET http://localhost:7070/v1/conversations
correlation: qa-9c59cf2a-da11-4f63-963f-220d1681aca4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c59cf2a-da11-4f63-963f-220d1681aca4
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-9c59cf2a-da11-4f63-963f-220d1681aca4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: us
Content-Length: 260

{"items":[{"id":"cnv_3bdbe640-35fe-4a1c-9d24-0ba39f760558","subject":"Project kickoff","status":"open","region":"us","participants":["qa-8ca871d45382","qa-2b8b1b2bdf55"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-17T10:50:08.588065877Z"}],"total":1}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_3bdbe640-35fe-4a1c-9d24-0ba39f760558/messages
correlation: qa-678bd812-802e-4047-ab8b-a795ec0e0d03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-678bd812-802e-4047-ab8b-a795ec0e0d03
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-678bd812-802e-4047-ab8b-a795ec0e0d03
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: us
Content-Length: 234

{"items":[{"id":"msg_988ee130-ec43-45d2-ae23-1b2cc7d0afb6","conversationId":"cnv_3bdbe640-35fe-4a1c-9d24-0ba39f760558","sender":"qa-8ca871d45382","body":"Hi Ben, got a minute?","createdAt":"2026-11-17T10:50:08.588242468Z"}],"total":1}
```

## 9. POST /v1/conversations/{id}/read

```text
#9 POST http://localhost:7070/v1/conversations/cnv_3bdbe640-35fe-4a1c-9d24-0ba39f760558/read
correlation: qa-9819d3fe-6fb3-496c-8e9d-3760020c84a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9819d3fe-6fb3-496c-8e9d-3760020c84a4
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-9819d3fe-6fb3-496c-8e9d-3760020c84a4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: us
Content-Length: 77

{"conversationId":"cnv_3bdbe640-35fe-4a1c-9d24-0ba39f760558","unreadCount":0}
```

## 10. GET /v1/conversations/{id}

```text
#10 GET http://localhost:7070/v1/conversations/cnv_3bdbe640-35fe-4a1c-9d24-0ba39f760558
correlation: qa-38285bd6-cf7b-4925-8c9c-ebcf3bad0489

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38285bd6-cf7b-4925-8c9c-ebcf3bad0489
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-38285bd6-cf7b-4925-8c9c-ebcf3bad0489
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: us
X-Data-Region: us
Content-Length: 238

{"id":"cnv_3bdbe640-35fe-4a1c-9d24-0ba39f760558","subject":"Project kickoff","status":"open","region":"us","participants":["qa-8ca871d45382","qa-2b8b1b2bdf55"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:08.588065877Z"}
```

## 11. POST /v1/conversations/{id}/messages

```text
#11 POST http://localhost:7070/v1/conversations/cnv_3bdbe640-35fe-4a1c-9d24-0ba39f760558/messages
correlation: qa-c53b677e-1dde-412f-85e8-6bfaa2410acc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c53b677e-1dde-412f-85e8-6bfaa2410acc
Content-Type: application/json

--- request body ---
{"body":"Sure, now works"}

--- response: 201 in 10 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-c53b677e-1dde-412f-85e8-6bfaa2410acc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: us
Content-Length: 206

{"id":"msg_987d7857-6e3a-4592-89ba-5d1c17bdbbc7","conversationId":"cnv_3bdbe640-35fe-4a1c-9d24-0ba39f760558","sender":"qa-2b8b1b2bdf55","body":"Sure, now works","createdAt":"2026-11-17T10:50:08.870638098Z"}
```

## 12. POST /v1/conversations/{id}/messages

```text
#12 POST http://localhost:7070/v1/conversations/cnv_3bdbe640-35fe-4a1c-9d24-0ba39f760558/messages
correlation: qa-00a564c8-e32e-42bb-8aeb-33718700a6a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00a564c8-e32e-42bb-8aeb-33718700a6a0
Content-Type: application/json

--- request body ---
{"body":"Calling you"}

--- response: 201 in 10 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-00a564c8-e32e-42bb-8aeb-33718700a6a0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: us
Content-Length: 202

{"id":"msg_64794751-2903-45e7-9d74-1b0b22bb84d9","conversationId":"cnv_3bdbe640-35fe-4a1c-9d24-0ba39f760558","sender":"qa-2b8b1b2bdf55","body":"Calling you","createdAt":"2026-11-17T10:50:08.893394905Z"}
```

## 13. GET /v1/conversations/{id}

```text
#13 GET http://localhost:7070/v1/conversations/cnv_3bdbe640-35fe-4a1c-9d24-0ba39f760558
correlation: qa-d9272fd5-beaa-463b-8d5e-fd2d7c4b603a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9272fd5-beaa-463b-8d5e-fd2d7c4b603a
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9272fd5-beaa-463b-8d5e-fd2d7c4b603a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
X-Data-Region: us
Content-Length: 238

{"id":"cnv_3bdbe640-35fe-4a1c-9d24-0ba39f760558","subject":"Project kickoff","status":"open","region":"us","participants":["qa-8ca871d45382","qa-2b8b1b2bdf55"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-17T10:50:08.588065877Z"}
```

## 14. GET /v1/conversations/{id}/messages

```text
#14 GET http://localhost:7070/v1/conversations/cnv_3bdbe640-35fe-4a1c-9d24-0ba39f760558/messages
correlation: qa-c3f69a03-c354-4978-9c46-feecaf998481

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3f69a03-c354-4978-9c46-feecaf998481
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-c3f69a03-c354-4978-9c46-feecaf998481
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 644

{"items":[{"id":"msg_988ee130-ec43-45d2-ae23-1b2cc7d0afb6","conversationId":"cnv_3bdbe640-35fe-4a1c-9d24-0ba39f760558","sender":"qa-8ca871d45382","body":"Hi Ben, got a minute?","createdAt":"2026-11-17T10:50:08.588242468Z"},{"id":"msg_987d7857-6e3a-4592-89ba-5d1c17bdbbc7","conversationId":"cnv_3bdbe640-35fe-4a1c-9d24-0ba39f760558","sender":"qa-2b8b1b2bdf55","body":"Sure, now works","createdAt":"2026-11-17T10:50:08.870638098Z"},{"id":"msg_64794751-2903-45e7-9d74-1b0b22bb84d9","conversationId":"cnv_3bdbe640-35fe-4a1c-9d24-0ba39f760558","sender":"qa-2b8b1b2bdf55","body":"Calling you","createdAt":"2026-11-17T10:50:08.893394905Z"}],"total":3}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-f6d0b9b3-039c-411f-9be0-e7fadb93b450

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6d0b9b3-039c-411f-9be0-e7fadb93b450
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6d0b9b3-039c-411f-9be0-e7fadb93b450
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 89

{"balance":4,"currency":"credits","accountId":"acc_8a796766-44c0-463b-8931-8fd3b8431922"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-d0585a82-b27b-407b-8332-b79d5b27f491

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0585a82-b27b-407b-8332-b79d5b27f491
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-d0585a82-b27b-407b-8332-b79d5b27f491
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 10
X-Served-Region: us
Content-Length: 89

{"balance":3,"currency":"credits","accountId":"acc_f7d5f72e-6b49-4418-ad05-920819126e34"}
```

## 17. POST /v1/auth/token

```text
#17 POST http://localhost:7070/v1/auth/token
correlation: qa-cec1b056-31c2-42fe-9b2a-be09201bce3c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cec1b056-31c2-42fe-9b2a-be09201bce3c
Content-Type: application/json

--- request body ---
{"handle":"qa-7d3256613d85","password":"****"}

--- response: 200 in 17 ms ---
Date: Tue, 17 Nov 2026 10:50:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-cec1b056-31c2-42fe-9b2a-be09201bce3c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a99b63d2-c1e5-4047-b276-2d5942a55646"}
```

## 18. GET /v1/conversations/{id}

```text
#18 GET http://localhost:7070/v1/conversations/cnv_3bdbe640-35fe-4a1c-9d24-0ba39f760558
correlation: qa-f0ec0bc3-f0cd-4500-9732-859c8bcb6ed8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0ec0bc3-f0cd-4500-9732-859c8bcb6ed8
Content-Type: application/json

--- response: 403 in 3 ms ---
Date: Tue, 17 Nov 2026 10:50:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f0ec0bc3-f0cd-4500-9732-859c8bcb6ed8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: in
Content-Length: 285

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_3bdbe640-35fe-4a1c-9d24-0ba39f760558","correlationId":"qa-f0ec0bc3-f0cd-4500-9732-859c8bcb6ed8"}
```

## 19. GET /v1/conversations/{id}/messages

```text
#19 GET http://localhost:7070/v1/conversations/cnv_3bdbe640-35fe-4a1c-9d24-0ba39f760558/messages
correlation: qa-49b5e702-19bf-4171-a026-e639f371336c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49b5e702-19bf-4171-a026-e639f371336c
Content-Type: application/json

--- response: 403 in 10 ms ---
Date: Tue, 17 Nov 2026 10:50:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-49b5e702-19bf-4171-a026-e639f371336c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: in
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_3bdbe640-35fe-4a1c-9d24-0ba39f760558/messages","correlationId":"qa-49b5e702-19bf-4171-a026-e639f371336c"}
```

## 20. POST /v1/conversations/{id}/messages

```text
#20 POST http://localhost:7070/v1/conversations/cnv_3bdbe640-35fe-4a1c-9d24-0ba39f760558/messages
correlation: qa-ee1ef6ef-ef9e-4081-b8e9-2a175b5a2009

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee1ef6ef-ef9e-4081-b8e9-2a175b5a2009
Content-Type: application/json

--- request body ---
{"body":"Hello?"}

--- response: 403 in 8 ms ---
Date: Tue, 17 Nov 2026 10:50:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ee1ef6ef-ef9e-4081-b8e9-2a175b5a2009
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: in
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_3bdbe640-35fe-4a1c-9d24-0ba39f760558/messages","correlationId":"qa-ee1ef6ef-ef9e-4081-b8e9-2a175b5a2009"}
```

## 21. GET /v1/conversations

```text
#21 GET http://localhost:7070/v1/conversations
correlation: qa-a7ecece5-daeb-4bb3-bd98-f86ea9e53fa0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7ecece5-daeb-4bb3-bd98-f86ea9e53fa0
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Tue, 17 Nov 2026 10:50:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-a7ecece5-daeb-4bb3-bd98-f86ea9e53fa0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: in
Content-Length: 22

{"items":[],"total":0}
```

## 22. GET /v1/credits/balance

```text
#22 GET http://localhost:7070/v1/credits/balance
correlation: qa-7b99fecc-9d7f-4ded-8d7c-79b0aebc4723

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b99fecc-9d7f-4ded-8d7c-79b0aebc4723
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Tue, 17 Nov 2026 10:50:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-7b99fecc-9d7f-4ded-8d7c-79b0aebc4723
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: in
Content-Length: 89

{"balance":5,"currency":"credits","accountId":"acc_a99b63d2-c1e5-4047-b276-2d5942a55646"}
```

## 23. POST /v1/conversations/{id}/close

```text
#23 POST http://localhost:7070/v1/conversations/cnv_3bdbe640-35fe-4a1c-9d24-0ba39f760558/close
correlation: qa-52254a0b-49ff-48ac-90a8-7066405f1555

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52254a0b-49ff-48ac-90a8-7066405f1555
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Tue, 17 Nov 2026 10:50:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-52254a0b-49ff-48ac-90a8-7066405f1555
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 284

{"id":"cnv_3bdbe640-35fe-4a1c-9d24-0ba39f760558","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-8ca871d45382","qa-2b8b1b2bdf55"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-17T10:50:08.588065877Z","closedAt":"2026-11-17T10:50:09.717466529Z"}
```

## 24. POST /v1/conversations/{id}/close

```text
#24 POST http://localhost:7070/v1/conversations/cnv_3bdbe640-35fe-4a1c-9d24-0ba39f760558/close
correlation: qa-c257c2dd-c4fd-4de9-a2df-edbf95ba09ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c257c2dd-c4fd-4de9-a2df-edbf95ba09ae
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 17 Nov 2026 10:50:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-c257c2dd-c4fd-4de9-a2df-edbf95ba09ae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 284

{"id":"cnv_3bdbe640-35fe-4a1c-9d24-0ba39f760558","subject":"Project kickoff","status":"closed","region":"us","participants":["qa-8ca871d45382","qa-2b8b1b2bdf55"],"messageCount":3,"unreadCount":2,"createdAt":"2026-11-17T10:50:08.588065877Z","closedAt":"2026-11-17T10:50:09.717466529Z"}
```

## 25. GET /v1/conversations/{id}/messages

```text
#25 GET http://localhost:7070/v1/conversations/cnv_3bdbe640-35fe-4a1c-9d24-0ba39f760558/messages
correlation: qa-5da744d7-3f95-4adc-abc8-c6b98a1d15e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5da744d7-3f95-4adc-abc8-c6b98a1d15e7
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 17 Nov 2026 10:50:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-5da744d7-3f95-4adc-abc8-c6b98a1d15e7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 10
X-Served-Region: us
Content-Length: 644

{"items":[{"id":"msg_988ee130-ec43-45d2-ae23-1b2cc7d0afb6","conversationId":"cnv_3bdbe640-35fe-4a1c-9d24-0ba39f760558","sender":"qa-8ca871d45382","body":"Hi Ben, got a minute?","createdAt":"2026-11-17T10:50:08.588242468Z"},{"id":"msg_987d7857-6e3a-4592-89ba-5d1c17bdbbc7","conversationId":"cnv_3bdbe640-35fe-4a1c-9d24-0ba39f760558","sender":"qa-2b8b1b2bdf55","body":"Sure, now works","createdAt":"2026-11-17T10:50:08.870638098Z"},{"id":"msg_64794751-2903-45e7-9d74-1b0b22bb84d9","conversationId":"cnv_3bdbe640-35fe-4a1c-9d24-0ba39f760558","sender":"qa-2b8b1b2bdf55","body":"Calling you","createdAt":"2026-11-17T10:50:08.893394905Z"}],"total":3}
```

## 26. POST /v1/conversations/{id}/messages

```text
#26 POST http://localhost:7070/v1/conversations/cnv_3bdbe640-35fe-4a1c-9d24-0ba39f760558/messages
correlation: qa-08e4f745-77bc-438e-9e4e-003300a80e7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08e4f745-77bc-438e-9e4e-003300a80e7d
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 4 ms ---
Date: Tue, 17 Nov 2026 10:50:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-08e4f745-77bc-438e-9e4e-003300a80e7d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 10
X-Served-Region: us
Content-Length: 329

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_3bdbe640-35fe-4a1c-9d24-0ba39f760558/messages","correlationId":"qa-08e4f745-77bc-438e-9e4e-003300a80e7d"}
```

## 27. GET /v1/credits/balance

```text
#27 GET http://localhost:7070/v1/credits/balance
correlation: qa-a22b88b2-23ae-4909-a781-e0a89817d1d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a22b88b2-23ae-4909-a781-e0a89817d1d1
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 17 Nov 2026 10:50:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-a22b88b2-23ae-4909-a781-e0a89817d1d1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 50
RateLimit-Reset: 10
X-Served-Region: us
Content-Length: 89

{"balance":3,"currency":"credits","accountId":"acc_f7d5f72e-6b49-4418-ad05-920819126e34"}
```

## 28. DELETE /v1/accounts/me

```text
#28 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2c5f04ec-22bc-4b6f-8654-b3058fbf389f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c5f04ec-22bc-4b6f-8654-b3058fbf389f
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Tue, 17 Nov 2026 10:50:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2c5f04ec-22bc-4b6f-8654-b3058fbf389f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: in
```

## 29. POST /v1/auth/token

```text
#29 POST http://localhost:7070/v1/auth/token
correlation: qa-ebc3da05-ce77-4c98-a92d-cf3747d64453

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ebc3da05-ce77-4c98-a92d-cf3747d64453
Content-Type: application/json

--- request body ---
{"handle":"qa-7d3256613d85","password":"****"}

--- response: 401 in 3 ms ---
Date: Tue, 17 Nov 2026 10:50:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ebc3da05-ce77-4c98-a92d-cf3747d64453
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 558
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ebc3da05-ce77-4c98-a92d-cf3747d64453"}
```

## 30. DELETE /v1/accounts/me

```text
#30 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5471fef3-ade3-48d5-b9bf-930460d16131

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5471fef3-ade3-48d5-b9bf-930460d16131
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Tue, 17 Nov 2026 10:50:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5471fef3-ade3-48d5-b9bf-930460d16131
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 49
RateLimit-Reset: 9
X-Served-Region: us
```

## 31. POST /v1/auth/token

```text
#31 POST http://localhost:7070/v1/auth/token
correlation: qa-95cfecbc-b1d8-41a2-97f0-94b190523d77

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95cfecbc-b1d8-41a2-97f0-94b190523d77
Content-Type: application/json

--- request body ---
{"handle":"qa-2b8b1b2bdf55","password":"****"}

--- response: 401 in 3 ms ---
Date: Tue, 17 Nov 2026 10:50:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-95cfecbc-b1d8-41a2-97f0-94b190523d77
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 557
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-95cfecbc-b1d8-41a2-97f0-94b190523d77"}
```

## 32. DELETE /v1/accounts/me

```text
#32 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cdad099b-4b60-4ad2-8df6-f32519be1b5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cdad099b-4b60-4ad2-8df6-f32519be1b5b
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Tue, 17 Nov 2026 10:50:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cdad099b-4b60-4ad2-8df6-f32519be1b5b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 9
X-Served-Region: eu
```

## 33. POST /v1/auth/token

```text
#33 POST http://localhost:7070/v1/auth/token
correlation: qa-2fd0c5c0-ae8e-428e-aacc-34b994f01d01

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2fd0c5c0-ae8e-428e-aacc-34b994f01d01
Content-Type: application/json

--- request body ---
{"handle":"qa-8ca871d45382","password":"****"}

--- response: 401 in 3 ms ---
Date: Tue, 17 Nov 2026 10:50:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2fd0c5c0-ae8e-428e-aacc-34b994f01d01
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 556
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2fd0c5c0-ae8e-428e-aacc-34b994f01d01"}
```
