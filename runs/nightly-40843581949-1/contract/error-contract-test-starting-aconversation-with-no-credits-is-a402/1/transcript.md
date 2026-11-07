# Transcript: With no credits left, starting a conversation is a 402 and nothing is charged

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#startingAConversationWithNoCreditsIsA402` |
| Features | FEAT-LEDGER-02, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 16 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 37 | `qa-6f7a70e2-7fc1-46ea-8a8d-116e95df3fe6` |
| 2 | `POST /v1/accounts` | 201 | 29 | `qa-9cfc3d4c-7bc2-451b-a179-1f4adba50729` |
| 3 | `POST /v1/auth/token` | 200 | 49 | `qa-f1a3cbf2-5712-4f64-aeed-204e1d80e735` |
| 4 | `POST /v1/conversations` | 201 | 20 | `qa-efa3b894-9034-45cb-b1d6-941802500d2c` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 35 | `qa-f3b3a655-772d-4010-b48d-0f1fc69f20a0` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 21 | `qa-c0ef186a-19d7-4dbe-8d02-5d7a1fdc2853` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 16 | `qa-e3909a63-7dd7-4ff7-a135-35c130b23abc` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 22 | `qa-fe85290a-61ee-4e4e-854c-a86fc3386faf` |
| 9 | `GET /v1/credits/balance` | 200 | 18 | `qa-b2d35d3e-e6f2-4ff1-8b5a-281e396f3840` |
| 10 | `POST /v1/conversations` | 402 | 12 | `qa-a6f787d8-3327-4231-b2a6-4d28f8dfd9a9` |
| 11 | `GET /v1/credits/ledger` | 200 | 24 | `qa-68d5f4b8-78fe-488e-8660-bce2a14fbe04` |
| 12 | `POST /v1/auth/token` | 200 | 17 | `qa-ce1d7372-1472-4675-a409-78a2f35ff531` |
| 13 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-ca45fc76-c303-4ecb-a3f1-b0bd5cb61be7` |
| 14 | `POST /v1/auth/token` | 401 | 10 | `qa-ac72f47c-adb1-43c9-8092-61bb29c65607` |
| 15 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-062693f3-d234-47e1-8dcc-4c0a5f5c6077` |
| 16 | `POST /v1/auth/token` | 401 | 15 | `qa-bd0765a9-b868-4c69-97e6-e21da0bf976d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6f7a70e2-7fc1-46ea-8a8d-116e95df3fe6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f7a70e2-7fc1-46ea-8a8d-116e95df3fe6
Content-Type: application/json

--- request body ---
{"handle":"qa-f1131cea2aa2","displayName":"QA f1131cea2aa2","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-6f7a70e2-7fc1-46ea-8a8d-116e95df3fe6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 414
RateLimit-Reset: 7
Location: /v1/accounts/qa-f1131cea2aa2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_dd1469dd-908c-46b9-8a73-16cee9e1b146","handle":"qa-f1131cea2aa2","displayName":"QA f1131cea2aa2","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.612091917Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9cfc3d4c-7bc2-451b-a179-1f4adba50729

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9cfc3d4c-7bc2-451b-a179-1f4adba50729
Content-Type: application/json

--- request body ---
{"handle":"qa-a4bf262fd9cc","displayName":"QA a4bf262fd9cc","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-9cfc3d4c-7bc2-451b-a179-1f4adba50729
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 410
RateLimit-Reset: 7
Location: /v1/accounts/qa-a4bf262fd9cc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_68baafc3-4d75-4bd3-848e-7074eca63743","handle":"qa-a4bf262fd9cc","displayName":"QA a4bf262fd9cc","region":"eu","role":"user","createdAt":"2026-10-29T08:39:00.646493064Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f1a3cbf2-5712-4f64-aeed-204e1d80e735

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1a3cbf2-5712-4f64-aeed-204e1d80e735
Content-Type: application/json

--- request body ---
{"handle":"qa-f1131cea2aa2","password":"****"}

--- response: 200 in 49 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-f1a3cbf2-5712-4f64-aeed-204e1d80e735
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 407
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dd1469dd-908c-46b9-8a73-16cee9e1b146"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-efa3b894-9034-45cb-b1d6-941802500d2c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-efa3b894-9034-45cb-b1d6-941802500d2c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a4bf262fd9cc","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-efa3b894-9034-45cb-b1d6-941802500d2c
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
Location: /v1/conversations/cnv_5518fe03-c3c3-4c76-866c-fd3d0e3fc556
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_5518fe03-c3c3-4c76-866c-fd3d0e3fc556","subject":"Error contract","status":"open","region":"eu","participants":["qa-f1131cea2aa2","qa-a4bf262fd9cc"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:39:00.755282511Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_5518fe03-c3c3-4c76-866c-fd3d0e3fc556/messages
correlation: qa-f3b3a655-772d-4010-b48d-0f1fc69f20a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3b3a655-772d-4010-b48d-0f1fc69f20a0
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 35 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-f3b3a655-772d-4010-b48d-0f1fc69f20a0
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
Content-Length: 192

{"id":"msg_530f8292-4267-4851-8ad4-9be92c0380aa","conversationId":"cnv_5518fe03-c3c3-4c76-866c-fd3d0e3fc556","sender":"qa-f1131cea2aa2","body":"2","createdAt":"2026-10-29T08:39:00.799327097Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_5518fe03-c3c3-4c76-866c-fd3d0e3fc556/messages
correlation: qa-c0ef186a-19d7-4dbe-8d02-5d7a1fdc2853

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0ef186a-19d7-4dbe-8d02-5d7a1fdc2853
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 21 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-c0ef186a-19d7-4dbe-8d02-5d7a1fdc2853
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
Content-Length: 192

{"id":"msg_87f5b7c5-c3aa-40f1-9a94-f47e075b7348","conversationId":"cnv_5518fe03-c3c3-4c76-866c-fd3d0e3fc556","sender":"qa-f1131cea2aa2","body":"3","createdAt":"2026-10-29T08:39:00.851964286Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_5518fe03-c3c3-4c76-866c-fd3d0e3fc556/messages
correlation: qa-e3909a63-7dd7-4ff7-a135-35c130b23abc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3909a63-7dd7-4ff7-a135-35c130b23abc
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 16 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-e3909a63-7dd7-4ff7-a135-35c130b23abc
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
Content-Length: 192

{"id":"msg_3bb628af-9e82-43bb-96f5-e8a55ee79c99","conversationId":"cnv_5518fe03-c3c3-4c76-866c-fd3d0e3fc556","sender":"qa-f1131cea2aa2","body":"4","createdAt":"2026-10-29T08:39:00.889002813Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_5518fe03-c3c3-4c76-866c-fd3d0e3fc556/messages
correlation: qa-fe85290a-61ee-4e4e-854c-a86fc3386faf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe85290a-61ee-4e4e-854c-a86fc3386faf
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 22 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-fe85290a-61ee-4e4e-854c-a86fc3386faf
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
X-Served-Region: eu
Content-Length: 192

{"id":"msg_59facb46-55ab-4c39-b4b1-d8cfc2a84445","conversationId":"cnv_5518fe03-c3c3-4c76-866c-fd3d0e3fc556","sender":"qa-f1131cea2aa2","body":"5","createdAt":"2026-10-29T08:39:00.926525841Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-b2d35d3e-e6f2-4ff1-8b5a-281e396f3840

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2d35d3e-e6f2-4ff1-8b5a-281e396f3840
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-b2d35d3e-e6f2-4ff1-8b5a-281e396f3840
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
X-Served-Region: eu
Content-Length: 89

{"balance":0,"currency":"credits","accountId":"acc_dd1469dd-908c-46b9-8a73-16cee9e1b146"}
```

## 10. POST /v1/conversations

```text
#10 POST http://localhost:7070/v1/conversations
correlation: qa-a6f787d8-3327-4231-b2a6-4d28f8dfd9a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6f787d8-3327-4231-b2a6-4d28f8dfd9a9
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a4bf262fd9cc","subject":"One more","message":"Hi"}

--- response: 402 in 12 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a6f787d8-3327-4231-b2a6-4d28f8dfd9a9
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
X-Served-Region: eu
Content-Length: 270

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations","correlationId":"qa-a6f787d8-3327-4231-b2a6-4d28f8dfd9a9"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-68d5f4b8-78fe-488e-8660-bce2a14fbe04

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68d5f4b8-78fe-488e-8660-bce2a14fbe04
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-68d5f4b8-78fe-488e-8660-bce2a14fbe04
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
X-Served-Region: eu
Content-Length: 1169

{"items":[{"id":"led_df89ab60-9762-4a97-8f89-93ee28c928f9","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-29T08:39:00.612104291Z"},{"id":"led_7b97183b-537a-46a6-bde1-edae188431e5","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_5518fe03-c3c3-4c76-866c-fd3d0e3fc556","createdAt":"2026-10-29T08:39:00.755269075Z"},{"id":"led_acec52af-ae7f-40a5-b190-495eb1e5b57e","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_530f8292-4267-4851-8ad4-9be92c0380aa","createdAt":"2026-10-29T08:39:00.799311017Z"},{"id":"led_7564ab9e-a196-4205-96e9-31bbedf6e168","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_87f5b7c5-c3aa-40f1-9a94-f47e075b7348","createdAt":"2026-10-29T08:39:00.851946022Z"},{"id":"led_83ea45f3-daf1-4e67-ab7b-183d6965efbd","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_3bb628af-9e82-43bb-96f5-e8a55ee79c99","createdAt":"2026-10-29T08:39:00.888989147Z"},{"id":"led_9bc40fb8-95d5-42a7-8070-530d6cc1f061","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_59facb46-55ab-4c39-b4b1-d8cfc2a84445","createdAt":"2026-10-29T08:39:00.926503729Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-ce1d7372-1472-4675-a409-78a2f35ff531

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce1d7372-1472-4675-a409-78a2f35ff531
Content-Type: application/json

--- request body ---
{"handle":"qa-a4bf262fd9cc","password":"****"}

--- response: 200 in 17 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce1d7372-1472-4675-a409-78a2f35ff531
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 321
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_68baafc3-4d75-4bd3-848e-7074eca63743"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ca45fc76-c303-4ecb-a3f1-b0bd5cb61be7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca45fc76-c303-4ecb-a3f1-b0bd5cb61be7
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ca45fc76-c303-4ecb-a3f1-b0bd5cb61be7
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
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-ac72f47c-adb1-43c9-8092-61bb29c65607

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac72f47c-adb1-43c9-8092-61bb29c65607
Content-Type: application/json

--- request body ---
{"handle":"qa-a4bf262fd9cc","password":"****"}

--- response: 401 in 10 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ac72f47c-adb1-43c9-8092-61bb29c65607
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 318
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ac72f47c-adb1-43c9-8092-61bb29c65607"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-062693f3-d234-47e1-8dcc-4c0a5f5c6077

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-062693f3-d234-47e1-8dcc-4c0a5f5c6077
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-062693f3-d234-47e1-8dcc-4c0a5f5c6077
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
X-Served-Region: eu
```

## 16. POST /v1/auth/token

```text
#16 POST http://localhost:7070/v1/auth/token
correlation: qa-bd0765a9-b868-4c69-97e6-e21da0bf976d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd0765a9-b868-4c69-97e6-e21da0bf976d
Content-Type: application/json

--- request body ---
{"handle":"qa-f1131cea2aa2","password":"****"}

--- response: 401 in 15 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bd0765a9-b868-4c69-97e6-e21da0bf976d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 314
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bd0765a9-b868-4c69-97e6-e21da0bf976d"}
```
