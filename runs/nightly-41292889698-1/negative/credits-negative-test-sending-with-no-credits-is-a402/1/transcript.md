# Transcript: With no credits left, a message is a 402 and nothing is charged

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.CreditsNegativeTest#sendingWithNoCreditsIsA402` |
| Features | FEAT-LEDGER-02, FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 16 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 14 | `qa-8db6bb2d-f010-4389-ab3f-e7f6b8b49e3d` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-0ff85c8f-20cb-4862-8a11-87a957cb689c` |
| 3 | `POST /v1/auth/token` | 200 | 8 | `qa-b485ac81-93d6-4cec-a1dd-fb3c027cd00c` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-b14cb1f9-8e07-4e30-a1c3-70eb4d1d2ee5` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 16 | `qa-09e6144a-8ba0-4eb6-8ddb-80d1f3f23a88` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 31 | `qa-c1387d5e-ea73-4c92-9a3c-9b8cd67144f9` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 20 | `qa-205887f5-1cb2-4b20-8ebb-c8282fdc308f` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 16 | `qa-2dc0d67b-cafb-4eec-aa84-24f60e7d96ea` |
| 9 | `GET /v1/credits/balance` | 200 | 5 | `qa-08b1c0d9-72bb-4bb5-961b-55df5b17e419` |
| 10 | `POST /v1/conversations/{id}/messages` | 402 | 6 | `qa-6dda8105-9b28-44b8-b03d-a248332f0d8a` |
| 11 | `GET /v1/credits/ledger` | 200 | 13 | `qa-f69e96f0-b09c-4f29-a2d8-2955ecd7fbf3` |
| 12 | `POST /v1/auth/token` | 200 | 10 | `qa-3f6f7fc6-1811-462f-a7c5-a34c695de9b4` |
| 13 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-e7fc859a-265b-451d-8e2d-b36ca180c8c7` |
| 14 | `POST /v1/auth/token` | 401 | 3 | `qa-c7802c81-0dbf-4506-834c-974d169745de` |
| 15 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-8e445c7d-6924-48c9-89c6-60bb0dd8503f` |
| 16 | `POST /v1/auth/token` | 401 | 6 | `qa-fe408a42-2eb0-4e70-9bcd-373537928099` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8db6bb2d-f010-4389-ab3f-e7f6b8b49e3d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8db6bb2d-f010-4389-ab3f-e7f6b8b49e3d
Content-Type: application/json

--- request body ---
{"handle":"qa-c8654dc9b244","displayName":"QA c8654dc9b244","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-8db6bb2d-f010-4389-ab3f-e7f6b8b49e3d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 9
Location: /v1/accounts/qa-c8654dc9b244
X-Served-Region: eu
Content-Length: 181

{"id":"acc_169cf91e-2ab4-4e92-980c-454115d65e17","handle":"qa-c8654dc9b244","displayName":"QA c8654dc9b244","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.590268440Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0ff85c8f-20cb-4862-8a11-87a957cb689c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ff85c8f-20cb-4862-8a11-87a957cb689c
Content-Type: application/json

--- request body ---
{"handle":"qa-9ab9092a6330","displayName":"QA 9ab9092a6330","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ff85c8f-20cb-4862-8a11-87a957cb689c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 9
Location: /v1/accounts/qa-9ab9092a6330
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7791e797-a1ec-4067-8503-017e0a29e000","handle":"qa-9ab9092a6330","displayName":"QA 9ab9092a6330","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.624627034Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b485ac81-93d6-4cec-a1dd-fb3c027cd00c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b485ac81-93d6-4cec-a1dd-fb3c027cd00c
Content-Type: application/json

--- request body ---
{"handle":"qa-c8654dc9b244","password":"****"}

--- response: 200 in 8 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-b485ac81-93d6-4cec-a1dd-fb3c027cd00c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_169cf91e-2ab4-4e92-980c-454115d65e17"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b14cb1f9-8e07-4e30-a1c3-70eb4d1d2ee5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b14cb1f9-8e07-4e30-a1c3-70eb4d1d2ee5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9ab9092a6330","subject":"Many messages","message":"1"}

--- response: 201 in 15 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-b14cb1f9-8e07-4e30-a1c3-70eb4d1d2ee5
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
Location: /v1/conversations/cnv_f41c3709-6794-4130-b0e3-a7b69060ae4f
X-Data-Region: eu
Content-Length: 236

{"id":"cnv_f41c3709-6794-4130-b0e3-a7b69060ae4f","subject":"Many messages","status":"open","region":"eu","participants":["qa-c8654dc9b244","qa-9ab9092a6330"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:22.665863920Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_f41c3709-6794-4130-b0e3-a7b69060ae4f/messages
correlation: qa-09e6144a-8ba0-4eb6-8ddb-80d1f3f23a88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09e6144a-8ba0-4eb6-8ddb-80d1f3f23a88
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 16 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-09e6144a-8ba0-4eb6-8ddb-80d1f3f23a88
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

{"id":"msg_2a6d1f6f-1587-4bd5-8836-54d15b609374","conversationId":"cnv_f41c3709-6794-4130-b0e3-a7b69060ae4f","sender":"qa-c8654dc9b244","body":"2","createdAt":"2026-11-01T09:23:22.698877293Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_f41c3709-6794-4130-b0e3-a7b69060ae4f/messages
correlation: qa-c1387d5e-ea73-4c92-9a3c-9b8cd67144f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1387d5e-ea73-4c92-9a3c-9b8cd67144f9
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 31 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-c1387d5e-ea73-4c92-9a3c-9b8cd67144f9
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

{"id":"msg_3b09461a-2016-4dec-a1ca-41fc4b34eedc","conversationId":"cnv_f41c3709-6794-4130-b0e3-a7b69060ae4f","sender":"qa-c8654dc9b244","body":"3","createdAt":"2026-11-01T09:23:22.752987683Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_f41c3709-6794-4130-b0e3-a7b69060ae4f/messages
correlation: qa-205887f5-1cb2-4b20-8ebb-c8282fdc308f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-205887f5-1cb2-4b20-8ebb-c8282fdc308f
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 20 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-205887f5-1cb2-4b20-8ebb-c8282fdc308f
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

{"id":"msg_8ce8a30b-61da-4da8-97a0-20b7c28db735","conversationId":"cnv_f41c3709-6794-4130-b0e3-a7b69060ae4f","sender":"qa-c8654dc9b244","body":"4","createdAt":"2026-11-01T09:23:22.808447855Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_f41c3709-6794-4130-b0e3-a7b69060ae4f/messages
correlation: qa-2dc0d67b-cafb-4eec-aa84-24f60e7d96ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2dc0d67b-cafb-4eec-aa84-24f60e7d96ea
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 16 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-2dc0d67b-cafb-4eec-aa84-24f60e7d96ea
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

{"id":"msg_1e038e9b-f983-4ebf-bada-6cf3373a76e8","conversationId":"cnv_f41c3709-6794-4130-b0e3-a7b69060ae4f","sender":"qa-c8654dc9b244","body":"5","createdAt":"2026-11-01T09:23:22.839668157Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-08b1c0d9-72bb-4bb5-961b-55df5b17e419

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08b1c0d9-72bb-4bb5-961b-55df5b17e419
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-08b1c0d9-72bb-4bb5-961b-55df5b17e419
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

{"balance":0,"currency":"credits","accountId":"acc_169cf91e-2ab4-4e92-980c-454115d65e17"}
```

## 10. POST /v1/conversations/{id}/messages

```text
#10 POST http://localhost:7070/v1/conversations/cnv_f41c3709-6794-4130-b0e3-a7b69060ae4f/messages
correlation: qa-6dda8105-9b28-44b8-b03d-a248332f0d8a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6dda8105-9b28-44b8-b03d-a248332f0d8a
Content-Type: application/json

--- request body ---
{"body":"6"}

--- response: 402 in 6 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6dda8105-9b28-44b8-b03d-a248332f0d8a
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
Content-Length: 320

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations/cnv_f41c3709-6794-4130-b0e3-a7b69060ae4f/messages","correlationId":"qa-6dda8105-9b28-44b8-b03d-a248332f0d8a"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-f69e96f0-b09c-4f29-a2d8-2955ecd7fbf3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f69e96f0-b09c-4f29-a2d8-2955ecd7fbf3
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-f69e96f0-b09c-4f29-a2d8-2955ecd7fbf3
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

{"items":[{"id":"led_344e65b7-71ea-4b30-81f6-75115a8632a1","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-01T09:23:22.590280002Z"},{"id":"led_d4f57c8f-3d37-4b99-b0e4-15fe44b6a1b0","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_f41c3709-6794-4130-b0e3-a7b69060ae4f","createdAt":"2026-11-01T09:23:22.665839384Z"},{"id":"led_afab37b7-641f-4be2-aaf3-c8eade147e4b","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_2a6d1f6f-1587-4bd5-8836-54d15b609374","createdAt":"2026-11-01T09:23:22.698839389Z"},{"id":"led_6ea204b9-3dd4-4f43-9523-0403ea3dc991","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_3b09461a-2016-4dec-a1ca-41fc4b34eedc","createdAt":"2026-11-01T09:23:22.752976453Z"},{"id":"led_36ce039b-df07-4b9b-8cdc-7c61df1896f5","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_8ce8a30b-61da-4da8-97a0-20b7c28db735","createdAt":"2026-11-01T09:23:22.808424280Z"},{"id":"led_11d9c01b-d91d-4a1e-bfff-421d46e49052","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_1e038e9b-f983-4ebf-bada-6cf3373a76e8","createdAt":"2026-11-01T09:23:22.839641977Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-3f6f7fc6-1811-462f-a7c5-a34c695de9b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f6f7fc6-1811-462f-a7c5-a34c695de9b4
Content-Type: application/json

--- request body ---
{"handle":"qa-9ab9092a6330","password":"****"}

--- response: 200 in 10 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-3f6f7fc6-1811-462f-a7c5-a34c695de9b4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7791e797-a1ec-4067-8503-017e0a29e000"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e7fc859a-265b-451d-8e2d-b36ca180c8c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7fc859a-265b-451d-8e2d-b36ca180c8c7
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e7fc859a-265b-451d-8e2d-b36ca180c8c7
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
correlation: qa-c7802c81-0dbf-4506-834c-974d169745de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7802c81-0dbf-4506-834c-974d169745de
Content-Type: application/json

--- request body ---
{"handle":"qa-9ab9092a6330","password":"****"}

--- response: 401 in 3 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c7802c81-0dbf-4506-834c-974d169745de
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c7802c81-0dbf-4506-834c-974d169745de"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8e445c7d-6924-48c9-89c6-60bb0dd8503f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e445c7d-6924-48c9-89c6-60bb0dd8503f
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8e445c7d-6924-48c9-89c6-60bb0dd8503f
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
correlation: qa-fe408a42-2eb0-4e70-9bcd-373537928099

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe408a42-2eb0-4e70-9bcd-373537928099
Content-Type: application/json

--- request body ---
{"handle":"qa-c8654dc9b244","password":"****"}

--- response: 401 in 6 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fe408a42-2eb0-4e70-9bcd-373537928099
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fe408a42-2eb0-4e70-9bcd-373537928099"}
```
