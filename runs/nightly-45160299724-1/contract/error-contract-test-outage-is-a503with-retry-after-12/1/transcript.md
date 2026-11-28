# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[12]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-90d2b14c-3d6e-4709-a029-4b6925003847` |
| 2 | `POST /v1/accounts` | 201 | 15 | `qa-ce827066-817f-463e-a44a-d81399df4586` |
| 3 | `POST /v1/auth/token` | 200 | 17 | `qa-522c01f0-c0bb-4cea-811f-1acee3032c96` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-2636a9f4-e96a-45fa-a7db-0b93c69fe5ff` |
| 5 | `POST /v1/conversations/{id}/close` | 503 | 12 | `qa-cb15e41b-cf90-4743-adbf-497fa36c46e7` |
| 6 | `POST /v1/auth/token` | 200 | 27 | `qa-f50bb32e-d549-4b78-a4ac-644bb4b1b852` |
| 7 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-e8b30519-cf26-4441-9ab9-52db229a33d8` |
| 8 | `POST /v1/auth/token` | 401 | 20 | `qa-58d59d32-7803-4690-aa90-87a0e3dcf2b7` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-3f71887a-eae9-48a9-8cf9-f415d4e63bba` |
| 10 | `POST /v1/auth/token` | 401 | 43 | `qa-242eda63-c88c-4acd-869c-fe42ee410c0f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-90d2b14c-3d6e-4709-a029-4b6925003847

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90d2b14c-3d6e-4709-a029-4b6925003847
Content-Type: application/json

--- request body ---
{"handle":"qa-f42120e236de","displayName":"QA f42120e236de","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-90d2b14c-3d6e-4709-a029-4b6925003847
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 373
RateLimit-Reset: 8
Location: /v1/accounts/qa-f42120e236de
X-Served-Region: eu
Content-Length: 181

{"id":"acc_11552c49-ce77-4411-8e71-bb8c457b43fd","handle":"qa-f42120e236de","displayName":"QA f42120e236de","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.709135748Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ce827066-817f-463e-a44a-d81399df4586

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce827066-817f-463e-a44a-d81399df4586
Content-Type: application/json

--- request body ---
{"handle":"qa-aabb276dd1c1","displayName":"QA aabb276dd1c1","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce827066-817f-463e-a44a-d81399df4586
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 370
RateLimit-Reset: 8
Location: /v1/accounts/qa-aabb276dd1c1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6a5f0cb1-c5a2-4688-a59a-c808da028a4e","handle":"qa-aabb276dd1c1","displayName":"QA aabb276dd1c1","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.726596716Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-522c01f0-c0bb-4cea-811f-1acee3032c96

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-522c01f0-c0bb-4cea-811f-1acee3032c96
Content-Type: application/json

--- request body ---
{"handle":"qa-f42120e236de","password":"****"}

--- response: 200 in 17 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-522c01f0-c0bb-4cea-811f-1acee3032c96
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 365
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_11552c49-ce77-4411-8e71-bb8c457b43fd"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-2636a9f4-e96a-45fa-a7db-0b93c69fe5ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2636a9f4-e96a-45fa-a7db-0b93c69fe5ff
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-aabb276dd1c1","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-2636a9f4-e96a-45fa-a7db-0b93c69fe5ff
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
Location: /v1/conversations/cnv_81c94824-83e5-474b-8b61-6e54b0ae5aa0
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_81c94824-83e5-474b-8b61-6e54b0ae5aa0","subject":"Error contract","status":"open","region":"eu","participants":["qa-f42120e236de","qa-aabb276dd1c1"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:54:59.776937714Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_81c94824-83e5-474b-8b61-6e54b0ae5aa0/close
correlation: qa-cb15e41b-cf90-4743-adbf-497fa36c46e7

--- request headers ---
Accept: application/json
X-Fault-Key: 67358c33-c3fc-4c4e-bdea-1116c162c00b
X-Fault: unavailable-once
X-Correlation-Id: qa-cb15e41b-cf90-4743-adbf-497fa36c46e7
Content-Type: application/json

--- response: 503 in 12 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cb15e41b-cf90-4743-adbf-497fa36c46e7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 308

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_81c94824-83e5-474b-8b61-6e54b0ae5aa0/close","correlationId":"qa-cb15e41b-cf90-4743-adbf-497fa36c46e7"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f50bb32e-d549-4b78-a4ac-644bb4b1b852

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f50bb32e-d549-4b78-a4ac-644bb4b1b852
Content-Type: application/json

--- request body ---
{"handle":"qa-aabb276dd1c1","password":"****"}

--- response: 200 in 27 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-f50bb32e-d549-4b78-a4ac-644bb4b1b852
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 344
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6a5f0cb1-c5a2-4688-a59a-c808da028a4e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e8b30519-cf26-4441-9ab9-52db229a33d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8b30519-cf26-4441-9ab9-52db229a33d8
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e8b30519-cf26-4441-9ab9-52db229a33d8
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
correlation: qa-58d59d32-7803-4690-aa90-87a0e3dcf2b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58d59d32-7803-4690-aa90-87a0e3dcf2b7
Content-Type: application/json

--- request body ---
{"handle":"qa-aabb276dd1c1","password":"****"}

--- response: 401 in 20 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-58d59d32-7803-4690-aa90-87a0e3dcf2b7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 340
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-58d59d32-7803-4690-aa90-87a0e3dcf2b7"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3f71887a-eae9-48a9-8cf9-f415d4e63bba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f71887a-eae9-48a9-8cf9-f415d4e63bba
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3f71887a-eae9-48a9-8cf9-f415d4e63bba
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
correlation: qa-242eda63-c88c-4acd-869c-fe42ee410c0f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-242eda63-c88c-4acd-869c-fe42ee410c0f
Content-Type: application/json

--- request body ---
{"handle":"qa-f42120e236de","password":"****"}

--- response: 401 in 43 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-242eda63-c88c-4acd-869c-fe42ee410c0f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 337
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-242eda63-c88c-4acd-869c-fe42ee410c0f"}
```
