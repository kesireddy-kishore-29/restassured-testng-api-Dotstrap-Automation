# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[2]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 32 | `qa-6c9b9c38-fa44-4964-abca-4a11867a6efe` |
| 2 | `POST /v1/accounts` | 201 | 39 | `qa-35b280f4-85c4-4f33-aaca-395d87eeaa03` |
| 3 | `POST /v1/auth/token` | 200 | 47 | `qa-29811e1b-3e3d-41d8-b3f4-a4a1d4bee343` |
| 4 | `POST /v1/conversations` | 201 | 30 | `qa-7beba2e1-1dd5-4536-86aa-65bf49b20c72` |
| 5 | `GET /v1/accounts/me` | 503 | 9 | `qa-71b35a5e-afee-4aff-8a21-8c47274ad06e` |
| 6 | `POST /v1/auth/token` | 200 | 21 | `qa-509c91b5-7c98-4e21-ad49-59697112a148` |
| 7 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-e3cb85e0-c9fc-463c-88a3-ba584334b105` |
| 8 | `POST /v1/auth/token` | 401 | 10 | `qa-65f60d24-7c60-4b25-a6fe-d356371ae52d` |
| 9 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-96bca4e7-8b92-4487-82cc-ecdf6c20339e` |
| 10 | `POST /v1/auth/token` | 401 | 21 | `qa-d9cff424-ccaa-4a1e-90bc-ffad590d26da` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6c9b9c38-fa44-4964-abca-4a11867a6efe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c9b9c38-fa44-4964-abca-4a11867a6efe
Content-Type: application/json

--- request body ---
{"handle":"qa-b933726239fe","displayName":"QA b933726239fe","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-6c9b9c38-fa44-4964-abca-4a11867a6efe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 10
Location: /v1/accounts/qa-b933726239fe
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7da453b4-3831-4d2b-909b-df8f18987495","handle":"qa-b933726239fe","displayName":"QA b933726239fe","region":"eu","role":"user","createdAt":"2026-11-17T10:50:17.642255126Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-35b280f4-85c4-4f33-aaca-395d87eeaa03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35b280f4-85c4-4f33-aaca-395d87eeaa03
Content-Type: application/json

--- request body ---
{"handle":"qa-0db4e0d945b9","displayName":"QA 0db4e0d945b9","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-35b280f4-85c4-4f33-aaca-395d87eeaa03
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 556
RateLimit-Reset: 10
Location: /v1/accounts/qa-0db4e0d945b9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b4c83d3-6392-46d9-8698-13429ffcdaee","handle":"qa-0db4e0d945b9","displayName":"QA 0db4e0d945b9","region":"eu","role":"user","createdAt":"2026-11-17T10:50:17.690393282Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-29811e1b-3e3d-41d8-b3f4-a4a1d4bee343

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29811e1b-3e3d-41d8-b3f4-a4a1d4bee343
Content-Type: application/json

--- request body ---
{"handle":"qa-b933726239fe","password":"****"}

--- response: 200 in 47 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-29811e1b-3e3d-41d8-b3f4-a4a1d4bee343
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 543
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7da453b4-3831-4d2b-909b-df8f18987495"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-7beba2e1-1dd5-4536-86aa-65bf49b20c72

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7beba2e1-1dd5-4536-86aa-65bf49b20c72
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0db4e0d945b9","subject":"Error contract","message":"Hi"}

--- response: 201 in 30 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-7beba2e1-1dd5-4536-86aa-65bf49b20c72
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
Location: /v1/conversations/cnv_05895327-024c-4eac-a1f4-10d7b9b14a61
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_05895327-024c-4eac-a1f4-10d7b9b14a61","subject":"Error contract","status":"open","region":"eu","participants":["qa-b933726239fe","qa-0db4e0d945b9"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:17.793622730Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-71b35a5e-afee-4aff-8a21-8c47274ad06e

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 9ef7cd74-0f2f-42d8-8785-8a72c9d28dcd
X-Correlation-Id: qa-71b35a5e-afee-4aff-8a21-8c47274ad06e
Content-Type: application/json

--- response: 503 in 9 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-71b35a5e-afee-4aff-8a21-8c47274ad06e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-71b35a5e-afee-4aff-8a21-8c47274ad06e"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-509c91b5-7c98-4e21-ad49-59697112a148

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-509c91b5-7c98-4e21-ad49-59697112a148
Content-Type: application/json

--- request body ---
{"handle":"qa-0db4e0d945b9","password":"****"}

--- response: 200 in 21 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-509c91b5-7c98-4e21-ad49-59697112a148
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 525
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6b4c83d3-6392-46d9-8698-13429ffcdaee"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e3cb85e0-c9fc-463c-88a3-ba584334b105

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3cb85e0-c9fc-463c-88a3-ba584334b105
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e3cb85e0-c9fc-463c-88a3-ba584334b105
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
correlation: qa-65f60d24-7c60-4b25-a6fe-d356371ae52d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65f60d24-7c60-4b25-a6fe-d356371ae52d
Content-Type: application/json

--- request body ---
{"handle":"qa-0db4e0d945b9","password":"****"}

--- response: 401 in 10 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-65f60d24-7c60-4b25-a6fe-d356371ae52d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 512
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-65f60d24-7c60-4b25-a6fe-d356371ae52d"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-96bca4e7-8b92-4487-82cc-ecdf6c20339e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96bca4e7-8b92-4487-82cc-ecdf6c20339e
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: text/plain
X-Correlation-Id: qa-96bca4e7-8b92-4487-82cc-ecdf6c20339e
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
correlation: qa-d9cff424-ccaa-4a1e-90bc-ffad590d26da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9cff424-ccaa-4a1e-90bc-ffad590d26da
Content-Type: application/json

--- request body ---
{"handle":"qa-b933726239fe","password":"****"}

--- response: 401 in 21 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d9cff424-ccaa-4a1e-90bc-ffad590d26da
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 502
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d9cff424-ccaa-4a1e-90bc-ffad590d26da"}
```
