# Transcript: The administrator gets the service statistics

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#theAdministratorGetsTheStatistics` |
| Features | FEAT-AUTHZ-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-9da834db-f26c-486e-89fb-e25e3fd4826c` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-118ca2ed-e33e-4e40-937b-dbae3555d852` |
| 3 | `POST /v1/auth/token` | 200 | 16 | `qa-66d5d941-4d2c-49c3-a67c-686ad0a86125` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-92480d93-9533-4c2b-8167-4a2591936025` |
| 5 | `POST /v1/auth/token` | 200 | 37 | `qa-609d9a94-8da1-44a9-a7c4-c4eb354d0751` |
| 6 | `GET /v1/admin/stats` | 200 | 37 | `qa-1ac3f33d-a014-423b-88e4-6dc120b4a648` |
| 7 | `POST /v1/auth/token` | 200 | 18 | `qa-793abd47-12b4-467c-9643-385800a0717b` |
| 8 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-085c966d-4fc7-407a-886f-1d544709877c` |
| 9 | `POST /v1/auth/token` | 401 | 7 | `qa-b2781618-c252-4f47-b0ac-96795a7556d9` |
| 10 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-513d2615-a881-472d-a475-42573c26a869` |
| 11 | `POST /v1/auth/token` | 401 | 12 | `qa-d62a4df0-3cdf-401f-945c-aab47064f2ed` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9da834db-f26c-486e-89fb-e25e3fd4826c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9da834db-f26c-486e-89fb-e25e3fd4826c
Content-Type: application/json

--- request body ---
{"handle":"qa-ff59e84de222","displayName":"QA ff59e84de222","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-9da834db-f26c-486e-89fb-e25e3fd4826c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 315
RateLimit-Reset: 6
Location: /v1/accounts/qa-ff59e84de222
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6acafee7-a731-48fd-b213-a295efc4b8a4","handle":"qa-ff59e84de222","displayName":"QA ff59e84de222","region":"eu","role":"user","createdAt":"2026-10-29T08:39:01.726008351Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-118ca2ed-e33e-4e40-937b-dbae3555d852

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-118ca2ed-e33e-4e40-937b-dbae3555d852
Content-Type: application/json

--- request body ---
{"handle":"qa-fb768d399760","displayName":"QA fb768d399760","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-118ca2ed-e33e-4e40-937b-dbae3555d852
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 313
RateLimit-Reset: 6
Location: /v1/accounts/qa-fb768d399760
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b6b6f5b8-911b-4a8c-b307-ca5ba0eb5fa5","handle":"qa-fb768d399760","displayName":"QA fb768d399760","region":"eu","role":"user","createdAt":"2026-10-29T08:39:01.766460139Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-66d5d941-4d2c-49c3-a67c-686ad0a86125

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66d5d941-4d2c-49c3-a67c-686ad0a86125
Content-Type: application/json

--- request body ---
{"handle":"qa-ff59e84de222","password":"****"}

--- response: 200 in 16 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-66d5d941-4d2c-49c3-a67c-686ad0a86125
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 307
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6acafee7-a731-48fd-b213-a295efc4b8a4"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-92480d93-9533-4c2b-8167-4a2591936025

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92480d93-9533-4c2b-8167-4a2591936025
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-fb768d399760","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-92480d93-9533-4c2b-8167-4a2591936025
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
Location: /v1/conversations/cnv_e8ae7e17-761d-4d1f-9ab6-5fdce24d2206
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e8ae7e17-761d-4d1f-9ab6-5fdce24d2206","subject":"Error contract","status":"open","region":"eu","participants":["qa-ff59e84de222","qa-fb768d399760"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:39:01.831415817Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-609d9a94-8da1-44a9-a7c4-c4eb354d0751

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-609d9a94-8da1-44a9-a7c4-c4eb354d0751
Content-Type: application/json

--- request body ---
{"handle":"admin","password":"****"}

--- response: 200 in 37 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-609d9a94-8da1-44a9-a7c4-c4eb354d0751
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 302
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9cb6bb0b-fd5e-4de9-88c2-142f30377398"}
```

## 6. GET /v1/admin/stats

```text
#6 GET http://localhost:7070/v1/admin/stats
correlation: qa-1ac3f33d-a014-423b-88e4-6dc120b4a648

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ac3f33d-a014-423b-88e4-6dc120b4a648
Content-Type: application/json

--- response: 200 in 37 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-1ac3f33d-a014-423b-88e4-6dc120b4a648
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
Content-Length: 47

{"accounts":11,"conversations":2,"purchases":0}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-793abd47-12b4-467c-9643-385800a0717b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-793abd47-12b4-467c-9643-385800a0717b
Content-Type: application/json

--- request body ---
{"handle":"qa-fb768d399760","password":"****"}

--- response: 200 in 18 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-793abd47-12b4-467c-9643-385800a0717b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 291
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b6b6f5b8-911b-4a8c-b307-ca5ba0eb5fa5"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-085c966d-4fc7-407a-886f-1d544709877c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-085c966d-4fc7-407a-886f-1d544709877c
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-085c966d-4fc7-407a-886f-1d544709877c
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-b2781618-c252-4f47-b0ac-96795a7556d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2781618-c252-4f47-b0ac-96795a7556d9
Content-Type: application/json

--- request body ---
{"handle":"qa-fb768d399760","password":"****"}

--- response: 401 in 7 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b2781618-c252-4f47-b0ac-96795a7556d9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 289
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b2781618-c252-4f47-b0ac-96795a7556d9"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-513d2615-a881-472d-a475-42573c26a869

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-513d2615-a881-472d-a475-42573c26a869
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-513d2615-a881-472d-a475-42573c26a869
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

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-d62a4df0-3cdf-401f-945c-aab47064f2ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d62a4df0-3cdf-401f-945c-aab47064f2ed
Content-Type: application/json

--- request body ---
{"handle":"qa-ff59e84de222","password":"****"}

--- response: 401 in 12 ms ---
Date: Thu, 29 Oct 2026 08:39:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d62a4df0-3cdf-401f-945c-aab47064f2ed
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 286
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d62a4df0-3cdf-401f-945c-aab47064f2ed"}
```
