# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[5]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 37 | `qa-93101b32-682d-4188-a656-976a9999ac69` |
| 2 | `POST /v1/accounts` | 201 | 34 | `qa-a1c865a9-ce2e-4800-9463-afe29d1bf9de` |
| 3 | `POST /v1/auth/token` | 200 | 16 | `qa-203508b3-2636-4512-b0c9-1a2e9cbf83dc` |
| 4 | `POST /v1/conversations` | 201 | 13 | `qa-47e76e87-921e-4726-aa76-782fee8a190a` |
| 5 | `POST /v1/accounts` | 422 | 12 | `qa-8af07c0a-10d0-4ad3-9e95-b18bc7d0fd6a` |
| 6 | `POST /v1/auth/token` | 200 | 44 | `qa-b3a9c929-c4da-4284-94b3-f59932e5cf9f` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-ace1f161-f67c-46f5-aac2-b6f8d0486fd1` |
| 8 | `POST /v1/auth/token` | 401 | 17 | `qa-dcfb92ed-e414-49d0-affb-9735d407b46d` |
| 9 | `DELETE /v1/accounts/me` | 204 | 30 | `qa-6847d538-1d1d-4704-a05d-458bd9e9e8b3` |
| 10 | `POST /v1/auth/token` | 401 | 30 | `qa-a5173055-420c-4faf-91a2-199a8f3ff542` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-93101b32-682d-4188-a656-976a9999ac69

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93101b32-682d-4188-a656-976a9999ac69
Content-Type: application/json

--- request body ---
{"handle":"qa-7a3081b94551","displayName":"QA 7a3081b94551","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-93101b32-682d-4188-a656-976a9999ac69
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 476
RateLimit-Reset: 8
Location: /v1/accounts/qa-7a3081b94551
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1122f079-09fb-4544-8788-80d5d0f2d7bd","handle":"qa-7a3081b94551","displayName":"QA 7a3081b94551","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.159261959Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a1c865a9-ce2e-4800-9463-afe29d1bf9de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1c865a9-ce2e-4800-9463-afe29d1bf9de
Content-Type: application/json

--- request body ---
{"handle":"qa-dbcbcf9b21d1","displayName":"QA dbcbcf9b21d1","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-a1c865a9-ce2e-4800-9463-afe29d1bf9de
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 464
RateLimit-Reset: 8
Location: /v1/accounts/qa-dbcbcf9b21d1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_00fadd2b-8091-4bc8-b8ff-6a31b8e036fb","handle":"qa-dbcbcf9b21d1","displayName":"QA dbcbcf9b21d1","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.212995614Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-203508b3-2636-4512-b0c9-1a2e9cbf83dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-203508b3-2636-4512-b0c9-1a2e9cbf83dc
Content-Type: application/json

--- request body ---
{"handle":"qa-7a3081b94551","password":"****"}

--- response: 200 in 16 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-203508b3-2636-4512-b0c9-1a2e9cbf83dc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 455
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1122f079-09fb-4544-8788-80d5d0f2d7bd"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-47e76e87-921e-4726-aa76-782fee8a190a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47e76e87-921e-4726-aa76-782fee8a190a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-dbcbcf9b21d1","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-47e76e87-921e-4726-aa76-782fee8a190a
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
Location: /v1/conversations/cnv_4b74d176-86e3-4370-9266-345fd5bc2c00
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4b74d176-86e3-4370-9266-345fd5bc2c00","subject":"Error contract","status":"open","region":"eu","participants":["qa-7a3081b94551","qa-dbcbcf9b21d1"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:53.281164671Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-8af07c0a-10d0-4ad3-9e95-b18bc7d0fd6a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8af07c0a-10d0-4ad3-9e95-b18bc7d0fd6a
Content-Type: application/json

--- request body ---
{"handle":"ab","displayName":"Name","password":"****","region":"eu"}

--- response: 422 in 12 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8af07c0a-10d0-4ad3-9e95-b18bc7d0fd6a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 446
RateLimit-Reset: 8
Content-Length: 338

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-8af07c0a-10d0-4ad3-9e95-b18bc7d0fd6a","errors":[{"field":"handle","message":"3-30 characters: a-z, 0-9 and '-', not starting with '-'"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b3a9c929-c4da-4284-94b3-f59932e5cf9f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3a9c929-c4da-4284-94b3-f59932e5cf9f
Content-Type: application/json

--- request body ---
{"handle":"qa-dbcbcf9b21d1","password":"****"}

--- response: 200 in 44 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-b3a9c929-c4da-4284-94b3-f59932e5cf9f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 431
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_00fadd2b-8091-4bc8-b8ff-6a31b8e036fb"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ace1f161-f67c-46f5-aac2-b6f8d0486fd1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ace1f161-f67c-46f5-aac2-b6f8d0486fd1
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ace1f161-f67c-46f5-aac2-b6f8d0486fd1
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
correlation: qa-dcfb92ed-e414-49d0-affb-9735d407b46d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dcfb92ed-e414-49d0-affb-9735d407b46d
Content-Type: application/json

--- request body ---
{"handle":"qa-dbcbcf9b21d1","password":"****"}

--- response: 401 in 17 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dcfb92ed-e414-49d0-affb-9735d407b46d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 419
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-dcfb92ed-e414-49d0-affb-9735d407b46d"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6847d538-1d1d-4704-a05d-458bd9e9e8b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6847d538-1d1d-4704-a05d-458bd9e9e8b3
Content-Type: application/json

--- response: 204 in 30 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6847d538-1d1d-4704-a05d-458bd9e9e8b3
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
correlation: qa-a5173055-420c-4faf-91a2-199a8f3ff542

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5173055-420c-4faf-91a2-199a8f3ff542
Content-Type: application/json

--- request body ---
{"handle":"qa-7a3081b94551","password":"****"}

--- response: 401 in 30 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a5173055-420c-4faf-91a2-199a8f3ff542
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 408
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a5173055-420c-4faf-91a2-199a8f3ff542"}
```
