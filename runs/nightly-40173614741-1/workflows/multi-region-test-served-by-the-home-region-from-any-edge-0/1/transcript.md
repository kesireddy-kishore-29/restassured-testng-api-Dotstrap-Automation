# Transcript: Requests are served by the home region, whichever edge they arrive at [IN, eu]

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.MultiRegionTest#servedByTheHomeRegionFromAnyEdge[0]` |
| Features | FEAT-REGION-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-94a570d0-e3a6-4d6c-b140-e3dddb15a0d9` |
| 2 | `POST /v1/auth/token` | 200 | 21 | `qa-c695b29f-784d-42b7-b010-6323f7c67d56` |
| 3 | `GET /v1/accounts/me` | 200 | 13 | `qa-ee2cbb29-ee8f-4506-855f-c99ddd7790e4` |
| 4 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-3b1855a2-c177-4963-b2c5-b90fb9ff7d30` |
| 5 | `POST /v1/auth/token` | 401 | 13 | `qa-3d20fc2d-d54a-4fb4-a758-a702505b1cd0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-94a570d0-e3a6-4d6c-b140-e3dddb15a0d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94a570d0-e3a6-4d6c-b140-e3dddb15a0d9
Content-Type: application/json

--- request body ---
{"handle":"qa-8ad192629ed9","displayName":"QA 8ad192629ed9","password":"****","region":"in"}

--- response: 201 in 22 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-94a570d0-e3a6-4d6c-b140-e3dddb15a0d9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 9
Location: /v1/accounts/qa-8ad192629ed9
X-Served-Region: in
Content-Length: 181

{"id":"acc_a3f933e8-2c15-4f88-a4e5-597e6e35c930","handle":"qa-8ad192629ed9","displayName":"QA 8ad192629ed9","region":"in","role":"user","createdAt":"2026-10-25T07:40:26.845839294Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-c695b29f-784d-42b7-b010-6323f7c67d56

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c695b29f-784d-42b7-b010-6323f7c67d56
Content-Type: application/json

--- request body ---
{"handle":"qa-8ad192629ed9","password":"****"}

--- response: 200 in 21 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-c695b29f-784d-42b7-b010-6323f7c67d56
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a3f933e8-2c15-4f88-a4e5-597e6e35c930"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-ee2cbb29-ee8f-4506-855f-c99ddd7790e4

--- request headers ---
Accept: application/json
X-Edge-Region: eu
X-Correlation-Id: qa-ee2cbb29-ee8f-4506-855f-c99ddd7790e4
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-ee2cbb29-ee8f-4506-855f-c99ddd7790e4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
X-Edge-Region: eu
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: in
Content-Length: 181

{"id":"acc_a3f933e8-2c15-4f88-a4e5-597e6e35c930","handle":"qa-8ad192629ed9","displayName":"QA 8ad192629ed9","region":"in","role":"user","createdAt":"2026-10-25T07:40:26.845839294Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3b1855a2-c177-4963-b2c5-b90fb9ff7d30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b1855a2-c177-4963-b2c5-b90fb9ff7d30
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3b1855a2-c177-4963-b2c5-b90fb9ff7d30
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
X-Served-Region: in
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-3d20fc2d-d54a-4fb4-a758-a702505b1cd0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d20fc2d-d54a-4fb4-a758-a702505b1cd0
Content-Type: application/json

--- request body ---
{"handle":"qa-8ad192629ed9","password":"****"}

--- response: 401 in 13 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3d20fc2d-d54a-4fb4-a758-a702505b1cd0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3d20fc2d-d54a-4fb4-a758-a702505b1cd0"}
```
