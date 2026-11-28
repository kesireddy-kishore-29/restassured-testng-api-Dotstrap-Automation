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
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-eedb6065-1227-4a0c-a5a5-1a124eecef21` |
| 2 | `POST /v1/accounts` | 201 | 16 | `qa-bb8cfdb8-39f9-4567-b590-0c4c95cf8015` |
| 3 | `POST /v1/auth/token` | 200 | 23 | `qa-bdc79281-48a2-4f8d-825d-193b9a74c5b6` |
| 4 | `POST /v1/conversations` | 201 | 8 | `qa-42995c6a-e6a6-40b6-aeee-a6590e0db349` |
| 5 | `POST /v1/conversations` | 422 | 19 | `qa-73b495fb-f7e2-48bd-942f-9d10b7b5096b` |
| 6 | `POST /v1/auth/token` | 200 | 23 | `qa-539eac7b-7ea0-4b3e-b3a8-6b9fc280f0aa` |
| 7 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-85b50c53-644b-4c97-bcce-96b20f664ad8` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-0f2a74e3-cc34-4920-89c8-707570c56bea` |
| 9 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-7f387dee-0b3c-4c32-ad30-5d42e618c4cc` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-c2bf5b63-9aaf-48f5-a75c-a4d3fa896492` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-eedb6065-1227-4a0c-a5a5-1a124eecef21

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eedb6065-1227-4a0c-a5a5-1a124eecef21
Content-Type: application/json

--- request body ---
{"handle":"qa-a1f2fd516115","displayName":"QA a1f2fd516115","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-eedb6065-1227-4a0c-a5a5-1a124eecef21
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 391
RateLimit-Reset: 8
Location: /v1/accounts/qa-a1f2fd516115
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c8fa9b84-121e-4c7d-ae47-5747b7900fe9","handle":"qa-a1f2fd516115","displayName":"QA a1f2fd516115","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.852181518Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-bb8cfdb8-39f9-4567-b590-0c4c95cf8015

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb8cfdb8-39f9-4567-b590-0c4c95cf8015
Content-Type: application/json

--- request body ---
{"handle":"qa-78643f7d4c3c","displayName":"QA 78643f7d4c3c","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb8cfdb8-39f9-4567-b590-0c4c95cf8015
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 389
RateLimit-Reset: 8
Location: /v1/accounts/qa-78643f7d4c3c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b6ada6de-6232-41c4-9cad-04a4810f89f1","handle":"qa-78643f7d4c3c","displayName":"QA 78643f7d4c3c","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.874888649Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-bdc79281-48a2-4f8d-825d-193b9a74c5b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bdc79281-48a2-4f8d-825d-193b9a74c5b6
Content-Type: application/json

--- request body ---
{"handle":"qa-a1f2fd516115","password":"****"}

--- response: 200 in 23 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-bdc79281-48a2-4f8d-825d-193b9a74c5b6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 386
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c8fa9b84-121e-4c7d-ae47-5747b7900fe9"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-42995c6a-e6a6-40b6-aeee-a6590e0db349

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42995c6a-e6a6-40b6-aeee-a6590e0db349
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-78643f7d4c3c","subject":"Error contract","message":"Hi"}

--- response: 201 in 8 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-42995c6a-e6a6-40b6-aeee-a6590e0db349
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
Location: /v1/conversations/cnv_72d4f2bc-7c3e-44a7-b18b-bf69d721bf3b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_72d4f2bc-7c3e-44a7-b18b-bf69d721bf3b","subject":"Error contract","status":"open","region":"eu","participants":["qa-a1f2fd516115","qa-78643f7d4c3c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:41.924815135Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-73b495fb-f7e2-48bd-942f-9d10b7b5096b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73b495fb-f7e2-48bd-942f-9d10b7b5096b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-78643f7d4c3c","subject":" ","message":"Hi"}

--- response: 422 in 19 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-73b495fb-f7e2-48bd-942f-9d10b7b5096b
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations","correlationId":"qa-73b495fb-f7e2-48bd-942f-9d10b7b5096b","errors":[{"field":"subject","message":"1-120 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-539eac7b-7ea0-4b3e-b3a8-6b9fc280f0aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-539eac7b-7ea0-4b3e-b3a8-6b9fc280f0aa
Content-Type: application/json

--- request body ---
{"handle":"qa-78643f7d4c3c","password":"****"}

--- response: 200 in 23 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-539eac7b-7ea0-4b3e-b3a8-6b9fc280f0aa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 350
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b6ada6de-6232-41c4-9cad-04a4810f89f1"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-85b50c53-644b-4c97-bcce-96b20f664ad8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85b50c53-644b-4c97-bcce-96b20f664ad8
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: text/plain
X-Correlation-Id: qa-85b50c53-644b-4c97-bcce-96b20f664ad8
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
correlation: qa-0f2a74e3-cc34-4920-89c8-707570c56bea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f2a74e3-cc34-4920-89c8-707570c56bea
Content-Type: application/json

--- request body ---
{"handle":"qa-78643f7d4c3c","password":"****"}

--- response: 401 in 12 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0f2a74e3-cc34-4920-89c8-707570c56bea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 342
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0f2a74e3-cc34-4920-89c8-707570c56bea"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7f387dee-0b3c-4c32-ad30-5d42e618c4cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f387dee-0b3c-4c32-ad30-5d42e618c4cc
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7f387dee-0b3c-4c32-ad30-5d42e618c4cc
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
correlation: qa-c2bf5b63-9aaf-48f5-a75c-a4d3fa896492

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2bf5b63-9aaf-48f5-a75c-a4d3fa896492
Content-Type: application/json

--- request body ---
{"handle":"qa-a1f2fd516115","password":"****"}

--- response: 401 in 16 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c2bf5b63-9aaf-48f5-a75c-a4d3fa896492
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 340
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c2bf5b63-9aaf-48f5-a75c-a4d3fa896492"}
```
