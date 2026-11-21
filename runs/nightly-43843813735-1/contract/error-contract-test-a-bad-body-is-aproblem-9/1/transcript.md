# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[9]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-7759700c-5e54-422a-ae5c-261465f2c13f` |
| 2 | `POST /v1/accounts` | 201 | 35 | `qa-3623380d-67e6-42b1-a8c1-a2c0273e643b` |
| 3 | `POST /v1/auth/token` | 200 | 30 | `qa-86710cef-25b2-445a-9d05-4ba73834babf` |
| 4 | `POST /v1/conversations` | 201 | 7 | `qa-fd13c753-7440-444b-9c40-d2f375e1bea6` |
| 5 | `POST /v1/conversations` | 400 | 14 | `qa-ccc546c0-50f1-4034-a9f5-cb8116b57bb8` |
| 6 | `POST /v1/auth/token` | 200 | 26 | `qa-964bb66b-a942-4ea1-9bb7-ff4565cd4dc3` |
| 7 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-70887466-c7d1-4c79-9f28-598abdd3a369` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-68189309-1945-4a2c-8e99-e5072b3c2918` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-98eb939a-6b70-42e3-b818-029362880538` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-1adb4af5-6a58-4ddc-87da-eb48189056fe` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7759700c-5e54-422a-ae5c-261465f2c13f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7759700c-5e54-422a-ae5c-261465f2c13f
Content-Type: application/json

--- request body ---
{"handle":"qa-d477ea1afb1a","displayName":"QA d477ea1afb1a","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-7759700c-5e54-422a-ae5c-261465f2c13f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 412
RateLimit-Reset: 8
Location: /v1/accounts/qa-d477ea1afb1a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72c5449e-d392-43b5-881d-411ac60e2d2f","handle":"qa-d477ea1afb1a","displayName":"QA d477ea1afb1a","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.667885376Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3623380d-67e6-42b1-a8c1-a2c0273e643b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3623380d-67e6-42b1-a8c1-a2c0273e643b
Content-Type: application/json

--- request body ---
{"handle":"qa-8affde404d5d","displayName":"QA 8affde404d5d","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-3623380d-67e6-42b1-a8c1-a2c0273e643b
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
Location: /v1/accounts/qa-8affde404d5d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_afd0404d-7735-4e1a-aa7a-019840a04e86","handle":"qa-8affde404d5d","displayName":"QA 8affde404d5d","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.721749832Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-86710cef-25b2-445a-9d05-4ba73834babf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86710cef-25b2-445a-9d05-4ba73834babf
Content-Type: application/json

--- request body ---
{"handle":"qa-d477ea1afb1a","password":"****"}

--- response: 200 in 30 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-86710cef-25b2-445a-9d05-4ba73834babf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 393
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_72c5449e-d392-43b5-881d-411ac60e2d2f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-fd13c753-7440-444b-9c40-d2f375e1bea6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd13c753-7440-444b-9c40-d2f375e1bea6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8affde404d5d","subject":"Error contract","message":"Hi"}

--- response: 201 in 7 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd13c753-7440-444b-9c40-d2f375e1bea6
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
Location: /v1/conversations/cnv_51b2096b-1cf9-4918-896e-8ec6a876012c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_51b2096b-1cf9-4918-896e-8ec6a876012c","subject":"Error contract","status":"open","region":"eu","participants":["qa-d477ea1afb1a","qa-8affde404d5d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:53.778739321Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-ccc546c0-50f1-4034-a9f5-cb8116b57bb8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ccc546c0-50f1-4034-a9f5-cb8116b57bb8
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 14 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ccc546c0-50f1-4034-a9f5-cb8116b57bb8
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
Content-Length: 258

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations","correlationId":"qa-ccc546c0-50f1-4034-a9f5-cb8116b57bb8"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-964bb66b-a942-4ea1-9bb7-ff4565cd4dc3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-964bb66b-a942-4ea1-9bb7-ff4565cd4dc3
Content-Type: application/json

--- request body ---
{"handle":"qa-8affde404d5d","password":"****"}

--- response: 200 in 26 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-964bb66b-a942-4ea1-9bb7-ff4565cd4dc3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 382
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_afd0404d-7735-4e1a-aa7a-019840a04e86"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-70887466-c7d1-4c79-9f28-598abdd3a369

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70887466-c7d1-4c79-9f28-598abdd3a369
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-70887466-c7d1-4c79-9f28-598abdd3a369
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
correlation: qa-68189309-1945-4a2c-8e99-e5072b3c2918

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68189309-1945-4a2c-8e99-e5072b3c2918
Content-Type: application/json

--- request body ---
{"handle":"qa-8affde404d5d","password":"****"}

--- response: 401 in 18 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-68189309-1945-4a2c-8e99-e5072b3c2918
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 374
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-68189309-1945-4a2c-8e99-e5072b3c2918"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-98eb939a-6b70-42e3-b818-029362880538

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98eb939a-6b70-42e3-b818-029362880538
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-98eb939a-6b70-42e3-b818-029362880538
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
correlation: qa-1adb4af5-6a58-4ddc-87da-eb48189056fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1adb4af5-6a58-4ddc-87da-eb48189056fe
Content-Type: application/json

--- request body ---
{"handle":"qa-d477ea1afb1a","password":"****"}

--- response: 401 in 19 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1adb4af5-6a58-4ddc-87da-eb48189056fe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 365
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1adb4af5-6a58-4ddc-87da-eb48189056fe"}
```
