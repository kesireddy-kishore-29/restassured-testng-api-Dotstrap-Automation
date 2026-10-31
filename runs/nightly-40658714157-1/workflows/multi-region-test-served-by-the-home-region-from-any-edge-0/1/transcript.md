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
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-c234ec02-fd22-4c48-9a75-0f4340ebac96` |
| 2 | `POST /v1/auth/token` | 200 | 19 | `qa-d4daebf8-bd58-4768-831a-ea6a60794828` |
| 3 | `GET /v1/accounts/me` | 200 | 13 | `qa-1e9ae585-be62-415d-9064-399bd8496143` |
| 4 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-9b98f1b8-b7aa-4298-9bd2-c22eb04ce3cb` |
| 5 | `POST /v1/auth/token` | 401 | 4 | `qa-16a1773d-5e3b-4776-bc86-7f0b9038be18` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c234ec02-fd22-4c48-9a75-0f4340ebac96

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c234ec02-fd22-4c48-9a75-0f4340ebac96
Content-Type: application/json

--- request body ---
{"handle":"qa-8d66a98ac5f7","displayName":"QA 8d66a98ac5f7","password":"****","region":"in"}

--- response: 201 in 22 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-c234ec02-fd22-4c48-9a75-0f4340ebac96
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 10
Location: /v1/accounts/qa-8d66a98ac5f7
X-Served-Region: in
Content-Length: 181

{"id":"acc_1c54080c-ecdd-4893-9dc9-bb4a8834e650","handle":"qa-8d66a98ac5f7","displayName":"QA 8d66a98ac5f7","region":"in","role":"user","createdAt":"2026-10-28T08:42:55.717354818Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-d4daebf8-bd58-4768-831a-ea6a60794828

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4daebf8-bd58-4768-831a-ea6a60794828
Content-Type: application/json

--- request body ---
{"handle":"qa-8d66a98ac5f7","password":"****"}

--- response: 200 in 19 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-d4daebf8-bd58-4768-831a-ea6a60794828
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 563
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1c54080c-ecdd-4893-9dc9-bb4a8834e650"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-1e9ae585-be62-415d-9064-399bd8496143

--- request headers ---
Accept: application/json
X-Edge-Region: eu
X-Correlation-Id: qa-1e9ae585-be62-415d-9064-399bd8496143
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e9ae585-be62-415d-9064-399bd8496143
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

{"id":"acc_1c54080c-ecdd-4893-9dc9-bb4a8834e650","handle":"qa-8d66a98ac5f7","displayName":"QA 8d66a98ac5f7","region":"in","role":"user","createdAt":"2026-10-28T08:42:55.717354818Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9b98f1b8-b7aa-4298-9bd2-c22eb04ce3cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b98f1b8-b7aa-4298-9bd2-c22eb04ce3cb
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9b98f1b8-b7aa-4298-9bd2-c22eb04ce3cb
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
correlation: qa-16a1773d-5e3b-4776-bc86-7f0b9038be18

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16a1773d-5e3b-4776-bc86-7f0b9038be18
Content-Type: application/json

--- request body ---
{"handle":"qa-8d66a98ac5f7","password":"****"}

--- response: 401 in 4 ms ---
Date: Wed, 28 Oct 2026 08:42:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-16a1773d-5e3b-4776-bc86-7f0b9038be18
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-16a1773d-5e3b-4776-bc86-7f0b9038be18"}
```
