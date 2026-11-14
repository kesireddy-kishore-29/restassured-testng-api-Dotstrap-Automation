# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[11]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 56 | `qa-37c20d0c-4295-4a82-82bb-43af1c4bfda6` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-804b7a28-ad89-4248-8875-df7a750e38b5` |
| 3 | `POST /v1/auth/token` | 200 | 23 | `qa-b2b4daad-ad4f-45b1-b9ab-7af82796d31e` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-2b433254-e879-48b2-9d71-6b1d79860349` |
| 5 | `POST /v1/conversations` | 422 | 22 | `qa-23e4d1dd-73bc-4eb5-8596-b77bc1f40e12` |
| 6 | `POST /v1/auth/token` | 200 | 48 | `qa-01797f6f-8cde-4f23-b25c-668370221aa6` |
| 7 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-80b3346c-122e-43aa-8eb9-21efb0aef94b` |
| 8 | `POST /v1/auth/token` | 401 | 8 | `qa-876f2186-7495-4c60-ac8c-65fe55cd675e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-830f8c4f-90c3-4e09-82e7-b9dfce41879d` |
| 10 | `POST /v1/auth/token` | 401 | 22 | `qa-4da40046-1d25-4f15-9147-24f6b33a1d59` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-37c20d0c-4295-4a82-82bb-43af1c4bfda6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37c20d0c-4295-4a82-82bb-43af1c4bfda6
Content-Type: application/json

--- request body ---
{"handle":"qa-5ec29cda78e9","displayName":"QA 5ec29cda78e9","password":"****","region":"eu"}

--- response: 201 in 56 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-37c20d0c-4295-4a82-82bb-43af1c4bfda6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 403
RateLimit-Reset: 8
Location: /v1/accounts/qa-5ec29cda78e9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_772d4e47-f6af-411c-8c78-396844e2dc46","handle":"qa-5ec29cda78e9","displayName":"QA 5ec29cda78e9","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.909647429Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-804b7a28-ad89-4248-8875-df7a750e38b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-804b7a28-ad89-4248-8875-df7a750e38b5
Content-Type: application/json

--- request body ---
{"handle":"qa-35bd0b921d42","displayName":"QA 35bd0b921d42","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-804b7a28-ad89-4248-8875-df7a750e38b5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 395
RateLimit-Reset: 8
Location: /v1/accounts/qa-35bd0b921d42
X-Served-Region: eu
Content-Length: 181

{"id":"acc_38b894fc-2496-4018-b43e-e5a3653003fe","handle":"qa-35bd0b921d42","displayName":"QA 35bd0b921d42","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.966183398Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b2b4daad-ad4f-45b1-b9ab-7af82796d31e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2b4daad-ad4f-45b1-b9ab-7af82796d31e
Content-Type: application/json

--- request body ---
{"handle":"qa-5ec29cda78e9","password":"****"}

--- response: 200 in 23 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-b2b4daad-ad4f-45b1-b9ab-7af82796d31e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 394
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_772d4e47-f6af-411c-8c78-396844e2dc46"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-2b433254-e879-48b2-9d71-6b1d79860349

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b433254-e879-48b2-9d71-6b1d79860349
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-35bd0b921d42","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-2b433254-e879-48b2-9d71-6b1d79860349
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
Location: /v1/conversations/cnv_4c821d58-59c7-4bae-8062-42cf1c10fdc1
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4c821d58-59c7-4bae-8062-42cf1c10fdc1","subject":"Error contract","status":"open","region":"eu","participants":["qa-5ec29cda78e9","qa-35bd0b921d42"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:37.011688088Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-23e4d1dd-73bc-4eb5-8596-b77bc1f40e12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23e4d1dd-73bc-4eb5-8596-b77bc1f40e12
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-35bd0b921d42","subject":" ","message":"Hi"}

--- response: 422 in 22 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-23e4d1dd-73bc-4eb5-8596-b77bc1f40e12
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
Content-Length: 315

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations","correlationId":"qa-23e4d1dd-73bc-4eb5-8596-b77bc1f40e12","errors":[{"field":"subject","message":"1-120 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-01797f6f-8cde-4f23-b25c-668370221aa6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01797f6f-8cde-4f23-b25c-668370221aa6
Content-Type: application/json

--- request body ---
{"handle":"qa-35bd0b921d42","password":"****"}

--- response: 200 in 48 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-01797f6f-8cde-4f23-b25c-668370221aa6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 374
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_38b894fc-2496-4018-b43e-e5a3653003fe"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-80b3346c-122e-43aa-8eb9-21efb0aef94b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80b3346c-122e-43aa-8eb9-21efb0aef94b
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-80b3346c-122e-43aa-8eb9-21efb0aef94b
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
correlation: qa-876f2186-7495-4c60-ac8c-65fe55cd675e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-876f2186-7495-4c60-ac8c-65fe55cd675e
Content-Type: application/json

--- request body ---
{"handle":"qa-35bd0b921d42","password":"****"}

--- response: 401 in 8 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-876f2186-7495-4c60-ac8c-65fe55cd675e
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-876f2186-7495-4c60-ac8c-65fe55cd675e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-830f8c4f-90c3-4e09-82e7-b9dfce41879d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-830f8c4f-90c3-4e09-82e7-b9dfce41879d
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-830f8c4f-90c3-4e09-82e7-b9dfce41879d
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
correlation: qa-4da40046-1d25-4f15-9147-24f6b33a1d59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4da40046-1d25-4f15-9147-24f6b33a1d59
Content-Type: application/json

--- request body ---
{"handle":"qa-5ec29cda78e9","password":"****"}

--- response: 401 in 22 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4da40046-1d25-4f15-9147-24f6b33a1d59
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 359
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4da40046-1d25-4f15-9147-24f6b33a1d59"}
```
