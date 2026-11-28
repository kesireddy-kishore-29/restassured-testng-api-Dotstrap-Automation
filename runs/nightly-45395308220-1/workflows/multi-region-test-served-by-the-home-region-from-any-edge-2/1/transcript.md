# Transcript: Requests are served by the home region, whichever edge they arrive at [US, in]

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.MultiRegionTest#servedByTheHomeRegionFromAnyEdge[2]` |
| Features | FEAT-REGION-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 533 | `qa-cfc695f6-8b90-4a88-a995-d4d9b25c7765` |
| 2 | `POST /v1/auth/token` | 200 | 90 | `qa-f27a6269-00a7-474d-b341-71b2e1aa6fc5` |
| 3 | `GET /v1/accounts/me` | 200 | 78 | `qa-7a18d7ac-b8fb-425e-956a-653d0750360d` |
| 4 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-6dd4c787-bec0-455d-aa1a-087f1cd9ba2c` |
| 5 | `POST /v1/auth/token` | 401 | 29 | `qa-5b53f6b8-6bc0-4d13-a058-4b4696094e9b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cfc695f6-8b90-4a88-a995-d4d9b25c7765

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cfc695f6-8b90-4a88-a995-d4d9b25c7765
Content-Type: application/json

--- request body ---
{"handle":"qa-a0c8aac97ce3","displayName":"QA a0c8aac97ce3","password":"****","region":"us"}

--- response: 201 in 533 ms ---
Date: Tue, 24 Nov 2026 12:38:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-cfc695f6-8b90-4a88-a995-d4d9b25c7765
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-a0c8aac97ce3
X-Served-Region: us
Content-Length: 181

{"id":"acc_80982bd3-7254-49a9-9517-feccb3e7bfff","handle":"qa-a0c8aac97ce3","displayName":"QA a0c8aac97ce3","region":"us","role":"user","createdAt":"2026-11-24T12:38:09.046823748Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-f27a6269-00a7-474d-b341-71b2e1aa6fc5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f27a6269-00a7-474d-b341-71b2e1aa6fc5
Content-Type: application/json

--- request body ---
{"handle":"qa-a0c8aac97ce3","password":"****"}

--- response: 200 in 90 ms ---
Date: Tue, 24 Nov 2026 12:38:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-f27a6269-00a7-474d-b341-71b2e1aa6fc5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_80982bd3-7254-49a9-9517-feccb3e7bfff"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-7a18d7ac-b8fb-425e-956a-653d0750360d

--- request headers ---
Accept: application/json
X-Edge-Region: in
X-Correlation-Id: qa-7a18d7ac-b8fb-425e-956a-653d0750360d
Content-Type: application/json

--- response: 200 in 78 ms ---
Date: Tue, 24 Nov 2026 12:38:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-7a18d7ac-b8fb-425e-956a-653d0750360d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
X-Edge-Region: in
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: us
Content-Length: 181

{"id":"acc_80982bd3-7254-49a9-9517-feccb3e7bfff","handle":"qa-a0c8aac97ce3","displayName":"QA a0c8aac97ce3","region":"us","role":"user","createdAt":"2026-11-24T12:38:09.046823748Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6dd4c787-bec0-455d-aa1a-087f1cd9ba2c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6dd4c787-bec0-455d-aa1a-087f1cd9ba2c
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Tue, 24 Nov 2026 12:38:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6dd4c787-bec0-455d-aa1a-087f1cd9ba2c
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
X-Served-Region: us
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-5b53f6b8-6bc0-4d13-a058-4b4696094e9b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b53f6b8-6bc0-4d13-a058-4b4696094e9b
Content-Type: application/json

--- request body ---
{"handle":"qa-a0c8aac97ce3","password":"****"}

--- response: 401 in 29 ms ---
Date: Tue, 24 Nov 2026 12:38:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5b53f6b8-6bc0-4d13-a058-4b4696094e9b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5b53f6b8-6bc0-4d13-a058-4b4696094e9b"}
```
