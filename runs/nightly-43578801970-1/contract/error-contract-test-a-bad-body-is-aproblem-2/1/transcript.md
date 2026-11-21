# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[2]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 33 | `qa-daafd360-9bc1-454e-a36f-77058a9ac64f` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-f398d829-d4f7-4b47-8864-e1cac5c4aec0` |
| 3 | `POST /v1/auth/token` | 200 | 30 | `qa-95ebc6e8-1bab-448e-ad01-05e996dfa80e` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-d615d15c-8654-4814-8f8a-d864c604fbfc` |
| 5 | `POST /v1/auth/token` | 422 | 35 | `qa-72e18663-449f-45df-9f85-2d9ebd1ed837` |
| 6 | `POST /v1/auth/token` | 200 | 57 | `qa-efafb5fb-65ec-43f1-8a46-d4e3322ffcc8` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-dc050ea8-25bf-4b1c-8d29-feb5a8c3ec40` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-5a192434-4ba3-4158-b01c-19cb92733e32` |
| 9 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-d853b145-9761-42bf-ad11-7970d2c4337f` |
| 10 | `POST /v1/auth/token` | 401 | 24 | `qa-acfc01f9-2a11-4986-bed0-8376ee572b1e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-daafd360-9bc1-454e-a36f-77058a9ac64f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-daafd360-9bc1-454e-a36f-77058a9ac64f
Content-Type: application/json

--- request body ---
{"handle":"qa-53c24f74f9fe","displayName":"QA 53c24f74f9fe","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Sat, 14 Nov 2026 09:05:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-daafd360-9bc1-454e-a36f-77058a9ac64f
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
Location: /v1/accounts/qa-53c24f74f9fe
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e7cfb8be-44f5-47e6-8811-f332e7688e64","handle":"qa-53c24f74f9fe","displayName":"QA 53c24f74f9fe","region":"eu","role":"user","createdAt":"2026-11-14T09:05:09.990036973Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f398d829-d4f7-4b47-8864-e1cac5c4aec0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f398d829-d4f7-4b47-8864-e1cac5c4aec0
Content-Type: application/json

--- request body ---
{"handle":"qa-3003d1ddcecf","displayName":"QA 3003d1ddcecf","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-f398d829-d4f7-4b47-8864-e1cac5c4aec0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 10
Location: /v1/accounts/qa-3003d1ddcecf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_54bc9fbd-c2a9-4caf-8f2f-69d45abe2c97","handle":"qa-3003d1ddcecf","displayName":"QA 3003d1ddcecf","region":"eu","role":"user","createdAt":"2026-11-14T09:05:10.024464560Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-95ebc6e8-1bab-448e-ad01-05e996dfa80e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95ebc6e8-1bab-448e-ad01-05e996dfa80e
Content-Type: application/json

--- request body ---
{"handle":"qa-53c24f74f9fe","password":"****"}

--- response: 200 in 30 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-95ebc6e8-1bab-448e-ad01-05e996dfa80e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 562
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e7cfb8be-44f5-47e6-8811-f332e7688e64"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d615d15c-8654-4814-8f8a-d864c604fbfc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d615d15c-8654-4814-8f8a-d864c604fbfc
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3003d1ddcecf","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-d615d15c-8654-4814-8f8a-d864c604fbfc
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
Location: /v1/conversations/cnv_46640bcc-c30a-47d7-be89-30698094a204
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_46640bcc-c30a-47d7-be89-30698094a204","subject":"Error contract","status":"open","region":"eu","participants":["qa-53c24f74f9fe","qa-3003d1ddcecf"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:10.091462605Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-72e18663-449f-45df-9f85-2d9ebd1ed837

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72e18663-449f-45df-9f85-2d9ebd1ed837
Content-Type: application/json

--- request body ---
{"handle":"qa-53c24f74f9fe","password":"****","ttlSeconds":0}

--- response: 422 in 35 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-72e18663-449f-45df-9f85-2d9ebd1ed837
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 550
RateLimit-Reset: 9
Content-Length: 294

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/auth/token","correlationId":"qa-72e18663-449f-45df-9f85-2d9ebd1ed837","errors":[{"field":"ttlSeconds","message":"1-3600"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-efafb5fb-65ec-43f1-8a46-d4e3322ffcc8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-efafb5fb-65ec-43f1-8a46-d4e3322ffcc8
Content-Type: application/json

--- request body ---
{"handle":"qa-3003d1ddcecf","password":"****"}

--- response: 200 in 57 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-efafb5fb-65ec-43f1-8a46-d4e3322ffcc8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 508
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_54bc9fbd-c2a9-4caf-8f2f-69d45abe2c97"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dc050ea8-25bf-4b1c-8d29-feb5a8c3ec40

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc050ea8-25bf-4b1c-8d29-feb5a8c3ec40
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dc050ea8-25bf-4b1c-8d29-feb5a8c3ec40
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
correlation: qa-5a192434-4ba3-4158-b01c-19cb92733e32

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a192434-4ba3-4158-b01c-19cb92733e32
Content-Type: application/json

--- request body ---
{"handle":"qa-3003d1ddcecf","password":"****"}

--- response: 401 in 16 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5a192434-4ba3-4158-b01c-19cb92733e32
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 493
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5a192434-4ba3-4158-b01c-19cb92733e32"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d853b145-9761-42bf-ad11-7970d2c4337f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d853b145-9761-42bf-ad11-7970d2c4337f
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d853b145-9761-42bf-ad11-7970d2c4337f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-acfc01f9-2a11-4986-bed0-8376ee572b1e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-acfc01f9-2a11-4986-bed0-8376ee572b1e
Content-Type: application/json

--- request body ---
{"handle":"qa-53c24f74f9fe","password":"****"}

--- response: 401 in 24 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-acfc01f9-2a11-4986-bed0-8376ee572b1e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 479
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-acfc01f9-2a11-4986-bed0-8376ee572b1e"}
```
