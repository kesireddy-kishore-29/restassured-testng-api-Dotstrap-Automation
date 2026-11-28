# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[6]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 54 | `qa-11c56717-d1f4-4afa-a7e7-6519451c568c` |
| 2 | `POST /v1/accounts` | 201 | 41 | `qa-6e6efd21-04e6-4864-8d0e-bfaecb7f0f98` |
| 3 | `POST /v1/auth/token` | 200 | 62 | `qa-dfff8457-4c8e-41bf-807b-74f793cb123a` |
| 4 | `POST /v1/conversations` | 201 | 43 | `qa-d0d76350-28d9-465a-970d-9abc0d74a941` |
| 5 | `POST /v1/conversations` | 503 | 22 | `qa-ee13ada7-db4e-49c8-bc5d-79b219ae6c04` |
| 6 | `POST /v1/auth/token` | 200 | 21 | `qa-1bdc0ade-4c6b-452b-a464-24041d2fb59c` |
| 7 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-5e816f01-9090-49fb-95f0-0a7818070bbd` |
| 8 | `POST /v1/auth/token` | 401 | 20 | `qa-52f81e30-e8a4-4bcd-b7a4-0b8c1902c5bd` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-1d7468bd-ea8d-488d-8381-e9aa789c8b6b` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-14c367ff-85ef-467d-a545-395823d5326f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-11c56717-d1f4-4afa-a7e7-6519451c568c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11c56717-d1f4-4afa-a7e7-6519451c568c
Content-Type: application/json

--- request body ---
{"handle":"qa-1dcf6b85abd7","displayName":"QA 1dcf6b85abd7","password":"****","region":"eu"}

--- response: 201 in 54 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-11c56717-d1f4-4afa-a7e7-6519451c568c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 474
RateLimit-Reset: 8
Location: /v1/accounts/qa-1dcf6b85abd7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_174ebdf4-0c6e-49df-8163-999123c452b2","handle":"qa-1dcf6b85abd7","displayName":"QA 1dcf6b85abd7","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.173663293Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6e6efd21-04e6-4864-8d0e-bfaecb7f0f98

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e6efd21-04e6-4864-8d0e-bfaecb7f0f98
Content-Type: application/json

--- request body ---
{"handle":"qa-684d97e63084","displayName":"QA 684d97e63084","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-6e6efd21-04e6-4864-8d0e-bfaecb7f0f98
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 465
RateLimit-Reset: 8
Location: /v1/accounts/qa-684d97e63084
X-Served-Region: eu
Content-Length: 181

{"id":"acc_dca6bae6-4d99-42a6-b499-696448861b3d","handle":"qa-684d97e63084","displayName":"QA 684d97e63084","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.226380774Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-dfff8457-4c8e-41bf-807b-74f793cb123a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dfff8457-4c8e-41bf-807b-74f793cb123a
Content-Type: application/json

--- request body ---
{"handle":"qa-1dcf6b85abd7","password":"****"}

--- response: 200 in 62 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-dfff8457-4c8e-41bf-807b-74f793cb123a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 459
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_174ebdf4-0c6e-49df-8163-999123c452b2"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d0d76350-28d9-465a-970d-9abc0d74a941

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0d76350-28d9-465a-970d-9abc0d74a941
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-684d97e63084","subject":"Error contract","message":"Hi"}

--- response: 201 in 43 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-d0d76350-28d9-465a-970d-9abc0d74a941
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
Location: /v1/conversations/cnv_2161db1e-a6c2-4b84-b632-b64685705452
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2161db1e-a6c2-4b84-b632-b64685705452","subject":"Error contract","status":"open","region":"eu","participants":["qa-1dcf6b85abd7","qa-684d97e63084"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:10:02.361623867Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-ee13ada7-db4e-49c8-bc5d-79b219ae6c04

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 3f176b27-b3e6-4788-9f79-4696f6266396
X-Correlation-Id: qa-ee13ada7-db4e-49c8-bc5d-79b219ae6c04
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1dcf6b85abd7","subject":"Probe","message":"Hi"}

--- response: 503 in 22 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ee13ada7-db4e-49c8-bc5d-79b219ae6c04
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-ee13ada7-db4e-49c8-bc5d-79b219ae6c04"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-1bdc0ade-4c6b-452b-a464-24041d2fb59c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1bdc0ade-4c6b-452b-a464-24041d2fb59c
Content-Type: application/json

--- request body ---
{"handle":"qa-684d97e63084","password":"****"}

--- response: 200 in 21 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-1bdc0ade-4c6b-452b-a464-24041d2fb59c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 441
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dca6bae6-4d99-42a6-b499-696448861b3d"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5e816f01-9090-49fb-95f0-0a7818070bbd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e816f01-9090-49fb-95f0-0a7818070bbd
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5e816f01-9090-49fb-95f0-0a7818070bbd
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
correlation: qa-52f81e30-e8a4-4bcd-b7a4-0b8c1902c5bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52f81e30-e8a4-4bcd-b7a4-0b8c1902c5bd
Content-Type: application/json

--- request body ---
{"handle":"qa-684d97e63084","password":"****"}

--- response: 401 in 20 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-52f81e30-e8a4-4bcd-b7a4-0b8c1902c5bd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 437
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-52f81e30-e8a4-4bcd-b7a4-0b8c1902c5bd"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1d7468bd-ea8d-488d-8381-e9aa789c8b6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d7468bd-ea8d-488d-8381-e9aa789c8b6b
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1d7468bd-ea8d-488d-8381-e9aa789c8b6b
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
correlation: qa-14c367ff-85ef-467d-a545-395823d5326f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14c367ff-85ef-467d-a545-395823d5326f
Content-Type: application/json

--- request body ---
{"handle":"qa-1dcf6b85abd7","password":"****"}

--- response: 401 in 13 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-14c367ff-85ef-467d-a545-395823d5326f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 431
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-14c367ff-85ef-467d-a545-395823d5326f"}
```
