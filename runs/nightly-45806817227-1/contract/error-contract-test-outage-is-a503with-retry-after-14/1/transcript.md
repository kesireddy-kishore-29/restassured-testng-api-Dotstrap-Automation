# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/credits/ledger]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[14]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 40 | `qa-408e3492-17d3-4c25-8345-6fe52432b8b4` |
| 2 | `POST /v1/accounts` | 201 | 29 | `qa-a05fa396-beb5-4eaf-8b88-4994686d270e` |
| 3 | `POST /v1/auth/token` | 200 | 27 | `qa-cc67c4cb-3485-43b9-b3cd-59a0b538a767` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-0d8f1365-a617-4452-bafa-e6f1a57fd4d7` |
| 5 | `GET /v1/credits/ledger` | 503 | 22 | `qa-221d9812-8f27-44e3-a697-d834d2faa294` |
| 6 | `POST /v1/auth/token` | 200 | 29 | `qa-f2150f8e-1b9e-45a8-9276-0358f37bd6c1` |
| 7 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-bfec6f1e-432b-43b8-a486-532168e9dcd1` |
| 8 | `POST /v1/auth/token` | 401 | 17 | `qa-143b9a40-5e20-4255-923b-ecb4ed3bd684` |
| 9 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-4186b82d-199f-4f31-b559-9774f53a9092` |
| 10 | `POST /v1/auth/token` | 401 | 33 | `qa-af909591-09dc-4ce1-a68d-2c564835b2ed` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-408e3492-17d3-4c25-8345-6fe52432b8b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-408e3492-17d3-4c25-8345-6fe52432b8b4
Content-Type: application/json

--- request body ---
{"handle":"qa-ca775c61d4be","displayName":"QA ca775c61d4be","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-408e3492-17d3-4c25-8345-6fe52432b8b4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 357
RateLimit-Reset: 6
Location: /v1/accounts/qa-ca775c61d4be
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d1624cc9-ab69-47f0-b210-0e086b2b9704","handle":"qa-ca775c61d4be","displayName":"QA ca775c61d4be","region":"eu","role":"user","createdAt":"2026-11-26T11:02:46.429048195Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a05fa396-beb5-4eaf-8b88-4994686d270e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a05fa396-beb5-4eaf-8b88-4994686d270e
Content-Type: application/json

--- request body ---
{"handle":"qa-e9d56bc1344e","displayName":"QA e9d56bc1344e","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-a05fa396-beb5-4eaf-8b88-4994686d270e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 352
RateLimit-Reset: 6
Location: /v1/accounts/qa-e9d56bc1344e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f153f9b8-fe36-49d3-875a-2c0409f9f765","handle":"qa-e9d56bc1344e","displayName":"QA e9d56bc1344e","region":"eu","role":"user","createdAt":"2026-11-26T11:02:46.472971153Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-cc67c4cb-3485-43b9-b3cd-59a0b538a767

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc67c4cb-3485-43b9-b3cd-59a0b538a767
Content-Type: application/json

--- request body ---
{"handle":"qa-ca775c61d4be","password":"****"}

--- response: 200 in 27 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-cc67c4cb-3485-43b9-b3cd-59a0b538a767
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 344
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d1624cc9-ab69-47f0-b210-0e086b2b9704"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-0d8f1365-a617-4452-bafa-e6f1a57fd4d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d8f1365-a617-4452-bafa-e6f1a57fd4d7
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e9d56bc1344e","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d8f1365-a617-4452-bafa-e6f1a57fd4d7
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
Location: /v1/conversations/cnv_30dfd4c2-854f-44f2-b0ed-871f3e8c39d3
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_30dfd4c2-854f-44f2-b0ed-871f3e8c39d3","subject":"Error contract","status":"open","region":"eu","participants":["qa-ca775c61d4be","qa-e9d56bc1344e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:46.546420779Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-221d9812-8f27-44e3-a697-d834d2faa294

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 8376cbea-80bd-43d1-bc8a-7752cb3ac77e
X-Correlation-Id: qa-221d9812-8f27-44e3-a697-d834d2faa294
Content-Type: application/json

--- response: 503 in 22 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-221d9812-8f27-44e3-a697-d834d2faa294
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 262

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/ledger","correlationId":"qa-221d9812-8f27-44e3-a697-d834d2faa294"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f2150f8e-1b9e-45a8-9276-0358f37bd6c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2150f8e-1b9e-45a8-9276-0358f37bd6c1
Content-Type: application/json

--- request body ---
{"handle":"qa-e9d56bc1344e","password":"****"}

--- response: 200 in 29 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-f2150f8e-1b9e-45a8-9276-0358f37bd6c1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 333
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f153f9b8-fe36-49d3-875a-2c0409f9f765"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bfec6f1e-432b-43b8-a486-532168e9dcd1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bfec6f1e-432b-43b8-a486-532168e9dcd1
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bfec6f1e-432b-43b8-a486-532168e9dcd1
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
correlation: qa-143b9a40-5e20-4255-923b-ecb4ed3bd684

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-143b9a40-5e20-4255-923b-ecb4ed3bd684
Content-Type: application/json

--- request body ---
{"handle":"qa-e9d56bc1344e","password":"****"}

--- response: 401 in 17 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-143b9a40-5e20-4255-923b-ecb4ed3bd684
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 325
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-143b9a40-5e20-4255-923b-ecb4ed3bd684"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4186b82d-199f-4f31-b559-9774f53a9092

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4186b82d-199f-4f31-b559-9774f53a9092
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4186b82d-199f-4f31-b559-9774f53a9092
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
correlation: qa-af909591-09dc-4ce1-a68d-2c564835b2ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af909591-09dc-4ce1-a68d-2c564835b2ed
Content-Type: application/json

--- request body ---
{"handle":"qa-ca775c61d4be","password":"****"}

--- response: 401 in 33 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-af909591-09dc-4ce1-a68d-2c564835b2ed
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-af909591-09dc-4ce1-a68d-2c564835b2ed"}
```
