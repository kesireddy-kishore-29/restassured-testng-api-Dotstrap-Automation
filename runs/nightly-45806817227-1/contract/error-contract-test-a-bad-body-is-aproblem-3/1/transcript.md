# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[3]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 33 | `qa-6525fc62-62b1-4fe9-b260-e63264ff26a1` |
| 2 | `POST /v1/accounts` | 201 | 56 | `qa-a7a5201e-86d9-4558-8520-e6e7413f97f9` |
| 3 | `POST /v1/auth/token` | 200 | 66 | `qa-32a11de4-ee6b-4f62-b009-a43e69e95619` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-1c9a5447-912e-41ec-8628-37ddc1f7045f` |
| 5 | `POST /v1/accounts` | 400 | 18 | `qa-70ea7a4e-8588-4883-ab2f-be9b8498e8dd` |
| 6 | `POST /v1/auth/token` | 200 | 98 | `qa-1e566dfe-bac3-4d63-9bf9-e94e95819f4b` |
| 7 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-fce67c2d-8d95-4571-af46-33a15370765e` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-0f6ac95e-2660-442e-8397-72f3ac0b0923` |
| 9 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-ce77b1aa-7823-41ad-9a1c-e20073d58ea3` |
| 10 | `POST /v1/auth/token` | 401 | 26 | `qa-3221efe5-d5b8-4f75-adf9-0dea01f0827c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6525fc62-62b1-4fe9-b260-e63264ff26a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6525fc62-62b1-4fe9-b260-e63264ff26a1
Content-Type: application/json

--- request body ---
{"handle":"qa-f39d2e59c3a1","displayName":"QA f39d2e59c3a1","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-6525fc62-62b1-4fe9-b260-e63264ff26a1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 9
Location: /v1/accounts/qa-f39d2e59c3a1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fda5ee71-9437-46c1-95b1-ccd974eb48bb","handle":"qa-f39d2e59c3a1","displayName":"QA f39d2e59c3a1","region":"eu","role":"user","createdAt":"2026-11-26T11:02:43.502673677Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a7a5201e-86d9-4558-8520-e6e7413f97f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7a5201e-86d9-4558-8520-e6e7413f97f9
Content-Type: application/json

--- request body ---
{"handle":"qa-9e672a3febc9","displayName":"QA 9e672a3febc9","password":"****","region":"eu"}

--- response: 201 in 56 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-a7a5201e-86d9-4558-8520-e6e7413f97f9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 9
Location: /v1/accounts/qa-9e672a3febc9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fcc230a3-304f-4f66-9308-2d2356f2e373","handle":"qa-9e672a3febc9","displayName":"QA 9e672a3febc9","region":"eu","role":"user","createdAt":"2026-11-26T11:02:43.579475513Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-32a11de4-ee6b-4f62-b009-a43e69e95619

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32a11de4-ee6b-4f62-b009-a43e69e95619
Content-Type: application/json

--- request body ---
{"handle":"qa-f39d2e59c3a1","password":"****"}

--- response: 200 in 66 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-32a11de4-ee6b-4f62-b009-a43e69e95619
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fda5ee71-9437-46c1-95b1-ccd974eb48bb"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-1c9a5447-912e-41ec-8628-37ddc1f7045f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c9a5447-912e-41ec-8628-37ddc1f7045f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9e672a3febc9","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-1c9a5447-912e-41ec-8628-37ddc1f7045f
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
Location: /v1/conversations/cnv_cf267d6d-3757-4469-be09-54afdaddef78
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_cf267d6d-3757-4469-be09-54afdaddef78","subject":"Error contract","status":"open","region":"eu","participants":["qa-f39d2e59c3a1","qa-9e672a3febc9"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:43.717880394Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-70ea7a4e-8588-4883-ab2f-be9b8498e8dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70ea7a4e-8588-4883-ab2f-be9b8498e8dd
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 18 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-70ea7a4e-8588-4883-ab2f-be9b8498e8dd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 548
RateLimit-Reset: 9
Content-Length: 253

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts","correlationId":"qa-70ea7a4e-8588-4883-ab2f-be9b8498e8dd"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-1e566dfe-bac3-4d63-9bf9-e94e95819f4b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e566dfe-bac3-4d63-9bf9-e94e95819f4b
Content-Type: application/json

--- request body ---
{"handle":"qa-9e672a3febc9","password":"****"}

--- response: 200 in 98 ms ---
Date: Thu, 26 Nov 2026 11:02:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e566dfe-bac3-4d63-9bf9-e94e95819f4b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 519
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fcc230a3-304f-4f66-9308-2d2356f2e373"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fce67c2d-8d95-4571-af46-33a15370765e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fce67c2d-8d95-4571-af46-33a15370765e
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Thu, 26 Nov 2026 11:02:44 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fce67c2d-8d95-4571-af46-33a15370765e
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
correlation: qa-0f6ac95e-2660-442e-8397-72f3ac0b0923

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f6ac95e-2660-442e-8397-72f3ac0b0923
Content-Type: application/json

--- request body ---
{"handle":"qa-9e672a3febc9","password":"****"}

--- response: 401 in 19 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0f6ac95e-2660-442e-8397-72f3ac0b0923
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 499
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0f6ac95e-2660-442e-8397-72f3ac0b0923"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ce77b1aa-7823-41ad-9a1c-e20073d58ea3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce77b1aa-7823-41ad-9a1c-e20073d58ea3
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ce77b1aa-7823-41ad-9a1c-e20073d58ea3
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
correlation: qa-3221efe5-d5b8-4f75-adf9-0dea01f0827c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3221efe5-d5b8-4f75-adf9-0dea01f0827c
Content-Type: application/json

--- request body ---
{"handle":"qa-f39d2e59c3a1","password":"****"}

--- response: 401 in 26 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3221efe5-d5b8-4f75-adf9-0dea01f0827c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 487
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3221efe5-d5b8-4f75-adf9-0dea01f0827c"}
```
