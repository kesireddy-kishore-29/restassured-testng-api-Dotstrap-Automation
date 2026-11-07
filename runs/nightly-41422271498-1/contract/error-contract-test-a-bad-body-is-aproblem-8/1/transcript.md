# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[8]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 33 | `qa-c826d2cf-914a-4743-9b87-25c095d1b9cb` |
| 2 | `POST /v1/accounts` | 201 | 21 | `qa-4468790f-650d-402b-b05e-e1f936c70631` |
| 3 | `POST /v1/auth/token` | 200 | 12 | `qa-742dd2ef-d7a9-49f1-b038-1e6c2d3f1e4c` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-4722e809-7efa-4231-8b7b-330f85dcae77` |
| 5 | `PATCH /v1/accounts/me` | 422 | 21 | `qa-fed85044-49bf-4bfa-9adb-a795a9baa5a0` |
| 6 | `POST /v1/auth/token` | 200 | 28 | `qa-3a9d3d44-1d61-4b67-bc49-5719428673e2` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-f5311558-c7ef-4f9e-b387-0eb9bdda50e9` |
| 8 | `POST /v1/auth/token` | 401 | 10 | `qa-4a06c14e-3bdd-4a99-b26c-7c21e93a0b65` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-6e381892-2170-43e8-b525-3207de56643a` |
| 10 | `POST /v1/auth/token` | 401 | 7 | `qa-30002e7d-8725-49d9-ac68-4e14cc9f3b90` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c826d2cf-914a-4743-9b87-25c095d1b9cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c826d2cf-914a-4743-9b87-25c095d1b9cb
Content-Type: application/json

--- request body ---
{"handle":"qa-851afafd4bc0","displayName":"QA 851afafd4bc0","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-c826d2cf-914a-4743-9b87-25c095d1b9cb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 430
RateLimit-Reset: 8
Location: /v1/accounts/qa-851afafd4bc0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_95cdb173-98a4-48cb-aea9-b8641c574a48","handle":"qa-851afafd4bc0","displayName":"QA 851afafd4bc0","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.813630083Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4468790f-650d-402b-b05e-e1f936c70631

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4468790f-650d-402b-b05e-e1f936c70631
Content-Type: application/json

--- request body ---
{"handle":"qa-089aae46d5cd","displayName":"QA 089aae46d5cd","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-4468790f-650d-402b-b05e-e1f936c70631
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
Location: /v1/accounts/qa-089aae46d5cd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1c0ed446-a74d-45b5-a9b5-fd4a0f708d6f","handle":"qa-089aae46d5cd","displayName":"QA 089aae46d5cd","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.868575917Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-742dd2ef-d7a9-49f1-b038-1e6c2d3f1e4c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-742dd2ef-d7a9-49f1-b038-1e6c2d3f1e4c
Content-Type: application/json

--- request body ---
{"handle":"qa-851afafd4bc0","password":"****"}

--- response: 200 in 12 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-742dd2ef-d7a9-49f1-b038-1e6c2d3f1e4c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 413
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_95cdb173-98a4-48cb-aea9-b8641c574a48"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-4722e809-7efa-4231-8b7b-330f85dcae77

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4722e809-7efa-4231-8b7b-330f85dcae77
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-089aae46d5cd","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-4722e809-7efa-4231-8b7b-330f85dcae77
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
Location: /v1/conversations/cnv_a392fa47-79e7-4ba9-8957-e12ed786cad7
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a392fa47-79e7-4ba9-8957-e12ed786cad7","subject":"Error contract","status":"open","region":"eu","participants":["qa-851afafd4bc0","qa-089aae46d5cd"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:38:36.929397024Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-fed85044-49bf-4bfa-9adb-a795a9baa5a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fed85044-49bf-4bfa-9adb-a795a9baa5a0
Content-Type: application/json

--- request body ---
{"displayName":"   "}

--- response: 422 in 21 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fed85044-49bf-4bfa-9adb-a795a9baa5a0
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
Content-Length: 316

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts/me","correlationId":"qa-fed85044-49bf-4bfa-9adb-a795a9baa5a0","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3a9d3d44-1d61-4b67-bc49-5719428673e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a9d3d44-1d61-4b67-bc49-5719428673e2
Content-Type: application/json

--- request body ---
{"handle":"qa-089aae46d5cd","password":"****"}

--- response: 200 in 28 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a9d3d44-1d61-4b67-bc49-5719428673e2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 402
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1c0ed446-a74d-45b5-a9b5-fd4a0f708d6f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f5311558-c7ef-4f9e-b387-0eb9bdda50e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5311558-c7ef-4f9e-b387-0eb9bdda50e9
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f5311558-c7ef-4f9e-b387-0eb9bdda50e9
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
correlation: qa-4a06c14e-3bdd-4a99-b26c-7c21e93a0b65

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a06c14e-3bdd-4a99-b26c-7c21e93a0b65
Content-Type: application/json

--- request body ---
{"handle":"qa-089aae46d5cd","password":"****"}

--- response: 401 in 10 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4a06c14e-3bdd-4a99-b26c-7c21e93a0b65
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 392
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4a06c14e-3bdd-4a99-b26c-7c21e93a0b65"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6e381892-2170-43e8-b525-3207de56643a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e381892-2170-43e8-b525-3207de56643a
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6e381892-2170-43e8-b525-3207de56643a
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
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-30002e7d-8725-49d9-ac68-4e14cc9f3b90

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30002e7d-8725-49d9-ac68-4e14cc9f3b90
Content-Type: application/json

--- request body ---
{"handle":"qa-851afafd4bc0","password":"****"}

--- response: 401 in 7 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-30002e7d-8725-49d9-ac68-4e14cc9f3b90
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-30002e7d-8725-49d9-ac68-4e14cc9f3b90"}
```
