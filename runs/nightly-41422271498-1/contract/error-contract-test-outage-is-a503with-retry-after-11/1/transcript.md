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
| 1 | `POST /v1/accounts` | 201 | 47 | `qa-e5455c53-3729-4263-b16d-02445462d858` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-2552c57d-02c3-4e5e-b7f0-a9cfacba17a2` |
| 3 | `POST /v1/auth/token` | 200 | 15 | `qa-687355ea-8841-4ae7-a7a2-93b715997612` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-2d05961a-304b-4c78-a474-fd2d660dcfb6` |
| 5 | `POST /v1/conversations/{id}/read` | 503 | 23 | `qa-75d6fc05-40c0-4737-8106-fcf60a88bdfe` |
| 6 | `POST /v1/auth/token` | 200 | 29 | `qa-eaab9bec-7686-48ca-8fd1-dc4592b15498` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-fd52f56d-9697-466c-9bef-6085457a10d4` |
| 8 | `POST /v1/auth/token` | 401 | 21 | `qa-cc5aeafb-fe90-40be-974e-3c57899492b1` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-157458cb-f6c1-468e-b5be-57d17d282e27` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-b5d77fd7-d247-44eb-82fd-f166e8108a54` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e5455c53-3729-4263-b16d-02445462d858

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5455c53-3729-4263-b16d-02445462d858
Content-Type: application/json

--- request body ---
{"handle":"qa-5bd8e568ee44","displayName":"QA 5bd8e568ee44","password":"****","region":"eu"}

--- response: 201 in 47 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-e5455c53-3729-4263-b16d-02445462d858
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 425
RateLimit-Reset: 8
Location: /v1/accounts/qa-5bd8e568ee44
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4579a7db-856d-43c2-ba40-f0e63e93247a","handle":"qa-5bd8e568ee44","displayName":"QA 5bd8e568ee44","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.859275991Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2552c57d-02c3-4e5e-b7f0-a9cfacba17a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2552c57d-02c3-4e5e-b7f0-a9cfacba17a2
Content-Type: application/json

--- request body ---
{"handle":"qa-9c43b4bcb67c","displayName":"QA 9c43b4bcb67c","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-2552c57d-02c3-4e5e-b7f0-a9cfacba17a2
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
Location: /v1/accounts/qa-9c43b4bcb67c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8061fc31-1a55-4f08-9928-67bd14f0af37","handle":"qa-9c43b4bcb67c","displayName":"QA 9c43b4bcb67c","region":"eu","role":"user","createdAt":"2026-11-02T09:38:36.911794467Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-687355ea-8841-4ae7-a7a2-93b715997612

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-687355ea-8841-4ae7-a7a2-93b715997612
Content-Type: application/json

--- request body ---
{"handle":"qa-5bd8e568ee44","password":"****"}

--- response: 200 in 15 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-687355ea-8841-4ae7-a7a2-93b715997612
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4579a7db-856d-43c2-ba40-f0e63e93247a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-2d05961a-304b-4c78-a474-fd2d660dcfb6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d05961a-304b-4c78-a474-fd2d660dcfb6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9c43b4bcb67c","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Mon, 02 Nov 2026 09:38:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-2d05961a-304b-4c78-a474-fd2d660dcfb6
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
Location: /v1/conversations/cnv_2ac33557-f75e-4b38-ab4e-967d0a5bb95f
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2ac33557-f75e-4b38-ab4e-967d0a5bb95f","subject":"Error contract","status":"open","region":"eu","participants":["qa-5bd8e568ee44","qa-9c43b4bcb67c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:38:36.990201351Z"}
```

## 5. POST /v1/conversations/{id}/read

```text
#5 POST http://localhost:7070/v1/conversations/cnv_2ac33557-f75e-4b38-ab4e-967d0a5bb95f/read
correlation: qa-75d6fc05-40c0-4737-8106-fcf60a88bdfe

--- request headers ---
Accept: application/json
X-Fault-Key: 5376fadd-6e39-43bc-accf-17332aef833d
X-Fault: unavailable-once
X-Correlation-Id: qa-75d6fc05-40c0-4737-8106-fcf60a88bdfe
Content-Type: application/json

--- response: 503 in 23 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-75d6fc05-40c0-4737-8106-fcf60a88bdfe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 307

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_2ac33557-f75e-4b38-ab4e-967d0a5bb95f/read","correlationId":"qa-75d6fc05-40c0-4737-8106-fcf60a88bdfe"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-eaab9bec-7686-48ca-8fd1-dc4592b15498

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eaab9bec-7686-48ca-8fd1-dc4592b15498
Content-Type: application/json

--- request body ---
{"handle":"qa-9c43b4bcb67c","password":"****"}

--- response: 200 in 29 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-eaab9bec-7686-48ca-8fd1-dc4592b15498
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8061fc31-1a55-4f08-9928-67bd14f0af37"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fd52f56d-9697-466c-9bef-6085457a10d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd52f56d-9697-466c-9bef-6085457a10d4
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fd52f56d-9697-466c-9bef-6085457a10d4
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
correlation: qa-cc5aeafb-fe90-40be-974e-3c57899492b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc5aeafb-fe90-40be-974e-3c57899492b1
Content-Type: application/json

--- request body ---
{"handle":"qa-9c43b4bcb67c","password":"****"}

--- response: 401 in 21 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cc5aeafb-fe90-40be-974e-3c57899492b1
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cc5aeafb-fe90-40be-974e-3c57899492b1"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-157458cb-f6c1-468e-b5be-57d17d282e27

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-157458cb-f6c1-468e-b5be-57d17d282e27
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-157458cb-f6c1-468e-b5be-57d17d282e27
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
correlation: qa-b5d77fd7-d247-44eb-82fd-f166e8108a54

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5d77fd7-d247-44eb-82fd-f166e8108a54
Content-Type: application/json

--- request body ---
{"handle":"qa-5bd8e568ee44","password":"****"}

--- response: 401 in 16 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b5d77fd7-d247-44eb-82fd-f166e8108a54
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 374
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b5d77fd7-d247-44eb-82fd-f166e8108a54"}
```
