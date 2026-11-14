# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[11]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 16 | `qa-97336ad2-e5b4-4a59-bdc5-586bed9b76e4` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-259560fa-bce3-4ebd-8024-9ae2771fda26` |
| 3 | `POST /v1/auth/token` | 200 | 22 | `qa-25724bb4-f0da-4984-a0cd-7e46ef916185` |
| 4 | `POST /v1/conversations` | 201 | 25 | `qa-62e67ebe-16ed-48d0-8b49-3c548be00e3e` |
| 5 | `POST /v1/conversations/{id}/read` | 503 | 10 | `qa-19e6a0c9-4ddf-4baa-ac83-a8dbbfa2817b` |
| 6 | `POST /v1/auth/token` | 200 | 10 | `qa-7fa8e5e5-ad73-4be9-9ad0-fa18b2e0253a` |
| 7 | `DELETE /v1/accounts/me` | 204 | 35 | `qa-c4051b10-3681-498f-a5b4-98a13898c9dc` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-3102fb62-e78b-4c45-80b8-af88a2e68ef0` |
| 9 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-fe0de665-78c4-40e2-9ea4-bfcb345204e5` |
| 10 | `POST /v1/auth/token` | 401 | 27 | `qa-a1fcdb0b-5a7b-49af-ab14-8a4b16b10061` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-97336ad2-e5b4-4a59-bdc5-586bed9b76e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97336ad2-e5b4-4a59-bdc5-586bed9b76e4
Content-Type: application/json

--- request body ---
{"handle":"qa-7402d4b74774","displayName":"QA 7402d4b74774","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-97336ad2-e5b4-4a59-bdc5-586bed9b76e4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 407
RateLimit-Reset: 8
Location: /v1/accounts/qa-7402d4b74774
X-Served-Region: eu
Content-Length: 181

{"id":"acc_50c162a6-3c13-433e-a2ad-e716823e6904","handle":"qa-7402d4b74774","displayName":"QA 7402d4b74774","region":"eu","role":"user","createdAt":"2026-11-08T09:09:03.014474236Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-259560fa-bce3-4ebd-8024-9ae2771fda26

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-259560fa-bce3-4ebd-8024-9ae2771fda26
Content-Type: application/json

--- request body ---
{"handle":"qa-60543d22c32e","displayName":"QA 60543d22c32e","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-259560fa-bce3-4ebd-8024-9ae2771fda26
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 400
RateLimit-Reset: 8
Location: /v1/accounts/qa-60543d22c32e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8e322109-deb7-4bc7-8bac-7cc7d66e0ad8","handle":"qa-60543d22c32e","displayName":"QA 60543d22c32e","region":"eu","role":"user","createdAt":"2026-11-08T09:09:03.048252341Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-25724bb4-f0da-4984-a0cd-7e46ef916185

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25724bb4-f0da-4984-a0cd-7e46ef916185
Content-Type: application/json

--- request body ---
{"handle":"qa-7402d4b74774","password":"****"}

--- response: 200 in 22 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-25724bb4-f0da-4984-a0cd-7e46ef916185
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 397
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_50c162a6-3c13-433e-a2ad-e716823e6904"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-62e67ebe-16ed-48d0-8b49-3c548be00e3e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62e67ebe-16ed-48d0-8b49-3c548be00e3e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-60543d22c32e","subject":"Error contract","message":"Hi"}

--- response: 201 in 25 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-62e67ebe-16ed-48d0-8b49-3c548be00e3e
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
Location: /v1/conversations/cnv_a0d32c83-5a83-457a-bef9-335a4d8cee10
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a0d32c83-5a83-457a-bef9-335a4d8cee10","subject":"Error contract","status":"open","region":"eu","participants":["qa-7402d4b74774","qa-60543d22c32e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:03.125069036Z"}
```

## 5. POST /v1/conversations/{id}/read

```text
#5 POST http://localhost:7070/v1/conversations/cnv_a0d32c83-5a83-457a-bef9-335a4d8cee10/read
correlation: qa-19e6a0c9-4ddf-4baa-ac83-a8dbbfa2817b

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 49b702ef-0e34-48fd-99f9-f72ea132f51d
X-Correlation-Id: qa-19e6a0c9-4ddf-4baa-ac83-a8dbbfa2817b
Content-Type: application/json

--- response: 503 in 10 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-19e6a0c9-4ddf-4baa-ac83-a8dbbfa2817b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 307

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_a0d32c83-5a83-457a-bef9-335a4d8cee10/read","correlationId":"qa-19e6a0c9-4ddf-4baa-ac83-a8dbbfa2817b"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-7fa8e5e5-ad73-4be9-9ad0-fa18b2e0253a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7fa8e5e5-ad73-4be9-9ad0-fa18b2e0253a
Content-Type: application/json

--- request body ---
{"handle":"qa-60543d22c32e","password":"****"}

--- response: 200 in 10 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-7fa8e5e5-ad73-4be9-9ad0-fa18b2e0253a
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8e322109-deb7-4bc7-8bac-7cc7d66e0ad8"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c4051b10-3681-498f-a5b4-98a13898c9dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4051b10-3681-498f-a5b4-98a13898c9dc
Content-Type: application/json

--- response: 204 in 35 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c4051b10-3681-498f-a5b4-98a13898c9dc
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
correlation: qa-3102fb62-e78b-4c45-80b8-af88a2e68ef0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3102fb62-e78b-4c45-80b8-af88a2e68ef0
Content-Type: application/json

--- request body ---
{"handle":"qa-60543d22c32e","password":"****"}

--- response: 401 in 16 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3102fb62-e78b-4c45-80b8-af88a2e68ef0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 369
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3102fb62-e78b-4c45-80b8-af88a2e68ef0"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fe0de665-78c4-40e2-9ea4-bfcb345204e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe0de665-78c4-40e2-9ea4-bfcb345204e5
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fe0de665-78c4-40e2-9ea4-bfcb345204e5
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
correlation: qa-a1fcdb0b-5a7b-49af-ab14-8a4b16b10061

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1fcdb0b-5a7b-49af-ab14-8a4b16b10061
Content-Type: application/json

--- request body ---
{"handle":"qa-7402d4b74774","password":"****"}

--- response: 401 in 27 ms ---
Date: Sun, 08 Nov 2026 09:09:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a1fcdb0b-5a7b-49af-ab14-8a4b16b10061
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 361
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a1fcdb0b-5a7b-49af-ab14-8a4b16b10061"}
```
