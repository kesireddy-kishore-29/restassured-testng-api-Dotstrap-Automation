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
| 1 | `POST /v1/accounts` | 201 | 57 | `qa-8dfab1ac-dcdd-4cde-977f-8f393d325caa` |
| 2 | `POST /v1/accounts` | 201 | 24 | `qa-3a60d1e7-7ac0-418f-a7f2-f3e2c1477343` |
| 3 | `POST /v1/auth/token` | 200 | 50 | `qa-57248e7d-2c47-4162-85ba-c4985f052fea` |
| 4 | `POST /v1/conversations` | 201 | 20 | `qa-533733b7-8f0e-4d91-88ae-f74ed1fbb139` |
| 5 | `GET /v1/conversations/{id}` | 503 | 28 | `qa-27a7ef00-542c-4cbb-8fc1-c5482e890317` |
| 6 | `POST /v1/auth/token` | 200 | 26 | `qa-420322a2-6e7e-492a-8849-e55395f12473` |
| 7 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-54a00add-cc84-4b41-ad22-b4afe62caa2f` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-f2d687bc-a319-4daa-901d-26494bf6db01` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-d0528187-bb07-45c9-8720-32308e8480d2` |
| 10 | `POST /v1/auth/token` | 401 | 17 | `qa-d03fb38f-1d20-45ed-9488-b3f1e2ef9d5a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8dfab1ac-dcdd-4cde-977f-8f393d325caa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8dfab1ac-dcdd-4cde-977f-8f393d325caa
Content-Type: application/json

--- request body ---
{"handle":"qa-fde71fe1edec","displayName":"QA fde71fe1edec","password":"****","region":"eu"}

--- response: 201 in 57 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-8dfab1ac-dcdd-4cde-977f-8f393d325caa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 416
RateLimit-Reset: 7
Location: /v1/accounts/qa-fde71fe1edec
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4dc04d2a-5b06-40e7-b9de-a1a4c5e328b9","handle":"qa-fde71fe1edec","displayName":"QA fde71fe1edec","region":"eu","role":"user","createdAt":"2026-11-11T09:34:38.236285410Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3a60d1e7-7ac0-418f-a7f2-f3e2c1477343

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a60d1e7-7ac0-418f-a7f2-f3e2c1477343
Content-Type: application/json

--- request body ---
{"handle":"qa-610e069e2a68","displayName":"QA 610e069e2a68","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a60d1e7-7ac0-418f-a7f2-f3e2c1477343
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 404
RateLimit-Reset: 7
Location: /v1/accounts/qa-610e069e2a68
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3970285c-c817-46db-aba6-a139d55428e4","handle":"qa-610e069e2a68","displayName":"QA 610e069e2a68","region":"eu","role":"user","createdAt":"2026-11-11T09:34:38.302161923Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-57248e7d-2c47-4162-85ba-c4985f052fea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57248e7d-2c47-4162-85ba-c4985f052fea
Content-Type: application/json

--- request body ---
{"handle":"qa-fde71fe1edec","password":"****"}

--- response: 200 in 50 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-57248e7d-2c47-4162-85ba-c4985f052fea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 398
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4dc04d2a-5b06-40e7-b9de-a1a4c5e328b9"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-533733b7-8f0e-4d91-88ae-f74ed1fbb139

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-533733b7-8f0e-4d91-88ae-f74ed1fbb139
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-610e069e2a68","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-533733b7-8f0e-4d91-88ae-f74ed1fbb139
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
Location: /v1/conversations/cnv_31088828-58f5-43a3-a9ed-eeff0578d7d5
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_31088828-58f5-43a3-a9ed-eeff0578d7d5","subject":"Error contract","status":"open","region":"eu","participants":["qa-fde71fe1edec","qa-610e069e2a68"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:38.393997988Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_31088828-58f5-43a3-a9ed-eeff0578d7d5
correlation: qa-27a7ef00-542c-4cbb-8fc1-c5482e890317

--- request headers ---
Accept: application/json
X-Fault-Key: 070618fe-6f9e-4d22-8050-ab04534ba53a
X-Fault: unavailable-once
X-Correlation-Id: qa-27a7ef00-542c-4cbb-8fc1-c5482e890317
Content-Type: application/json

--- response: 503 in 28 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-27a7ef00-542c-4cbb-8fc1-c5482e890317
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 302

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_31088828-58f5-43a3-a9ed-eeff0578d7d5","correlationId":"qa-27a7ef00-542c-4cbb-8fc1-c5482e890317"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-420322a2-6e7e-492a-8849-e55395f12473

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-420322a2-6e7e-492a-8849-e55395f12473
Content-Type: application/json

--- request body ---
{"handle":"qa-610e069e2a68","password":"****"}

--- response: 200 in 26 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-420322a2-6e7e-492a-8849-e55395f12473
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 383
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3970285c-c817-46db-aba6-a139d55428e4"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-54a00add-cc84-4b41-ad22-b4afe62caa2f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54a00add-cc84-4b41-ad22-b4afe62caa2f
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-54a00add-cc84-4b41-ad22-b4afe62caa2f
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
correlation: qa-f2d687bc-a319-4daa-901d-26494bf6db01

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2d687bc-a319-4daa-901d-26494bf6db01
Content-Type: application/json

--- request body ---
{"handle":"qa-610e069e2a68","password":"****"}

--- response: 401 in 14 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f2d687bc-a319-4daa-901d-26494bf6db01
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 376
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f2d687bc-a319-4daa-901d-26494bf6db01"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d0528187-bb07-45c9-8720-32308e8480d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0528187-bb07-45c9-8720-32308e8480d2
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d0528187-bb07-45c9-8720-32308e8480d2
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
correlation: qa-d03fb38f-1d20-45ed-9488-b3f1e2ef9d5a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d03fb38f-1d20-45ed-9488-b3f1e2ef9d5a
Content-Type: application/json

--- request body ---
{"handle":"qa-fde71fe1edec","password":"****"}

--- response: 401 in 17 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d03fb38f-1d20-45ed-9488-b3f1e2ef9d5a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 366
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d03fb38f-1d20-45ed-9488-b3f1e2ef9d5a"}
```
