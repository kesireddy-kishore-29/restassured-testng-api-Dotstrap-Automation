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
| 1 | `POST /v1/accounts` | 201 | 343 | `qa-37df0662-7b50-4548-b634-e90ffde5fe7d` |
| 2 | `POST /v1/auth/token` | 200 | 41 | `qa-32332b75-9da5-4a20-9c04-1ef39136b7b5` |
| 3 | `GET /v1/accounts/me` | 200 | 43 | `qa-55e13116-9211-49e7-bca8-4206ef8091e5` |
| 4 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-ea0a6a5a-d1c2-4f7d-9967-f95884b777ab` |
| 5 | `POST /v1/auth/token` | 401 | 19 | `qa-b8401c18-e3b6-4936-9b19-2f877dc49b8f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-37df0662-7b50-4548-b634-e90ffde5fe7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37df0662-7b50-4548-b634-e90ffde5fe7d
Content-Type: application/json

--- request body ---
{"handle":"qa-b118a9c18f93","displayName":"QA b118a9c18f93","password":"****","region":"us"}

--- response: 201 in 343 ms ---
Date: Sat, 21 Nov 2026 09:57:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-37df0662-7b50-4548-b634-e90ffde5fe7d
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
Location: /v1/accounts/qa-b118a9c18f93
X-Served-Region: us
Content-Length: 181

{"id":"acc_8b26a028-6ca7-4a18-a052-c1b6380b497f","handle":"qa-b118a9c18f93","displayName":"QA b118a9c18f93","region":"us","role":"user","createdAt":"2026-11-21T09:57:05.809343954Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-32332b75-9da5-4a20-9c04-1ef39136b7b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32332b75-9da5-4a20-9c04-1ef39136b7b5
Content-Type: application/json

--- request body ---
{"handle":"qa-b118a9c18f93","password":"****"}

--- response: 200 in 41 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-32332b75-9da5-4a20-9c04-1ef39136b7b5
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8b26a028-6ca7-4a18-a052-c1b6380b497f"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-55e13116-9211-49e7-bca8-4206ef8091e5

--- request headers ---
Accept: application/json
X-Edge-Region: in
X-Correlation-Id: qa-55e13116-9211-49e7-bca8-4206ef8091e5
Content-Type: application/json

--- response: 200 in 43 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-55e13116-9211-49e7-bca8-4206ef8091e5
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

{"id":"acc_8b26a028-6ca7-4a18-a052-c1b6380b497f","handle":"qa-b118a9c18f93","displayName":"QA b118a9c18f93","region":"us","role":"user","createdAt":"2026-11-21T09:57:05.809343954Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ea0a6a5a-d1c2-4f7d-9967-f95884b777ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea0a6a5a-d1c2-4f7d-9967-f95884b777ab
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ea0a6a5a-d1c2-4f7d-9967-f95884b777ab
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
correlation: qa-b8401c18-e3b6-4936-9b19-2f877dc49b8f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8401c18-e3b6-4936-9b19-2f877dc49b8f
Content-Type: application/json

--- request body ---
{"handle":"qa-b118a9c18f93","password":"****"}

--- response: 401 in 19 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b8401c18-e3b6-4936-9b19-2f877dc49b8f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b8401c18-e3b6-4936-9b19-2f877dc49b8f"}
```
