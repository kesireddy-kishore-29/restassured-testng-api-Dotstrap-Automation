# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[7]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 40 | `qa-6f4715dc-1ea3-4fad-85c7-4e354bcb1ae3` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-0144cc5c-f5c6-4ad2-99db-0966167c59ea` |
| 3 | `POST /v1/auth/token` | 200 | 30 | `qa-340ce070-99d4-4649-bf4b-a34290d13b60` |
| 4 | `POST /v1/conversations` | 201 | 31 | `qa-5b9d858c-a973-4a01-b400-ae07d8e4168a` |
| 5 | `PATCH /v1/accounts/me` | 415 | 13 | `qa-fc2c9670-8dc9-4a31-802d-aa81224025dd` |
| 6 | `POST /v1/auth/token` | 200 | 13 | `qa-cb9ff875-4407-4580-b37b-ddba2b428e5f` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-19351c29-ca12-4828-8cce-77de26b4333b` |
| 8 | `POST /v1/auth/token` | 401 | 8 | `qa-a9469509-e53d-4809-862b-374e4f1f9116` |
| 9 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-0fe593c7-d0d9-43f0-8587-b29e3cfb7efd` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-75fd63e5-771b-41f6-b7d1-7fd055d8138f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6f4715dc-1ea3-4fad-85c7-4e354bcb1ae3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f4715dc-1ea3-4fad-85c7-4e354bcb1ae3
Content-Type: application/json

--- request body ---
{"handle":"qa-934254ab50f5","displayName":"QA 934254ab50f5","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-6f4715dc-1ea3-4fad-85c7-4e354bcb1ae3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 468
RateLimit-Reset: 8
Location: /v1/accounts/qa-934254ab50f5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ded39569-8c5c-4976-9c86-d2e8a90578f8","handle":"qa-934254ab50f5","displayName":"QA 934254ab50f5","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.214524082Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0144cc5c-f5c6-4ad2-99db-0966167c59ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0144cc5c-f5c6-4ad2-99db-0966167c59ea
Content-Type: application/json

--- request body ---
{"handle":"qa-c156bd30e8de","displayName":"QA c156bd30e8de","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-0144cc5c-f5c6-4ad2-99db-0966167c59ea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 454
RateLimit-Reset: 8
Location: /v1/accounts/qa-c156bd30e8de
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f263b326-7502-45d8-a4fd-82c1f5c4c77c","handle":"qa-c156bd30e8de","displayName":"QA c156bd30e8de","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.268590710Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-340ce070-99d4-4649-bf4b-a34290d13b60

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-340ce070-99d4-4649-bf4b-a34290d13b60
Content-Type: application/json

--- request body ---
{"handle":"qa-934254ab50f5","password":"****"}

--- response: 200 in 30 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-340ce070-99d4-4649-bf4b-a34290d13b60
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 448
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ded39569-8c5c-4976-9c86-d2e8a90578f8"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-5b9d858c-a973-4a01-b400-ae07d8e4168a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b9d858c-a973-4a01-b400-ae07d8e4168a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c156bd30e8de","subject":"Error contract","message":"Hi"}

--- response: 201 in 31 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b9d858c-a973-4a01-b400-ae07d8e4168a
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
Location: /v1/conversations/cnv_e6415795-4888-4ecd-bd83-8111cafc02b1
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e6415795-4888-4ecd-bd83-8111cafc02b1","subject":"Error contract","status":"open","region":"eu","participants":["qa-934254ab50f5","qa-c156bd30e8de"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:53.342801401Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-fc2c9670-8dc9-4a31-802d-aa81224025dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc2c9670-8dc9-4a31-802d-aa81224025dd
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 13 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fc2c9670-8dc9-4a31-802d-aa81224025dd
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
Content-Length: 255

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts/me","correlationId":"qa-fc2c9670-8dc9-4a31-802d-aa81224025dd"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-cb9ff875-4407-4580-b37b-ddba2b428e5f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb9ff875-4407-4580-b37b-ddba2b428e5f
Content-Type: application/json

--- request body ---
{"handle":"qa-c156bd30e8de","password":"****"}

--- response: 200 in 13 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-cb9ff875-4407-4580-b37b-ddba2b428e5f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 437
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f263b326-7502-45d8-a4fd-82c1f5c4c77c"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-19351c29-ca12-4828-8cce-77de26b4333b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19351c29-ca12-4828-8cce-77de26b4333b
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-19351c29-ca12-4828-8cce-77de26b4333b
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
correlation: qa-a9469509-e53d-4809-862b-374e4f1f9116

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9469509-e53d-4809-862b-374e4f1f9116
Content-Type: application/json

--- request body ---
{"handle":"qa-c156bd30e8de","password":"****"}

--- response: 401 in 8 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a9469509-e53d-4809-862b-374e4f1f9116
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 427
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a9469509-e53d-4809-862b-374e4f1f9116"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0fe593c7-d0d9-43f0-8587-b29e3cfb7efd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0fe593c7-d0d9-43f0-8587-b29e3cfb7efd
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0fe593c7-d0d9-43f0-8587-b29e3cfb7efd
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
correlation: qa-75fd63e5-771b-41f6-b7d1-7fd055d8138f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75fd63e5-771b-41f6-b7d1-7fd055d8138f
Content-Type: application/json

--- request body ---
{"handle":"qa-934254ab50f5","password":"****"}

--- response: 401 in 13 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-75fd63e5-771b-41f6-b7d1-7fd055d8138f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 422
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-75fd63e5-771b-41f6-b7d1-7fd055d8138f"}
```
