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
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-baf6bbd5-2519-438b-bfd7-8932e5c76499` |
| 2 | `POST /v1/accounts` | 201 | 22 | `qa-4cf211b7-db24-4ec9-889a-1094d7b827ca` |
| 3 | `POST /v1/auth/token` | 200 | 8 | `qa-d3ee2659-8ef5-4db5-8242-4a82ca44f124` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-303d0371-95a4-4d02-81d9-2a08f024461b` |
| 5 | `GET /v1/conversations/{id}` | 503 | 13 | `qa-d665436e-eea4-4f0f-bb71-3fccd9e486d8` |
| 6 | `POST /v1/auth/token` | 200 | 52 | `qa-3bc39762-d6be-4df7-8d8a-fc31ffa808c9` |
| 7 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-bc6dd1ec-9d24-45ea-a206-f02b0eb9f251` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-431ad777-6e77-44ef-b618-f46468ae2b70` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-1118af8c-ab2c-4e19-8737-cffb8f492553` |
| 10 | `POST /v1/auth/token` | 401 | 30 | `qa-71757a4f-635e-420b-a4a6-ce5597eb4177` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-baf6bbd5-2519-438b-bfd7-8932e5c76499

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-baf6bbd5-2519-438b-bfd7-8932e5c76499
Content-Type: application/json

--- request body ---
{"handle":"qa-131337c0aa14","displayName":"QA 131337c0aa14","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-baf6bbd5-2519-438b-bfd7-8932e5c76499
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 415
RateLimit-Reset: 8
Location: /v1/accounts/qa-131337c0aa14
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1eabcf40-eb9a-4108-9992-48347099f69b","handle":"qa-131337c0aa14","displayName":"QA 131337c0aa14","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.806607836Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4cf211b7-db24-4ec9-889a-1094d7b827ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4cf211b7-db24-4ec9-889a-1094d7b827ca
Content-Type: application/json

--- request body ---
{"handle":"qa-2bc70247757e","displayName":"QA 2bc70247757e","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-4cf211b7-db24-4ec9-889a-1094d7b827ca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 409
RateLimit-Reset: 8
Location: /v1/accounts/qa-2bc70247757e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_da01b1ab-605c-4c1f-a2bf-bdfc06876d6b","handle":"qa-2bc70247757e","displayName":"QA 2bc70247757e","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.856938184Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d3ee2659-8ef5-4db5-8242-4a82ca44f124

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3ee2659-8ef5-4db5-8242-4a82ca44f124
Content-Type: application/json

--- request body ---
{"handle":"qa-131337c0aa14","password":"****"}

--- response: 200 in 8 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3ee2659-8ef5-4db5-8242-4a82ca44f124
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 405
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1eabcf40-eb9a-4108-9992-48347099f69b"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-303d0371-95a4-4d02-81d9-2a08f024461b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-303d0371-95a4-4d02-81d9-2a08f024461b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2bc70247757e","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-303d0371-95a4-4d02-81d9-2a08f024461b
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
Location: /v1/conversations/cnv_16f929cc-2da5-430d-b539-7aa69778b14b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_16f929cc-2da5-430d-b539-7aa69778b14b","subject":"Error contract","status":"open","region":"eu","participants":["qa-131337c0aa14","qa-2bc70247757e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:36.897588418Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_16f929cc-2da5-430d-b539-7aa69778b14b
correlation: qa-d665436e-eea4-4f0f-bb71-3fccd9e486d8

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: ccf5c0c3-1b47-4fd7-9a95-6021b7a39aac
X-Correlation-Id: qa-d665436e-eea4-4f0f-bb71-3fccd9e486d8
Content-Type: application/json

--- response: 503 in 13 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d665436e-eea4-4f0f-bb71-3fccd9e486d8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 302

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_16f929cc-2da5-430d-b539-7aa69778b14b","correlationId":"qa-d665436e-eea4-4f0f-bb71-3fccd9e486d8"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3bc39762-d6be-4df7-8d8a-fc31ffa808c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3bc39762-d6be-4df7-8d8a-fc31ffa808c9
Content-Type: application/json

--- request body ---
{"handle":"qa-2bc70247757e","password":"****"}

--- response: 200 in 52 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-3bc39762-d6be-4df7-8d8a-fc31ffa808c9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 387
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_da01b1ab-605c-4c1f-a2bf-bdfc06876d6b"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bc6dd1ec-9d24-45ea-a206-f02b0eb9f251

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc6dd1ec-9d24-45ea-a206-f02b0eb9f251
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bc6dd1ec-9d24-45ea-a206-f02b0eb9f251
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
correlation: qa-431ad777-6e77-44ef-b618-f46468ae2b70

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-431ad777-6e77-44ef-b618-f46468ae2b70
Content-Type: application/json

--- request body ---
{"handle":"qa-2bc70247757e","password":"****"}

--- response: 401 in 14 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-431ad777-6e77-44ef-b618-f46468ae2b70
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 383
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-431ad777-6e77-44ef-b618-f46468ae2b70"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1118af8c-ab2c-4e19-8737-cffb8f492553

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1118af8c-ab2c-4e19-8737-cffb8f492553
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1118af8c-ab2c-4e19-8737-cffb8f492553
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
correlation: qa-71757a4f-635e-420b-a4a6-ce5597eb4177

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71757a4f-635e-420b-a4a6-ce5597eb4177
Content-Type: application/json

--- request body ---
{"handle":"qa-131337c0aa14","password":"****"}

--- response: 401 in 30 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-71757a4f-635e-420b-a4a6-ce5597eb4177
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 376
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-71757a4f-635e-420b-a4a6-ce5597eb4177"}
```
