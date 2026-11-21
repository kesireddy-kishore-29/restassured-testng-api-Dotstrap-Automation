# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[8]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-17b4db42-6a46-4837-a2d2-366e0199bbc2` |
| 2 | `POST /v1/accounts` | 201 | 29 | `qa-3c26562e-6230-47e5-a593-5533e1a1aa78` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-bd63c134-f57f-4940-ba68-997fba9e838c` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-5184baee-12dc-4ebf-8a9b-9b8e60c485d1` |
| 5 | `GET /v1/conversations/{id}` | 503 | 11 | `qa-1d0ecd31-697f-4c1c-a55a-c01baa424601` |
| 6 | `POST /v1/auth/token` | 200 | 29 | `qa-e549dbbf-5434-44a8-bfe8-879fabf0d74c` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-1789ab66-a260-4f08-86fd-8550d859a74c` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-b2611cb7-0a4b-4f4c-98db-142fbf82c071` |
| 9 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-01ab18de-06aa-4204-b819-4d25bdf132ec` |
| 10 | `POST /v1/auth/token` | 401 | 20 | `qa-1320c00b-16a4-422d-8d89-0e638789322b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-17b4db42-6a46-4837-a2d2-366e0199bbc2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17b4db42-6a46-4837-a2d2-366e0199bbc2
Content-Type: application/json

--- request body ---
{"handle":"qa-da9f80e5bf1c","displayName":"QA da9f80e5bf1c","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-17b4db42-6a46-4837-a2d2-366e0199bbc2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 421
RateLimit-Reset: 8
Location: /v1/accounts/qa-da9f80e5bf1c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e9404bd6-0648-4719-ac6a-fe385ae53cc3","handle":"qa-da9f80e5bf1c","displayName":"QA da9f80e5bf1c","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.608809785Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3c26562e-6230-47e5-a593-5533e1a1aa78

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c26562e-6230-47e5-a593-5533e1a1aa78
Content-Type: application/json

--- request body ---
{"handle":"qa-e8f49b07615f","displayName":"QA e8f49b07615f","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-3c26562e-6230-47e5-a593-5533e1a1aa78
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 414
RateLimit-Reset: 8
Location: /v1/accounts/qa-e8f49b07615f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f53efa61-5a42-447a-912c-bbda31fae473","handle":"qa-e8f49b07615f","displayName":"QA e8f49b07615f","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.649928723Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-bd63c134-f57f-4940-ba68-997fba9e838c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd63c134-f57f-4940-ba68-997fba9e838c
Content-Type: application/json

--- request body ---
{"handle":"qa-da9f80e5bf1c","password":"****"}

--- response: 200 in 21 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd63c134-f57f-4940-ba68-997fba9e838c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 409
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e9404bd6-0648-4719-ac6a-fe385ae53cc3"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-5184baee-12dc-4ebf-8a9b-9b8e60c485d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5184baee-12dc-4ebf-8a9b-9b8e60c485d1
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e8f49b07615f","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-5184baee-12dc-4ebf-8a9b-9b8e60c485d1
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
Location: /v1/conversations/cnv_7b3d9f60-eecc-408e-8a7e-5cb95aee463c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_7b3d9f60-eecc-408e-8a7e-5cb95aee463c","subject":"Error contract","status":"open","region":"eu","participants":["qa-da9f80e5bf1c","qa-e8f49b07615f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:53.698738168Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_7b3d9f60-eecc-408e-8a7e-5cb95aee463c
correlation: qa-1d0ecd31-697f-4c1c-a55a-c01baa424601

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: cfb5cc47-dc73-495d-80bb-7c20d96def57
X-Correlation-Id: qa-1d0ecd31-697f-4c1c-a55a-c01baa424601
Content-Type: application/json

--- response: 503 in 11 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1d0ecd31-697f-4c1c-a55a-c01baa424601
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 302

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_7b3d9f60-eecc-408e-8a7e-5cb95aee463c","correlationId":"qa-1d0ecd31-697f-4c1c-a55a-c01baa424601"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e549dbbf-5434-44a8-bfe8-879fabf0d74c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e549dbbf-5434-44a8-bfe8-879fabf0d74c
Content-Type: application/json

--- request body ---
{"handle":"qa-e8f49b07615f","password":"****"}

--- response: 200 in 29 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-e549dbbf-5434-44a8-bfe8-879fabf0d74c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 385
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f53efa61-5a42-447a-912c-bbda31fae473"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1789ab66-a260-4f08-86fd-8550d859a74c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1789ab66-a260-4f08-86fd-8550d859a74c
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1789ab66-a260-4f08-86fd-8550d859a74c
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

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-b2611cb7-0a4b-4f4c-98db-142fbf82c071

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2611cb7-0a4b-4f4c-98db-142fbf82c071
Content-Type: application/json

--- request body ---
{"handle":"qa-e8f49b07615f","password":"****"}

--- response: 401 in 19 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b2611cb7-0a4b-4f4c-98db-142fbf82c071
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 379
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b2611cb7-0a4b-4f4c-98db-142fbf82c071"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-01ab18de-06aa-4204-b819-4d25bdf132ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01ab18de-06aa-4204-b819-4d25bdf132ec
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-01ab18de-06aa-4204-b819-4d25bdf132ec
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
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-1320c00b-16a4-422d-8d89-0e638789322b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1320c00b-16a4-422d-8d89-0e638789322b
Content-Type: application/json

--- request body ---
{"handle":"qa-da9f80e5bf1c","password":"****"}

--- response: 401 in 20 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1320c00b-16a4-422d-8d89-0e638789322b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 372
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1320c00b-16a4-422d-8d89-0e638789322b"}
```
