# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[1]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 32 | `qa-c0ad7b16-e282-4736-8e7a-dad39d5a4b49` |
| 2 | `POST /v1/accounts` | 201 | 36 | `qa-b9dbcc96-aff5-4918-89fa-67f8d4a7d803` |
| 3 | `POST /v1/auth/token` | 200 | 60 | `qa-b8ebb6ef-9e81-4b96-9340-9639dd618669` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-cf7ad41d-738d-4868-a94d-53878920a4d1` |
| 5 | `POST /v1/auth/token` | 415 | 59 | `qa-1a2ebeb4-201c-4431-8d0a-5aa512ddc85f` |
| 6 | `POST /v1/auth/token` | 200 | 74 | `qa-f0f07786-b80e-4c37-b868-60d51a10e7fa` |
| 7 | `DELETE /v1/accounts/me` | 204 | 33 | `qa-7c07739a-bcd2-46af-9aab-902fc45d04e0` |
| 8 | `POST /v1/auth/token` | 401 | 20 | `qa-2b8e9f7e-e503-4e3a-b0e4-0b537d4f640e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-c933dc23-f387-4cfe-8138-b482db88810a` |
| 10 | `POST /v1/auth/token` | 401 | 81 | `qa-c9132589-cbe9-4f5d-b0e5-d643ff762d83` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c0ad7b16-e282-4736-8e7a-dad39d5a4b49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0ad7b16-e282-4736-8e7a-dad39d5a4b49
Content-Type: application/json

--- request body ---
{"handle":"qa-d2be63071286","displayName":"QA d2be63071286","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-c0ad7b16-e282-4736-8e7a-dad39d5a4b49
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
Location: /v1/accounts/qa-d2be63071286
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2a9c3d46-949c-475f-be1d-010b3fe1af41","handle":"qa-d2be63071286","displayName":"QA d2be63071286","region":"eu","role":"user","createdAt":"2026-11-19T10:29:23.518899353Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b9dbcc96-aff5-4918-89fa-67f8d4a7d803

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9dbcc96-aff5-4918-89fa-67f8d4a7d803
Content-Type: application/json

--- request body ---
{"handle":"qa-52c53c426342","displayName":"QA 52c53c426342","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9dbcc96-aff5-4918-89fa-67f8d4a7d803
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 559
RateLimit-Reset: 9
Location: /v1/accounts/qa-52c53c426342
X-Served-Region: eu
Content-Length: 181

{"id":"acc_90f3ad82-f2cd-48a3-a92b-6f27c8a3f02e","handle":"qa-52c53c426342","displayName":"QA 52c53c426342","region":"eu","role":"user","createdAt":"2026-11-19T10:29:23.601153977Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b8ebb6ef-9e81-4b96-9340-9639dd618669

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8ebb6ef-9e81-4b96-9340-9639dd618669
Content-Type: application/json

--- request body ---
{"handle":"qa-d2be63071286","password":"****"}

--- response: 200 in 60 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-b8ebb6ef-9e81-4b96-9340-9639dd618669
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 553
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2a9c3d46-949c-475f-be1d-010b3fe1af41"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-cf7ad41d-738d-4868-a94d-53878920a4d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf7ad41d-738d-4868-a94d-53878920a4d1
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-52c53c426342","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-cf7ad41d-738d-4868-a94d-53878920a4d1
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
Location: /v1/conversations/cnv_64e15935-f4d3-45b9-b9c9-b841a923c6d1
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_64e15935-f4d3-45b9-b9c9-b841a923c6d1","subject":"Error contract","status":"open","region":"eu","participants":["qa-d2be63071286","qa-52c53c426342"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:23.711479641Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-1a2ebeb4-201c-4431-8d0a-5aa512ddc85f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a2ebeb4-201c-4431-8d0a-5aa512ddc85f
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 59 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1a2ebeb4-201c-4431-8d0a-5aa512ddc85f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 543
RateLimit-Reset: 9
Content-Length: 254

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/auth/token","correlationId":"qa-1a2ebeb4-201c-4431-8d0a-5aa512ddc85f"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f0f07786-b80e-4c37-b868-60d51a10e7fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0f07786-b80e-4c37-b868-60d51a10e7fa
Content-Type: application/json

--- request body ---
{"handle":"qa-52c53c426342","password":"****"}

--- response: 200 in 74 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-f0f07786-b80e-4c37-b868-60d51a10e7fa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 513
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_90f3ad82-f2cd-48a3-a92b-6f27c8a3f02e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7c07739a-bcd2-46af-9aab-902fc45d04e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c07739a-bcd2-46af-9aab-902fc45d04e0
Content-Type: application/json

--- response: 204 in 33 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7c07739a-bcd2-46af-9aab-902fc45d04e0
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
correlation: qa-2b8e9f7e-e503-4e3a-b0e4-0b537d4f640e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b8e9f7e-e503-4e3a-b0e4-0b537d4f640e
Content-Type: application/json

--- request body ---
{"handle":"qa-52c53c426342","password":"****"}

--- response: 401 in 20 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2b8e9f7e-e503-4e3a-b0e4-0b537d4f640e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 498
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2b8e9f7e-e503-4e3a-b0e4-0b537d4f640e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c933dc23-f387-4cfe-8138-b482db88810a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c933dc23-f387-4cfe-8138-b482db88810a
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c933dc23-f387-4cfe-8138-b482db88810a
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
correlation: qa-c9132589-cbe9-4f5d-b0e5-d643ff762d83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c9132589-cbe9-4f5d-b0e5-d643ff762d83
Content-Type: application/json

--- request body ---
{"handle":"qa-d2be63071286","password":"****"}

--- response: 401 in 81 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c9132589-cbe9-4f5d-b0e5-d643ff762d83
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 477
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c9132589-cbe9-4f5d-b0e5-d643ff762d83"}
```
