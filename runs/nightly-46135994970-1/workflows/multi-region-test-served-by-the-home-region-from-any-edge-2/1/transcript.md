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
| 1 | `POST /v1/accounts` | 201 | 503 | `qa-90cd0665-37c1-4343-b42a-2d8c42c24aa5` |
| 2 | `POST /v1/auth/token` | 200 | 67 | `qa-0fdffcbc-1088-46c6-98e3-963836084690` |
| 3 | `GET /v1/accounts/me` | 200 | 66 | `qa-ce41468d-73d2-414d-953c-9d505e254a44` |
| 4 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-612d8595-6940-415d-a437-e0f7254c422c` |
| 5 | `POST /v1/auth/token` | 401 | 10 | `qa-8bef7568-4c42-4e68-b2c1-0572319acd2d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-90cd0665-37c1-4343-b42a-2d8c42c24aa5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90cd0665-37c1-4343-b42a-2d8c42c24aa5
Content-Type: application/json

--- request body ---
{"handle":"qa-0505c65ba286","displayName":"QA 0505c65ba286","password":"****","region":"us"}

--- response: 201 in 503 ms ---
Date: Sat, 28 Nov 2026 10:37:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-90cd0665-37c1-4343-b42a-2d8c42c24aa5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-0505c65ba286
X-Served-Region: us
Content-Length: 181

{"id":"acc_cd277ffc-30d7-49f2-b56f-e0d23beb08df","handle":"qa-0505c65ba286","displayName":"QA 0505c65ba286","region":"us","role":"user","createdAt":"2026-11-28T10:37:19.397531338Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-0fdffcbc-1088-46c6-98e3-963836084690

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0fdffcbc-1088-46c6-98e3-963836084690
Content-Type: application/json

--- request body ---
{"handle":"qa-0505c65ba286","password":"****"}

--- response: 200 in 67 ms ---
Date: Sat, 28 Nov 2026 10:37:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-0fdffcbc-1088-46c6-98e3-963836084690
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cd277ffc-30d7-49f2-b56f-e0d23beb08df"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-ce41468d-73d2-414d-953c-9d505e254a44

--- request headers ---
Accept: application/json
X-Edge-Region: in
X-Correlation-Id: qa-ce41468d-73d2-414d-953c-9d505e254a44
Content-Type: application/json

--- response: 200 in 66 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce41468d-73d2-414d-953c-9d505e254a44
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

{"id":"acc_cd277ffc-30d7-49f2-b56f-e0d23beb08df","handle":"qa-0505c65ba286","displayName":"QA 0505c65ba286","region":"us","role":"user","createdAt":"2026-11-28T10:37:19.397531338Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-612d8595-6940-415d-a437-e0f7254c422c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-612d8595-6940-415d-a437-e0f7254c422c
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: text/plain
X-Correlation-Id: qa-612d8595-6940-415d-a437-e0f7254c422c
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
correlation: qa-8bef7568-4c42-4e68-b2c1-0572319acd2d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8bef7568-4c42-4e68-b2c1-0572319acd2d
Content-Type: application/json

--- request body ---
{"handle":"qa-0505c65ba286","password":"****"}

--- response: 401 in 10 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8bef7568-4c42-4e68-b2c1-0572319acd2d
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8bef7568-4c42-4e68-b2c1-0572319acd2d"}
```
